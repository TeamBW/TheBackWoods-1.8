package com.chaka.thebackwoods.init;

import com.chaka.thebackwoods.item.ItemTest;
import com.chaka.thebackwoods.item.gem.ItemAmethyst;
import com.chaka.thebackwoods.item.tool.amethyst.*;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    //Tool Constructors
    public static final Item.ToolMaterial amethystToolMaterial = EnumHelper.addToolMaterial("amethystToolMaterial", 4, 4600, 12.0F, 10.0F, 30);

    public static ItemTest testItem;
    public static ItemAmethyst amethystItem;
    public static ItemAmethystSword amethystSword;
    public static ItemAmethystPickaxe amethystPickaxe;
    public static ItemAmethystShovel amethystShovel;
    public static ItemAmethystAxe amethystAxe;
    public static ItemAmethystHoe amethystHoe;

    public static void init() {

        testItem = new ItemTest();
        GameRegistry.registerItem(testItem, "testItem");
        amethystItem = new ItemAmethyst();
        GameRegistry.registerItem(amethystItem, "amethystItem");
        amethystSword = new ItemAmethystSword(amethystToolMaterial);
        GameRegistry.registerItem(amethystSword, "amethystSword");
        amethystPickaxe = new ItemAmethystPickaxe(amethystToolMaterial);
        GameRegistry.registerItem(amethystPickaxe, "amethystPickaxe");
        amethystShovel = new ItemAmethystShovel(amethystToolMaterial);
        GameRegistry.registerItem(amethystShovel, "amethystShovel");
        amethystAxe = new ItemAmethystAxe(amethystToolMaterial);
        GameRegistry.registerItem(amethystAxe, "amethystAxe");
        amethystHoe = new ItemAmethystHoe(amethystToolMaterial);
        GameRegistry.registerItem(amethystHoe, "amethystHoe");
    }
}
