package moreores.dimension;

import java.util.Random;

import moreores.MoreOres;
import moreores.worldgen.WorldGeneratorRainbowTrees;
import moreores.worldgen.WorldGeneratorRainbowVines;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;
public class BiomeRainbowBiome extends BiomeGenBase
{
	public final Material blockMaterial;
	public BiomeRainbowBiome(int par1)
	{
		super(par1);
		this.blockMaterial = Material.water;
		this.setMinMaxHeight(75.0F, 250.0F);
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.topBlock = ((byte)MoreOres.rainbowGrass.blockID);
		this.fillerBlock = ((byte)MoreOres.rainbowDirt.blockID);
		this.setBiomeName("Rainbow");
		this.theBiomeDecorator.grassPerChunk = 0;
		this.theBiomeDecorator.flowersPerChunk = 0;
		this.theBiomeDecorator.reedsPerChunk = 0;
		this.theBiomeDecorator.cactiPerChunk = 0;
		this.theBiomeDecorator.clayPerChunk = 0;
		this.theBiomeDecorator.deadBushPerChunk = 0;
		this.theBiomeDecorator.mushroomsPerChunk = 0;
		this.theBiomeDecorator.sandPerChunk = 0;
		this.theBiomeDecorator.treesPerChunk = 3;

		this.waterColorMultiplier = 0xE42D17;
	}
	
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
	{
		return (WorldGenerator)(par1Random.nextInt(5) == 0 ? new WorldGeneratorRainbowTrees(false) : (par1Random.nextInt(10) == 0 ? new WorldGeneratorRainbowTrees(false) : new WorldGeneratorRainbowTrees(false)));
	}
	
	public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);
        WorldGeneratorRainbowVines worldgenvines = new WorldGeneratorRainbowVines();

        for (int k = 0; k < 50; ++k)
        {
            int l = par3 + par2Random.nextInt(16) + 8;
            byte b0 = 64;
            int i1 = par4 + par2Random.nextInt(16) + 8;
            worldgenvines.generate(par1World, par2Random, l, b0, i1);
        }
    }
}