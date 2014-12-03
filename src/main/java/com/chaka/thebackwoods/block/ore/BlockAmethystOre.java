package com.chaka.thebackwoods.block.ore;

import com.chaka.thebackwoods.block.BlockTBW;
import com.chaka.thebackwoods.init.ModBlocks;
import com.chaka.thebackwoods.init.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockAmethystOre extends BlockTBW {

    public BlockAmethystOre(Material materialIn) {

        super(materialIn);
        this.setUnlocalizedName("amethystOre");
        this.setStepSound(soundTypePiston);
        this.setResistance(2.0F);
        this.setHardness(2.0F);
        this.setHarvestLevel("pickaxe", 3);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return this == ModBlocks.amethystOre ? ModItems.amethystItem : Item.getItemFromBlock(this);
    }

    public int quantityDropped(Random rand) {

        return 1 + rand.nextInt(2);
    }
}
