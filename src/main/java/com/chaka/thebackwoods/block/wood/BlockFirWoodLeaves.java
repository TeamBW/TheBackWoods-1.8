package com.chaka.thebackwoods.block.wood;

import com.chaka.thebackwoods.block.BlockTBW;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockFirWoodLeaves extends BlockTBW {

    public BlockFirWoodLeaves(Material materialIn) {
        super(materialIn);
        this.setUnlocalizedName("firWoodLeaves");
        this.setStepSound(soundTypeGrass);
        this.setHardness(1.5F);
        this.setResistance(1.5F);
    }

    public boolean isOpaqueCube(){
        return false;
    }

    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer()
    {
        return EnumWorldBlockLayer.CUTOUT_MIPPED;
    }

    public boolean isFoliage(IBlockAccess world, BlockPos pos)
    {
        return true;
    }

    public void beginLeavesDecay(World world, BlockPos pos){}
}
