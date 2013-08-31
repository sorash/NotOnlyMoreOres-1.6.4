package moreores.blocks;

import moreores.MoreOresConfig;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BlockTrampoline extends Block{

	EntityLiving entityliving;
	
	public BlockTrampoline(int par1, Material par2Material) {
		super(par1, par2Material);        
        this.setBlockBounds(0.0F, 0.457F, 0.0F, 1.0F, 0.7F, 1.0F);
	}
	
    public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity) {
    	((EntityLivingBase)par5Entity).addPotionEffect(new PotionEffect(Potion.resistance.getId(), 1200, 10));
    	par5Entity.motionY += (double)MoreOresConfig.trampolineHeight;
    }
	
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public int getRenderType()
    {
        return 0;
    }
    
    public void setBlockBoundsForItemRender()
    {
        float f = 0.1875F;
        this.setBlockBounds(0.0F, 0.82F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("moreores:trampoline");
	}

}
