package com.chaka.thebackwoods.block.wood;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;

public class BlockFirWoodPlanks extends BlockTBW {

    public BlockFirWoodPlanks(Material materialIn) {

        super(Material.wood);
        this.setUnlocalizedName("firWoodPlanks");
        this.setStepSound(soundTypeWood);
        this.setHardness(1.5F);
        this.setHarvestLevel("axe", 0);
    }
}
