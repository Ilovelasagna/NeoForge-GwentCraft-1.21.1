package com.ilovelasagna.gwentcraft.compat.jade;

import com.ilovelasagna.gwentcraft.block.JobBlock;
import com.ilovelasagna.gwentcraft.block.entity.JobBlockEntity;

import snownee.jade.api.IWailaClientRegistration;
import snownee.jade.api.IWailaCommonRegistration;
import snownee.jade.api.IWailaPlugin;
import snownee.jade.api.WailaPlugin;

@WailaPlugin
public class KegJadePlugin implements IWailaPlugin {

    @Override
    public void register(IWailaCommonRegistration registration) {
        registration.registerBlockDataProvider(
                KegFluidProvider.INSTANCE,
                JobBlockEntity.class
        );
    }

    @Override
    public void registerClient(IWailaClientRegistration registration) {
        registration.registerBlockComponent(
                KegFluidProvider.INSTANCE,
                JobBlock.class
        );
    }
}