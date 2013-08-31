package moreores.entity.projectile;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityBlueArrow extends EntityThrowable
{
    public EntityBlueArrow(World par1World)
    {
        super(par1World);
    }

    public EntityBlueArrow(World par1World, EntityLivingBase par2EntityLivingBase)
    {
        super(par1World, par2EntityLivingBase);
    }

    public EntityBlueArrow(World par1World, double par2, double par4, double par6)
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
			if (par1MovingObjectPosition.entityHit instanceof EntityBlaze)
			{
				var2 = 50;
			}
			
			if (!par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), var2));
			
			par1MovingObjectPosition.entityHit.extinguish();
        }

        for (int i = 0; i < 8; ++i)
        {
            this.worldObj.spawnParticle("splash", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
            
			if(this.worldObj.getBlockId(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY + 1, par1MovingObjectPosition.blockZ) == Block.fire.blockID){
				this.worldObj.setBlock(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY + 1, par1MovingObjectPosition.blockZ, 0);
			}
			
			if(this.worldObj.getBlockId(par1MovingObjectPosition.blockX + 1, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ) == Block.fire.blockID){
				this.worldObj.setBlock(par1MovingObjectPosition.blockX + 1, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ, 0);
			}
			
			if(this.worldObj.getBlockId(par1MovingObjectPosition.blockX - 1, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ) == Block.fire.blockID){
				this.worldObj.setBlock(par1MovingObjectPosition.blockX - 1, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ, 0);
			}
			
			if(this.worldObj.getBlockId(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ + 1) == Block.fire.blockID){
				this.worldObj.setBlock(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ + 1, 0);
			}
			
			if(this.worldObj.getBlockId(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ - 1) == Block.fire.blockID){
				this.worldObj.setBlock(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ - 1, 0);
			}
			
			if(this.worldObj.getBlockId(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ) == Block.lavaStill.blockID){
				this.worldObj.setBlock(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ, Block.obsidian.blockID);
			}
			
			if(this.worldObj.getBlockId(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ) == Block.lavaMoving.blockID){
				this.worldObj.setBlock(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ, Block.cobblestone.blockID);
			}
        }
    }
}
