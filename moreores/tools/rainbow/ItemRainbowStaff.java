package moreores.tools.rainbow;

import moreores.MoreOres;
import moreores.PacketHandlerMoreOres;
import moreores.entity.projectile.EntityLava;
import moreores.entity.projectile.EntityWater;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
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

public class ItemRainbowStaff extends ItemSword{

	public static PacketHandlerMoreOres packet;

	public ItemRainbowStaff(int par1) {
		super(par1, MoreOres.toolRainbow);
		setMaxDamage(150);
	}

	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("moreores:rainbowStaff");
	}

	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}

	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.rare;
	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityPlayer)
	{
		if(entityPlayer.isSneaking()){
			if(!world.isRemote){
				entityPlayer.openGui(MoreOres.instance, 1, entityPlayer.worldObj, (int) entityPlayer.posX, (int) entityPlayer.posY, (int) entityPlayer.posZ);
			}
		}

		else if(!entityPlayer.isSneaking()){
			if(itemstack.getItemDamage() == 0){
				if(packet.mode == 0){
					float f = 1.0F;
					float f1 = entityPlayer.prevRotationPitch + (entityPlayer.rotationPitch - entityPlayer.prevRotationPitch) * f;
					float f2 = entityPlayer.prevRotationYaw + (entityPlayer.rotationYaw - entityPlayer.prevRotationYaw) * f;
					double d = entityPlayer.prevPosX + (entityPlayer.posX - entityPlayer.prevPosX) * (double)f;
					double d1 = (entityPlayer.prevPosY + (entityPlayer.posY - entityPlayer.prevPosY) * (double)f + 1.6200000000000001D) - (double)entityPlayer.yOffset;
					double d2 = entityPlayer.prevPosZ + (entityPlayer.posZ - entityPlayer.prevPosZ) * (double)f;
					Vec3 vec3d = Vec3.createVectorHelper(d, d1, d2);
					float f3 = MathHelper.cos(-f2 * 0.01745329F - 3.141593F);
					float f4 = MathHelper.sin(-f2 * 0.01745329F - 3.141593F);
					float f5 = -MathHelper.cos(-f1 * 0.01745329F);
					float f6 = MathHelper.sin(-f1 * 0.01745329F);
					float f7 = f4 * f5;
					float f8 = f6;
					float f9 = f3 * f5;
					double d3 = 5000D;
					Vec3 vec3d1 = vec3d.addVector((double)f7 * d3, (double)f8 * d3 + 1, (double)f9 * d3);
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
						if(!world.isRemote){
						world.addWeatherEffect(new EntityLightningBolt(world, i, j, k));
						}
					}
				}
				
				if(packet.mode == 1){
					if (!world.isRemote) {
						Vec3 look = entityPlayer.getLookVec();
						EntityLargeFireball fireball = new EntityLargeFireball(world, entityPlayer, 1, 1, 1);
						fireball.setPosition(
								entityPlayer.posX + look.xCoord,
								entityPlayer.posY + look.yCoord + 1,
								entityPlayer.posZ + look.zCoord);
						fireball.accelerationX = look.xCoord * 0.1;
						fireball.accelerationY = look.yCoord * 0.1;
						fireball.accelerationZ = look.zCoord * 0.1;
						world.spawnEntityInWorld(fireball);
						world.playSoundEffect(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, "mob.ghast.scream", 1.0F, 1.0F);
					}
				}
				
				if(packet.mode == 2){
					world.spawnParticle("dripWater", entityPlayer.posX + 0.07F, entityPlayer.posY, entityPlayer.posZ + 0.15F, 0.0D, 0.4D, 0.0D);
					world.spawnParticle("dripWater", entityPlayer.posX - 0.27F, entityPlayer.posY + 0.01F, entityPlayer.posZ + 0.11F, 0.0D, 0.0D, 0.0D);
					world.spawnParticle("dripWater", entityPlayer.posX - 0.27F, entityPlayer.posY + 0.01F, entityPlayer.posZ - 0.41F, 0.0D, 0.0D, 0.0D);
					world.spawnParticle("dripWater", entityPlayer.posX + 0.07F, entityPlayer.posY + 0.01F, entityPlayer.posZ - 0.41F, 0.0D, 0.0D, 0.0D);
					itemstack.damageItem(1, entityPlayer);

					if (!world.isRemote)
					{
						world.spawnEntityInWorld(new EntityWater(world, entityPlayer));
					}
				}
				
				if(packet.mode == 3){
					world.spawnParticle("flame", entityPlayer.posX + 0.07F, entityPlayer.posY, entityPlayer.posZ + 0.15F, 0.0D, 0.0D, 0.0D);
					world.spawnParticle("flame", entityPlayer.posX - 0.27F, entityPlayer.posY + 0.01F, entityPlayer.posZ + 0.11F, 0.0D, 0.0D, 0.0D);
					world.spawnParticle("flame", entityPlayer.posX - 0.27F, entityPlayer.posY + 0.01F, entityPlayer.posZ - 0.41F, 0.0D, 0.0D, 0.0D);
					world.spawnParticle("flame", entityPlayer.posX + 0.07F, entityPlayer.posY + 0.01F, entityPlayer.posZ - 0.41F, 0.0D, 0.0D, 0.0D);
					itemstack.damageItem(1, entityPlayer);

					if (!world.isRemote)
					{
						world.spawnEntityInWorld(new EntityLava(world, entityPlayer));
					}
				}
				
				if(packet.mode == 4){

					if (!world.isRemote) {
						Vec3 look = entityPlayer.getLookVec();
						EntityWitherSkull skull = new EntityWitherSkull(world, entityPlayer, 1, 1, 1);
						skull.setPosition(
								entityPlayer.posX + look.xCoord,
								entityPlayer.posY + look.yCoord + 1,
								entityPlayer.posZ + look.zCoord);
						skull.accelerationX = look.xCoord * 0.1;
						skull.accelerationY = look.yCoord * 0.1;
						skull.accelerationZ = look.zCoord * 0.1;
						world.spawnEntityInWorld(skull);
						world.playSoundEffect(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, "mob.wither.idle", 1.0F, 1.0F);
					}
				}
				
				if(packet.mode == 5){
					world.spawnParticle("portal", entityPlayer.posX + 0.07F, entityPlayer.posY, entityPlayer.posZ + 0.15F, 0.0D, 0.0D, 0.0D);
					world.spawnParticle("portal", entityPlayer.posX - 0.27F, entityPlayer.posY + 0.01F, entityPlayer.posZ + 0.11F, 0.0D, 0.0D, 0.0D);
					world.spawnParticle("portal", entityPlayer.posX - 0.27F, entityPlayer.posY + 0.01F, entityPlayer.posZ - 0.41F, 0.0D, 0.0D, 0.0D);
					world.spawnParticle("portal", entityPlayer.posX + 0.07F, entityPlayer.posY + 0.01F, entityPlayer.posZ - 0.41F, 0.0D, 0.0D, 0.0D);
					float f = 1.0F;
					float f1 = entityPlayer.prevRotationPitch + (entityPlayer.rotationPitch - entityPlayer.prevRotationPitch) * f;
					float f2 = entityPlayer.prevRotationYaw + (entityPlayer.rotationYaw - entityPlayer.prevRotationYaw) * f;
					double d = entityPlayer.prevPosX + (entityPlayer.posX - entityPlayer.prevPosX) * (double)f;
					double d1 = (entityPlayer.prevPosY + (entityPlayer.posY - entityPlayer.prevPosY) * (double)f + 1.6200000000000001D) - (double)entityPlayer.yOffset;
					double d2 = entityPlayer.prevPosZ + (entityPlayer.posZ - entityPlayer.prevPosZ) * (double)f;
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
						entityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 100, 20));
						entityPlayer.setPositionAndUpdate(i + 0.5, j + 1, k + 0.5);
						entityPlayer.fallDistance = 0.0F;						world.playSoundEffect(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, "mob.endermen.portal", 1.0F, 1.0F);
						world.spawnParticle("portal", entityPlayer.posX + 0.07F, entityPlayer.posY, entityPlayer.posZ + 0.15F, 0.0D, 0.0D, 0.0D);
						world.spawnParticle("portal", entityPlayer.posX - 0.27F, entityPlayer.posY + 0.01F, entityPlayer.posZ + 0.11F, 0.0D, 0.0D, 0.0D);
						world.spawnParticle("portal", entityPlayer.posX - 0.27F, entityPlayer.posY + 0.01F, entityPlayer.posZ - 0.41F, 0.0D, 0.0D, 0.0D);
						world.spawnParticle("portal", entityPlayer.posX + 0.07F, entityPlayer.posY + 0.01F, entityPlayer.posZ - 0.41F, 0.0D, 0.0D, 0.0D);
					}
				}

				itemstack.setItemDamage(149);
			}
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
