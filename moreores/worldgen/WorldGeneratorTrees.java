package moreores.worldgen;

import java.util.Random;

import moreores.MoreOres;
import moreores.MoreOresConfig;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorTrees implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);

		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);

		case 150:
			generateRainbow(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	WorldType worldtype;

	private void generateSurface(World world, Random random, int BlockX, int BlockZ) {

		if(MoreOresConfig.treesAllowed == true){
			if(!(world.getWorldInfo().getTerrainType() == worldtype.FLAT)){
				for(int i = 0; i < 4; i++){
					int Xcoord3 = BlockX + random.nextInt(16);
					int Ycoord3 = random.nextInt(90);
					int Zcoord3 = BlockZ + random.nextInt(16);

					(new WorldGeneratorOrangeTrees(false, 6, 0, 0, false)).generate(world, random, Xcoord3, Ycoord3, Zcoord3);
				}

				for(int i = 0; i < 1; i++){
					int Xcoord = BlockX + random.nextInt(16);
					int Ycoord = random.nextInt(90);
					int Zcoord = BlockZ + random.nextInt(16);

					(new WorldGeneratorBlueTrees(false, 15, 0, 0)).generate(world, random, Xcoord, Ycoord, Zcoord);
				}

				for(int i = 0; i < 2; i++){
					int Xcoord1 = BlockX + random.nextInt(16);
					int Ycoord1 = random.nextInt(90);
					int Zcoord1 = BlockZ + random.nextInt(16);

					(new WorldGeneratorGreenTrees(false)).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
				}

				for(int i = 0; i < 3; i++){
					int Xcoord2 = BlockX + random.nextInt(16);
					int Ycoord2 = random.nextInt(90);
					int Zcoord2 = BlockZ + random.nextInt(16);

					(new WorldGeneratorYellowTrees(false, 7, 0, 0, false)).generate(world, random, Xcoord2, Ycoord2, Zcoord2);
				}
			}
		}
	}

	private void generateNether(World world, Random random, int i, int j) {

	}


	private void generateRainbow(World world, Random random, int chunkX, int chunkZ)
	{
		for(int i = 0; i < 8; i++)
		{
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(90);
			int zCoord = chunkZ + random.nextInt(16);

			(new WorldGenMinableRainbow(MoreOres.rainbowOre.blockID, 5)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}
}