package com.ilovelasagna.gwentcraft.items;

import com.ilovelasagna.gwentcraft.GwentCraft;
import com.ilovelasagna.gwentcraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(
                    Registries.CREATIVE_MODE_TAB,
                    GwentCraft.MOD_ID
            );

    public static final Supplier<CreativeModeTab> GWENT_ITEMS_TAB =
            CREATIVE_MODE_TAB.register("gwent_item_tab",
                    () -> new RotatingGwentCreativeModeTab(
                            CreativeModeTab.builder()
                                    .title(Component.translatable(
                                            "creativetab.gwentcraft.gwent_items"))
                                    .displayItems((itemDisplayParameters, output) -> {

                                        // ==================================================
                                        // MONSTERS
                                        // ==================================================

                                        // Leaders
                                        output.accept(ModItems.EREDIN_1.get());
                                        output.accept(ModItems.EREDIN_2.get());
                                        output.accept(ModItems.EREDIN_3.get());
                                        output.accept(ModItems.EREDIN_4.get());
                                        output.accept(ModItems.EREDIN_5.get());

                                        // Heroes

                                        // Close Combat
                                        output.accept(ModItems.MONSTER_CC_WEREWOLF.get());
                                        output.accept(ModItems.MONSTER_CC_PLAGUEMAIDEN.get());
                                        output.accept(ModItems.MONSTER_CC_NEKKER.get());
                                        output.accept(ModItems.MONSTER_CC_IMLERITH.get());
                                        output.accept(ModItems.MONSTER_CC_GRIFFIN.get());
                                        output.accept(ModItems.MONSTER_CC_GHOUL.get());
                                        output.accept(ModItems.MONSTER_CC_FRIGHTENER.get());
                                        output.accept(ModItems.MONSTER_CC_FORKTAIL.get());
                                        output.accept(ModItems.MONSTER_CC_FOGLET.get());
                                        output.accept(ModItems.MONSTER_CC_FIEND.get());
                                        output.accept(ModItems.MONSTER_CC_DRAUG.get());
                                        output.accept(ModItems.MONSTER_CC_BOTCHLING.get());
                                        output.accept(ModItems.MONSTER_CC_ARACHAS.get());

                                        // Crones
                                        output.accept(ModItems.MONSTER_CC_CRONE_1.get());
                                        output.accept(ModItems.MONSTER_CC_CRONE_2.get());
                                        output.accept(ModItems.MONSTER_CC_CRONE_3.get());

                                        // Vampires
                                        output.accept(ModItems.MONSTER_CC_VAMPIRE_1.get());
                                        output.accept(ModItems.MONSTER_CC_VAMPIRE_2.get());
                                        output.accept(ModItems.MONSTER_CC_VAMPIRE_3.get());
                                        output.accept(ModItems.MONSTER_CC_VAMPIRE_4.get());
                                        output.accept(ModItems.MONSTER_CC_VAMPIRE_5.get());

                                        // Agile cards grouped under CC
                                        output.accept(ModItems.MONSTER_RANGED_KAYRAN.get());
                                        output.accept(ModItems.MONSTER_RANGED_HARPY.get());
                                        output.accept(ModItems.MONSTER_RANGED_CELAENOHARPY.get());

                                        // Ranged
                                        output.accept(ModItems.MONSTER_RANGED_WYVERN.get());
                                        output.accept(ModItems.MONSTER_RANGED_LESHEN.get());
                                        output.accept(ModItems.MONSTER_RANGED_TOAD.get());
                                        output.accept(ModItems.MONSTER_RANGED_GRAVEHAG.get());
                                        output.accept(ModItems.MONSTER_RANGED_GARGOYLE.get());
                                        output.accept(ModItems.MONSTER_RANGED_ENDREGA.get());
                                        output.accept(ModItems.MONSTER_RANGED_COCKATRICE.get());

                                        // Siege
                                        output.accept(ModItems.MONSTER_SIEGE_ICEGIANT.get());
                                        output.accept(ModItems.MONSTER_SIEGE_FIREELEMENTAL.get());
                                        output.accept(ModItems.MONSTER_SIEGE_EARTHELEMENTAL.get());
                                        output.accept(ModItems.MONSTER_SIEGE_ARACHASBEHEMOTH.get());

                                        // Special


                                        // ==================================================
                                        // NILFGAARD
                                        // ==================================================

                                        // Leaders
                                        output.accept(ModItems.EMHYR_1.get());
                                        output.accept(ModItems.EMHYR_2.get());
                                        output.accept(ModItems.EMHYR_3.get());
                                        output.accept(ModItems.EMHYR_4.get());
                                        output.accept(ModItems.EMHYR_5.get());
                                        output.accept(ModItems.NILFGAARD_CC_LETHO_OF_GULET.get());
                                        output.accept(ModItems.NILFGAARD_CC_MENNO_COEHOORN.get());
                                        output.accept(ModItems.NILFGAARD_RANGED_TIBOR_EGBRACHT.get());
                                        output.accept(ModItems.NILFGAARD_SIEGE_ZERRIKANIAN_FIRE_SCORPION.get());
                                        output.accept(ModItems.NILFGAARD_SIEGE_MORVRAN_VOORHIS.get());

                                        // Heroes

                                        // Close Combat
                                        output.accept(ModItems.NILFGAARD_CC_CAHIR_MAWR_DYFFRYN_AEP_CEALLACH.get());
                                        output.accept(ModItems.NILFGAARD_CC_IMPERA_BRIGADE_GUARD.get());
                                        output.accept(ModItems.NILFGAARD_CC_MORTEISEN.get());
                                        output.accept(ModItems.NILFGAARD_CC_NAUSICAA_CAVALRY_RIDER.get());
                                        output.accept(ModItems.NILFGAARD_CC_RAINFARN.get());
                                        output.accept(ModItems.NILFGAARD_CC_SHILARD_FITZ_OESTERLEN.get());
                                        output.accept(ModItems.NILFGAARD_CC_STEFAN_SKELLEN.get());
                                        output.accept(ModItems.NILFGAARD_CC_VATTIER_DE_RIDEAUX.get());
                                        output.accept(ModItems.NILFGAARD_CC_VREEMDE.get());
                                        output.accept(ModItems.NILFGAARD_CC_YOUNG_EMISSARY.get());

                                        // Ranged
                                        output.accept(ModItems.NILFGAARD_RANGED_ALBRICH.get());
                                        output.accept(ModItems.NILFGAARD_RANGED_ASSIRE_VAR_ANAHID.get());
                                        output.accept(ModItems.NILFGAARD_RANGED_BLACK_INFANTRY_ARCHER.get());
                                        output.accept(ModItems.NILFGAARD_RANGED_CYNTHIA.get());
                                        output.accept(ModItems.NILFGAARD_RANGED_ETOLIAN_AUXILIARY_ARCHERS.get());
                                        output.accept(ModItems.NILFGAARD_RANGED_FRINGILLA_VIGO.get());
                                        output.accept(ModItems.NILFGAARD_RANGED_PUTTKAMMER.get());
                                        output.accept(ModItems.NILFGAARD_RANGED_RENUALD_AEP_MATSEN.get());
                                        output.accept(ModItems.NILFGAARD_RANGED_SWEERS.get());
                                        output.accept(ModItems.NILFGAARD_RANGED_VANHEMAR.get());

                                        // Siege
                                        output.accept(ModItems.NILFGAARD_SIEGE_HEAVY_ZERRIKANIAN_FIRE_SCORPION.get());
                                        output.accept(ModItems.NILFGAARD_SIEGE_ROTTEN_MANGONEL.get());
                                        output.accept(ModItems.NILFGAARD_SIEGE_SIEGE_ENGINEER.get());
                                        output.accept(ModItems.NILFGAARD_SIEGE_SIEGE_TECHNICIAN.get());

                                        // Special


                                        // ==================================================
                                        // NORTHERN REALMS
                                        // ==================================================

                                        // Leaders
                                        output.accept(ModItems.FOLTEST_1.get());
                                        output.accept(ModItems.FOLTEST_2.get());
                                        output.accept(ModItems.FOLTEST_3.get());
                                        output.accept(ModItems.FOLTEST_4.get());
                                        output.accept(ModItems.FOLTEST_5.get());

                                        // Heroes
                                        output.accept(ModItems.ESTERAD.get());
                                        output.accept(ModItems.JOHN_NATALIS.get());
                                        output.accept(ModItems.PHILIPPA_EILHART.get());
                                        output.accept(ModItems.VERNON_ROCHE.get());

                                        // Close Combat
                                        output.accept(ModItems.NORTHERN_CC_BLUE_STRIPES_COMMANDO.get());
                                        output.accept(ModItems.NORTHERN_CC_POOR_FUCKING_INFANTRY.get());
                                        output.accept(ModItems.NORTHERN_CC_PRINCE_STENNIS.get());
                                        output.accept(ModItems.NORTHERN_CC_REDANIAN_FOOT_SOLDIER.get());
                                        output.accept(ModItems.NORTHERN_CC_SIEGFRIED_OF_DENESLE.get());
                                        output.accept(ModItems.NORTHERN_CC_SIGISMUND_DIJKSTRA.get());
                                        output.accept(ModItems.NORTHERN_CC_VES.get());
                                        output.accept(ModItems.NORTHERN_CC_YARPEN_ZIGRIN.get());

                                        // Ranged
                                        output.accept(ModItems.NORTHERN_RANGED_CRINFRID_REAVERS_DRAGON_HUNTER.get());
                                        output.accept(ModItems.NORTHERN_RANGED_DETHMOLD.get());
                                        output.accept(ModItems.NORTHERN_RANGED_KEIRA_METZ.get());
                                        output.accept(ModItems.NORTHERN_RANGED_SABRINA_GLEVISSIG.get());
                                        output.accept(ModItems.NORTHERN_RANGED_SHELDON_SKAGGS.get());
                                        output.accept(ModItems.NORTHERN_RANGED_SILE_DE_TANSARVILLE.get());

                                        // Siege
                                        output.accept(ModItems.NORTHERN_SIEGE_BALLISTA.get());
                                        output.accept(ModItems.NORTHERN_SIEGE_CATAPULT.get());
                                        output.accept(ModItems.NORTHERN_SIEGE_DUN_BANNER_MEDIC.get());
                                        output.accept(ModItems.NORTHERN_SIEGE_KAEDWENI_SIEGE_EXPERT.get());
                                        output.accept(ModItems.NORTHERN_SIEGE_SIEGE_TOWER.get());
                                        output.accept(ModItems.NORTHERN_SIEGE_THALER.get());
                                        output.accept(ModItems.NORTHERN_SIEGE_TREBUCHET.get());

                                        // Special


                                        // ==================================================
                                        // SCOIA'TAEL
                                        // ==================================================

                                        // Leaders
                                        output.accept(ModItems.FRANCESCA_1.get());
                                        output.accept(ModItems.FRANCESCA_2.get());
                                        output.accept(ModItems.FRANCESCA_3.get());
                                        output.accept(ModItems.FRANCESCA_4.get());
                                        output.accept(ModItems.FRANCESCA_5.get());

                                        // Heroes

                                        // Close Combat
                                        output.accept(ModItems.SCOIATAEL_CC_DWARVEN_SKIRMISHER.get());
                                        output.accept(ModItems.SCOIATAEL_CC_ELVEN_SKIRMISHER.get());
                                        output.accept(ModItems.SCOIATAEL_CC_HAVEKAR_SMUGGLER.get());
                                        output.accept(ModItems.SCOIATAEL_CC_MAHAKAMAN_DEFENDER.get());
                                        output.accept(ModItems.SCOIATAEL_CC_TORUVIEL.get());

                                        // Agile cards grouped under CC
                                        output.accept(ModItems.SCOIATAEL_AGILE_BARCLAY_ELS.get());
                                        output.accept(ModItems.SCOIATAEL_AGILE_CIARAN.get());
                                        output.accept(ModItems.SCOIATAEL_AGILE_DOL_BLATHANNA_SCOUT.get());
                                        output.accept(ModItems.SCOIATAEL_AGILE_FILAVANDREL.get());
                                        output.accept(ModItems.SCOIATAEL_AGILE_VRIHEDD_BRIGADE_VETERAN.get());
                                        output.accept(ModItems.SCOIATAEL_AGILE_YAEVINN.get());

                                        // Ranged
                                        output.accept(ModItems.SCOIATAEL_RANGED_DENNIS_CRANMER.get());
                                        output.accept(ModItems.SCOIATAEL_RANGED_DOL_BLATHANNA_ARCHER.get());
                                        output.accept(ModItems.SCOIATAEL_RANGED_EITHNE.get());
                                        output.accept(ModItems.SCOIATAEL_RANGED_HAVEKAR_HEALER.get());
                                        output.accept(ModItems.SCOIATAEL_RANGED_IDA_EMEAN.get());
                                        output.accept(ModItems.SCOIATAEL_RANGED_IORVETH.get());
                                        output.accept(ModItems.SCOIATAEL_RANGED_ISENGRIM.get());
                                        output.accept(ModItems.SCOIATAEL_RANGED_MILVA.get());
                                        output.accept(ModItems.SCOIATAEL_RANGED_RIORDAIN.get());
                                        output.accept(ModItems.SCOIATAEL_RANGED_SAESENTHESSIS.get());
                                        output.accept(ModItems.SCOIATAEL_RANGED_SCHIRRU.get());

                                        // Siege
                                        output.accept(ModItems.SCOIATAEL_SIEGE_VRIHEDD_BRIGADE_RECRUIT.get());

                                        // Special


                                        // ==================================================
                                        // SKELLIGE
                                        // ==================================================

                                        // Leaders
                                        output.accept(ModItems.SKELLIGE_CRACH_AN_CRAITE.get());
                                        output.accept(ModItems.SKELLIGE_KING_BRAN.get());

                                        // Heroes

                                        // Close Combat
                                        output.accept(ModItems.SKELLIGE_CC_BERSERKER.get());
                                        output.accept(ModItems.SKELLIGE_CC_BIRNA_BRAN.get());
                                        output.accept(ModItems.SKELLIGE_CC_BLUEBOY_LUGOS.get());
                                        output.accept(ModItems.SKELLIGE_CC_CERYS.get());
                                        output.accept(ModItems.SKELLIGE_CC_CLAN_AN_CRAITE_WARRIOR.get());
                                        output.accept(ModItems.SKELLIGE_CC_CLAN_DRUMMOND_SHIELD_MAIDEN.get());
                                        output.accept(ModItems.SKELLIGE_CC_CLAN_TORDARROCH_ARMORSMITH.get());
                                        output.accept(ModItems.SKELLIGE_CC_DONAR_AN_HINDAR.get());
                                        output.accept(ModItems.SKELLIGE_CC_MADMAN_LUGOS.get());
                                        output.accept(ModItems.SKELLIGE_CC_SVANRIGE.get());
                                        output.accept(ModItems.SKELLIGE_CC_UDALRYK.get());
                                        output.accept(ModItems.SKELLIGE_CC_KAMBI.get());

                                        // Agile cards grouped under CC
                                        output.accept(ModItems.SKELLIGE_AGILE_OLAF.get());

                                        // Ranged
                                        output.accept(ModItems.SKELLIGE_RANGED_HJALMAR.get());
                                        output.accept(ModItems.SKELLIGE_RANGED_ERMION.get());
                                        output.accept(ModItems.SKELLIGE_RANGED_CLAN_BROKVAR_ARCHER.get());
                                        output.accept(ModItems.SKELLIGE_RANGED_CLAN_DIMUN_PIRATE.get());
                                        output.accept(ModItems.SKELLIGE_RANGED_LIGHT_LONGSHIP.get());
                                        output.accept(ModItems.SKELLIGE_RANGED_YOUNG_BERSERKER.get());

                                        // Siege
                                        output.accept(ModItems.SKELLIGE_SIEGE_DRAIG_BON_DHU.get());
                                        output.accept(ModItems.SKELLIGE_SIEGE_HOLGER_BLACKHAND.get());
                                        output.accept(ModItems.SKELLIGE_SIEGE_WAR_LONGSHIP.get());

                                        // Special
                                        output.accept(ModItems.SKELLIGE_SPECIAL_MARDROEME.get());


                                        // ==================================================
                                        // NEUTRAL
                                        // ==================================================

                                        // Leaders

                                        // Heroes
                                        output.accept(ModItems.NEUTRAL_GERALT.get());
                                        output.accept(ModItems.NEUTRAL_CIRI.get());
                                        output.accept(ModItems.NEUTRAL_YENN.get());

                                        // Close Combat
                                        output.accept(ModItems.NEUTRAL_MYSTERIOUS_ELF.get());
                                        output.accept(ModItems.NEUTRAL_TRISS.get());
                                        output.accept(ModItems.NEUTRAL_BOVINE_DEFENSE_FORCE.get());
                                        output.accept(ModItems.NEUTRAL_DANDELION.get());
                                        output.accept(ModItems.NEUTRAL_EMIEL_REGIS.get());
                                        output.accept(ModItems.NEUTRAL_ROACH.get());
                                        output.accept(ModItems.NEUTRAL_VESEMIR.get());
                                        output.accept(ModItems.NEUTRAL_VILLENTRETENMERTH.get());
                                        output.accept(ModItems.NEUTRAL_ZOLTAN.get());
                                        output.accept(ModItems.NEUTRAL_COW.get());
                                        output.accept(ModItems.NEUTRAL_GAUNTER_ODIMM_DARKNESS.get());
                                        output.accept(ModItems.NEUTRAL_GAUNTER_ODIMM.get());
                                        output.accept(ModItems.NEUTRAL_OLGIERD.get());

                                        // Ranged

                                        // Siege

                                        // Special
                                        output.accept(ModItems.NEUTRAL_HORN.get());
                                        output.accept(ModItems.NEUTRAL_DECOY.get());
                                        output.accept(ModItems.NEUTRAL_SCORCH.get());
                                        output.accept(ModItems.NEUTRAL_BITING_FROST.get());
                                        output.accept(ModItems.NEUTRAL_CLEAR_WEATHER.get());
                                        output.accept(ModItems.NEUTRAL_IMPENETRABLE_FOG.get());
                                        output.accept(ModItems.NEUTRAL_SKELLIGE_STORM.get());
                                        output.accept(ModItems.NEUTRAL_TORRENTIAL_RAIN.get());


                                        // ==================================================
                                        // OTHER ITEMS
                                        // ==================================================

                                        // Gwent Guide Book
                                        output.accept(ModItems.GWENTGUIDE.get());

                                        // Keg block
                                        output.accept(ModBlocks.JOB_BLOCK.get());
                                    })
                    ));

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}