package com.chaka.thebackwoods.block.gemblock;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockAmethyst extends BlockTBW {

    public BlockAmethyst(Material materialIn) {

        super(materialIn);
        this.setUnlocalizedName("amethystBlock");
        this.setStepSound(soundTypeMetal);
        this.setHardness(5.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 3);
    }
}