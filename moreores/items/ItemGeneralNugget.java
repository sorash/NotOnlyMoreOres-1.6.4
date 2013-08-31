package moreores.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemGeneralNugget extends Item {

	public ItemGeneralNugget(int par1) {
		super(par1);
	}
	
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon("moreores" + ":" + (this.getUnlocalizedName().substring(5)));
	}

}
