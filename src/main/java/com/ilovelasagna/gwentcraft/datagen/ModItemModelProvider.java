package com.ilovelasagna.gwentcraft.datagen;

import com.ilovelasagna.gwentcraft.GwentCraft;
import com.ilovelasagna.gwentcraft.items.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(
            PackOutput output,
            ExistingFileHelper existingFileHelper) {
        super(output, GwentCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        // Monster Leader Cards: shared faction texture
        withExistingParent("eredin_1", "minecraft:item/generated")
                .texture("layer0", modLoc("item/monster_leader"));

        withExistingParent("eredin_2", "minecraft:item/generated")
                .texture("layer0", modLoc("item/monster_leader"));

        // Gwent Guide Book
        basicItem(ModItems.GWENTGUIDE.get());
    }
}