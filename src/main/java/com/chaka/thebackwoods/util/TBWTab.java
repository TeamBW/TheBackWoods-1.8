package com.chaka.thebackwoods.util;

import com.chaka.thebackwoods.init.ModBlocks;
import com.chaka.thebackwoods.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TBWTab {

    public static final CreativeTabs TAB = new CreativeTabs("TheBackWoodsBlocks".toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.testBlock);
        }
    };

    public static final CreativeTabs TAB_TOOLS = new CreativeTabs("TheBackWoodsTools".toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.amethystPickaxe;
        }
    };
}

