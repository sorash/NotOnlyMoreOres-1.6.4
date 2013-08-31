package moreores.items.blosper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class ItemBlueberry extends ItemFood{

	public ItemBlueberry(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		itemIcon = iconRegister.registerIcon("moreores:blueberry");
	}
}
