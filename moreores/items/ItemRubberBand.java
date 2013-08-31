package moreores.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemRubberBand extends Item{

	public ItemRubberBand(int par1) {
		super(par1);
	}
	
	public void registerIcons(IconRegister iconRegister){
		itemIcon = iconRegister.registerIcon("moreores:rubberBand");
	}

}
