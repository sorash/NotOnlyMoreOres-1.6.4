package moreores.tools.rainbow;

import moreores.MoreOres;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemRainbowSword extends ItemSword{

	public ItemRainbowSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}
	
	private EnumToolMaterial material;

	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("moreores:rainbowSword");
	}
	
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}
	
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.epic;
	}
	
	public boolean getIsRepairable(ItemStack stack, ItemStack stack2) {
		if(stack.getItem() == MoreOres.ingotRainbow && material == MoreOres.toolRainbow); {
			return true;
		}
	}
	
	public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5) {
		if(itemstack.isItemEnchanted() == false) {
			itemstack.addEnchantment(Enchantment.looting, 3);
		}
	}
	
}
