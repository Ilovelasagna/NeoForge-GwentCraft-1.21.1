package com.ilovelasagna.gwentcraft.menu;

import com.ilovelasagna.gwentcraft.data.CardCollectionSavedData;
import com.ilovelasagna.gwentcraft.network.payload.GwentCollectionDataPayload;
import com.ilovelasagna.gwentcraft.registry.ModMenus;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;

import net.neoforged.neoforge.network.PacketDistributor;

public class GwentCollectionMenu extends AbstractContainerMenu {

    public GwentCollectionMenu(int containerId, Inventory inventory) {
        super(ModMenus.GWENT_COLLECTION.get(), containerId);
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        return ItemStack.EMPTY;
    }

    public static void open(ServerPlayer player) {

        // Retrieve the player's saved card collection.
        CardCollectionSavedData collection =
                CardCollectionSavedData.get(player.getServer());

        // Create a copy of the player's collected cards.
        var playerCards =
                collection.getCollection(player.getUUID());

        // Open the collection menu.
        player.openMenu(
                new SimpleMenuProvider(
                        (containerId, inventory, serverPlayer) ->
                                new GwentCollectionMenu(
                                        containerId,
                                        inventory
                                ),
                        Component.translatable(
                                "menu.gwentcraft.gwent_collection"
                        )
                )
        );

        // Send the collection data to this player's client.
        PacketDistributor.sendToPlayer(
                player,
                new GwentCollectionDataPayload(playerCards)
        );
    }
}