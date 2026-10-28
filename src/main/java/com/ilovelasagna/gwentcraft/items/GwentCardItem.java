package com.ilovelasagna.gwentcraft.items;

import com.ilovelasagna.gwentcraft.data.CardCollectionSavedData;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class GwentCardItem extends Item {

    private final boolean repeatable;

    // Tracks the last duplicate warning shown to each player.
    private static final Map<UUID, String> LAST_DUPLICATE_WARNING =
            new HashMap<>();

    public GwentCardItem(Properties properties, boolean repeatable) {
        super(properties);
        this.repeatable = repeatable;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(
            Level level,
            Player player,
            InteractionHand hand) {

        ItemStack stack = player.getItemInHand(hand);

        // The server handles registration and saving.
        if (level.isClientSide) {
            return InteractionResultHolder.sidedSuccess(stack, true);
        }

        if (!(player instanceof ServerPlayer serverPlayer)) {
            return InteractionResultHolder.pass(stack);
        }

        // Identify the card by its registered item ID.
        String cardId = BuiltInRegistries.ITEM
                .getKey(this)
                .toString();

        // Get the persistent collection for this world.
        MinecraftServer server = serverPlayer.getServer();

        if (server == null) {
            return InteractionResultHolder.pass(stack);
        }

        CardCollectionSavedData collection =
                CardCollectionSavedData.get(server);

        // Get the card's display name before consuming it.
        String cardName = this.getName(stack).getString();

        // Attempt to register the card.
        if (!collection.registerCard(
                serverPlayer.getUUID(),
                cardId,
                repeatable)) {

            UUID playerId = serverPlayer.getUUID();

            // Only warn if this card differs from the last
            // duplicate warning shown to this player.
            String lastWarning =
                    LAST_DUPLICATE_WARNING.get(playerId);

            if (!cardId.equals(lastWarning)) {
                serverPlayer.sendSystemMessage(
                        Component.empty()
                                .append(Component.literal(cardName)
                                        .withStyle(ChatFormatting.ITALIC))
                                .append(Component.literal(
                                        " is already in your Gwent deck."))
                );

                LAST_DUPLICATE_WARNING.put(playerId, cardId);
            }

            return InteractionResultHolder.sidedSuccess(stack, false);
        }

        // Registration succeeded: consume one physical card.
        stack.shrink(1);

        // Reset duplicate-warning tracking after success.
        LAST_DUPLICATE_WARNING.remove(serverPlayer.getUUID());

        // Send a success message with the card name in italics.
        serverPlayer.sendSystemMessage(
                Component.empty()
                        .append(Component.literal(cardName)
                                .withStyle(ChatFormatting.ITALIC))
                        .append(Component.literal(
                                " added to your Gwent deck."))
        );

        return InteractionResultHolder.sidedSuccess(stack, false);
    }
}