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

    public static final DeferredItem<GwentCardItem> EREDIN_3 =
            ITEMS.register("eredin_3",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> EREDIN_4 =
            ITEMS.register("eredin_4",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> EREDIN_5 =
            ITEMS.register("eredin_5",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_WEREWOLF =
            ITEMS.register("monster_cc_werewolf",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_CC_PLAGUEMAIDEN =
            ITEMS.register("monster_cc_plaguemaiden",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_CC_NEKKER =
            ITEMS.register("monster_cc_nekker",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_CC_IMlERITH =
            ITEMS.register("monster_cc_imlerith",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_CC_GRIFFIN =
            ITEMS.register("monster_cc_griffin",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_CC_ghoul =
            ITEMS.register("monster_cc_ghoul",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_CC_FRIGHTENER =
            ITEMS.register("monster_cc_frightener",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_CC_FORKTAIL =
            ITEMS.register("monster_cc_forktail",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_CC_FOGLET =
            ITEMS.register("monster_cc_foglet",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_CC_FIEND =
            ITEMS.register("monster_cc_fiend",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_CC_DRAUG =
            ITEMS.register("monster_cc_draug",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_CC_BOTCHLING =
            ITEMS.register("monster_cc_botchling",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_CC_ARACHAS =
            ITEMS.register("monster_cc_arachas",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_CC_CRONE_1 =
            ITEMS.register("monster_cc_crone_1",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_CC_CRONE_2 =
            ITEMS.register("monster_cc_crone_2",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_CC_CRONE_3 =
            ITEMS.register("monster_cc_crone_3",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));


    public static final DeferredItem<GwentCardItem> MONSTER_CC_VAMPIRE_1 =
            ITEMS.register("monster_cc_vampire_1",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_CC_VAMPIRE_2 =
            ITEMS.register("monster_cc_vampire_2",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_CC_VAMPIRE_3 =
            ITEMS.register("monster_cc_vampire_3",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_CC_VAMPIRE_4 =
            ITEMS.register("monster_cc_vampire_4",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_CC_VAMPIRE_5 =
            ITEMS.register("monster_cc_vampire_5",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));

    public static final DeferredItem<GwentCardItem> MONSTER_RANGED_KAYRAN =
            ITEMS.register("monster_ranged_kayran",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_RANGED_HARPY =
            ITEMS.register("monster_ranged_harpy",
                    () -> new GwentCardItem(
                            new Item.Properties(), false));
    public static final DeferredItem<GwentCardItem> MONSTER_RANGED_CELAENOHARPY =
            ITEMS.register("monster_ranged_celaenoharpy",
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
