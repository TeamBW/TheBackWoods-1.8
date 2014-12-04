package com.chaka.thebackwoods.block.wood;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockFirWood extends BlockTBW {

    public BlockFirWood(Material materialIn) {

        super(materialIn);
        this.setUnlocalizedName("firWood");
        this.setStepSound(soundTypeWood);
        this.setHardness(2.5F);
        this.setResistance(1.5F);
    }

    public boolean canSustainLeaves(IBlockAccess world, BlockPos pos) {

        return true;
    }
}