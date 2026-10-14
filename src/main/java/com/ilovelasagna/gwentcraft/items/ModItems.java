package com.ilovelasagna.gwentcraft.items;

import com.ilovelasagna.gwentcraft.GwentCraft;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GwentCraft.MOD_ID);

    public static final DeferredItem<Item> EREDIN_1 = ITEMS.register("eredin_1",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EREDIN_2 = ITEMS.register("eredin_2",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
