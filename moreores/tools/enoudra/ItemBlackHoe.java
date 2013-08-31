package moreores.tools.enoudra;

import moreores.MoreOres;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBlackHoe extends ItemHoe{
	
	private EnumToolMaterial material;

	public ItemBlackHoe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(CreativeTabs.tabTools);
	}

	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("moreores:blackHoe");
	}
	
	public boolean getIsRepairable(ItemStack stack, ItemStack stack2) {
		if(stack.getItem() == MoreOres.ingotBlack && material == MoreOres.toolBlack); {
			return true;
		}
	}
	
	public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5) {
		if(itemstack.isItemEnchanted() == false) {
			itemstack.addEnchantment(Enchantment.punch, 1);
		}
	}
	
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}
	
}
