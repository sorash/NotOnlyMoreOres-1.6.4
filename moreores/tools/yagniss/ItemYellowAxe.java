package moreores.tools.yagniss;

import moreores.MoreOres;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemYellowAxe extends ItemAxe{

	private EnumToolMaterial material;
	
	public ItemYellowAxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}

	public void registerIcons(IconRegister reg) {
		itemIcon = reg.registerIcon("moreores:yellowAxe");
	}
	
	
	public boolean getIsRepairable(ItemStack stack, ItemStack stack2) {
		if(stack.getItem() == MoreOres.ingotYellow && material == MoreOres.toolYellow); {
			return true;
		}
	}
	
}
