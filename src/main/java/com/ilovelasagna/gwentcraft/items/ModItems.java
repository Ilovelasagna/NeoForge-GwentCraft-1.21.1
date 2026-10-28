package com.ilovelasagna.gwentcraft.items;

import com.ilovelasagna.gwentcraft.GwentCraft;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GwentCraft.MOD_ID);

    //Gwent Cards
    public static final DeferredItem<GwentCardItem> EREDIN_1 =
            ITEMS.register("eredin_1",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> EREDIN_2 =
            ITEMS.register("eredin_2",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));


    //Gwent Guide Book
    public static final DeferredItem<Item> GWENTGUIDE =
            ITEMS.register("gwentguide",
                    () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
