package com.ilovelasagna.gwentcraft.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class RotatingGwentCreativeModeTab extends CreativeModeTab {

    private static int currentIcon = 0;

    public RotatingGwentCreativeModeTab(Builder builder) {
        super(builder);
    }

    // Move to the next faction leader.
    public static void advanceIcon() {
        currentIcon = (currentIcon + 1) % 5;
    }

    // Return the current faction leader as the tab icon.
    @Override
    public ItemStack getIconItem() {
        return switch (currentIcon) {
            case 0 -> ModItems.EREDIN_1.get().getDefaultInstance();
            case 1 -> ModItems.EMHYR_1.get().getDefaultInstance();
            case 2 -> ModItems.FOLTEST_1.get().getDefaultInstance();
            case 3 -> ModItems.FRANCESCA_1.get().getDefaultInstance();
            case 4 -> ModItems.SKELLIGE_CRACH_AN_CRAITE.get().getDefaultInstance();
            default -> ModItems.EREDIN_1.get().getDefaultInstance();
        };
    }
}
