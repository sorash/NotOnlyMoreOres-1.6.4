package moreores.entity.projectile;

import moreores.MoreOres;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityLavaReplace extends EntityThrowable
{
	public double accelerationX;
	public double accelerationY;
	public double accelerationZ;

	public EntityLavaReplace(World par1World)
	{
		super(par1World);
		this.isImmuneToFire = true;
	}

	public EntityLavaReplace(World par1World, EntityLivingBase par2EntityLiving)
	{
		super(par1World, par2EntityLiving);
		this.setFire(100);
	}

	public EntityLavaReplace(World par1World, double par2, double par4, double par6)
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
			this.worldObj.setBlock(x, y, z, Block.lavaStill.blockID);
		}
	}
}