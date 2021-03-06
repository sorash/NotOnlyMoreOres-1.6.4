package moreores.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockGeneralOre extends Block{

	public BlockGeneralOre(int par1, Material par2Material) {
		super(par1, par2Material);
	}
	
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("moreores" + ":" + (this.getUnlocalizedName().substring(5)));
	} 

	public int idDropped(int par1, Random rand, int par2){
		return this.blockID;
	}
	
	public int quantityDropped(){
		return 1;
	}
}
