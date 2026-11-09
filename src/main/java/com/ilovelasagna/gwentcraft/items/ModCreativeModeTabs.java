
package com.ilovelasagna.gwentcraft.items;

import com.ilovelasagna.gwentcraft.GwentCraft;
import com.ilovelasagna.gwentcraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
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
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModItems.EREDIN_1.get()))
                            .title(Component.translatable(
                                    "creativetab.gwentcraft.gwent_items"))
                            .displayItems((itemDisplayParameters, output) -> {

                                // Monster faction leaders
                                output.accept(ModItems.EREDIN_1.get());
                                output.accept(ModItems.EREDIN_2.get());
                                output.accept(ModItems.EREDIN_3.get());
                                output.accept(ModItems.EREDIN_4.get());
                                output.accept(ModItems.EREDIN_5.get());

                                // Monster Close Combat cards
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

                                // Crone cards
                                output.accept(ModItems.MONSTER_CC_CRONE_1.get());
                                output.accept(ModItems.MONSTER_CC_CRONE_2.get());
                                output.accept(ModItems.MONSTER_CC_CRONE_3.get());

                                // Vampire cards
                                output.accept(ModItems.MONSTER_CC_VAMPIRE_1.get());
                                output.accept(ModItems.MONSTER_CC_VAMPIRE_2.get());
                                output.accept(ModItems.MONSTER_CC_VAMPIRE_3.get());
                                output.accept(ModItems.MONSTER_CC_VAMPIRE_4.get());
                                output.accept(ModItems.MONSTER_CC_VAMPIRE_5.get());

                                // Monster Ranged cards
                                output.accept(ModItems.MONSTER_RANGED_WYVERN.get());
                                output.accept(ModItems.MONSTER_RANGED_LESHEN.get());
                                output.accept(ModItems.MONSTER_RANGED_TOAD.get());
                                output.accept(ModItems.MONSTER_RANGED_GRAVEHAG.get());
                                output.accept(ModItems.MONSTER_RANGED_GARGOYLE.get());
                                output.accept(ModItems.MONSTER_RANGED_ENDREGA.get());
                                output.accept(ModItems.MONSTER_RANGED_COCKATRICE.get());

                                // Monster Siege cards
                                output.accept(ModItems.MONSTER_SIEGE_ICEGIANT.get());
                                output.accept(ModItems.MONSTER_SIEGE_FIREELEMENTAL.get());
                                output.accept(ModItems.MONSTER_SIEGE_EARTHELEMENTAL.get());
                                output.accept(ModItems.MONSTER_SIEGE_ARACHASBEHEMOTH.get());

                                // Monster Agile cards
                                output.accept(ModItems.MONSTER_RANGED_KAYRAN.get());
                                output.accept(ModItems.MONSTER_RANGED_HARPY.get());
                                output.accept(ModItems.MONSTER_RANGED_CELAENOHARPY.get());

                                //Neutral Hero Cards
                                output.accept(ModItems.NEUTRAL_GERALT.get());
                                output.accept(ModItems.NEUTRAL_CIRI.get());
                                output.accept(ModItems.NEUTRAL_YENN.get());

                                //Neutral CC Cards
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

                                output.accept(ModItems.NEUTRAL_HORN.get());
                                output.accept(ModItems.NEUTRAL_DECOY.get());
                                output.accept(ModItems.NEUTRAL_SCORCH.get());

                                output.accept(ModItems.NEUTRAL_BITING_FROST.get());
                                output.accept(ModItems.NEUTRAL_CLEAR_WEATHER.get());
                                output.accept(ModItems.NEUTRAL_IMPENETRABLE_FOG.get());
                                output.accept(ModItems.NEUTRAL_SKELLIGE_STORM.get());
                                output.accept(ModItems.NEUTRAL_TORRENTIAL_RAIN.get());

                                // Northern Realms Leader Cards
                                output.accept(ModItems.FOLTEST_1.get());
                                output.accept(ModItems.FOLTEST_2.get());
                                output.accept(ModItems.FOLTEST_3.get());
                                output.accept(ModItems.FOLTEST_4.get());
                                output.accept(ModItems.FOLTEST_5.get());
                                output.accept(ModItems.ESTERAD.get());
                                output.accept(ModItems.JOHN_NATALIS.get());
                                output.accept(ModItems.PHILIPPA_EILHART.get());
                                output.accept(ModItems.VERNON_ROCHE.get());


                                // Northern Realms Close Combat cards
                                output.accept(ModItems.NORTHERN_CC_BLUE_STRIPES_COMMANDO.get());
                                output.accept(ModItems.NORTHERN_CC_POOR_FUCKING_INFANTRY.get());
                                output.accept(ModItems.NORTHERN_CC_PRINCE_STENNIS.get());
                                output.accept(ModItems.NORTHERN_CC_REDANIAN_FOOT_SOLDIER.get());
                                output.accept(ModItems.NORTHERN_CC_SIEGFRIED_OF_DENESLE.get());
                                output.accept(ModItems.NORTHERN_CC_SIGISMUND_DIJKSTRA.get());
                                output.accept(ModItems.NORTHERN_CC_VES.get());
                                output.accept(ModItems.NORTHERN_CC_YARPEN_ZIGRIN.get());


                                // Northern Realms Ranged cards
                                output.accept(ModItems.NORTHERN_RANGED_CRINFRID_REAVERS_DRAGON_HUNTER.get());
                                output.accept(ModItems.NORTHERN_RANGED_DETHMOLD.get());
                                output.accept(ModItems.NORTHERN_RANGED_KEIRA_METZ.get());
                                output.accept(ModItems.NORTHERN_RANGED_SABRINA_GLEVISSIG.get());
                                output.accept(ModItems.NORTHERN_RANGED_SHELDON_SKAGGS.get());
                                output.accept(ModItems.NORTHERN_RANGED_SILE_DE_TANSARVILLE.get());


                                // Northern Realms Siege cards
                                output.accept(ModItems.NORTHERN_SIEGE_BALLISTA.get());
                                output.accept(ModItems.NORTHERN_SIEGE_CATAPULT.get());
                                output.accept(ModItems.NORTHERN_SIEGE_DUN_BANNER_MEDIC.get());
                                output.accept(ModItems.NORTHERN_SIEGE_KAEDWENI_SIEGE_EXPERT.get());
                                output.accept(ModItems.NORTHERN_SIEGE_SIEGE_TOWER.get());
                                output.accept(ModItems.NORTHERN_SIEGE_THALER.get());
                                output.accept(ModItems.NORTHERN_SIEGE_TREBUCHET.get());

                                // Scoia'tael Leader cards
                                output.accept(ModItems.FRANCESCA_1.get());
                                output.accept(ModItems.FRANCESCA_2.get());
                                output.accept(ModItems.FRANCESCA_3.get());
                                output.accept(ModItems.FRANCESCA_4.get());
                                output.accept(ModItems.FRANCESCA_5.get());

                                // Scoia'tael Close Combat cards
                                output.accept(ModItems.SCOIATAEL_CC_DWARVEN_SKIRMISHER.get());
                                output.accept(ModItems.SCOIATAEL_CC_ELVEN_SKIRMISHER.get());
                                output.accept(ModItems.SCOIATAEL_CC_HAVEKAR_SMUGGLER.get());
                                output.accept(ModItems.SCOIATAEL_CC_MAHAKAMAN_DEFENDER.get());
                                output.accept(ModItems.SCOIATAEL_CC_TORUVIEL.get());

                                // Scoia'tael Ranged cards
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

                                // Scoia'tael Siege cards
                                output.accept(ModItems.SCOIATAEL_SIEGE_VRIHEDD_BRIGADE_RECRUIT.get());

                                // Scoia'tael Agile cards
                                output.accept(ModItems.SCOIATAEL_AGILE_BARCLAY_ELS.get());
                                output.accept(ModItems.SCOIATAEL_AGILE_CIARAN.get());
                                output.accept(ModItems.SCOIATAEL_AGILE_DOL_BLATHANNA_SCOUT.get());
                                output.accept(ModItems.SCOIATAEL_AGILE_FILAVANDREL.get());
                                output.accept(ModItems.SCOIATAEL_AGILE_VRIHEDD_BRIGADE_VETERAN.get());
                                output.accept(ModItems.SCOIATAEL_AGILE_YAEVINN.get());



                                // Gwent Guide Book
                                output.accept(ModItems.GWENTGUIDE.get());

                                // Keg block
                                output.accept(ModBlocks.JOB_BLOCK.get());
                            })
                            .build()
            );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}