package com.diamondsnowflake.autocart.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BasicBlock extends Block {

	public BasicBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.MATERIALS);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setSoundType(SoundType.METAL);
        this.setHarvestLevel("pickaxe", 3);
	}
	
	public BasicBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, hardness, resistance);
    }

    public BasicBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }	
}
