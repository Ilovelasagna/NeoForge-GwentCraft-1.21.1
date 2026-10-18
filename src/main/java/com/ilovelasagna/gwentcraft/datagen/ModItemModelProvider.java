package com.ilovelasagna.gwentcraft.datagen;

import com.ilovelasagna.gwentcraft.GwentCraft;
import com.ilovelasagna.gwentcraft.items.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GwentCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.EREDIN_1.get());
        basicItem(ModItems.EREDIN_2.get());
        basicItem(ModItems.GWENTGUIDE.get());

    }
}
