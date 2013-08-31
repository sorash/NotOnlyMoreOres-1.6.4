package moreores.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockXrayBlock extends Block{

	public BlockXrayBlock(int par1, Material par2Material) {
		super(par1, par2Material);
	}

    public boolean isOpaqueCube()
    {
        return true;
    }
    
	public int quantityDropped(Random par1Random)
	{
		return 0;
	}

	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("moreores:xrayBlock");
	}
	
}
