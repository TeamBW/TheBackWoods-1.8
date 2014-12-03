package com.chaka.thebackwoods.item;

import com.chaka.thebackwoods.util.Reference;
import com.chaka.thebackwoods.util.TBWTab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemTBW extends Item {

    public ItemTBW() {

        super();
        this.setCreativeTab(TBWTab.TAB);
    }

    @Override
    public String getUnlocalizedName() {

        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {

        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
