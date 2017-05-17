package com.diamondsnowflake.autocart.client.render.blocks;

import com.diamondsnowflake.autocart.Main;
import com.diamondsnowflake.autocart.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {
	
	public static String modid = Main.MODID;
	
	public static void registerBlockRenderer() {
		register(ModBlocks.tutorialBlock);
    }
	
	public static void register(Block block){
		String blockName = block.getUnlocalizedName().substring(5);
		Minecraft
		.getMinecraft()
		.getRenderItem()
		.getItemModelMesher()
	    .register(Item.getItemFromBlock(block) , 0, 
	    		new ModelResourceLocation(modid + ":" + blockName, "inventory"));
	}
}
