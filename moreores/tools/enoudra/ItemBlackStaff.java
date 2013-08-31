package moreores.tools.enoudra;

import moreores.MoreOres;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemBlackStaff extends ItemSword{

	public ItemBlackStaff(int par1) {
		super(par1, MoreOres.toolBlack);
		setMaxDamage(150);
	}

	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("moreores:blackStaff");
	}
	
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}
	
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.rare;
	}
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
		if(itemstack.getItemDamage() == 0){    
			world.spawnParticle("portal", entityplayer.posX + 0.07F, entityplayer.posY, entityplayer.posZ + 0.15F, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("portal", entityplayer.posX - 0.27F, entityplayer.posY + 0.01F, entityplayer.posZ + 0.11F, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("portal", entityplayer.posX - 0.27F, entityplayer.posY + 0.01F, entityplayer.posZ - 0.41F, 0.0D, 0.0D, 0.0D);
			world.spawnParticle("portal", entityplayer.posX + 0.07F, entityplayer.posY + 0.01F, entityplayer.posZ - 0.41F, 0.0D, 0.0D, 0.0D);
			float f = 1.0F;
			float f1 = entityplayer.prevRotationPitch + (entityplayer.rotationPitch - entityplayer.prevRotationPitch) * f;
			float f2 = entityplayer.prevRotationYaw + (entityplayer.rotationYaw - entityplayer.prevRotationYaw) * f;
			double d = entityplayer.prevPosX + (entityplayer.posX - entityplayer.prevPosX) * (double)f;
			double d1 = (entityplayer.prevPosY + (entityplayer.posY - entityplayer.prevPosY) * (double)f + 1.6200000000000001D) - (double)entityplayer.yOffset;
			double d2 = entityplayer.prevPosZ + (entityplayer.posZ - entityplayer.prevPosZ) * (double)f;
			Vec3 vec3d = Vec3.createVectorHelper(d, d1, d2);
			float f3 = MathHelper.cos(-f2 * 0.01745329F - 3.141593F);
			float f4 = MathHelper.sin(-f2 * 0.01745329F - 3.141593F);
			float f5 = -MathHelper.cos(-f1 * 0.01745329F);
			float f6 = MathHelper.sin(-f1 * 0.01745329F);
			float f7 = f4 * f5;
			float f8 = f6;
			float f9 = f3 * f5;
			double d3 = 5000D;
			Vec3 vec3d1 = vec3d.addVector((double)f7 * d3, (double)f8 * d3, (double)f9 * d3);
			MovingObjectPosition movingobjectposition = world.rayTraceBlocks_do_do(vec3d, vec3d1, false, true);
			if (movingobjectposition == null)
			{
				return itemstack;
			}
			if (movingobjectposition.typeOfHit == EnumMovingObjectType.TILE)
			{
				int i = movingobjectposition.blockX;
				int j = movingobjectposition.blockY;
				int k = movingobjectposition.blockZ;
				entityplayer.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 100, 20));
				entityplayer.setPositionAndUpdate(i + 0.5, j + 1, k + 0.5);
				entityplayer.fallDistance = 0.0F;
				world.playSoundEffect(entityplayer.posX, entityplayer.posY, entityplayer.posZ, "mob.endermen.portal", 1.0F, 1.0F);
				world.spawnParticle("portal", entityplayer.posX + 0.07F, entityplayer.posY, entityplayer.posZ + 0.15F, 0.0D, 0.0D, 0.0D);
				world.spawnParticle("portal", entityplayer.posX - 0.27F, entityplayer.posY + 0.01F, entityplayer.posZ + 0.11F, 0.0D, 0.0D, 0.0D);
				world.spawnParticle("portal", entityplayer.posX - 0.27F, entityplayer.posY + 0.01F, entityplayer.posZ - 0.41F, 0.0D, 0.0D, 0.0D);
				world.spawnParticle("portal", entityplayer.posX + 0.07F, entityplayer.posY + 0.01F, entityplayer.posZ - 0.41F, 0.0D, 0.0D, 0.0D);
			}
			itemstack.setItemDamage(149);
		}
		return itemstack;        
	}
	
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
    {
            if(itemstack.getItemDamage() > 0)
            {
                    itemstack.damageItem(-1, (EntityLivingBase)entity);
            }
    }

	
}
