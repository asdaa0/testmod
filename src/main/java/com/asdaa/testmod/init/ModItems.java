package com.asdaa.testmod.init;

import com.asdaa.testmod.item.ItemTM;
import com.asdaa.testmod.item.ItemTestingDragon;
import com.asdaa.testmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemTM testingDragon = new ItemTestingDragon();

    public static void init(){
        GameRegistry.registerItem(testingDragon, "testingDragon");
    }
}
