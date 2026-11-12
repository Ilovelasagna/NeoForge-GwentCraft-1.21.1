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

    //Northern Realms Leader Cards

    public static final DeferredItem<GwentCardItem> FOLTEST_1 =
            ITEMS.register("foltest_1",
                    () -> new GwentCardItem(new Item.Properties(),false));

    public static final DeferredItem<GwentCardItem> FOLTEST_2 =
            ITEMS.register("foltest_2",
                    () -> new GwentCardItem(new Item.Properties(),false));

    public static final DeferredItem<GwentCardItem> FOLTEST_3 =
            ITEMS.register("foltest_3",
                    () -> new GwentCardItem(new Item.Properties(),false));

    public static final DeferredItem<GwentCardItem> FOLTEST_4 =
            ITEMS.register("foltest_4",
                    () -> new GwentCardItem(new Item.Properties(),false));

    public static final DeferredItem<GwentCardItem> FOLTEST_5 =
            ITEMS.register("foltest_5",
                    () -> new GwentCardItem(new Item.Properties(),false));

    public static final DeferredItem<GwentCardItem> ESTERAD =
            ITEMS.register("esterad",
                    () -> new GwentCardItem(new Item.Properties(),false));

    public static final DeferredItem<GwentCardItem> JOHN_NATALIS =
            ITEMS.register("john_natalis",
                    () -> new GwentCardItem(new Item.Properties(),false));

    public static final DeferredItem<GwentCardItem> PHILIPPA_EILHART =
            ITEMS.register("philippa_eilhart",
                    () -> new GwentCardItem(new Item.Properties(),false));

    public static final DeferredItem<GwentCardItem> VERNON_ROCHE =
            ITEMS.register("vernon_roche",
                    () -> new GwentCardItem(new Item.Properties(),false));

    // Northern Realms Close Combat cards
    public static final DeferredItem<GwentCardItem> NORTHERN_CC_BLUE_STRIPES_COMMANDO =
            ITEMS.register("northern_cc_blue_stripes_commando",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NORTHERN_CC_POOR_FUCKING_INFANTRY =
            ITEMS.register("northern_cc_poor_fucking_infantry",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NORTHERN_CC_PRINCE_STENNIS =
            ITEMS.register("northern_cc_prince_stennis",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NORTHERN_CC_REDANIAN_FOOT_SOLDIER =
            ITEMS.register("northern_cc_redanian_foot_soldier",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NORTHERN_CC_SIEGFRIED_OF_DENESLE =
            ITEMS.register("northern_cc_siegfried_of_denesle",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NORTHERN_CC_SIGISMUND_DIJKSTRA =
            ITEMS.register("northern_cc_sigismund_dijkstra",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NORTHERN_CC_VES =
            ITEMS.register("northern_cc_ves",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NORTHERN_CC_YARPEN_ZIGRIN =
            ITEMS.register("northern_cc_yarpen_zigrin",
                    () -> new GwentCardItem(new Item.Properties(), false));


    // Northern Realms Ranged cards
    public static final DeferredItem<GwentCardItem> NORTHERN_RANGED_CRINFRID_REAVERS_DRAGON_HUNTER =
            ITEMS.register("northern_ranged_crinfrid_reavers_dragon_hunter",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NORTHERN_RANGED_DETHMOLD =
            ITEMS.register("northern_ranged_dethmold",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NORTHERN_RANGED_KEIRA_METZ =
            ITEMS.register("northern_ranged_keira_metz",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NORTHERN_RANGED_SABRINA_GLEVISSIG =
            ITEMS.register("northern_ranged_sabrina_glevissig",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NORTHERN_RANGED_SHELDON_SKAGGS =
            ITEMS.register("northern_ranged_sheldon_skaggs",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NORTHERN_RANGED_SILE_DE_TANSARVILLE =
            ITEMS.register("northern_ranged_sile_de_tansarville",
                    () -> new GwentCardItem(new Item.Properties(), false));


    // Northern Realms Siege cards
    public static final DeferredItem<GwentCardItem> NORTHERN_SIEGE_BALLISTA =
            ITEMS.register("northern_siege_ballista",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NORTHERN_SIEGE_CATAPULT =
            ITEMS.register("northern_siege_catapult",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NORTHERN_SIEGE_DUN_BANNER_MEDIC =
            ITEMS.register("northern_siege_dun_banner_medic",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NORTHERN_SIEGE_KAEDWENI_SIEGE_EXPERT =
            ITEMS.register("northern_siege_kaedweni_siege_expert",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NORTHERN_SIEGE_SIEGE_TOWER =
            ITEMS.register("northern_siege_siege_tower",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NORTHERN_SIEGE_THALER =
            ITEMS.register("northern_siege_thaler",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NORTHERN_SIEGE_TREBUCHET =
            ITEMS.register("northern_siege_trebuchet",
                    () -> new GwentCardItem(new Item.Properties(), false));

    // Scoia'tael Leader Cards
    public static final DeferredItem<GwentCardItem> FRANCESCA_1 =
            ITEMS.register("francesca_1",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> FRANCESCA_2 =
            ITEMS.register("francesca_2",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> FRANCESCA_3 =
            ITEMS.register("francesca_3",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> FRANCESCA_4 =
            ITEMS.register("francesca_4",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> FRANCESCA_5 =
            ITEMS.register("francesca_5",
                    () -> new GwentCardItem(new Item.Properties(), false));


    // Scoia'tael Close Combat Cards
    public static final DeferredItem<GwentCardItem> SCOIATAEL_CC_DWARVEN_SKIRMISHER =
            ITEMS.register("scoiatael_cc_dwarven_skirmisher",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SCOIATAEL_CC_ELVEN_SKIRMISHER =
            ITEMS.register("scoiatael_cc_elven_skirmisher",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SCOIATAEL_CC_HAVEKAR_SMUGGLER =
            ITEMS.register("scoiatael_cc_havekar_smuggler",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SCOIATAEL_CC_MAHAKAMAN_DEFENDER =
            ITEMS.register("scoiatael_cc_mahakaman_defender",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SCOIATAEL_CC_TORUVIEL =
            ITEMS.register("scoiatael_cc_toruviel",
                    () -> new GwentCardItem(new Item.Properties(), false));


    // Scoia'tael Ranged Cards
    public static final DeferredItem<GwentCardItem> SCOIATAEL_RANGED_DENNIS_CRANMER =
            ITEMS.register("scoiatael_ranged_dennis_cranmer",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SCOIATAEL_RANGED_DOL_BLATHANNA_ARCHER =
            ITEMS.register("scoiatael_ranged_dol_blathanna_archer",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SCOIATAEL_RANGED_EITHNE =
            ITEMS.register("scoiatael_ranged_eithne",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SCOIATAEL_RANGED_HAVEKAR_HEALER =
            ITEMS.register("scoiatael_ranged_havekar_healer",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SCOIATAEL_RANGED_IDA_EMEAN =
            ITEMS.register("scoiatael_ranged_ida_emean",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SCOIATAEL_RANGED_IORVETH =
            ITEMS.register("scoiatael_ranged_iorveth",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SCOIATAEL_RANGED_ISENGRIM =
            ITEMS.register("scoiatael_ranged_isengrim",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SCOIATAEL_RANGED_MILVA =
            ITEMS.register("scoiatael_ranged_milva",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SCOIATAEL_RANGED_RIORDAIN =
            ITEMS.register("scoiatael_ranged_riordain",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SCOIATAEL_RANGED_SAESENTHESSIS =
            ITEMS.register("scoiatael_ranged_saesenthessis",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SCOIATAEL_RANGED_SCHIRRU =
            ITEMS.register("scoiatael_ranged_schirru",
                    () -> new GwentCardItem(new Item.Properties(), false));


    // Scoia'tael Siege Cards
    public static final DeferredItem<GwentCardItem> SCOIATAEL_SIEGE_VRIHEDD_BRIGADE_RECRUIT =
            ITEMS.register("scoiatael_siege_vrihedd_brigade_recruit",
                    () -> new GwentCardItem(new Item.Properties(), false));

    // Scoia'tael Agile Cards
    public static final DeferredItem<GwentCardItem> SCOIATAEL_AGILE_BARCLAY_ELS =
            ITEMS.register("scoiatael_agile_barclay_els",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SCOIATAEL_AGILE_CIARAN =
            ITEMS.register("scoiatael_agile_ciaran",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SCOIATAEL_AGILE_DOL_BLATHANNA_SCOUT =
            ITEMS.register("scoiatael_agile_dol_blathanna_scout",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SCOIATAEL_AGILE_FILAVANDREL =
            ITEMS.register("scoiatael_agile_filavandrel",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SCOIATAEL_AGILE_VRIHEDD_BRIGADE_VETERAN =
            ITEMS.register("scoiatael_agile_vrihedd_brigade_veteran",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SCOIATAEL_AGILE_YAEVINN =
            ITEMS.register("scoiatael_agile_yaevinn",
                    () -> new GwentCardItem(new Item.Properties(), false));


    //Nilfgaardian Leader Cards
    public static final DeferredItem<GwentCardItem> EMHYR_1 =
            ITEMS.register("emhyr_1",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> EMHYR_2 =
            ITEMS.register("emhyr_2",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> EMHYR_3 =
            ITEMS.register("emhyr_3",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> EMHYR_4 =
            ITEMS.register("emhyr_4",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> EMHYR_5 =
            ITEMS.register("emhyr_5",
                    () -> new GwentCardItem(new Item.Properties(), false));

    // Nilfgaardian Empire Close Combat Cards
    public static final DeferredItem<GwentCardItem> NILFGAARD_CC_CAHIR_MAWR_DYFFRYN_AEP_CEALLACH =
            ITEMS.register("nilfgaard_cc_cahir_mawr_dyffryn_aep_ceallach",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_CC_IMPERA_BRIGADE_GUARD =
            ITEMS.register("nilfgaard_cc_impera_brigade_guard",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_CC_LETHO_OF_GULET =
            ITEMS.register("nilfgaard_cc_letho_of_gulet",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_CC_MENNO_COEHOORN =
            ITEMS.register("nilfgaard_cc_menno_coehoorn",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_CC_MORTEISEN =
            ITEMS.register("nilfgaard_cc_morteisen",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_CC_NAUSICAA_CAVALRY_RIDER =
            ITEMS.register("nilfgaard_cc_nausicaa_cavalry_rider",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_CC_RAINFARN =
            ITEMS.register("nilfgaard_cc_rainfarn",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_CC_SHILARD_FITZ_OESTERLEN =
            ITEMS.register("nilfgaard_cc_shilard_fitz_oesterlen",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_CC_STEFAN_SKELLEN =
            ITEMS.register("nilfgaard_cc_stefan_skellen",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_CC_VATTIER_DE_RIDEAUX =
            ITEMS.register("nilfgaard_cc_vattier_de_rideaux",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_CC_VREEMDE =
            ITEMS.register("nilfgaard_cc_vreemde",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_CC_YOUNG_EMISSARY =
            ITEMS.register("nilfgaard_cc_young_emissary",
                    () -> new GwentCardItem(new Item.Properties(), false));

    // Nilfgaardian Empire Ranged Cards
    public static final DeferredItem<GwentCardItem> NILFGAARD_RANGED_ALBRICH =
            ITEMS.register("nilfgaard_ranged_albrich",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_RANGED_ASSIRE_VAR_ANAHID =
            ITEMS.register("nilfgaard_ranged_assire_var_anahid",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_RANGED_BLACK_INFANTRY_ARCHER =
            ITEMS.register("nilfgaard_ranged_black_infantry_archer",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_RANGED_CYNTHIA =
            ITEMS.register("nilfgaard_ranged_cynthia",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_RANGED_ETOLIAN_AUXILIARY_ARCHERS =
            ITEMS.register("nilfgaard_ranged_etolian_auxiliary_archers",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_RANGED_FRINGILLA_VIGO =
            ITEMS.register("nilfgaard_ranged_fringilla_vigo",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_RANGED_PUTTKAMMER =
            ITEMS.register("nilfgaard_ranged_puttkammer",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_RANGED_RENUALD_AEP_MATSEN =
            ITEMS.register("nilfgaard_ranged_renuald_aep_matsen",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_RANGED_SWEERS =
            ITEMS.register("nilfgaard_ranged_sweers",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_RANGED_TIBOR_EGBRACHT =
            ITEMS.register("nilfgaard_ranged_tibor_egbracht",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_RANGED_VANHEMAR =
            ITEMS.register("nilfgaard_ranged_vanhemar",
                    () -> new GwentCardItem(new Item.Properties(), false));

    // Nilfgaardian Empire Siege Cards
    public static final DeferredItem<GwentCardItem> NILFGAARD_SIEGE_HEAVY_ZERRIKANIAN_FIRE_SCORPION =
            ITEMS.register("nilfgaard_siege_heavy_zerrikanian_fire_scorpion",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_SIEGE_MORVRAN_VOORHIS =
            ITEMS.register("nilfgaard_siege_morvran_voorhis",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_SIEGE_ROTTEN_MANGONEL =
            ITEMS.register("nilfgaard_siege_rotten_mangonel",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_SIEGE_SIEGE_ENGINEER =
            ITEMS.register("nilfgaard_siege_siege_engineer",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_SIEGE_SIEGE_TECHNICIAN =
            ITEMS.register("nilfgaard_siege_siege_technician",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> NILFGAARD_SIEGE_ZERRIKANIAN_FIRE_SCORPION =
            ITEMS.register("nilfgaard_siege_zerrikanian_fire_scorpion",
                    () -> new GwentCardItem(new Item.Properties(), false));


    // SKELLIGE LEADER CARDS
    public static final DeferredItem<GwentCardItem> SKELLIGE_CRACH_AN_CRAITE =
            ITEMS.register("skellige_leader_crach_an_craite",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_KING_BRAN =
            ITEMS.register("skellige_leader_king_bran",
                    () -> new GwentCardItem(new Item.Properties(), false));

    // SKELLIGE CLOSE COMBAT CARDS
    public static final DeferredItem<GwentCardItem> SKELLIGE_CC_BERSERKER =
            ITEMS.register("skellige_cc_berserker",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_CC_BIRNA_BRAN =
            ITEMS.register("skellige_cc_birna_bran",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_CC_BLUEBOY_LUGOS =
            ITEMS.register("skellige_cc_blueboy_lugos",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_CC_CERYS =
            ITEMS.register("skellige_cc_cerys",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_CC_CLAN_AN_CRAITE_WARRIOR =
            ITEMS.register("skellige_cc_clan_an_craite_warrior",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_CC_CLAN_DRUMMOND_SHIELD_MAIDEN =
            ITEMS.register("skellige_cc_clan_drummond_shield_maiden",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_CC_CLAN_HEYMAEY_SKALD =
            ITEMS.register("skellige_cc_clan_heymaey_skald",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_CC_CLAN_TORDARROCH_ARMORSMITH =
            ITEMS.register("skellige_cc_clan_tordarroch_armorsmith",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_CC_DONAR_AN_HINDAR =
            ITEMS.register("skellige_cc_donar_an_hindar",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_CC_MADMAN_LUGOS =
            ITEMS.register("skellige_cc_madman_lugos",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_CC_SVANRIGE =
            ITEMS.register("skellige_cc_svanrige",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_CC_UDALRYK =
            ITEMS.register("skellige_cc_udalryk",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_CC_KAMBI =
            ITEMS.register("skellige_cc_kambi",
                    () -> new GwentCardItem(new Item.Properties(), false));

    // SKELLIGE RANGED CARDS
    public static final DeferredItem<GwentCardItem> SKELLIGE_RANGED_CLAN_BROKVAR_ARCHER =
            ITEMS.register("skellige_ranged_clan_brokvar_archer",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_RANGED_CLAN_DIMUN_PIRATE =
            ITEMS.register("skellige_ranged_clan_dimun_pirate",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_RANGED_ERMION =
            ITEMS.register("skellige_ranged_ermion",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_RANGED_HJALMAR =
            ITEMS.register("skellige_ranged_hjalmar",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_RANGED_LIGHT_LONGSHIP =
            ITEMS.register("skellige_ranged_light_longship",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_RANGED_YOUNG_BERSERKER =
            ITEMS.register("skellige_ranged_young_berserker",
                    () -> new GwentCardItem(new Item.Properties(), false));

    // SKELLIGE SIEGE CARDS
    public static final DeferredItem<GwentCardItem> SKELLIGE_SIEGE_DRAIG_BON_DHU =
            ITEMS.register("skellige_siege_draig_bon_dhu",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_SIEGE_HOLGER_BLACKHAND =
            ITEMS.register("skellige_siege_holger_blackhand",
                    () -> new GwentCardItem(new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> SKELLIGE_SIEGE_WAR_LONGSHIP =
            ITEMS.register("skellige_siege_war_longship",
                    () -> new GwentCardItem(new Item.Properties(), false));

    // SKELLIGE AGILE CARDS
    public static final DeferredItem<GwentCardItem> SKELLIGE_AGILE_OLAF =
            ITEMS.register("skellige_agile_olaf",
                    () -> new GwentCardItem(new Item.Properties(), false));

    // SKELLIGE SPECIAL CARDS
    public static final DeferredItem<GwentCardItem> SKELLIGE_SPECIAL_MARDROEME =
            ITEMS.register("skellige_special_mardroeme",
                    () -> new GwentCardItem(new Item.Properties(), false));


    // Gwent Guide Book
    public static final DeferredItem<GwentGuide> GWENTGUIDE =
            ITEMS.register("gwentguide",
                    () -> new GwentGuide(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}