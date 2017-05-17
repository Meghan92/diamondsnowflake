package com.diamondsnowflake.autocart.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	public static Item tutorialItem;
	
	public static void createItems() {
		String itemName = "tutorial_item";
		tutorialItem = new BasicItem(itemName);
		GameRegistry.register(tutorialItem);
    }
}
