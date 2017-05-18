package com.diamondsnowflake.autocart.client.render.blocks;

import com.diamondsnowflake.autocart.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {
	
	public static void registerBlockRenderer() {
		ModBlocks.blocks.forEach((block)->{
			register(block);
		});
    }
	
	public static void register(Block block){
		String blockName = block.getRegistryName().toString();
		Minecraft
		.getMinecraft()
		.getRenderItem()
		.getItemModelMesher()
	    .register(Item.getItemFromBlock(block) , 0, 
	    		new ModelResourceLocation(blockName, "inventory"));
	}
}
