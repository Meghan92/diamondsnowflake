package com.diamondsnowflake.tutorial.blocks;

import com.diamondsnowflake.tutorial.Main;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;

public final class BasicItemBlock extends ItemBlock {
	public BasicItemBlock(String unlocalizedName, Block block) {
		super(block);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Main.MODID + ":" + unlocalizedName));
	}
}
