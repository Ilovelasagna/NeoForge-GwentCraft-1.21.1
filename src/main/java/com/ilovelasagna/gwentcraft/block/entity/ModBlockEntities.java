package com.ilovelasagna.gwentcraft.block.entity;

import com.ilovelasagna.gwentcraft.GwentCraft;
import com.ilovelasagna.gwentcraft.block.ModBlocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;

import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(
                    Registries.BLOCK_ENTITY_TYPE,
                    GwentCraft.MOD_ID
            );

    public static final Supplier<BlockEntityType<JobBlockEntity>> JOB_BLOCK_ENTITY =
            BLOCK_ENTITIES.register(
                    "job_block",
                    () -> BlockEntityType.Builder.of(
                            JobBlockEntity::new,
                            ModBlocks.JOB_BLOCK.get()
                    ).build(null)
            );

    private ModBlockEntities() {
    }
}