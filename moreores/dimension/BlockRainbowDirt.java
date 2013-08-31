package moreores.dimension;

import moreores.MoreOres;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;

public class BlockRainbowDirt extends Block{
	public BlockRainbowDirt(int par1)
	{
		super(par1, Material.ground);
		this.setUnlocalizedName("moreores:rainbowDirt");
	}

	public int idDropped()
	{
		return MoreOres.rainbowDirt.blockID;
	}
	
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("moreores:rainbowDirt");
	}
	
    public boolean canSustainPlant(World world, int x, int y, int z, ForgeDirection direction, IPlantable plant)
    {
    	return true;
    }
}