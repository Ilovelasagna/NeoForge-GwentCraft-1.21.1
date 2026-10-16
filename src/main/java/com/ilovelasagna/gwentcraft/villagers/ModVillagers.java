package com.ilovelasagna.gwentcraft.villagers;

import com.google.common.collect.ImmutableSet;
import com.ilovelasagna.gwentcraft.GwentCraft;
import com.ilovelasagna.gwentcraft.block.ModBlocks;
import com.ilovelasagna.gwentcraft.sound.ModSounds;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(BuiltInRegistries.POINT_OF_INTEREST_TYPE, GwentCraft.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(BuiltInRegistries.VILLAGER_PROFESSION,GwentCraft.MOD_ID);

    public static final Holder<PoiType> LASAGNA_POI = POI_TYPES.register("lasagna_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.JOB_BLOCK.get().getStateDefinition().getPossibleStates()),1,1));

   public static final Holder<VillagerProfession> INnKEEPER = VILLAGER_PROFESSIONS.register("innkeeper",
            () -> new VillagerProfession("innkeeper", holder -> holder.value() == LASAGNA_POI.value(),
                    poiTypeHolder -> poiTypeHolder.value() == LASAGNA_POI.value(), ImmutableSet.of(), ImmutableSet.of(),
                    ModSounds.KEG_USE.get()));


    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}


