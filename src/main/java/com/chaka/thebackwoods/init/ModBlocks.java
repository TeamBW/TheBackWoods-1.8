package com.chaka.thebackwoods.init;

import com.chaka.thebackwoods.block.BlockTest;
import com.chaka.thebackwoods.block.gemblock.BlockAmethyst;
import com.chaka.thebackwoods.block.ore.BlockAmethystOre;
import com.chaka.thebackwoods.block.wood.BlockFirWood;
import com.chaka.thebackwoods.block.wood.BlockFirWoodLeaves;
import com.chaka.thebackwoods.block.wood.BlockFirWoodPlanks;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static BlockTest testBlock;
    public static BlockAmethystOre amethystOre;
    public static BlockAmethyst amethystBlock;
    public static BlockFirWood firWood;
    public static BlockFirWoodPlanks firWoodPlanks;
    public static BlockFirWoodLeaves firWoodLeaves;

    public static void init() {
        
        testBlock = new BlockTest(Material.rock);
        GameRegistry.registerBlock(testBlock, "testBlock");
        amethystOre = new BlockAmethystOre(Material.rock);
        GameRegistry.registerBlock(amethystOre, "amethystOre");
        amethystBlock = new BlockAmethyst(Material.iron);
        GameRegistry.registerBlock(amethystBlock, "amethystBlock");
        firWood = new BlockFirWood(Material.wood);
        GameRegistry.registerBlock(firWood, "firWood");
        firWoodPlanks = new BlockFirWoodPlanks(Material.wood);
        GameRegistry.registerBlock(firWoodPlanks, "firWoodPlanks");
        firWoodLeaves = new BlockFirWoodLeaves(Material.leaves);
        GameRegistry.registerBlock(firWoodLeaves, "firWoodLeaves");
    }
}
