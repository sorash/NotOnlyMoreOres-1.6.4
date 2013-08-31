package moreores.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class ItemGeneralJelly extends ItemFood{

	public ItemGeneralJelly(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
	}
	
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon("moreores" + ":" + (this.getUnlocalizedName().substring(5)));
	}

}
