package moreores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockGeneralGrass extends Block{

	public Icon field_94393_a;
	public Icon field_94392_b;
	
	public BlockGeneralGrass(int par1, Material par2Material) {
		super(par1, par2Material);
	}

	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("moreores" + ":" + (this.getUnlocalizedName().substring(5)) + "_side");
		this.field_94393_a = par1IconRegister.registerIcon("moreores" + ":" + (this.getUnlocalizedName().substring(5)) + "_top");
		this.field_94392_b = par1IconRegister.registerIcon("moreores" + ":" + (this.getUnlocalizedName().substring(5)) + "_bottom");
	} 
	
	public Icon getIcon(int par1, int par2){
		return par1 == 0? this.field_94392_b : (par1 == 1 ? this.field_94393_a : this .blockIcon);
	}
	
}
