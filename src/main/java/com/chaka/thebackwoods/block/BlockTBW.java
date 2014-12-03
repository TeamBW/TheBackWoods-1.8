package com.chaka.thebackwoods.block;

import com.chaka.thebackwoods.util.Reference;
import com.chaka.thebackwoods.util.TBWTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTBW extends Block {

    public BlockTBW(Material materialIn) {

        super(materialIn);
        this.setCreativeTab(TBWTab.TAB);
    }

    @Override
    public String getUnlocalizedName() {

        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
