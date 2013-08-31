package moreores.worldgen;

import java.util.Random;

import moreores.MoreOres;
import net.minecraft.util.Direction;
import net.minecraft.util.Facing;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGeneratorOrangeVines extends WorldGenerator
{
    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        int l = par3;

        for (int i1 = par5; par4 < 128; ++par4)
        {
            if (par1World.isAirBlock(par3, par4, par5))
            {
                for (int j1 = 2; j1 <= 5; ++j1)
                {
                    if (MoreOres.orangeVines.canPlaceBlockOnSide(par1World, par3, par4, par5, j1))
                    {
                        par1World.setBlock(par3, par4, par5, MoreOres.orangeVines.blockID, 1 << Direction.facingToDirection[Facing.oppositeSide[j1]], 2);
                        break;
                    }
                }
            }
            else
            {
                par3 = l + par2Random.nextInt(4) - par2Random.nextInt(4);
                par5 = i1 + par2Random.nextInt(4) - par2Random.nextInt(4);
            }
        }

        return true;
    }
}
