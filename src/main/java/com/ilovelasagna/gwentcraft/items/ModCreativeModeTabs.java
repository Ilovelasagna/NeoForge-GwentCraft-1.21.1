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
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GwentCraft.MOD_ID);

    public static final Supplier<CreativeModeTab> GWENT_ITEMS_TAB = CREATIVE_MODE_TAB.register( "gwent_item_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EREDIN_1.get()))
                    .title(Component.translatable("creativetab.gwentcraft.gwent_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.EREDIN_1);
                        output.accept(ModItems.EREDIN_2);
                        output.accept(ModBlocks.JOB_BLOCK);
                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
