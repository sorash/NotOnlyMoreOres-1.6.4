package moreores.tools.blosper;

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

public class ItemBlueSword extends ItemSword{

	public ItemBlueSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}
	
	private EnumToolMaterial material;

	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("moreores:blueSword");
	}
	
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}
	
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.rare;
	}
	
	public boolean getIsRepairable(ItemStack stack, ItemStack stack2) {
		if(stack.getItem() == MoreOres.ingotBlue && material == MoreOres.toolBlue); {
			return true;
		}
	}
	
	public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5) {
		if(itemstack.isItemEnchanted() == false) {
			itemstack.addEnchantment(Enchantment.looting, 2);
		}
	}
	
}
