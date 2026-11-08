package com.ilovelasagna.gwentcraft.registry;

import com.ilovelasagna.gwentcraft.GwentCraft;
import com.ilovelasagna.gwentcraft.menu.GwentCollectionMenu;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModMenus {

    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(
                    Registries.MENU,
                    GwentCraft.MOD_ID
            );

    public static final Supplier<MenuType<GwentCollectionMenu>>
            GWENT_COLLECTION = MENUS.register(
            "gwent_collection",
            () -> new MenuType<>(
                    GwentCollectionMenu::new,
                    FeatureFlags.DEFAULT_FLAGS
            )
    );

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}