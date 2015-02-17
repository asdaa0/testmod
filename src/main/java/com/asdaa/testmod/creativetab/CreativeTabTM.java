package com.asdaa.testmod.creativetab;

import com.asdaa.testmod.init.ModItems;
import com.asdaa.testmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTM {
    public static final CreativeTabs TM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.testingDragon;
        }
    };
}
