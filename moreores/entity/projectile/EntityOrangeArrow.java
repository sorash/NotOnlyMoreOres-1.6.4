package moreores.entity.projectile;

import moreores.MoreOres;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityOrangeArrow extends EntityThrowable
{
    public EntityOrangeArrow(World par1World)
    {
        super(par1World);
    }

    public EntityOrangeArrow(World par1World, EntityLivingBase par2EntityLivingBase)
    {
        super(par1World, par2EntityLivingBase);
    }

    public EntityOrangeArrow(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
        if (par1MovingObjectPosition.entityHit != null)
        {
			byte var2 = 15;
			
			if (!par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), var2));
			
            par1MovingObjectPosition.entityHit.setFire(20);
        }

        for (int i = 0; i < 8; ++i)
        {
            this.worldObj.spawnParticle("fire", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        	this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, 2F, true, true);
        }
    }
}
