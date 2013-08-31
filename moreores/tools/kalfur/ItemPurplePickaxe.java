package moreores.tools.kalfur;

import moreores.MoreOres;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemPurplePickaxe extends ItemPickaxe{

	private EnumToolMaterial material;
	
	public ItemPurplePickaxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}

	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("moreores:purplePickaxe");
	}
	
	public boolean getIsRepairable(ItemStack stack, ItemStack stack2) {
		if(stack.getItem() == MoreOres.ingotPurple && material == MoreOres.toolPurple); {
			return true;
		}
	}
	
	public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5) {
		if(itemstack.isItemEnchanted() == false) {
			itemstack.addEnchantment(Enchantment.unbreaking, 1);
		}
	}
	
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}
	
}
