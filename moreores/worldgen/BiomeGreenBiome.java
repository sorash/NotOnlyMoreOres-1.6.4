package moreores.worldgen;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenHugeTrees;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTaiga1;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGreenBiome extends BiomeGenBase{

	public BiomeGreenBiome(int par1) {
		super(par1);
		this.topBlock = (byte) Block.grass.blockID;
		this.fillerBlock = (byte) Block.dirt.blockID;
		
		this.waterColorMultiplier = 0xE01B1B;
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityOcelot.class, 2, 4, 8));
		
		this.setMinMaxHeight(50.0F, 200.0F);
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
        return (WorldGenerator)(par1Random.nextInt(10) == 0 ? new WorldGeneratorGreenTrees(false) : (par1Random.nextInt(2) == 0 ? new WorldGeneratorGreenTrees(false) : (par1Random.nextInt(3) == 0 ? new WorldGeneratorGreenTrees(false) : new WorldGeneratorGreenTrees(false))));
    }
    
    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);
        WorldGeneratorGreenVines worldgenvines = new WorldGeneratorGreenVines();

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
        return ((ColorizerGrass.getGrassColor(d0, d1) & 0x37FF00));
    }

    @SideOnly(Side.CLIENT)

    /**
     * Provides the basic foliage color based on the biome temperature and rainfall
     */
    public int getBiomeFoliageColor()
    {
        double d0 = (double)this.getFloatTemperature();
        double d1 = (double)this.getFloatRainfall();
        return ((ColorizerFoliage.getFoliageColor(d0, d1) & 0x37FF00));
    }
    
    
}
