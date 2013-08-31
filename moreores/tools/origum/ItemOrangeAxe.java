package moreores.tools.origum;

import moreores.MoreOres;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemOrangeAxe extends ItemAxe{

	private EnumToolMaterial material;
	
	public ItemOrangeAxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}

	public void registerIcons(IconRegister reg) {
		itemIcon = reg.registerIcon("moreores:orangeAxe");
	}
	
	public boolean getIsRepairable(ItemStack stack, ItemStack stack2) {
		if(stack.getItem() == MoreOres.ingotOrange && material == MoreOres.toolOrange); {
			return true;
		}
	}
	
}
