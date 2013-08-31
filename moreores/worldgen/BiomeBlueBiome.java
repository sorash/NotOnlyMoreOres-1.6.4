package moreores.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BiomeBlueBiome extends BiomeGenBase{

	public BiomeBlueBiome(int par1) {
		super(par1);
		this.topBlock = (byte) Block.grass.blockID;
		this.fillerBlock = (byte) Block.dirt.blockID;
		
		this.waterColorMultiplier = 0x0011BB;
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityOcelot.class, 2, 4, 8));
		
		this.setMinMaxHeight(75.0F, 250.0F);
		this.theBiomeDecorator.treesPerChunk = 13;
		this.theBiomeDecorator.grassPerChunk = 16;
		this.theBiomeDecorator.clayPerChunk = 3;
		this.theBiomeDecorator.reedsPerChunk = 5;
		this.theBiomeDecorator.ironGen = new WorldGenMinable(Block.oreIron.blockID, 8);
	 
	}

    /**
     * Gets a WorldGen appropriate for this biome.
     */
    public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return (WorldGenerator)(par1Random.nextInt(10) == 0 ? new WorldGeneratorBlueTrees(false, 6 + par1Random.nextInt(7), 0, 0) : (par1Random.nextInt(2) == 0 ? new WorldGeneratorBlueTrees(false, 15 + par1Random.nextInt(7), 0, 0) : (par1Random.nextInt(3) == 0 ? new WorldGeneratorBlueTrees(false, 11 + par1Random.nextInt(20), 3, 3) : new WorldGeneratorBlueTrees(false, 8 + par1Random.nextInt(7), 0, 0))));
    }
    
    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);
        WorldGeneratorBlueVines worldgenvines = new WorldGeneratorBlueVines();

        for (int k = 0; k < 50; ++k)
        {
            int l = par3 + par2Random.nextInt(16) + 8;
            byte b0 = 64;
            int i1 = par4 + par2Random.nextInt(16) + 8;
            worldgenvines.generate(par1World, par2Random, l, b0, i1);
        }
    }
    
    @SideOnly(Side.CLIENT)

    /**
     * Provides the basic grass color based on the biome temperature and rainfall
     */
    public int getBiomeGrassColor()
    {
        double d0 = (double)this.getFloatTemperature();
        double d1 = (double)this.getFloatRainfall();
        return ((ColorizerGrass.getGrassColor(d0, d1) & 0x2969FF));
    }

    @SideOnly(Side.CLIENT)

    /**
     * Provides the basic foliage color based on the biome temperature and rainfall
     */
    public int getBiomeFoliageColor()
    {
        double d0 = (double)this.getFloatTemperature();
        double d1 = (double)this.getFloatRainfall();
        return ((ColorizerFoliage.getFoliageColor(d0, d1) & 0x2969FF));
    }
    
}
