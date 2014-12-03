package com.chaka.thebackwoods.init;

import com.chaka.thebackwoods.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class InventoryRender {

    public static void init() {

        InventoryBlockRender(ModBlocks.testBlock, "testBlock");
        InventoryBlockRender(ModBlocks.amethystOre, "amethystOre");
        InventoryBlockRender(ModBlocks.amethystBlock, "amethystOreBlock");

        InventoryItemRender(ModItems.testItem, "testItem");
        InventoryItemRender(ModItems.amethystItem, "amethystItem");
        InventoryItemRender(ModItems.amethystSword, "amethystSword");
        InventoryItemRender(ModItems.amethystPickaxe, "amethystPickaxe");
        InventoryItemRender(ModItems.amethystShovel, "amethystShovel");
        InventoryItemRender(ModItems.amethystAxe, "amethystAxe");
        InventoryItemRender(ModItems.amethystHoe, "amethystHoe");
    }

    public static void InventoryBlockRender(Block block, String blockName) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + blockName, "inventory"));
    }

    public static void InventoryItemRender(Item item, String itemName) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + itemName, "inventory"));
    }
}
