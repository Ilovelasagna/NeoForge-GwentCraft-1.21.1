package com.ilovelasagna.gwentcraft.client;

import com.ilovelasagna.gwentcraft.GwentCraft;
import com.ilovelasagna.gwentcraft.client.screen.GwentCollectionScreen;
import com.ilovelasagna.gwentcraft.registry.ModMenus;

import net.minecraft.client.gui.screens.MenuScreens;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;

@EventBusSubscriber(
        modid = GwentCraft.MOD_ID,
        bus = EventBusSubscriber.Bus.MOD,
        value = Dist.CLIENT
)
public class GwentCraftClient {

    @SubscribeEvent
    public static void registerScreens(
            RegisterMenuScreensEvent event) {

        event.register(
                ModMenus.GWENT_COLLECTION.get(),
                GwentCollectionScreen::new
        );
    }
}