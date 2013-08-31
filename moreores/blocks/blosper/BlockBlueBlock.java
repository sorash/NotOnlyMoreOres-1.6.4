package moreores.blocks.blosper;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;

public class BlockBlueBlock extends Block {
	

	public BlockBlueBlock(int id, Material mat){
		super(id, mat);
	}	

	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("moreores:blueBlock");
	} 
	
	public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity){
		if(par5Entity instanceof EntityLivingBase){
			((EntityLivingBase)par5Entity).addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 1200, 10));
			((EntityLivingBase)par5Entity).addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 1200, 10));
		}
	}
	
	public int quantityDropped(){
		return 1;
	}
}
