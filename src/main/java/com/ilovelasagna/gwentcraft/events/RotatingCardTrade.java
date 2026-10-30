package com.ilovelasagna.gwentcraft.events;

import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;

import java.util.List;

public class RotatingCardTrade implements VillagerTrades.ItemListing {

    private final List<Item> cards;
    private final int emeraldCost;
    private final int villagerXp;

    public RotatingCardTrade(
            List<Item> cards,
            int emeraldCost,
            int villagerXp
    ) {
        if (cards == null || cards.isEmpty()) {
            throw new IllegalArgumentException("Card list cannot be empty!");
        }

        this.cards = List.copyOf(cards);
        this.emeraldCost = emeraldCost;
        this.villagerXp = villagerXp;
    }

    @Override
    public MerchantOffer getOffer(Entity entity, RandomSource random) {

        Item selectedCard = cards.get(random.nextInt(cards.size()));

        return new MerchantOffer(
                new ItemCost(Items.EMERALD, emeraldCost),
                new ItemStack(selectedCard, 1),
                1,
                villagerXp,
                0.05f
        );
    }
}