package com.ilovelasagna.gwentcraft.items;

import com.ilovelasagna.gwentcraft.GwentCraft;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.ilovelasagna.gwentcraft.items.custom.GwentGuide;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(GwentCraft.MOD_ID);

    // Monster faction leader cards
    public static final DeferredItem<GwentCardItem> EREDIN_1 =
            ITEMS.register("eredin_1",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> EREDIN_2 =
            ITEMS.register("eredin_2",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> EREDIN_3 =
            ITEMS.register("eredin_3",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> EREDIN_4 =
            ITEMS.register("eredin_4",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> EREDIN_5 =
            ITEMS.register("eredin_5",
                    () -> new GwentCardItem(new Item.Properties(), false));

    // Monster Close Combat cards
    public static final DeferredItem<GwentCardItem> MONSTER_CC_WEREWOLF =
            ITEMS.register("monster_cc_werewolf",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_PLAGUEMAIDEN =
            ITEMS.register("monster_cc_plaguemaiden",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_NEKKER =
            ITEMS.register("monster_cc_nekker",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_IMLERITH =
            ITEMS.register("monster_cc_imlerith",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_GRIFFIN =
            ITEMS.register("monster_cc_griffin",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_GHOUL =
            ITEMS.register("monster_cc_ghoul",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_FRIGHTENER =
            ITEMS.register("monster_cc_frightener",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_FORKTAIL =
            ITEMS.register("monster_cc_forktail",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_FOGLET =
            ITEMS.register("monster_cc_foglet",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_FIEND =
            ITEMS.register("monster_cc_fiend",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_DRAUG =
            ITEMS.register("monster_cc_draug",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_BOTCHLING =
            ITEMS.register("monster_cc_botchling",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_ARACHAS =
            ITEMS.register("monster_cc_arachas",
                    () -> new GwentCardItem(new Item.Properties(), false));

    // Monster Crone cards
    public static final DeferredItem<GwentCardItem> MONSTER_CC_CRONE_1 =
            ITEMS.register("monster_cc_crone_1",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_CRONE_2 =
            ITEMS.register("monster_cc_crone_2",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_CRONE_3 =
            ITEMS.register("monster_cc_crone_3",
                    () -> new GwentCardItem(new Item.Properties(), false));

    // Monster Vampire cards
    public static final DeferredItem<GwentCardItem> MONSTER_CC_VAMPIRE_1 =
            ITEMS.register("monster_cc_vampire_1",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_VAMPIRE_2 =
            ITEMS.register("monster_cc_vampire_2",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_VAMPIRE_3 =
            ITEMS.register("monster_cc_vampire_3",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_VAMPIRE_4 =
            ITEMS.register("monster_cc_vampire_4",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_VAMPIRE_5 =
            ITEMS.register("monster_cc_vampire_5",
                    () -> new GwentCardItem(new Item.Properties(), false));

    // Monster Agile cards
    public static final DeferredItem<GwentCardItem> MONSTER_RANGED_KAYRAN =
            ITEMS.register("monster_ranged_kayran",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_RANGED_HARPY =
            ITEMS.register("monster_ranged_harpy",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_RANGED_CELAENOHARPY =
            ITEMS.register("monster_ranged_celaenoharpy",
                    () -> new GwentCardItem(new Item.Properties(), false));

    // Monster Ranged cards
    public static final DeferredItem<GwentCardItem> MONSTER_RANGED_WYVERN =
            ITEMS.register("monster_ranged_wyvern",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_RANGED_TOAD =
            ITEMS.register("monster_ranged_toad",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_RANGED_LESHEN =
            ITEMS.register("monster_ranged_leshen",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_RANGED_GRAVEHAG =
            ITEMS.register("monster_ranged_gravehag",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_RANGED_GARGOYLE =
            ITEMS.register("monster_ranged_gargoyle",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_RANGED_ENDREGA =
            ITEMS.register("monster_ranged_endrega",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_RANGED_COCKATRICE =
            ITEMS.register("monster_ranged_cockatrice",
                    () -> new GwentCardItem(new Item.Properties(), false));

    // Monster Siege cards
    public static final DeferredItem<GwentCardItem> MONSTER_SIEGE_ICEGIANT =
            ITEMS.register("monster_siege_icegiant",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_SIEGE_FIREELEMENTAL =
            ITEMS.register("monster_siege_fireelemental",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_SIEGE_EARTHELEMENTAL =
            ITEMS.register("monster_siege_earthelemental",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_SIEGE_ARACHASBEHEMOTH =
            ITEMS.register("monster_siege_arachasbehemoth",
                    () -> new GwentCardItem(new Item.Properties(), false));

    //Neutral Hero Cards
    public static final DeferredItem<GwentCardItem> NEUTRAL_GERALT =
            ITEMS.register("neutral_geralt",
                    () -> new GwentCardItem(new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> NEUTRAL_YENN =
            ITEMS.register("neutral_yenn",
                    () -> new GwentCardItem(new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> NEUTRAL_CIRI =
            ITEMS.register("neutral_ciri",
                    () -> new GwentCardItem(new Item.Properties(), false));

    //Neutral CC Cards
    public static final DeferredItem<GwentCardItem> NEUTRAL_BOVINE_DEFENSE_FORCE =
            ITEMS.register("neutral_bovine_defense_force",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NEUTRAL_DANDELION =
            ITEMS.register("neutral_dandelion",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NEUTRAL_EMIEL_REGIS =
            ITEMS.register("neutral_emiel_regis",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NEUTRAL_ROACH =
            ITEMS.register("neutral_roach",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NEUTRAL_VESEMIR =
            ITEMS.register("neutral_vesemir",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NEUTRAL_VILLENTRETENMERTH =
            ITEMS.register("neutral_villentretenmerth",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NEUTRAL_ZOLTAN =
            ITEMS.register("neutral_zoltan",
                    () -> new GwentCardItem(new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> NEUTRAL_MYSTERIOUS_ELF =
            ITEMS.register("neutral_mysterious_elf",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NEUTRAL_TRISS =
            ITEMS.register("neutral_triss",
                    () -> new GwentCardItem(new Item.Properties(), false));

    //Neutral Ranged Cards
    public static final DeferredItem<GwentCardItem> NEUTRAL_COW =
            ITEMS.register("neutral_cow",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NEUTRAL_GAUNTER_ODIMM_DARKNESS =
            ITEMS.register("neutral_gaunter_odimm_darkness",
                    () -> new GwentCardItem(new Item.Properties(), false));

    //Neutral Siege Cards
    public static final DeferredItem<GwentCardItem> NEUTRAL_GAUNTER_ODIMM =
            ITEMS.register("neutral_gaunter_odimm",
                    () -> new GwentCardItem(new Item.Properties(), false));

    //Neutral Agile Cards
    public static final DeferredItem<GwentCardItem> NEUTRAL_OLGIERD =
            ITEMS.register("neutral_olgierd",
                    () -> new GwentCardItem(new Item.Properties(), false));

    //Neutral Special Cards
    public static final DeferredItem<GwentCardItem> NEUTRAL_HORN =
            ITEMS.register("neutral_horn",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NEUTRAL_DECOY =
            ITEMS.register("neutral_decoy",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NEUTRAL_SCORCH =
            ITEMS.register("neutral_scorch",
                    () -> new GwentCardItem(new Item.Properties(), false));

    //Neutral Weather Cards
    public static final DeferredItem<GwentCardItem> NEUTRAL_BITING_FROST =
            ITEMS.register("neutral_biting_frost",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NEUTRAL_CLEAR_WEATHER =
            ITEMS.register("neutral_clear_weather",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NEUTRAL_IMPENETRABLE_FOG =
            ITEMS.register("neutral_impenetrable_fog",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NEUTRAL_SKELLIGE_STORM =
            ITEMS.register("neutral_skellige_storm",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NEUTRAL_TORRENTIAL_RAIN =
            ITEMS.register("neutral_torrential_rain",
                    () -> new GwentCardItem(new Item.Properties(), false));


    // Gwent Guide Book
    public static final DeferredItem<GwentGuide> GWENTGUIDE =
            ITEMS.register("gwentguide",
                    () -> new GwentGuide(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}