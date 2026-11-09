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
                "eredin_5",
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

        // Neutral Cards
        String[] neutralCards = {
                "neutral_geralt",
                "neutral_yenn",
                "neutral_ciri"
        };
        for (String cardId : neutralCards) {
            generateFactionCard(cardId, "neutral_hero");
        }

        String[] neutralCloseCombatCards = {
                "neutral_bovine_defense_force",
                "neutral_emiel_regis",
                "neutral_roach",
                "neutral_vesemir",
                "neutral_villentretenmerth",
                "neutral_zoltan",
                "neutral_triss",
                "neutral_mysterious_elf"
        };
        for (String cardId : neutralCloseCombatCards) {
            generateFactionCard(cardId, "neutral_cc");
        }

        String[] neutralHornCards = {
                "neutral_dandelion",
                "neutral_horn"
        };
        for (String cardId : neutralHornCards) {
            generateFactionCard(cardId, "neutral_horn");
        }

        String[] neutralRangedCards = {
                "neutral_cow",
                "neutral_gaunter_odimm_darkness"
        };
        for (String cardId : neutralRangedCards) {
            generateFactionCard(cardId, "neutral_ranged");
        }

        String[] neutralSiegeCards = {
                "neutral_gaunter_odimm"
        };
        for (String cardId : neutralSiegeCards) {
            generateFactionCard(cardId, "neutral_siege");
        }

        String[] neutralAgileCards = {
                "neutral_olgierd"
        };
        for (String cardId : neutralAgileCards) {
            generateFactionCard(cardId, "neutral_agile");
        }

        String[] neutralWeatherCards = {
                "neutral_biting_frost",
                "neutral_clear_weather",
                "neutral_impenetrable_fog",
                "neutral_skellige_storm",
                "neutral_torrential_rain"
        };
        for (String cardId : neutralWeatherCards) {
            generateFactionCard(cardId, "neutral_weather");
        }

        String[] neutralScorch = {
                "neutral_scorch"
        };
        for (String cardId : neutralScorch) {
            generateFactionCard(cardId, "neutral_scorch");
        }

        String[] neutralDecoy = {
                "neutral_decoy"
        };
        for (String cardId : neutralDecoy) {
            generateFactionCard(cardId, "neutral_decoy");
        }

        // Northern Realms Leader
        String[] northernLeaderCards = {
                "foltest_1",
                "foltest_2",
                "foltest_3",
                "foltest_4",
                "foltest_5",
                "esterad",
                "john_natalis",
                "philippa_eilhart",
                "vernon_roche"
        };
        for (String cardId : northernLeaderCards) {
            generateFactionCard(cardId, "northern_leader");
        }

        // Northern Realms Close Combat cards
        String[] northernCloseCombatCards = {
                "northern_cc_blue_stripes_commando",
                "northern_cc_poor_fucking_infantry",
                "northern_cc_prince_stennis",
                "northern_cc_redanian_foot_soldier",
                "northern_cc_siegfried_of_denesle",
                "northern_cc_sigismund_dijkstra",
                "northern_cc_ves",
                "northern_cc_yarpen_zigrin"
        };
        for (String cardId : northernCloseCombatCards) {
            generateFactionCard(cardId, "northern_cc");
        }

        // Northern Realms Ranged cards
        String[] northernRangedCards = {
                "northern_ranged_crinfrid_reavers_dragon_hunter",
                "northern_ranged_dethmold",
                "northern_ranged_keira_metz",
                "northern_ranged_sabrina_glevissig",
                "northern_ranged_sheldon_skaggs",
                "northern_ranged_sile_de_tansarville"
        };
        for (String cardId : northernRangedCards) {
            generateFactionCard(cardId, "northern_ranged");
        }

        // Northern Realms Siege cards
        String[] northernSiegeCards = {
                "northern_siege_ballista",
                "northern_siege_catapult",
                "northern_siege_dun_banner_medic",
                "northern_siege_kaedweni_siege_expert",
                "northern_siege_siege_tower",
                "northern_siege_thaler",
                "northern_siege_trebuchet"
        };
        for (String cardId : northernSiegeCards) {
            generateFactionCard(cardId, "northern_siege");
        }

        // Scoia'tael Leader cards
        String[] scoiataelLeaderCards = {
                "francesca_1",
                "francesca_2",
                "francesca_3",
                "francesca_4",
                "francesca_5"
        };
        for (String cardId : scoiataelLeaderCards) {
            generateFactionCard(cardId, "scoiatael_leader");
        }

        // Scoia'tael Close Combat cards
        String[] scoiataelCloseCombatCards = {
                "scoiatael_cc_dwarven_skirmisher",
                "scoiatael_cc_elven_skirmisher",
                "scoiatael_cc_havekar_smuggler",
                "scoiatael_cc_mahakaman_defender",
                "scoiatael_cc_toruviel"
        };
        for (String cardId : scoiataelCloseCombatCards) {
            generateFactionCard(cardId, "scoiatael_cc");
        }

        // Scoia'tael Ranged cards
        String[] scoiataelRangedCards = {
                "scoiatael_ranged_dennis_cranmer",
                "scoiatael_ranged_dol_blathanna_archer",
                "scoiatael_ranged_eithne",
                "scoiatael_ranged_havekar_healer",
                "scoiatael_ranged_ida_emean",
                "scoiatael_ranged_iorveth",
                "scoiatael_ranged_isengrim",
                "scoiatael_ranged_milva",
                "scoiatael_ranged_riordain",
                "scoiatael_ranged_saesenthessis",
                "scoiatael_ranged_schirru"
        };
        for (String cardId : scoiataelRangedCards) {
            generateFactionCard(cardId, "scoiatael_ranged");
        }

        // Scoia'tael Siege cards
        String[] scoiataelSiegeCards = {
                "scoiatael_siege_vrihedd_brigade_recruit"
        };
        for (String cardId : scoiataelSiegeCards) {
            generateFactionCard(cardId, "scoiatael_siege");
        }

        // Scoia'tael Agile cards
        String[] scoiataelAgileCards = {
                "scoiatael_agile_barclay_els",
                "scoiatael_agile_ciaran",
                "scoiatael_agile_dol_blathanna_scout",
                "scoiatael_agile_filavandrel",
                "scoiatael_agile_vrihedd_brigade_veteran",
                "scoiatael_agile_yaevinn"
        };
        for (String cardId : scoiataelAgileCards) {
            generateFactionCard(cardId, "scoiatael_agile");
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