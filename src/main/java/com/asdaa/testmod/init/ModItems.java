package com.asdaa.testmod.init;

import com.asdaa.testmod.item.ItemTM;
import com.asdaa.testmod.item.ItemTestingDragon;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemTM testingDragon = new ItemTestingDragon();

    public static void init(){
        GameRegistry.registerItem(testingDragon, "testingDragon");
    }
}
