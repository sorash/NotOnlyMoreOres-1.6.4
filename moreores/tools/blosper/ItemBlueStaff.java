package moreores.tools.blosper;

import moreores.MoreOres;
import moreores.entity.projectile.EntityWater;
import moreores.entity.projectile.EntityWaterReplace;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemBlueStaff extends ItemSword{

	public ItemBlueStaff(int par1) {
		super(par1, MoreOres.toolBlue);
		setMaxDamage(100);
	}

	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("moreores:blueStaff");
	}

	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}

	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.rare;
	}

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{	
		par2World.spawnParticle("dripWater", par3EntityPlayer.posX + 0.07F, par3EntityPlayer.posY, par3EntityPlayer.posZ + 0.15F, 0.0D, 0.4D, 0.0D);
		par2World.spawnParticle("dripWater", par3EntityPlayer.posX - 0.27F, par3EntityPlayer.posY + 0.01F, par3EntityPlayer.posZ + 0.11F, 0.0D, 0.0D, 0.0D);
		par2World.spawnParticle("dripWater", par3EntityPlayer.posX - 0.27F, par3EntityPlayer.posY + 0.01F, par3EntityPlayer.posZ - 0.41F, 0.0D, 0.0D, 0.0D);
		par2World.spawnParticle("dripWater", par3EntityPlayer.posX + 0.07F, par3EntityPlayer.posY + 0.01F, par3EntityPlayer.posZ - 0.41F, 0.0D, 0.0D, 0.0D);
		if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(Item.bucketWater.itemID) || par3EntityPlayer.inventory.hasItem(MoreOres.orangeBucketWater.itemID) || par3EntityPlayer.inventory.hasItem(MoreOres.yellowBucketWater.itemID) || par3EntityPlayer.inventory.hasItem(MoreOres.greenBucketWater.itemID) || par3EntityPlayer.inventory.hasItem(MoreOres.blueBucketWater.itemID)){
			par1ItemStack.damageItem(1, par3EntityPlayer);

			if (!par2World.isRemote && par3EntityPlayer.isSneaking() == false)
			{
				par2World.spawnEntityInWorld(new EntityWater(par2World, par3EntityPlayer));
			}

			else{
				if (!par2World.isRemote)
				{
					par2World.spawnEntityInWorld(new EntityWaterReplace(par2World, par3EntityPlayer));
				}
			}

		}
		return par1ItemStack;
	}
}
