package moreores.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemIronRod extends Item{

	public ItemIronRod(int par1) {
		super(par1);
	}

	public void registerIcons(IconRegister iconRegister){
		itemIcon = iconRegister.registerIcon("moreores:ironRod");
	}
	
}
