package moreores.blocks.origum;

import java.util.Random;

import moreores.worldgen.WorldGeneratorOrangeTrees;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;

public class BlockOrangeSapling extends BlockFlower
{

	public static final String[] WOOD_TYPES = new String[] {"orange"};
	public BlockOrangeSapling(int i, int j)
	{
		super(i);
		float var3 = 0.4F;
		this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
	}
	/**
	 * Ticks the block if it's been scheduled
	 */
	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		if (!par1World.isRemote)
		{
			super.updateTick(par1World, par2, par3, par4, par5Random);
			if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9 && par5Random.nextInt(7) == 0)
			{
				this.func_96477_c(par1World, par2, par3, par4, par5Random);
			}
		}
	}
	public void func_96477_c(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		int l = par1World.getBlockMetadata(par2, par3, par4);

		if ((l & 8) == Block.grass.blockID)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, l | 8, 4);
		}
		else
		{
			this.growTree(par1World, par2, par3, par4, par5Random);
		}
	}
	/**
	 * Attempts to grow a sapling into a tree
	 */
	public void growTree(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		if (!TerrainGen.saplingGrowTree(par1World, par5Random, par2, par3, par4)) return;
		int l = par1World.getBlockMetadata(par2, par3, par4) & 3;
		Object object = null;
		int i1 = 0;
		int j1 = 0;
		boolean flag = false;
		if (l == 3)
		{
			for (i1 = 0; i1 >= -1; --i1)
			{
				for (j1 = 0; j1 >= -1; --j1)
				{
					if (this.isSameSapling(par1World, par2 + i1, par3, par4 + j1, 3) && this.isSameSapling(par1World, par2 + i1 + 1, par3, par4 + j1, 3) && this.isSameSapling(par1World, par2 + i1, par3, par4 + j1 + 1, 3) && this.isSameSapling(par1World, par2 + i1 + 1, par3, par4 + j1 + 1, 3))
					{

						object = new WorldGeneratorOrangeTrees(true, 10 + par5Random.nextInt(20), 0, 0, false);
						flag = true;
						break;
					}
				}
				if (object != null)
				{
					break;
				}
			}
			if (object == null)
			{
				j1 = 0;
				i1 = 0;

				object = new WorldGeneratorOrangeTrees(true, 4 + par5Random.nextInt(7), 3, 3, false);
			}
		}
		else
		{

			object = new WorldGeneratorOrangeTrees(true);
		}
		if (flag)
		{
			par1World.setBlock(par2 + i1, par3, par4 + j1, 0, 0, 4);
			par1World.setBlock(par2 + i1 + 1, par3, par4 + j1, 0, 0, 4);
			par1World.setBlock(par2 + i1, par3, par4 + j1 + 1, 0, 0, 4);
			par1World.setBlock(par2 + i1 + 1, par3, par4 + j1 + 1, 0, 0, 4);
		}
		else
		{
			par1World.setBlock(par2, par3, par4, 0, 0, 4);
		}
		if (!((WorldGenerator)object).generate(par1World, par5Random, par2 + i1, par3, par4 + j1))
		{
			if (flag)
			{
				par1World.setBlock(par2 + i1, par3, par4 + j1, this.blockID, l, 4);
				par1World.setBlock(par2 + i1 + 1, par3, par4 + j1, this.blockID, l, 4);
				par1World.setBlock(par2 + i1, par3, par4 + j1 + 1, this.blockID, l, 4);
				par1World.setBlock(par2 + i1 + 1, par3, par4 + j1 + 1, this.blockID, l, 4);
			}
			else
			{
				par1World.setBlock(par2, par3, par4, this.blockID, l, 4);
			}
		}
	}
	/**
	 * Determines if the same sapling is present at the given location.
	 */
	public boolean isSameSapling(World par1World, int par2, int par3, int par4, int par5)
	{
		return par1World.getBlockId(par2, par3, par4) == this.blockID && (par1World.getBlockMetadata(par2, par3, par4) & 3) == par5;
	}
	/**
	 * Gets passed in the blockID of the block below and supposed to return true if its allowed to grow on the type of
	 * blockID passed in. Args: blockID
	 */
	@Override
	protected boolean canThisPlantGrowOnThisBlockID(int par1)
	{
		return par1 == Block.grass.blockID || par1 == Block.dirt.blockID || par1 == Block.tilledField.blockID;
	}
	
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("moreores:orangeSapling");
	}  
}