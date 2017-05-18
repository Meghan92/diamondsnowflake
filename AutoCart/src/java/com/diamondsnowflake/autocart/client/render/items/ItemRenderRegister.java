package com.diamondsnowflake.autocart.client.render.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import com.diamondsnowflake.autocart.items.ModItems;

public final class ItemRenderRegister {	

	public static void registerItemRenderer() {
		if (ModItems.items != null && !ModItems.items.isEmpty()){
			ModItems.items.forEach((item)->{
				register(item);
			});	
		}		    
	}

	public static void register(Item item) {
		String itemName = item.getRegistryName().toString();
	    Minecraft
	    .getMinecraft()
	    .getRenderItem()
	    .getItemModelMesher()
	    .register(item, 0, 
	    		new ModelResourceLocation(itemName, "inventory"));
	}
}
