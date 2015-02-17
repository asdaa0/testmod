package com.asdaa.testmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ModItems.testingDragon), "b b", "bbb", " b ", 'b', new ItemStack(ModItems.blaziumIngot));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blaziumIngot, 6), new ItemStack(ModItems.testingDragon));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.saladBowl), "   ", "q q", " q ", 'q', "gemQuartz"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.quartz), new ItemStack(ModBlocks.saladBowl)));
    }
}
