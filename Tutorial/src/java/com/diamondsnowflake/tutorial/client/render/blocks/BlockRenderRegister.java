package com.diamondsnowflake.tutorial.client.render.blocks;

import com.diamondsnowflake.tutorial.Main;
import com.diamondsnowflake.tutorial.blocks.ModBlocks;

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
