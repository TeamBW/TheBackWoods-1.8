package com.chaka.thebackwoods.init;

import com.chaka.thebackwoods.block.BlockTest;
import com.chaka.thebackwoods.block.ore.BlockAmethystOre;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static BlockTest testBlock;
    public static BlockAmethystOre amethystOre;

    public static void init() {
        
        testBlock = new BlockTest(Material.rock);
        GameRegistry.registerBlock(testBlock, "testBlock");
        amethystOre = new BlockAmethystOre(Material.rock);
        GameRegistry.registerBlock(amethystOre, "amethystOre");
    }
}
