package com.chaka.thebackwoods.item.tool;

import com.chaka.thebackwoods.util.Reference;
import com.chaka.thebackwoods.util.TBWTab;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemTBWSword extends ItemSword {

    public ItemTBWSword(ToolMaterial material) {

        super(material);
        this.setCreativeTab(TBWTab.TAB_TOOLS);
        this.maxStackSize = 1;
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