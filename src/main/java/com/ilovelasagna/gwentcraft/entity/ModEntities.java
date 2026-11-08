
package com.ilovelasagna.gwentcraft.entity;

import com.ilovelasagna.gwentcraft.GwentCraft;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(
                    Registries.ENTITY_TYPE,
                    GwentCraft.MOD_ID
            );

    public static final DeferredHolder<EntityType<?>, EntityType<GwentPlayerEntity>> GWENT_PLAYER =
            ENTITY_TYPES.register(
                    "gwent_player",
                    () -> EntityType.Builder.of(
                                    GwentPlayerEntity::new,
                                    MobCategory.CREATURE
                            )
                            .sized(0.6F, 1.95F)
                            .clientTrackingRange(8)
                            .build("gwent_player")
            );

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

    public static void registerAttributes(
            EntityAttributeCreationEvent event
    ) {
        event.put(
                GWENT_PLAYER.get(),
                GwentPlayerEntity.createAttributes().build()
        );
    }
}