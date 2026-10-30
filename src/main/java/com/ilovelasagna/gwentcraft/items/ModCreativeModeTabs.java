
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