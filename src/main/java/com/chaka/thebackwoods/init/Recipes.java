package com.chaka.thebackwoods.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {

    public static void init() {

        //Amethyst Tools
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethystSword), " A ", " A ", " # ", 'A', new ItemStack(ModItems.amethystItem), '#', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethystPickaxe), "AAA", " # ", " # ", 'A', new ItemStack(ModItems.amethystItem), '#', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethystShovel), " A ", " # ", " # ", 'A', new ItemStack(ModItems.amethystItem), '#', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethystAxe), "AA ", "A# ", " # ", 'A', new ItemStack(ModItems.amethystItem), '#', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethystAxe), " AA", " #A", " # ", 'A', new ItemStack(ModItems.amethystItem), '#', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethystHoe), "AA ", " # ", " # ", 'A', new ItemStack(ModItems.amethystItem), '#', new ItemStack(Item.getItemById(280)));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.amethystHoe), " AA", " # ", " # ", 'A', new ItemStack(ModItems.amethystItem), '#', new ItemStack(Item.getItemById(280)));

        //Gem Blocks
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.amethystBlock), new ItemStack(ModItems.amethystItem, 9));
    }
}
