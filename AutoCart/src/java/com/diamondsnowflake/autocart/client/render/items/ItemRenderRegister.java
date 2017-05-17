package com.diamondsnowflake.autocart.client.render.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import com.diamondsnowflake.autocart.items.ModItems;
import com.diamondsnowflake.autocart.Main;

public final class ItemRenderRegister {
	
	public static String modid = Main.MODID;
	

	public static void registerItemRenderer() {
	    register(ModItems.tutorialItem);
	}

	public static void register(Item item) {
		String shortenedName = item.getUnlocalizedName().substring(5);
	    Minecraft
	    .getMinecraft()
	    .getRenderItem()
	    .getItemModelMesher()
	    .register(item, 0, 
	    		new ModelResourceLocation(modid + ":" + shortenedName, "inventory"));
	}
}
