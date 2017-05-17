package com.diamondsnowflake.autocart.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block tutorialBlock;
	public static ItemBlock tutorialItemBlock;
	
	public static void createBlocks() {
		String blockName = "tutorial_block";
		tutorialBlock = new BasicBlock(blockName, 0.9f, 0.99f);
		GameRegistry.register(tutorialBlock);
		
		tutorialItemBlock = new BasicItemBlock(blockName, tutorialBlock);
		GameRegistry.register(tutorialItemBlock);
    }
}
