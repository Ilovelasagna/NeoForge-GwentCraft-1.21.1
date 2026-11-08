package com.ilovelasagna.gwentcraft.items.custom;

import com.ilovelasagna.gwentcraft.menu.GwentCollectionMenu;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class GwentGuide extends Item {

    public GwentGuide(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(
            Level level,
            Player player,
            InteractionHand hand) {

        ItemStack stack = player.getItemInHand(hand);

        // Open the collection menu on the server.
        if (!level.isClientSide && player instanceof ServerPlayer serverPlayer) {

            GwentCollectionMenu.open(serverPlayer);
        }

        return InteractionResultHolder.sidedSuccess(
                stack,
                level.isClientSide
        );
    }
}