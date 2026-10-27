package com.ilovelasagna.gwentcraft;

import com.ilovelasagna.gwentcraft.block.entity.ModBlockEntities;

import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;

public class ModCapabilities {

    public static void registerCapabilities(
            RegisterCapabilitiesEvent event) {

        event.registerBlockEntity(
                Capabilities.FluidHandler.BLOCK,
                ModBlockEntities.JOB_BLOCK_ENTITY.get(),
                (blockEntity, side) -> blockEntity.getFluidHandler()
        );
    }
}