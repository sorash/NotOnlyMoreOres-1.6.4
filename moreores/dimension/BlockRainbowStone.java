package moreores.dimension;
import static net.minecraftforge.common.ForgeDirection.UP;

import java.util.Random;

import moreores.MoreOres;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;
public class BlockRainbowStone extends Block
{
	public BlockRainbowStone(int par1)
	{
		super(par1, Material.rock);
		this.setUnlocalizedName("moreores:rainbowStone");
	}
	
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("moreores:rainbowStone");
	}
	
	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return MoreOres.rainbowStone.blockID;
	}
}