package moreores.entity.projectile;

import moreores.MoreOres;
import moreores.blocks.blosper.BlockBlueSapling;
import moreores.blocks.grenium.BlockGreenSapling;
import moreores.blocks.origum.BlockOrangeSapling;
import moreores.blocks.yagniss.BlockYellowSapling;
import moreores.dimension.BlockRainbowSapling;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityGreenArrow extends EntityThrowable
{
	private ItemDye dye;
	
    public EntityGreenArrow(World par1World)
    {
        super(par1World);
    }

    public EntityGreenArrow(World par1World, EntityLivingBase par2EntityLivingBase)
    {
        super(par1World, par2EntityLivingBase);
    }

    public EntityGreenArrow(World par1World, double par2, double par4, double par6)
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
            byte b0 = 15;

            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)b0);
        }

        for (int i = 0; i < 8; ++i)
        {
            this.worldObj.spawnParticle("happyVillager", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
            if(this.worldObj.getBlockId(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ) == Block.crops.blockID){
            	this.worldObj.setBlockMetadataWithNotify(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ, 7, 2);
            }
            
            if(this.worldObj.getBlockId(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ) == Block.carrot.blockID){
            	this.worldObj.setBlockMetadataWithNotify(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ, 7, 2);
            }
            
            if(this.worldObj.getBlockId(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ) == Block.potato.blockID){
            	this.worldObj.setBlockMetadataWithNotify(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ, 7, 2);
            }
            
            if(this.worldObj.getBlockId(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ) == Block.grass.blockID){
            	dye.applyBonemeal(new ItemStack(Item.dyePowder, 1, 15), this.worldObj, par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ, (EntityPlayer)this.getThrower());
            }
            
            if(this.worldObj.getBlockId(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ) == Block.sapling.blockID){
            	((BlockSapling)Block.sapling).growTree(this.worldObj, par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ, rand);
            }
            
            if(this.worldObj.getBlockId(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ) == MoreOres.orangeSapling.blockID){
            	((BlockOrangeSapling)MoreOres.orangeSapling).growTree(this.worldObj, par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ, rand);
            }
            
            if(this.worldObj.getBlockId(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ) == MoreOres.yellowSapling.blockID){
            	((BlockYellowSapling)MoreOres.yellowSapling).growTree(this.worldObj, par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ, rand);
            }
            
            if(this.worldObj.getBlockId(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ) == MoreOres.greenSapling.blockID){
            	((BlockGreenSapling)MoreOres.greenSapling).growTree(this.worldObj, par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ, rand);
            }
            
            if(this.worldObj.getBlockId(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ) == MoreOres.blueSapling.blockID){
            	((BlockBlueSapling)MoreOres.blueSapling).growTree(this.worldObj, par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ, rand);
            }
            
            if(this.worldObj.getBlockId(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ) == MoreOres.rainbowSapling.blockID){
            	((BlockRainbowSapling)MoreOres.rainbowSapling).growTree(this.worldObj, par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ, rand);
            }
            
            if(this.worldObj.getBlockId(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ) == Block.dirt.blockID){
            	this.worldObj.setBlock(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ, Block.grass.blockID);
            }
            
            if(this.worldObj.getBlockId(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY, par1MovingObjectPosition.blockZ) == Block.reed.blockID){
            	if(this.worldObj.isAirBlock(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY + 1, par1MovingObjectPosition.blockZ)){
            		this.worldObj.setBlock(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY + 1, par1MovingObjectPosition.blockZ, Block.reed.blockID);
            	}
            	if(this.worldObj.isAirBlock(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY + 2, par1MovingObjectPosition.blockZ)){
            		this.worldObj.setBlock(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY + 2, par1MovingObjectPosition.blockZ, Block.reed.blockID);
            	}
            	if(this.worldObj.isAirBlock(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY + 3, par1MovingObjectPosition.blockZ)){
            		this.worldObj.setBlock(par1MovingObjectPosition.blockX, par1MovingObjectPosition.blockY + 3, par1MovingObjectPosition.blockZ, Block.reed.blockID);
            	}
            }
            
            else{
            	this.noClip = false;
            }
        }
    }
}
