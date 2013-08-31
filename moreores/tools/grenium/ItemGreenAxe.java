package moreores.tools.grenium;

import moreores.MoreOres;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGreenAxe extends ItemAxe{

	private EnumToolMaterial material;
	
	public ItemGreenAxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}

	public void registerIcons(IconRegister reg) {
		itemIcon = reg.registerIcon("moreores:greenAxe");
	}
	
	public boolean getIsRepairable(ItemStack stack, ItemStack stack2) {
		if(stack.getItem() == MoreOres.ingotGreen && material == MoreOres.toolGreen); {
			return true;
		}
	}
	
	public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5) {
		if(itemstack.isItemEnchanted() == false) {
			itemstack.addEnchantment(Enchantment.silkTouch, 1);
		}
	}
	
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}
	
}
