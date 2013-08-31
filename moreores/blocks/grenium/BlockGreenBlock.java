package moreores.blocks.grenium;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BlockGreenBlock extends Block {
	

	public BlockGreenBlock(int id, Material mat){
		super(id, mat);
	}	

	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("moreores:greenBlock");
	} 
	
	public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity){	
		if(par5Entity instanceof EntityLivingBase){
			((EntityLivingBase)par5Entity).addPotionEffect(new PotionEffect(Potion.jump.getId(), 1200, 10));
			((EntityLivingBase)par5Entity).addPotionEffect(new PotionEffect(Potion.resistance.getId(), 1200, 10));
		}
	}
	
	public int quantityDropped(){
		return 1;
	}
	

}
