package com.ilovelasagna.gwentcraft.compat.jade;

import com.ilovelasagna.gwentcraft.GwentCraft;
import com.ilovelasagna.gwentcraft.block.entity.JobBlockEntity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluids;

import snownee.jade.api.BlockAccessor;
import snownee.jade.api.IBlockComponentProvider;
import snownee.jade.api.IServerDataProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;

public enum KegFluidProvider
        implements IBlockComponentProvider,
        IServerDataProvider<BlockAccessor> {

    INSTANCE;

    private static final String AMOUNT_KEY = "KegFluidAmount";
    private static final String CAPACITY_KEY = "KegFluidCapacity";

    @Override
    public ResourceLocation getUid() {
        return ResourceLocation.fromNamespaceAndPath(
                GwentCraft.MOD_ID,
                "keg_fluid"
        );
    }

    @Override
    public void appendServerData(
            CompoundTag data,
            BlockAccessor accessor) {

        if (accessor.getBlockEntity() instanceof JobBlockEntity keg) {
            data.putInt(AMOUNT_KEY, keg.getStoredAmount());
            data.putInt(CAPACITY_KEY, keg.getCapacity());
        }
    }

    @Override
    public void appendTooltip(
            ITooltip tooltip,
            BlockAccessor accessor,
            IPluginConfig config) {

        CompoundTag data = accessor.getServerData();

        if (!data.contains(AMOUNT_KEY)
                || !data.contains(CAPACITY_KEY)) {
            return;
        }

        int amount = data.getInt(AMOUNT_KEY);
        int capacity = data.getInt(CAPACITY_KEY);

        if (amount <= 0 || capacity <= 0) {
            tooltip.add(Component.translatable(
                    "tooltip.gwentcraft.keg_empty"
            ));
            return;
        }

    }
}