package moreores.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemGeneralFuel extends Item{

	public ItemGeneralFuel(int par1) {
		super(par1);
	}
	
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon("moreores" + ":" + (this.getUnlocalizedName().substring(5)));
	}

}
