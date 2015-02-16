package com.asdaa.testmod.init;

import com.asdaa.testmod.block.BlockSaladBowl;
import com.asdaa.testmod.block.BlockTM;
import com.asdaa.testmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockTM saladBowl = new BlockSaladBowl();

    public static void init(){
        GameRegistry.registerBlock(saladBowl, "saladBowl");
    }
}
