package moreores.blocks.kalfur;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BlockPurpleBlock extends Block {
	

	public BlockPurpleBlock(int id, Material mat){
		super(id, mat);
	}	

	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("moreores:purpleBlock");
	} 
	
	public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity){	
		if(par5Entity instanceof EntityLivingBase){
			((EntityLivingBase)par5Entity).addPotionEffect(new PotionEffect(Potion.blindness.getId(), 200, 20));
			((EntityLivingBase)par5Entity).addPotionEffect(new PotionEffect(Potion.confusion.getId(), 400, 100));
			((EntityLivingBase)par5Entity).addPotionEffect(new PotionEffect(Potion.digSlowdown.getId(), 400, 20));
			((EntityLivingBase)par5Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 350, 2));
		}
	}
	
	public int quantityDropped(){
		return 1;
	}
	

}
