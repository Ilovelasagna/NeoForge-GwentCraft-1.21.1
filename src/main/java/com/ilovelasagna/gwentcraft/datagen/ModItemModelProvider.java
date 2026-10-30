package com.ilovelasagna.gwentcraft.datagen;

import com.ilovelasagna.gwentcraft.GwentCraft;
import com.ilovelasagna.gwentcraft.items.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(
            PackOutput output,
            ExistingFileHelper existingFileHelper) {
        super(output, GwentCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        // Monster faction leader cards
        String[] monsterLeaderCards = {
                "eredin_1",
                "eredin_2",
                "eredin_3",
                "eredin_4",
                "eredin_5"
        };

        for (String cardId : monsterLeaderCards) {
            generateFactionCard(cardId, "monster_leader");
        }

        // Monster Close Combat cards
        String[] monsterCloseCombatCards = {
                "monster_cc_werewolf",
                "monster_cc_plaguemaiden",
                "monster_cc_nekker",
                "monster_cc_imlerith",
                "monster_cc_griffin",
                "monster_cc_ghoul",
                "monster_cc_frightener",
                "monster_cc_forktail",
                "monster_cc_foglet",
                "monster_cc_fiend",
                "monster_cc_draug",
                "monster_cc_botchling",
                "monster_cc_arachas",

                "monster_cc_crone_1",
                "monster_cc_crone_2",
                "monster_cc_crone_3",

                "monster_cc_vampire_1",
                "monster_cc_vampire_2",
                "monster_cc_vampire_3",
                "monster_cc_vampire_4",
                "monster_cc_vampire_5"
        };

        for (String cardId : monsterCloseCombatCards) {
            generateFactionCard(cardId, "monster_cc");
        }

        // Monster Agile cards
        String[] monsterAgileCards = {
                "monster_ranged_kayran",
                "monster_ranged_harpy",
                "monster_ranged_celaenoharpy"
        };

        for (String cardId : monsterAgileCards) {
            generateFactionCard(cardId, "monster_ranged");
        }

        // Monster Ranged cards
        String[] monsterRangedCards = {
                "monster_ranged_wyvern",
                "monster_ranged_toad",
                "monster_ranged_leshen",
                "monster_ranged_gravehag",
                "monster_ranged_gargoyle",
                "monster_ranged_endrega",
                "monster_ranged_cockatrice"
        };

        for (String cardId : monsterRangedCards) {
            generateFactionCard(cardId, "monster_ranged");
        }

        // Monster Siege cards
        String[] monsterSiegeCards = {
                "monster_siege_icegiant",
                "monster_siege_fireelemental",
                "monster_siege_earthelemental",
                "monster_siege_arachasbehemoth"
        };

        for (String cardId : monsterSiegeCards) {
            generateFactionCard(cardId, "monster_siege");
        }

        // Northern Realms faction leader cards
        String[] northernRealmsLeaderCards = {
                // Add registered Northern Realms card IDs here.
        };

        for (String cardId : northernRealmsLeaderCards) {
            generateFactionCard(
                    cardId,
                    "northern_realms_leader"
            );
        }

        // Gwent Guide Book
        basicItem(ModItems.GWENTGUIDE.get());
    }

    // Generates an item model using a shared faction texture.
    private void generateFactionCard(
            String cardId,
            String textureName) {

        withExistingParent(cardId, "minecraft:item/generated")
                .texture("layer0", modLoc("item/" + textureName));
    }
}