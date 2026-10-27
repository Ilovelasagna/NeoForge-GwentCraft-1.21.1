package com.ilovelasagna.gwentcraft.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;

import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.fluids.capability.templates.FluidTank;

public class JobBlockEntity extends BlockEntity {

    public static final int CAPACITY = 2000;

    private final FluidTank tank = new FluidTank(
            CAPACITY,
            fluid -> fluid.getFluid() == Fluids.WATER
    ) {
        @Override
        protected void onContentsChanged() {
            JobBlockEntity.this.setChanged();

            if (JobBlockEntity.this.level != null
                    && !JobBlockEntity.this.level.isClientSide) {
                JobBlockEntity.this.level.sendBlockUpdated(
                        JobBlockEntity.this.worldPosition,
                        JobBlockEntity.this.getBlockState(),
                        JobBlockEntity.this.getBlockState(),
                        3
                );
            }
        }
    };

    public JobBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.JOB_BLOCK_ENTITY.get(), pos, state);
    }

    public IFluidHandler getFluidHandler() {
        return tank;
    }

    public FluidStack getStoredFluid() {
        return tank.getFluid().copy();
    }

    public int getStoredAmount() {
        return tank.getFluidAmount();
    }

    public int getCapacity() {
        return tank.getCapacity();
    }

    @Override
    protected void saveAdditional(
            CompoundTag tag,
            HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.put("Tank", tank.writeToNBT(registries, new CompoundTag()));
    }

    @Override
    protected void loadAdditional(
            CompoundTag tag,
            HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);

        if (tag.contains("Tank")) {
            tank.readFromNBT(registries, tag.getCompound("Tank"));
        }
    }
}