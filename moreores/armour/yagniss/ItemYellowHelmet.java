package moreores.armour.yagniss;

import moreores.MoreOres;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemYellowHelmet extends ItemArmor{
	
	private EnumArmorMaterial material;

	public ItemYellowHelmet(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("moreores:yellowHelmet");
	}
	
	public boolean getIsRepairable(ItemStack stack, ItemStack stack2) {
		if(stack.getItem() == MoreOres.ingotYellow && material == MoreOres.armorYellow); {
			return true;
		}
	}
	
}