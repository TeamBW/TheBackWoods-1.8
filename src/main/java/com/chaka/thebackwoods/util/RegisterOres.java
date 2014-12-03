package com.chaka.thebackwoods.util;

import com.chaka.thebackwoods.init.ModBlocks;
import net.minecraftforge.oredict.OreDictionary;

public class RegisterOres {

    public static void init() {

        OreDictionary.registerOre("oreAmethyst", ModBlocks.amethystOre);
    }
}
