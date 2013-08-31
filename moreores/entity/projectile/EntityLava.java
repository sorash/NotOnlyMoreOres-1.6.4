package moreores.entity.projectile;

import moreores.MoreOres;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityLava extends EntityThrowable
{
	public double accelerationX;
	public double accelerationY;
	public double accelerationZ;

	public EntityLava(World par1World)
	{
		super(par1World);
		this.isImmuneToFire = true;
	}

	public EntityLava(World par1World, EntityLivingBase par2EntityLiving)
	{
		super(par1World, par2EntityLiving);
		this.setFire(100);
	}

	public EntityLava(World par1World, double par2, double par4, double par6)
	{
		super(par1World, par2, par4, par6);
	}

	/**
	 * Called when this EntityThrowable hits a block or entity.
	 */
	protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
	{

		int x = (int)par1MovingObjectPosition.blockX;
		int y = (int)par1MovingObjectPosition.blockY;
		int z = (int)par1MovingObjectPosition.blockZ;

		if (par1MovingObjectPosition.entityHit != null)
		{
			byte var2 = 0;
			if (!par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), var2))
			{
			}
			
            par1MovingObjectPosition.entityHit.setFire(20);
		}
		
		for (int var3 = 0; var3 < 8; ++var3)
		{
			this.worldObj.spawnParticle("lava", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
		}

		if (!this.worldObj.isRemote)
		{
			this.setDead();
			if (!this.worldObj.isRemote)
			{
				if (this.worldObj.isAirBlock(x, y + 1, z) && !((this.worldObj.getBlockId(x, y, z) == Block.sand.blockID) || (this.worldObj.getBlockId(x, y, z) == Block.cobblestone.blockID) || (this.worldObj.getBlockId(x, y, z) == Block.oreIron.blockID) || (this.worldObj.getBlockId(x, y, z) == Block.oreGold.blockID || (this.worldObj.getBlockId(x, y, z) == MoreOres.orangeOre.blockID) || (this.worldObj.getBlockId(x, y, z) == MoreOres.yellowOre.blockID) || (this.worldObj.getBlockId(x, y, z) == MoreOres.greenOre.blockID) || (this.worldObj.getBlockId(x, y, z) == MoreOres.blueOre.blockID) || (this.worldObj.getBlockId(x, y, z) == MoreOres.rainbowOre.blockID) || (this.worldObj.getBlockId(x, y, z) == MoreOres.purpleOre.blockID) || (this.worldObj.getBlockId(x, y, z) == MoreOres.blackOre.blockID) || (this.worldObj.getBlockId(x, y, z) == MoreOres.rainbowOre.blockID) || (this.worldObj.getBlockId(x, y, z) == MoreOres.purpleOre.blockID) || (this.worldObj.getBlockId(x, y, z) == Block.tallGrass.blockID || (this.worldObj.getBlockId(x, y, z) == Block.sapling.blockID) || (this.worldObj.getBlockId(x, y, z) == Block.plantYellow.blockID || (this.worldObj.getBlockId(x, y, z) == Block.plantRed.blockID) || (this.worldObj.getBlockId(x, y, z) == Block.vine.blockID))))))
				{
					this.worldObj.setBlock(x, y + 1, z, Block.lavaStill.blockID);
				}

				if (this.worldObj.getBlockId(x, y, z) == Block.sand.blockID)
				{
					this.worldObj.setBlock(x, y, z, Block.glass.blockID);
				}

				if (this.worldObj.getBlockId(x, y, z) == Block.cobblestone.blockID)
				{
					this.worldObj.setBlock(x, y, z, Block.stone.blockID);
				}

				if (this.worldObj.getBlockId(x, y, z) == Block.oreIron.blockID)
				{
					this.worldObj.setBlock(x, y, z, 0);
					this.dropItem(Item.ingotIron.itemID, 1);
				}

				if (this.worldObj.getBlockId(x, y, z) == Block.oreGold.blockID)
				{
					this.worldObj.setBlock(x, y, z, 0);
					this.dropItem(Item.ingotGold.itemID, 1);
				}
				
				if (this.worldObj.getBlockId(x, y, z) == MoreOres.orangeOre.blockID)
				{
					this.worldObj.setBlock(x, y, z, 0);
					this.dropItem(MoreOres.ingotOrange.itemID, 1);
				}
				
				if (this.worldObj.getBlockId(x, y, z) == MoreOres.yellowOre.blockID)
				{
					this.worldObj.setBlock(x, y, z, 0);
					this.dropItem(MoreOres.ingotYellow.itemID, 1);
				}
				
				if (this.worldObj.getBlockId(x, y, z) == MoreOres.greenOre.blockID)
				{
					this.worldObj.setBlock(x, y, z, 0);
					this.dropItem(MoreOres.ingotGreen.itemID, 1);
				}
				
				if (this.worldObj.getBlockId(x, y, z) == MoreOres.blueOre.blockID)
				{
					this.worldObj.setBlock(x, y, z, 0);
					this.dropItem(MoreOres.ingotBlue.itemID, 1);
				}
				
				if (this.worldObj.getBlockId(x, y, z) == MoreOres.rainbowOre.blockID)
				{
					this.worldObj.setBlock(x, y, z, 0);
					this.dropItem(MoreOres.ingotRainbow.itemID, 1);
				}
				
				if (this.worldObj.getBlockId(x, y, z) == MoreOres.purpleOre.blockID)
				{
					this.worldObj.setBlock(x, y, z, 0);
					this.dropItem(MoreOres.ingotPurple.itemID, 1);
				}
				
				if (this.worldObj.getBlockId(x, y, z) == MoreOres.blackOre.blockID)
				{
					this.worldObj.setBlock(x, y, z, 0);
					this.dropItem(MoreOres.ingotBlack.itemID, 1);
				}
				
				if (this.worldObj.getBlockId(x, y + 1, z) == Block.waterStill.blockID)
				{
					this.worldObj.setBlock(x, y + 1, z, Block.obsidian.blockID);
				}

				if (this.worldObj.getBlockId(x, y + 1, z) == Block.waterMoving.blockID)
				{
					this.worldObj.setBlock(x, y + 1, z, Block.cobblestone.blockID);
				}
				
				if (this.worldObj.getBlockId(x, y + 1, z) == Block.tallGrass.blockID || this.worldObj.getBlockId(x, y + 1, z) == Block.sapling.blockID || this.worldObj.getBlockId(x, y + 1, z) == Block.plantYellow.blockID || this.worldObj.getBlockId(x, y + 1, z) == Block.plantRed.blockID)
				{
					this.worldObj.setBlock(x, y + 1, z, Block.lavaStill.blockID);
				}
				
				if (this.worldObj.getBlockId(x, y, z) == Block.tallGrass.blockID || this.worldObj.getBlockId(x, y, z) == Block.sapling.blockID || this.worldObj.getBlockId(x, y, z) == Block.plantYellow.blockID || this.worldObj.getBlockId(x, y, z) == Block.plantRed.blockID)
				{
					this.worldObj.setBlock(x, y, z, Block.lavaStill.blockID);
				}
				
				if (this.worldObj.getBlockId(x, y, z) == Block.vine.blockID)
				{
					this.worldObj.setBlock(x, y, z, Block.lavaStill.blockID);
				}
			}
		}
	}
}