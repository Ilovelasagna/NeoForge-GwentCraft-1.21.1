package com.ilovelasagna.gwentcraft;

import com.ilovelasagna.gwentcraft.block.ModBlocks;
import com.ilovelasagna.gwentcraft.block.entity.ModBlockEntities;
import com.ilovelasagna.gwentcraft.items.ModCreativeModeTabs;
import com.ilovelasagna.gwentcraft.items.ModItems;
import com.ilovelasagna.gwentcraft.sound.ModSounds;
import com.ilovelasagna.gwentcraft.villagers.ModVillagers;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

import org.slf4j.Logger;

@Mod(GwentCraft.MOD_ID)
public class GwentCraft {

    public static final String MOD_ID = "gwentcraft";
    public static final Logger LOGGER = LogUtils.getLogger();

    public GwentCraft(
            IEventBus modEventBus,
            ModContainer modContainer) {

        // Register lifecycle events.
        modEventBus.addListener(this::commonSetup);

        // Register the Keg's fluid-handler capability.
        modEventBus.addListener(
                ModCapabilities::registerCapabilities
        );

        // Register events handled on the main NeoForge event bus.
        NeoForge.EVENT_BUS.register(this);

        // Register creative tabs, items, blocks, and block entities.
        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.BLOCK_ENTITIES.register(modEventBus);

        // Register sounds and villagers.
        ModSounds.register(modEventBus);
        ModVillagers.register(modEventBus);

        // Register creative inventory modifications.
        modEventBus.addListener(this::addCreative);

        // Register the mod's common configuration.
        modContainer.registerConfig(
                ModConfig.Type.COMMON,
                Config.SPEC
        );
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        // Common setup logic can be added here.
    }

    private void addCreative(
            BuildCreativeModeTabContentsEvent event) {
        // Add creative tab entries here if needed.
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Server-start logic can be added here.
    }
}