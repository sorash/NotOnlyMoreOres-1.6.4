package moreores.worldgen;

import java.util.Random;

import moreores.MoreOres;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorOres implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);	
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		case 150:
			generateRainbow(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
		for(int i = 0; i < 5; i ++){
			int x = chunkX + random.nextInt(16);
			int y = random.nextInt(120);
			int z = chunkZ + random.nextInt(16);
			
			(new WorldGenMinableEnd(MoreOres.blackOre.blockID, 10)).generate(world, random, x, y, z);
		}
	}

	private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		for(int i = 0; i < 6; i ++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(64);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(MoreOres.orangeOre.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
		for(int i = 0; i < 5; i ++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(53);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(MoreOres.yellowOre.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
		for(int i = 0; i < 4; i ++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(36);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(MoreOres.greenOre.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
		for(int i = 0; i < 3; i ++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(29);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(MoreOres.blueOre.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}

	private void generateNether(World world, Random random, int chunkX, int chunkZ) {
		for(int i = 0; i < 5; i ++){
			int x = chunkX + random.nextInt(16);
			int y = random.nextInt(120);
			int z = chunkZ + random.nextInt(16);
			
			(new WorldGenMinableNether(MoreOres.purpleOre.blockID, 10)).generate(world, random, x, y, z);
		}
	}
	
	private void generateRainbow(World world, Random random, int chunkX, int chunkZ) {
		for(int i = 0; i < 4; i ++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(60);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinableRainbow(MoreOres.rainbowOre.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}
}
