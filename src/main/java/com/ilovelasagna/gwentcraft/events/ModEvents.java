
package com.ilovelasagna.gwentcraft.events;

import com.ilovelasagna.gwentcraft.GwentCraft;
import com.ilovelasagna.gwentcraft.items.ModItems;
import com.ilovelasagna.gwentcraft.villagers.ModVillagers;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;

import java.util.List;

public class ModEvents {

    public static void addCustomTrades(VillagerTradesEvent event) {

        if (event.getType() != ModVillagers.INNKEEPER.value()) {
            return;
        }

        GwentCraft.LOGGER.info("Innkeeper trade event detected!");

        Int2ObjectMap<List<VillagerTrades.ItemListing>> trades =
                event.getTrades();

        // Level 1 - Gwent Guide
        trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                new ItemCost(Items.EMERALD, 5),
                new ItemStack(ModItems.GWENTGUIDE.get(), 1),
                1, 3, 0.05f
        ));

        // Level 1 - Rotating Monster Card Trade (3 Emeralds, 5 XP)
        trades.get(1).add(new RotatingCardTrade(List.of(
                ModItems.MONSTER_RANGED_HARPY.get(),
                ModItems.MONSTER_RANGED_KAYRAN.get(),
                ModItems.MONSTER_RANGED_CELAENOHARPY.get(),
                ModItems.MONSTER_RANGED_WYVERN.get(),
                ModItems.MONSTER_RANGED_TOAD.get(),
                ModItems.MONSTER_RANGED_LESHEN.get()
        ), 3, 5));

        GwentCraft.LOGGER.info(
                "Level 1 trades after adding: " + trades.get(1).size()
        );

        // Level 2 - Rotating Monster Card Trade (7 Emeralds, 5 XP)
        trades.get(2).add(new RotatingCardTrade(List.of(
                ModItems.MONSTER_CC_CRONE_3.get(),
                ModItems.MONSTER_SIEGE_EARTHELEMENTAL.get()
        ), 7, 5));

        GwentCraft.LOGGER.info(
                "Level 2 trades after adding: " + trades.get(2).size()
        );
    }
}