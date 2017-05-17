package com.diamondsnowflake.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block tutorialBlock;
	
	public static void createBlocks() {
		String blockName = "tutorial_block";
		tutorialBlock = new BasicBlock(blockName, 0.9f, 0.99f);
		GameRegistry.register(tutorialBlock);
    }
}
