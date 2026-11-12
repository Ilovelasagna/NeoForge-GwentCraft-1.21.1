package com.ilovelasagna.gwentcraft.client;

import com.ilovelasagna.gwentcraft.GwentCraft;
import com.ilovelasagna.gwentcraft.items.RotatingGwentCreativeModeTab;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;

@EventBusSubscriber(
        modid = GwentCraft.MOD_ID,
        value = Dist.CLIENT
)
public class GwentTabIconTicker {

    private static int ticks = 0;

    @SubscribeEvent
    public static void onClientTick(ClientTickEvent.Post event) {

        ticks++;

        // Change the icon every 40 ticks (approximately 2 seconds).
        if (ticks >= 40) {
            ticks = 0;
            RotatingGwentCreativeModeTab.advanceIcon();
        }
    }
}
