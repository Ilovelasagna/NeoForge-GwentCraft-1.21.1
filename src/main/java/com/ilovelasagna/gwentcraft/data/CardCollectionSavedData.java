package com.ilovelasagna.gwentcraft.data;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.saveddata.SavedData;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CardCollectionSavedData extends SavedData {

    private static final String DATA_NAME =
            "gwentcraft_card_collection";

    private final Map<UUID, Map<String, Integer>> collections =
            new HashMap<>();

    public CardCollectionSavedData() {
    }

    // Load previously saved player collections.
    public static CardCollectionSavedData load(
            CompoundTag tag,
            net.minecraft.core.HolderLookup.Provider registries) {

        CardCollectionSavedData data =
                new CardCollectionSavedData();

        CompoundTag players = tag.getCompound("Players");

        for (String playerKey : players.getAllKeys()) {
            try {
                UUID playerId = UUID.fromString(playerKey);
                CompoundTag cards = players.getCompound(playerKey);

                Map<String, Integer> collection = new HashMap<>();

                for (String cardId : cards.getAllKeys()) {
                    int count = cards.getInt(cardId);

                    if (count > 0) {
                        collection.put(cardId, count);
                    }
                }

                data.collections.put(playerId, collection);

            } catch (IllegalArgumentException ignored) {
                // Ignore malformed player UUIDs in saved data.
            }
        }

        return data;
    }

    // Save player collections to disk.
    @Override
    public CompoundTag save(
            CompoundTag tag,
            net.minecraft.core.HolderLookup.Provider registries) {

        CompoundTag players = new CompoundTag();

        for (Map.Entry<UUID, Map<String, Integer>> playerEntry
                : collections.entrySet()) {

            CompoundTag cards = new CompoundTag();

            for (Map.Entry<String, Integer> cardEntry
                    : playerEntry.getValue().entrySet()) {

                cards.putInt(
                        cardEntry.getKey(),
                        cardEntry.getValue()
                );
            }

            players.put(
                    playerEntry.getKey().toString(),
                    cards
            );
        }

        tag.put("Players", players);
        return tag;
    }

    // Add a specified number of cards directly to a collection.
    public void addCard(
            UUID playerId,
            String cardId,
            int amount) {

        if (amount <= 0) {
            return;
        }

        Map<String, Integer> collection =
                collections.computeIfAbsent(
                        playerId,
                        id -> new HashMap<>()
                );

        collection.merge(cardId, amount, Integer::sum);

        setDirty();
    }

    // Get the number of registered copies of a card.
    public int getCardCount(UUID playerId, String cardId) {
        return collections
                .getOrDefault(playerId, Map.of())
                .getOrDefault(cardId, 0);
    }

    // Register a card, respecting its duplicate rule.
    public boolean registerCard(
            UUID playerId,
            String cardId,
            boolean repeatable) {

        int currentCount = getCardCount(playerId, cardId);

        // Unique cards cannot be registered more than once.
        if (!repeatable && currentCount >= 1) {
            return false;
        }

        Map<String, Integer> collection =
                collections.computeIfAbsent(
                        playerId,
                        id -> new HashMap<>()
                );

        collection.put(cardId, currentCount + 1);

        // Mark data as changed so Minecraft saves it.
        setDirty();

        return true;
    }

    // Get the persistent collection data for this world.
    public static CardCollectionSavedData get(
            MinecraftServer server) {

        return server.overworld()
                .getDataStorage()
                .computeIfAbsent(
                        new SavedData.Factory<>(
                                CardCollectionSavedData::new,
                                CardCollectionSavedData::load,
                                null
                        ),
                        DATA_NAME
                );
    }

    // Convenience method for working directly with a player.
    public void addCard(
            ServerPlayer player,
            String cardId,
            int amount) {

        addCard(player.getUUID(), cardId, amount);
    }
}