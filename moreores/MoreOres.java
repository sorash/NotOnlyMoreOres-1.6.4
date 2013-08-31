package moreores;

import moreores.armour.ItemNightVisionGoggles;
import moreores.armour.blosper.ItemBlueBoots;
import moreores.armour.blosper.ItemBlueChestplate;
import moreores.armour.blosper.ItemBlueHelmet;
import moreores.armour.blosper.ItemBlueLeggings;
import moreores.armour.enoudra.ItemBlackBoots;
import moreores.armour.enoudra.ItemBlackChestplate;
import moreores.armour.enoudra.ItemBlackHelmet;
import moreores.armour.enoudra.ItemBlackLeggings;
import moreores.armour.grenium.ItemGreenBoots;
import moreores.armour.grenium.ItemGreenChestplate;
import moreores.armour.grenium.ItemGreenHelmet;
import moreores.armour.grenium.ItemGreenLeggings;
import moreores.armour.kalfur.ItemPurpleBoots;
import moreores.armour.kalfur.ItemPurpleChestplate;
import moreores.armour.kalfur.ItemPurpleHelmet;
import moreores.armour.kalfur.ItemPurpleLeggings;
import moreores.armour.origum.ItemOrangeBoots;
import moreores.armour.origum.ItemOrangeChestplate;
import moreores.armour.origum.ItemOrangeHelmet;
import moreores.armour.origum.ItemOrangeLeggings;
import moreores.armour.rainbow.ItemRainbowBoots;
import moreores.armour.rainbow.ItemRainbowChestplate;
import moreores.armour.rainbow.ItemRainbowHelmet;
import moreores.armour.rainbow.ItemRainbowLeggings;
import moreores.armour.yagniss.ItemYellowBoots;
import moreores.armour.yagniss.ItemYellowChestplate;
import moreores.armour.yagniss.ItemYellowHelmet;
import moreores.armour.yagniss.ItemYellowLeggings;
import moreores.blocks.BlockGeneralFence;
import moreores.blocks.BlockGeneralFencegate;
import moreores.blocks.BlockGeneralGlass;
import moreores.blocks.BlockGeneralLadder;
import moreores.blocks.BlockGeneralOre;
import moreores.blocks.BlockGeneralPlanks;
import moreores.blocks.BlockGeneralPressurePlate;
import moreores.blocks.BlockGeneralStairs;
import moreores.blocks.BlockGeneralTrapdoor;
import moreores.blocks.BlockGeneralVines;
import moreores.blocks.BlockGeneralWalls;
import moreores.blocks.BlockTrampoline;
import moreores.blocks.BlockXrayBlock;
import moreores.blocks.blosper.BlockBlueBlock;
import moreores.blocks.blosper.BlockBlueCrop;
import moreores.blocks.blosper.BlockBlueDoor;
import moreores.blocks.blosper.BlockBlueLeaves;
import moreores.blocks.blosper.BlockBlueLog;
import moreores.blocks.blosper.BlockBlueSapling;
import moreores.blocks.blosper.BlockBlueSlab;
import moreores.blocks.blosper.BlockBlueTorch;
import moreores.blocks.enoudra.BlockBlackBlock;
import moreores.blocks.enoudra.BlockBlackDoor;
import moreores.blocks.enoudra.BlockBlackSlab;
import moreores.blocks.enoudra.BlockBlackTorch;
import moreores.blocks.grenium.BlockGreenBlock;
import moreores.blocks.grenium.BlockGreenCrop;
import moreores.blocks.grenium.BlockGreenDoor;
import moreores.blocks.grenium.BlockGreenLeaves;
import moreores.blocks.grenium.BlockGreenLog;
import moreores.blocks.grenium.BlockGreenSapling;
import moreores.blocks.grenium.BlockGreenSlab;
import moreores.blocks.grenium.BlockGreenTorch;
import moreores.blocks.kalfur.BlockPurpleBlock;
import moreores.blocks.kalfur.BlockPurpleCrop;
import moreores.blocks.kalfur.BlockPurpleDoor;
import moreores.blocks.kalfur.BlockPurpleSlab;
import moreores.blocks.kalfur.BlockPurpleTorch;
import moreores.blocks.origum.BlockOrangeBlock;
import moreores.blocks.origum.BlockOrangeCrop;
import moreores.blocks.origum.BlockOrangeDoor;
import moreores.blocks.origum.BlockOrangeLeaves;
import moreores.blocks.origum.BlockOrangeLog;
import moreores.blocks.origum.BlockOrangeSapling;
import moreores.blocks.origum.BlockOrangeSlab;
import moreores.blocks.origum.BlockOrangeTorch;
import moreores.blocks.yagniss.BlockYellowBlock;
import moreores.blocks.yagniss.BlockYellowCrop;
import moreores.blocks.yagniss.BlockYellowDoor;
import moreores.blocks.yagniss.BlockYellowLeaves;
import moreores.blocks.yagniss.BlockYellowLog;
import moreores.blocks.yagniss.BlockYellowSapling;
import moreores.blocks.yagniss.BlockYellowSlab;
import moreores.blocks.yagniss.BlockYellowTorch;
import moreores.creativetabs.BlackTab;
import moreores.creativetabs.BlueTab;
import moreores.creativetabs.GreenTab;
import moreores.creativetabs.MachinesTab;
import moreores.creativetabs.OrangeTab;
import moreores.creativetabs.PurpleTab;
import moreores.creativetabs.RainbowTab;
import moreores.creativetabs.YellowTab;
import moreores.dimension.BiomeRainbowBiome;
import moreores.dimension.BlockRainbowBlock;
import moreores.dimension.BlockRainbowCrop;
import moreores.dimension.BlockRainbowDirt;
import moreores.dimension.BlockRainbowDoor;
import moreores.dimension.BlockRainbowFire;
import moreores.dimension.BlockRainbowGrass;
import moreores.dimension.BlockRainbowLeaves;
import moreores.dimension.BlockRainbowLog;
import moreores.dimension.BlockRainbowOre;
import moreores.dimension.BlockRainbowPortal;
import moreores.dimension.BlockRainbowSapling;
import moreores.dimension.BlockRainbowSlab;
import moreores.dimension.BlockRainbowStone;
import moreores.dimension.BlockRainbowTorch;
import moreores.dimension.ItemRainbowLighter;
import moreores.dimension.ItemRainbowPortalPlacer;
import moreores.dimension.WorldProviderRainbow;
import moreores.entity.EntityBlueCreeper;
import moreores.entity.EntityBlueSlime;
import moreores.entity.EntityGreenCreeper;
import moreores.entity.EntityGreenSlime;
import moreores.entity.EntityOrangeCreeper;
import moreores.entity.EntityOrangeSlime;
import moreores.entity.EntityYellowCreeper;
import moreores.entity.EntityYellowSlime;
import moreores.entity.projectile.EntityBlackArrow;
import moreores.entity.projectile.EntityBlueArrow;
import moreores.entity.projectile.EntityGreenArrow;
import moreores.entity.projectile.EntityGrenade;
import moreores.entity.projectile.EntityLava;
import moreores.entity.projectile.EntityLavaReplace;
import moreores.entity.projectile.EntityOrangeArrow;
import moreores.entity.projectile.EntityPurpleArrow;
import moreores.entity.projectile.EntityWater;
import moreores.entity.projectile.EntityWaterReplace;
import moreores.entity.projectile.EntityYellowArrow;
import moreores.furnaces.BlockBlackFurnace;
import moreores.furnaces.BlockBlueFurnace;
import moreores.furnaces.BlockGreenFurnace;
import moreores.furnaces.BlockOrangeFurnace;
import moreores.furnaces.BlockPurpleFurnace;
import moreores.furnaces.BlockRainbowFurnace;
import moreores.furnaces.BlockYellowFurnace;
import moreores.furnaces.TileEntityBlackFurnace;
import moreores.furnaces.TileEntityBlueFurnace;
import moreores.furnaces.TileEntityGreenFurnace;
import moreores.furnaces.TileEntityOrangeFurnace;
import moreores.furnaces.TileEntityPurpleFurnace;
import moreores.furnaces.TileEntityRainbowFurnace;
import moreores.furnaces.TileEntityYellowFurnace;
import moreores.head.BlockSkorpio;
import moreores.head.ItemSkorpio;
import moreores.head.TileEntitySkorpio;
import moreores.items.ItemCrusher;
import moreores.items.ItemGeneralChunklet;
import moreores.items.ItemGeneralChunkletMolded;
import moreores.items.ItemGeneralCrushedItems;
import moreores.items.ItemGeneralFuel;
import moreores.items.ItemGeneralIngot;
import moreores.items.ItemGeneralJelly;
import moreores.items.ItemGeneralNugget;
import moreores.items.ItemGeneralSeeds;
import moreores.items.ItemIntroBook;
import moreores.items.ItemIronRod;
import moreores.items.ItemRubber;
import moreores.items.ItemRubberBand;
import moreores.items.ItemSecretPaste;
import moreores.items.blosper.ItemBlueBucket;
import moreores.items.blosper.ItemBlueDoor;
import moreores.items.blosper.ItemBlueIngot;
import moreores.items.blosper.ItemBlueWoodDoor;
import moreores.items.blosper.ItemBlueberry;
import moreores.items.blosper.ItemEnchantedBlueberry;
import moreores.items.enoudra.ItemBlackBucket;
import moreores.items.enoudra.ItemBlackDoor;
import moreores.items.grenium.ItemEnchantedGreenApple;
import moreores.items.grenium.ItemGreenApple;
import moreores.items.grenium.ItemGreenBucket;
import moreores.items.grenium.ItemGreenDoor;
import moreores.items.grenium.ItemGreenWoodDoor;
import moreores.items.kalfur.ItemPurpleBucket;
import moreores.items.kalfur.ItemPurpleDoor;
import moreores.items.origum.ItemEnchantedOrange;
import moreores.items.origum.ItemOrange;
import moreores.items.origum.ItemOrangeBucket;
import moreores.items.origum.ItemOrangeDoor;
import moreores.items.origum.ItemOrangeWoodDoor;
import moreores.items.rainbow.ItemEnchantedSuperfruit;
import moreores.items.rainbow.ItemRainbowBucket;
import moreores.items.rainbow.ItemRainbowDoor;
import moreores.items.rainbow.ItemRainbowWoodDoor;
import moreores.items.rainbow.ItemSuperfruit;
import moreores.items.yagniss.ItemEnchantedLemon;
import moreores.items.yagniss.ItemLemon;
import moreores.items.yagniss.ItemYellowBucket;
import moreores.items.yagniss.ItemYellowDoor;
import moreores.items.yagniss.ItemYellowWoodDoor;
import moreores.machines.BlockCrusher;
import moreores.machines.BlockExtractor;
import moreores.machines.TileEntityCrusher;
import moreores.machines.TileEntityExtractor;
import moreores.tools.ItemArrows;
import moreores.tools.ItemGreenCrossbow;
import moreores.tools.ItemGrenade;
import moreores.tools.blosper.ItemBlueAxe;
import moreores.tools.blosper.ItemBlueHoe;
import moreores.tools.blosper.ItemBluePaxcel;
import moreores.tools.blosper.ItemBluePickaxe;
import moreores.tools.blosper.ItemBlueShovel;
import moreores.tools.blosper.ItemBlueStaff;
import moreores.tools.blosper.ItemBlueSword;
import moreores.tools.enoudra.ItemBlackAxe;
import moreores.tools.enoudra.ItemBlackHoe;
import moreores.tools.enoudra.ItemBlackPaxcel;
import moreores.tools.enoudra.ItemBlackPickaxe;
import moreores.tools.enoudra.ItemBlackShovel;
import moreores.tools.enoudra.ItemBlackStaff;
import moreores.tools.enoudra.ItemBlackSword;
import moreores.tools.grenium.ItemGreenAxe;
import moreores.tools.grenium.ItemGreenHoe;
import moreores.tools.grenium.ItemGreenPaxcel;
import moreores.tools.grenium.ItemGreenPickaxe;
import moreores.tools.grenium.ItemGreenShovel;
import moreores.tools.grenium.ItemGreenStaff;
import moreores.tools.grenium.ItemGreenSword;
import moreores.tools.kalfur.ItemPurpleAxe;
import moreores.tools.kalfur.ItemPurpleHoe;
import moreores.tools.kalfur.ItemPurplePaxcel;
import moreores.tools.kalfur.ItemPurplePickaxe;
import moreores.tools.kalfur.ItemPurpleShovel;
import moreores.tools.kalfur.ItemPurpleStaff;
import moreores.tools.kalfur.ItemPurpleSword;
import moreores.tools.origum.ItemOrangeAxe;
import moreores.tools.origum.ItemOrangeHoe;
import moreores.tools.origum.ItemOrangePaxcel;
import moreores.tools.origum.ItemOrangePickaxe;
import moreores.tools.origum.ItemOrangeShovel;
import moreores.tools.origum.ItemOrangeStaff;
import moreores.tools.origum.ItemOrangeSword;
import moreores.tools.rainbow.ItemRainbowAxe;
import moreores.tools.rainbow.ItemRainbowHoe;
import moreores.tools.rainbow.ItemRainbowPaxcel;
import moreores.tools.rainbow.ItemRainbowPickaxe;
import moreores.tools.rainbow.ItemRainbowShovel;
import moreores.tools.rainbow.ItemRainbowStaff;
import moreores.tools.rainbow.ItemRainbowSword;
import moreores.tools.yagniss.ItemYellowAxe;
import moreores.tools.yagniss.ItemYellowHoe;
import moreores.tools.yagniss.ItemYellowPaxcel;
import moreores.tools.yagniss.ItemYellowPickaxe;
import moreores.tools.yagniss.ItemYellowShovel;
import moreores.tools.yagniss.ItemYellowStaff;
import moreores.tools.yagniss.ItemYellowSword;
import moreores.worldgen.BiomeBlueBiome;
import moreores.worldgen.BiomeGreenBiome;
import moreores.worldgen.BiomeOrangeBiome;
import moreores.worldgen.BiomeYellowBiome;
import moreores.worldgen.WorldGeneratorOres;
import moreores.worldgen.WorldGeneratorRainbowTrees;
import moreores.worldgen.WorldGeneratorTrees;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.EnumMobType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraft.src.ModLoader;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;

import org.lwjgl.input.Keyboard;
import org.modstats.ModstatInfo;
import org.modstats.Modstats;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@ModstatInfo(prefix="nomo")
@Mod(modid = MoreOres.modID, name = MoreOres.modID, version = MoreOres.version)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels = { "MoreOresMod" }, packetHandler = PacketHandlerMoreOres.class)
public class MoreOres {

	public static final String modID = "Skorpio's NotOnlyMoreOres Mod";
	public static final String version = "2.6";

	@Instance(MoreOres.modID)
	public static MoreOres instance = new MoreOres();

	public static int KEY_AIM = Keyboard.KEY_F;

	private GuiHandlerMoreOres guihandler = new GuiHandlerMoreOres();


	@SidedProxy(clientSide = "moreores.ClientProxyMoreOres", serverSide = "moreores.ServerProxyMoreOres")
	public static ServerProxyMoreOres proxy;


	//config
	public static Configuration config;

	//crafting handler
	public static CraftingHandlerMoreOres moreOresCraftingHandler = new CraftingHandlerMoreOres();


	//intro book
	public static Item introBook;


	//my head
	public static Item skorpio;
	public static Block skorpioHead;


	//dimension
	public static Block rainbowDirt;
	public static Block rainbowGrass;
	public static Block rainbowStone;

	public static BlockRainbowPortal rainbowPortal;

	public static BlockRainbowFire rainbowFire;

	public static Item rainbowLighter;

	public static Item rainbowPortalPlacer;

	public static BiomeGenBase rainbowBiome;


	//rainbow tools
	public static Item rainbowPickaxe;

	public static Item rainbowSword;

	public static Item rainbowShovel;

	public static Item rainbowAxe;

	public static Item rainbowHoe;

	public static Item rainbowPaxcel;


	public static Item rainbowStaff;


	//rainbow armor
	public static Item rainbowHelmet;

	public static Item rainbowChestplate;

	public static Item rainbowLeggings;

	public static Item rainbowBoots;


	//rainbow blocks and ingot
	public static Item ingotRainbow;

	public static Block rainbowOre;

	public static Block rainbowBlock;

	//green glass
	public static Block rainbowGlass;

	//rainbow nuggets
	public static Item rainbowNugget;

	//rainbow stairs
	public static Block rainbowStairs;

	//rainbow ladder
	public static Block rainbowLadder;

	//rainbow fence and Fencegate
	public static Block rainbowFence;

	public static Block rainbowFencegate;

	//superfruit
	public static Item superfruit;

	public static Item superfruitEnchanted;

	//rainbow bucket
	public static Item rainbowBucketEmpty;

	public static Item rainbowBucketWater;

	public static Item rainbowBucketLava;

	//rainbow fuel
	public static Item rainbowFuel;

	//crop
	public static Block rainbowCrop;

	//Seeds
	public static Item rainbowSeeds;

	//rainbow chunklet
	public static Item rainbowChunklet;

	//rainbow molded chunklet
	public static Item rainbowChunkletMolded;

	//green apple tree
	public static Block rainbowLog;

	public static Block rainbowLeaves;

	public static Block rainbowSapling;

	//Green Apple Planks
	public static Block rainbowPlanks;

	//green stairs
	public static Block rainbowStairsWood;

	//rainbow walls
	public static Block rainbowWalls;

	//torch
	public static Block rainbowTorch;

	//rainbow enums for armor and tools
	public static EnumToolMaterial toolRainbow = EnumHelper.addToolMaterial("RAINBOW", 3, 2500, 20.0F, 7, 30);

	public static EnumArmorMaterial armorRainbow = EnumHelper.addArmorMaterial("RAINBOW", 45, new int []{3, 8, 6, 2}, 30);

	//rainbow Creative tab
	public static CreativeTabs rainbowTab = new RainbowTab(CreativeTabs.getNextID(), "Rainbow");


	/*
	 * 
	 */


	//Biomes
	public static BiomeGenBase greenBiome;

	public static BiomeGenBase yellowBiome;

	public static BiomeGenBase blueBiome;

	public static BiomeGenBase orangeBiome;


	/*
	 * 
	 */


	//Grenium tools
	public static Item greenPickaxe;
	public static Item greenSword;
	public static Item greenShovel;
	public static Item greenAxe;
	public static Item greenHoe;
	public static Item greenPaxcel;

	public static Item greenCrossbow;

	public static Item greenStaff;

	//Grenium armor
	public static Item greenHelmet;
	public static Item greenChestplate;
	public static Item greenLeggings;
	public static Item greenBoots;

	//Grenium blocks and ingot
	public static Item ingotGreen;
	public static Block greenOre;
	public static Block greenBlock;

	//green glass
	public static Block greenGlass;

	//Grenium nuggets
	public static Item greenNugget;

	//Grenium stairs
	public static Block greenStairs;

	//Grenium ladder
	public static Block greenLadder;

	//Grenium fence and Fencegate
	public static Block greenFence;
	public static Block greenFencegate;

	//Green apple
	public static Item greenApple;

	public static Item greenEnchantedApple;

	//Grenium bucket
	public static Item greenBucketEmpty;
	public static Item greenBucketWater;
	public static Item greenBucketLava;

	//grenium fuel
	public static Item greenFuel;

	//grenade
	public static Item grenade;

	//crop
	public static Block greenCrop;

	//Seeds
	public static Item greenSeeds;

	//grenium chunklet
	public static Item greenChunklet;

	//grenium molded chunklet
	public static Item greenChunkletMolded;

	//green apple tree
	public static Block greenLog;

	public static Block greenLeaves;

	public static Block greenSapling;

	//Green Apple Planks
	public static Block greenPlanks;

	//green stairs
	public static Block greenStairsWood;

	//grenium walls
	public static Block greenWalls;

	//grenium torch
	public static Block greenTorch;

	//Grenium enums for armor and tools
	public static EnumToolMaterial toolGreen = EnumHelper.addToolMaterial("GREEN", 3, 1650, 15.0F, 4, 30);

	public static EnumArmorMaterial armorGreen = EnumHelper.addArmorMaterial("GREEN", 36, new int []{3, 8, 6, 2}, 30);

	//Grenium Creative tab
	public static CreativeTabs greenTab = new GreenTab(CreativeTabs.getNextID(), "GreenStuff");


	/*
	 * 
	 */


	//yegniss tools
	public static Item yellowSword;
	public static Item yellowPickaxe;
	public static Item yellowAxe;
	public static Item yellowShovel;
	public static Item yellowHoe;
	public static Item yellowPaxcel;

	public static Item yellowStaff;

	//yagniss armor
	public static Item yellowHelmet;
	public static Item yellowChestplate;
	public static Item yellowLeggings;
	public static Item yellowBoots;

	//yagniss blocks and ingot
	public static Block yellowOre;
	public static Block yellowBlock;
	public static Item ingotYellow;

	//yellow glass
	public static Block yellowGlass;

	//yagniss nuggets
	public static Item yellowNugget;

	//yagniss stairs
	public static Block yellowStairs;

	//yagniss fence and Fencegate
	public static Block yellowFence;
	public static Block yellowFencegate;

	//yagniss ladder
	public static Block yellowLadder;

	//Lemon
	public static Item lemon;

	public static Item enchantedLemon;

	//yagniss bucket
	public static Item yellowBucketEmpty;
	public static Item yellowBucketWater;

	//yagniss fuel
	public static Item yellowFuel;

	//crop
	public static Block yellowCrop;

	//Seeds
	public static Item yellowSeeds;

	//yagniss chunklet
	public static Item yellowChunklet;

	//grenium molded chunklet
	public static Item yellowChunkletMolded;

	//lemon tree
	public static Block yellowLog;

	public static Block yellowLeaves;

	public static Block yellowSapling;

	//Lemon Planks
	public static Block yellowPlanks;

	//yellow stairs
	public static Block yellowStairsWood;

	//yagniss walls
	public static Block yellowWalls;

	//yagniss torch
	public static Block yellowTorch;

	//yagniss enums for armor and tools
	public static EnumToolMaterial toolYellow = EnumHelper.addToolMaterial("YELLOW", 3, 550, 10.5F, 3, 10);

	public static EnumArmorMaterial armorYellow = EnumHelper.addArmorMaterial("YELLOW", 28, new int []{3, 7, 6, 2}, 30);

	//yagniss Creative tab
	public static CreativeTabs yellowTab = new YellowTab(CreativeTabs.getNextID(), "YellowStuff");


	/*
	 * 
	 */


	//Origum tools
	public static Item orangePickaxe;
	public static Item orangeSword;
	public static Item orangeShovel;
	public static Item orangeAxe;
	public static Item orangeHoe;
	public static Item orangePaxcel;

	public static Item orangeStaff;

	//Origum armor
	public static Item orangeHelmet;
	public static Item orangeChestplate;
	public static Item orangeLeggings;
	public static Item orangeBoots;

	//Origum blocks and ingot
	public static Item ingotOrange;
	public static Block orangeOre;
	public static Block orangeBlock;

	//orange glass
	public static Block orangeGlass;

	//Origum nuggets
	public static Item orangeNugget;

	//Origum stairs
	public static Block orangeStairs;

	//Origum ladder
	public static Block orangeLadder;

	//Origum fence and Fencegate
	public static Block orangeFence;
	public static Block orangeFencegate;

	//orange
	public static Item orange;

	public static Item orangeEnchanted;

	//Origum bucket
	public static Item orangeBucketEmpty;
	public static Item orangeBucketWater;

	//Origum fuel
	public static Item orangeFuel;

	//crop
	public static Block orangeCrop;

	//Seeds
	public static Item orangeSeeds;

	//origum chunklet
	public static Item orangeChunklet;

	//origum molded chunklet
	public static Item orangeChunkletMolded;

	//orange tree
	public static Block orangeLog;

	public static Block orangeLeaves;

	public static Block orangeSapling;

	//orange planks
	public static Block orangePlanks;

	//orange stairs
	public static Block orangeStairsWood;

	//origum walls
	public static Block orangeWalls;

	//origum torch
	public static Block orangeTorch;

	//Origum enums for armor and tools
	public static EnumToolMaterial toolOrange = EnumHelper.addToolMaterial("ORANGE", 2, 486, 7.5F, 2, 30);

	public static EnumArmorMaterial armorOrange = EnumHelper.addArmorMaterial("ORANGE", 20, new int[]{2, 7, 6, 2}, 30);

	//Origum Creative tab
	public static CreativeTabs orangeTab = new OrangeTab(CreativeTabs.getNextID(), "OrangeStuff");


	/*
	 * 
	 */


	//Blosper tools
	public static Item bluePickaxe;
	public static Item blueSword;
	public static Item blueShovel;
	public static Item blueAxe;
	public static Item blueHoe;
	public static Item bluePaxcel;

	public static Item blueStaff;

	//Blosper armor
	public static Item blueHelmet;
	public static Item blueChestplate;
	public static Item blueLeggings;
	public static Item blueBoots;

	//Blosper blocks and ingot
	public static Item ingotBlue;
	public static Block blueOre;
	public static Block blueBlock;

	//Blosper glass
	public static Block blueGlass;

	//Blosper nuggets
	public static Item blueNugget;

	//Blosper stairs
	public static Block blueStairs;

	//Blosper ladder
	public static Block blueLadder;

	//Blosper fence and Fencegate
	public static Block blueFence;
	public static Block blueFencegate;

	//blueberry
	public static Item blueberry;

	public static Item blueberryEnchanted;

	//Blosper bucket
	public static Item blueBucketEmpty;
	public static Item blueBucketWater;
	public static Item blueBucketLava;

	//Blosper fuel
	public static Item blueFuel;

	//crop
	public static Block blueCrop;

	//Seeds
	public static Item blueSeeds;

	//blosper chunklet
	public static Item blueChunklet;

	//blosper molded chunklet
	public static Item blueChunkletMolded;

	//blueberry tree
	public static Block blueLog;

	public static Block blueLeaves;

	public static Block blueSapling;

	//Blueberry Planks
	public static Block bluePlanks;

	//blue stairs
	public static Block blueStairsWood;

	//blosper walls
	public static Block blueWalls;

	//blosper torch
	public static Block blueTorch;

	//Blosper enums for armor and tools
	public static EnumToolMaterial toolBlue = EnumHelper.addToolMaterial("BLUE", 3, 1800, 19.0F, 5, 30);

	public static EnumArmorMaterial armorBlue = EnumHelper.addArmorMaterial("BLUE", 30, new int[]{3, 8, 6, 3}, 30);

	//Blosper Creative tab
	public static CreativeTabs blueTab = new BlueTab(CreativeTabs.getNextID(), "BlueStuff");


	/*
	 * 
	 */


	//Kalfur tools
	public static Item purplePickaxe;
	public static Item purpleSword;
	public static Item purpleShovel;
	public static Item purpleAxe;
	public static Item purpleHoe;
	public static Item purplePaxcel;

	public static Item purpleStaff;

	//Kalfur armor
	public static Item purpleHelmet;
	public static Item purpleChestplate;
	public static Item purpleLeggings;
	public static Item purpleBoots;

	//Kalfur blocks and ingot
	public static Item ingotPurple;
	public static Block purpleOre;
	public static Block purpleBlock;

	//purple glass
	public static Block purpleGlass;

	//Kalfur nuggets
	public static Item purpleNugget;

	//Kalfur stairs
	public static Block purpleStairs;

	//Kalfur ladder
	public static Block purpleLadder;

	//Kalfur fence and Fencegate
	public static Block purpleFence;
	public static Block purpleFencegate;

	//Kalfur bucket
	public static Item purpleBucketEmpty;
	public static Item purpleBucketWater;
	public static Item purpleBucketLava;

	//Kalfur fuel
	public static Item purpleFuel;

	//crop
	public static Block purpleCrop;

	//Seeds
	public static Item purpleSeeds;

	//Kalfur chunklet
	public static Item purpleChunklet;

	//Kalfur molded chunklet
	public static Item purpleChunkletMolded;

	//Kalfur walls
	public static Block purpleWalls;

	//Kalfur torch
	public static Block purpleTorch;

	//Kalfur enums for armor and tools
	public static EnumToolMaterial toolPurple = EnumHelper.addToolMaterial("PURPLE", 3, 1875, 17.0F, 5, 30);

	public static EnumArmorMaterial armorPurple = EnumHelper.addArmorMaterial("PURPLE", 38, new int []{3, 8, 6, 2}, 30);

	//Kalfur Creative tab
	public static CreativeTabs purpleTab = new PurpleTab(CreativeTabs.getNextID(), "purpleStuff");


	/*
	 * 
	 */


	//enoudra tools
	public static Item blackPickaxe;
	public static Item blackSword;
	public static Item blackShovel;
	public static Item blackAxe;
	public static Item blackHoe;
	public static Item blackPaxcel;

	public static Item blackStaff;

	//enoudra armor
	public static Item blackHelmet;
	public static Item blackChestplate;
	public static Item blackLeggings;
	public static Item blackBoots;

	//enoudra blocks and ingot
	public static Item ingotBlack;
	public static Block blackOre;
	public static Block blackBlock;

	//black glass
	public static Block blackGlass;

	//enoudra nuggets
	public static Item blackNugget;

	//enoudra stairs
	public static Block blackStairs;

	//enoudra ladder
	public static Block blackLadder;

	//enoudra fence and Fencegate
	public static Block blackFence;
	public static Block blackFencegate;

	//enoudra bucket
	public static Item blackBucketEmpty;
	public static Item blackBucketWater;
	public static Item blackBucketLava;

	//enoudra fuel
	public static Item blackFuel;

	//enoudra walls
	public static Block blackWalls;

	//enoudra torch
	public static Block blackTorch;

	//enoudra enums for armor and tools
	public static EnumToolMaterial toolBlack = EnumHelper.addToolMaterial("BLACK", 3, 1950, 17.5F, 5, 30);

	public static EnumArmorMaterial armorBlack = EnumHelper.addArmorMaterial("BLACK", 40, new int []{3, 8, 6, 2}, 30);

	//enoudra Creative tab
	public static CreativeTabs blackTab = new BlackTab(CreativeTabs.getNextID(), "blackStuff");


	/*
	 * 
	 */


	//iron rod
	public static Item ironRod;


	//doors
	public static Block orangeDoorBlock;	
	public static Item orangeDoorItem;
	public static Block orangeWoodDoorBlock;	
	public static Item orangeWoodDoorItem;

	public static Block yellowDoorBlock;	
	public static Item yellowDoorItem;
	public static Block yellowWoodDoorBlock;	
	public static Item yellowWoodDoorItem;

	public static Block greenDoorBlock;	
	public static Item greenDoorItem;
	public static Block greenWoodDoorBlock;	
	public static Item greenWoodDoorItem;

	public static Block blueDoorBlock;	
	public static Item blueDoorItem;
	public static Block blueWoodDoorBlock;	
	public static Item blueWoodDoorItem;

	public static Block rainbowDoorBlock;	
	public static Item rainbowDoorItem;
	public static Block rainbowWoodDoorBlock;	
	public static Item rainbowWoodDoorItem;

	public static Block purpleDoorBlock;	
	public static Item purpleDoorItem;

	public static Block blackDoorBlock;	
	public static Item blackDoorItem;

	//trapdoors
	public static Block orangeTrapdoor;

	public static Block yellowTrapdoor;

	public static Block greenTrapdoor;

	public static Block blueTrapdoor;

	public static Block rainbowTrapdoor;

	public static Block purpleTrapdoor;

	public static Block blackTrapdoor;


	//xray block and secret paste
	public static Block xrayBlock;

	public static Item secretPaste;


	//furnaces
	public static Block orangeFurnaceIdle;
	public static Block orangeFurnaceBurning;

	public static Block yellowFurnaceIdle;
	public static Block yellowFurnaceBurning;

	public static Block greenFurnaceIdle;
	public static Block greenFurnaceBurning;

	public static Block blueFurnaceIdle;
	public static Block blueFurnaceBurning;

	public static Block rainbowFurnaceIdle;
	public static Block rainbowFurnaceBurning;

	public static Block purpleFurnaceIdle;
	public static Block purpleFurnaceBurning;

	public static Block blackFurnaceIdle;
	public static Block blackFurnaceBurning;


	//crusher
	public static Block crusherIdle;
	public static Block crusherRunning;

	public static Item crushedItems;

	public static Item crusher;


	//extractor
	public static Block extractorIdle;
	public static Block extractorRunning;

	public static Item rubber;


	//rubber band
	public static Item rubberBand;


	//Machines Creative tab
	public static CreativeTabs machinesTab = new MachinesTab(CreativeTabs.getNextID(), "Machinery");


	//next id
	public static int getUniqueID(){
		int EntityId = 300;
		do{
			EntityId++;
		} while(EntityList.getStringFromID(EntityId) != null);
		return EntityId;
	}

	public static void EntityEgg(Class<? extends Entity > entity, int primaryColor, int secondaryColor){
		int id = getUniqueID();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
	}


	//slime drops
	public static Item orangeJelly;

	public static Item yellowJelly;

	public static Item greenJelly;

	public static Item blueJelly;


	//trampoline
	public static Block trampoline;


	//slabs
	//orange slabs
	public static BlockHalfSlab orangeSingleSlab;
	public static BlockHalfSlab orangeDoubleSlab;

	//yellow slabs
	public static BlockHalfSlab yellowSingleSlab;
	public static BlockHalfSlab yellowDoubleSlab;

	//green slabs
	public static BlockHalfSlab greenSingleSlab;
	public static BlockHalfSlab greenDoubleSlab;

	//blue slabs
	public static BlockHalfSlab blueSingleSlab;
	public static BlockHalfSlab blueDoubleSlab;

	//rainbow slabs
	public static BlockHalfSlab rainbowSingleSlab;
	public static BlockHalfSlab rainbowDoubleSlab;

	//purple slabs
	public static BlockHalfSlab purpleSingleSlab;
	public static BlockHalfSlab purpleDoubleSlab;

	//black slabs
	public static BlockHalfSlab blackSingleSlab;
	public static BlockHalfSlab blackDoubleSlab;


	//night vision goggles
	public static Item nightVisionGoggles;

	public static EnumArmorMaterial nightVision = EnumHelper.addArmorMaterial("NIGHTVISION", 0, new int[]{0, 0, 0, 0}, 0);


	//wood fences and Fencegates
	public static Block orangeWoodFence;
	public static Block orangeWoodFencegate;

	public static Block yellowWoodFence;
	public static Block yellowWoodFencegate;

	public static Block greenWoodFence;
	public static Block greenWoodFencegate;

	public static Block blueWoodFence;
	public static Block blueWoodFencegate;

	public static Block rainbowWoodFence;
	public static Block rainbowWoodFencegate;


	//Vines
	public static Block orangeVines;

	public static Block yellowVines;

	public static Block greenVines;

	public static Block blueVines;

	public static Block rainbowVines;


	//pressure plates
	public static Block orangePressurePlate;
	public static Block orangeWoodPressurePlate;

	public static Block yellowPressurePlate;
	public static Block yellowWoodPressurePlate;

	public static Block greenPressurePlate;
	public static Block greenWoodPressurePlate;

	public static Block bluePressurePlate;
	public static Block blueWoodPressurePlate;

	public static Block rainbowPressurePlate;
	public static Block rainbowWoodPressurePlate;

	public static Block purplePressurePlate;

	public static Block blackPressurePlate;


	//arrows
	public static Item orangeArrow;
	public static Item yellowArrow;
	public static Item greenArrow;
	public static Item blueArrow;
	public static Item purpleArrow;
	public static Item blackArrow;


	//achievements
	public static Achievement goingGreen;

	public static Achievement discovery;

	public static Achievement comfortability;

	public static Achievement closetAch;


	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//Config file
		config = new Configuration(event.getSuggestedConfigurationFile());

		new MoreOresConfig();


		ingotOrange = new ItemGeneralIngot(MoreOresConfig.ingotOrangeID).setUnlocalizedName("ingotOrange").setCreativeTab(orangeTab);

		ingotGreen = new ItemGeneralIngot(MoreOresConfig.ingotGreenID).setUnlocalizedName("ingotGreen").setCreativeTab(greenTab);

		bluePaxcel = new ItemBluePaxcel(MoreOresConfig.bluePaxcelID, toolBlue).setUnlocalizedName("bluePaxcel").setCreativeTab(blueTab);

		ingotRainbow = new ItemGeneralIngot(MoreOresConfig.ingotRainbowID).setUnlocalizedName("ingotRainbow").setCreativeTab(rainbowTab);


		//achievements
		discovery = (new Achievement(MoreOresConfig.discoveryID, "discovery", 6, 4, MoreOres.ingotOrange, AchievementList.buildFurnace)).registerAchievement().setSpecial();

		goingGreen = (new Achievement(MoreOresConfig.goingGreenID, "goingGreen", 6, 6, MoreOres.ingotGreen, MoreOres.discovery)).registerAchievement().setSpecial();

		comfortability = (new Achievement(MoreOresConfig.comfortabilityID, "comfortability", 8, 4, MoreOres.bluePaxcel, MoreOres.discovery)).registerAchievement().setSpecial();

		closetAch = (new Achievement(MoreOresConfig.closetAchID, "closet", 8, 6, MoreOres.ingotRainbow, MoreOres.discovery)).registerAchievement().setSpecial();


		/*
		 * 
		 */


		//intro book
		introBook = new ItemIntroBook(MoreOresConfig.introBookID).setUnlocalizedName("introBook");


		//head
		skorpio = new ItemSkorpio(MoreOresConfig.skorpioID).setUnlocalizedName("skorpio").setCreativeTab(machinesTab);
		skorpioHead = new BlockSkorpio(MoreOresConfig.skorpioHeadID).setHardness(1.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("skorpio").setLightValue(1.0F);
		GameRegistry.registerTileEntity(TileEntitySkorpio.class, "skorpio"); 


		/*
		 * 
		 */


		/** dimension **/
		rainbowFire = (BlockRainbowFire)new BlockRainbowFire(MoreOresConfig.rainbowFireID, Material.fire).setHardness(0.0F).setLightValue(1.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("moreores:rainbowFire").func_111022_d("moreores:rainbowFire").setCreativeTab(rainbowTab);
		rainbowPortal = (BlockRainbowPortal)new BlockRainbowPortal(MoreOresConfig.rainbowPortalID).setHardness(-1.0F).setStepSound(Block.soundGlassFootstep).setLightValue(0.75F).setUnlocalizedName("moreores:rainbowPortal").setCreativeTab(rainbowTab);
		rainbowGrass = new BlockRainbowGrass(200).setHardness(0.6F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("rainbowGrass").setCreativeTab(rainbowTab);
		rainbowDirt = new BlockRainbowDirt(201).setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("rainbowDirt").setCreativeTab(rainbowTab);
		rainbowStone = new BlockRainbowStone(202).setHardness(2.0F).setResistance(10.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("rainbowStone").setCreativeTab(rainbowTab);
		/** Items **/
		rainbowLighter = new ItemRainbowLighter(MoreOresConfig.rainbowLighterID).setUnlocalizedName("rainbowLighter").setCreativeTab(rainbowTab);
		rainbowPortalPlacer = new ItemRainbowPortalPlacer(MoreOresConfig.rainbowPortalPlacerID).setUnlocalizedName("rainbowPortalPlacer").setCreativeTab(rainbowTab);

		//rainbow ids and declarations
		rainbowSword = new ItemRainbowSword(MoreOresConfig.rainbowSwordID, toolRainbow).setUnlocalizedName("rainbowSword").setCreativeTab(rainbowTab);
		rainbowPickaxe = new ItemRainbowPickaxe(MoreOresConfig.rainbowPickaxeID, toolRainbow).setUnlocalizedName("rainbowPickaxe").setCreativeTab(rainbowTab);
		rainbowAxe = new ItemRainbowAxe(MoreOresConfig.rainbowAxeID, toolRainbow).setUnlocalizedName("rainbowAxe").setCreativeTab(rainbowTab);
		rainbowShovel = new ItemRainbowShovel(MoreOresConfig.rainbowShovelID, toolRainbow).setUnlocalizedName("rainbowShovel").setCreativeTab(rainbowTab);
		rainbowHoe = new ItemRainbowHoe(MoreOresConfig.rainbowHoeID, toolRainbow).setUnlocalizedName("rainbowHoe").setCreativeTab(rainbowTab);
		rainbowPaxcel = new ItemRainbowPaxcel(MoreOresConfig.rainbowPaxcelID, toolRainbow).setUnlocalizedName("rainbowPaxcel").setCreativeTab(rainbowTab);

		rainbowStaff = new ItemRainbowStaff(MoreOresConfig.rainbowStaffID).setUnlocalizedName("rainbowStaff").setCreativeTab(rainbowTab);

		rainbowHelmet = new ItemRainbowHelmet(MoreOresConfig.rainbowHelmetID, armorRainbow, proxy.addArmor("rainbow"), 0).setUnlocalizedName("rainbowHelmet").setCreativeTab(rainbowTab);
		rainbowChestplate = new ItemRainbowChestplate(MoreOresConfig.rainbowChestplateID, armorRainbow, proxy.addArmor("rainbow"), 1).setUnlocalizedName("rainbowChestplate").setCreativeTab(rainbowTab);
		rainbowLeggings = new ItemRainbowLeggings(MoreOresConfig.rainbowLeggingsID, armorRainbow, proxy.addArmor("rainbow"), 2).setUnlocalizedName("rainbowLeggings").setCreativeTab(rainbowTab);
		rainbowBoots = new ItemRainbowBoots(MoreOresConfig.rainbowBootsID, armorRainbow, proxy.addArmor("rainbow"), 3).setUnlocalizedName("rainbowBoots").setCreativeTab(rainbowTab);		

		rainbowOre = new BlockRainbowOre(MoreOresConfig.rainbowOreID, Material.rock).setUnlocalizedName("rainbowOre").setCreativeTab(rainbowTab).setHardness(3.0F).setResistance(15.0F).setStepSound(Block.soundStoneFootstep).setLightValue(0.5F);
		rainbowBlock = new BlockRainbowBlock(MoreOresConfig.rainbowBlockID, Material.iron).setUnlocalizedName("rainbowBlock").setCreativeTab(rainbowTab).setHardness(5.0F).setResistance(30.0F).setStepSound(Block.soundMetalFootstep).setLightValue(1.0F);

		rainbowGlass = new BlockGeneralGlass(MoreOresConfig.rainbowGlassID, Material.glass, false).setUnlocalizedName("rainbowGlass").setHardness(0.3F).setResistance(25.0F).setStepSound(Block.soundGlassFootstep).setCreativeTab(rainbowTab);

		rainbowStairs = new BlockGeneralStairs(MoreOresConfig.rainbowStairsID, MoreOres.rainbowBlock, 0).setHardness(1.5F).setResistance(3.5F).setUnlocalizedName("rainbowStairs").setCreativeTab(rainbowTab).setLightOpacity(0);

		rainbowLadder = new BlockGeneralLadder(MoreOresConfig.rainbowLadderID).setHardness(1.0F).setUnlocalizedName("rainbowLadder").setCreativeTab(rainbowTab);

		rainbowFence = new BlockGeneralFence(MoreOresConfig.rainbowFenceID, "moreores:rainbowBlock", Material.iron).setUnlocalizedName("rainbowFence").setCreativeTab(rainbowTab).setHardness(10.0F).setResistance(30.0F);
		rainbowFencegate = new BlockGeneralFencegate(MoreOresConfig.rainbowFencegateID, MoreOres.rainbowBlock).setUnlocalizedName("rainbowFencegate").setCreativeTab(rainbowTab).setHardness(10.0F);

		superfruit = new ItemSuperfruit(MoreOresConfig.superfruitID, 12, 3.5F, false).setUnlocalizedName("superfruit").setCreativeTab(rainbowTab);

		superfruitEnchanted = new ItemEnchantedSuperfruit(MoreOresConfig.superfruitEnchantedID, 15, 3.8F, false).setUnlocalizedName("superfruitEncanted").setCreativeTab(rainbowTab);

		rainbowNugget = new ItemGeneralNugget(MoreOresConfig.rainbowNuggetID).setUnlocalizedName("rainbowNugget").setCreativeTab(rainbowTab);

		rainbowChunklet = new ItemGeneralChunklet(MoreOresConfig.rainbowChunkletID).setUnlocalizedName("rainbowChunklet").setCreativeTab(rainbowTab);

		rainbowChunkletMolded = new ItemGeneralChunkletMolded(MoreOresConfig.rainbowChunkletMoldedID).setUnlocalizedName("rainbowChunkletMolded").setCreativeTab(rainbowTab);

		rainbowBucketEmpty = new ItemRainbowBucket(MoreOresConfig.rainbowBucketEmptyID, 0).setUnlocalizedName("moreores:rainbowBucketEmpty").setCreativeTab(rainbowTab).setMaxStackSize(16);
		rainbowBucketWater = new ItemRainbowBucket(MoreOresConfig.rainbowBucketWaterID, Block.waterMoving.blockID).setUnlocalizedName("moreores:rainbowBucketWater").setCreativeTab(rainbowTab).setContainerItem(rainbowBucketEmpty).setMaxStackSize(1);
		rainbowBucketLava = new ItemRainbowBucket(MoreOresConfig.rainbowBucketLavaID, Block.lavaMoving.blockID).setUnlocalizedName("moreores:rainbowBucketLava").setCreativeTab(rainbowTab).setContainerItem(rainbowBucketEmpty).setMaxStackSize(1);

		rainbowFuel = new ItemGeneralFuel(MoreOresConfig.rainbowFuelID).setUnlocalizedName("rainbowFuel").setCreativeTab(rainbowTab);

		rainbowTorch = new BlockRainbowTorch(MoreOresConfig.rainbowTorchID).setUnlocalizedName("rainbowTorch").setCreativeTab(rainbowTab).setHardness(0.0F).setLightValue(1.0F).setLightOpacity(0).setStepSound(Block.soundWoodFootstep);

		rainbowCrop = new BlockRainbowCrop(MoreOresConfig.rainbowCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("moreores:rainbowCrop");

		rainbowSeeds = new ItemGeneralSeeds(MoreOresConfig.rainbowSeedsID, MoreOres.rainbowCrop.blockID, Block.tilledField.blockID).setUnlocalizedName("rainbowSeeds").setCreativeTab(rainbowTab);

		//superfruit tree
		rainbowLog = new BlockRainbowLog(MoreOresConfig.rainbowLogID).setUnlocalizedName("rainbowLog").setCreativeTab(rainbowTab).setHardness(2.0F).setStepSound(Block.soundWoodFootstep);
		rainbowLeaves = new BlockRainbowLeaves(MoreOresConfig.rainbowLeavesID).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("rainbowLeaves").setCreativeTab(rainbowTab);
		rainbowSapling = new BlockRainbowSapling(MoreOresConfig.rainbowSaplingID, 0).setUnlocalizedName("rainbowSapling").setCreativeTab(rainbowTab).setHardness(0.0F).setStepSound(Block.soundGrassFootstep);

		//superfruit Planks
		rainbowPlanks = new BlockGeneralPlanks(MoreOresConfig.rainbowPlanksID).setUnlocalizedName("rainbowPlanks").setCreativeTab(rainbowTab).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep);

		rainbowStairsWood = new BlockGeneralStairs(MoreOresConfig.rainbowStairsWoodID, MoreOres.rainbowPlanks, 0).setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("rainbowStairsWood").setCreativeTab(rainbowTab).setLightOpacity(0);

		//rainbow walls
		rainbowWalls = new BlockGeneralWalls(MoreOresConfig.rainbowWallsID, MoreOres.rainbowBlock, MoreOres.rainbowBlock).setUnlocalizedName("rainbowWalls").setCreativeTab(rainbowTab);


		/*
		 * 
		 */


		//Grenium ids and declarations
		greenSword = new ItemGreenSword(MoreOresConfig.greenSwordID, toolGreen).setUnlocalizedName("greenSword").setCreativeTab(greenTab);
		greenPickaxe = new ItemGreenPickaxe(MoreOresConfig.greenPickaxeID, toolGreen).setUnlocalizedName("greenPickaxe").setCreativeTab(greenTab);
		greenAxe = new ItemGreenAxe(MoreOresConfig.greenAxeID, toolGreen).setUnlocalizedName("greenAxe").setCreativeTab(greenTab);
		greenShovel = new ItemGreenShovel(MoreOresConfig.greenShovelID, toolGreen).setUnlocalizedName("greenShovel").setCreativeTab(greenTab);
		greenHoe = new ItemGreenHoe(MoreOresConfig.greenHoeID, toolGreen).setUnlocalizedName("greenHoe").setCreativeTab(greenTab);
		greenPaxcel = new ItemGreenPaxcel(MoreOresConfig.greenPaxcelID, toolGreen).setUnlocalizedName("greenPaxcel").setCreativeTab(greenTab);

		greenCrossbow = new ItemGreenCrossbow(MoreOresConfig.greenCrossbowID).setFull3D().setUnlocalizedName("greenCrossbow").setCreativeTab(greenTab);

		greenStaff = new ItemGreenStaff(MoreOresConfig.greenStaffID).setUnlocalizedName("greenStaff").setCreativeTab(greenTab);

		greenHelmet = new ItemGreenHelmet(MoreOresConfig.greenHelmetID, armorGreen, proxy.addArmor("green"), 0).setUnlocalizedName("greenHelmet").setCreativeTab(greenTab);
		greenChestplate = new ItemGreenChestplate(MoreOresConfig.greenChestplateID, armorGreen, proxy.addArmor("green"), 1).setUnlocalizedName("greenChestplate").setCreativeTab(greenTab);
		greenLeggings = new ItemGreenLeggings(MoreOresConfig.greenLeggingsID, armorGreen, proxy.addArmor("green"), 2).setUnlocalizedName("greenLeggings").setCreativeTab(greenTab);
		greenBoots = new ItemGreenBoots(MoreOresConfig.greenBootsID, armorGreen, proxy.addArmor("green"), 3).setUnlocalizedName("greenBoots").setCreativeTab(greenTab);		

		greenOre = new BlockGeneralOre(MoreOresConfig.greenOreID, Material.rock).setUnlocalizedName("greenOre").setCreativeTab(greenTab).setHardness(3.0F).setResistance(15.0F).setStepSound(Block.soundStoneFootstep).setLightValue(0.5F);
		greenBlock = new BlockGreenBlock(MoreOresConfig.greenBlockID, Material.iron).setUnlocalizedName("greenBlock").setCreativeTab(greenTab).setHardness(5.0F).setResistance(30.0F).setStepSound(Block.soundMetalFootstep).setLightValue(1.0F);

		greenGlass = new BlockGeneralGlass(MoreOresConfig.greenGlassID, Material.glass, false).setUnlocalizedName("greenGlass").setHardness(0.3F).setResistance(25.0F).setStepSound(Block.soundGlassFootstep).setCreativeTab(greenTab);

		greenStairs = new BlockGeneralStairs(MoreOresConfig.greenStairsID, MoreOres.greenBlock, 0).setHardness(1.5F).setResistance(3.5F).setUnlocalizedName("greenStairs").setCreativeTab(greenTab).setLightOpacity(0);

		greenLadder = new BlockGeneralLadder(MoreOresConfig.greenLadderID).setHardness(1.0F).setUnlocalizedName("greenLadder").setCreativeTab(greenTab);

		greenFence = new BlockGeneralFence(MoreOresConfig.greenFenceID, "moreores:greenBlock", Material.iron).setUnlocalizedName("greenFence").setCreativeTab(greenTab).setHardness(6.5F).setResistance(30.0F);
		greenFencegate = new BlockGeneralFencegate(MoreOresConfig.greenFencegateID, MoreOres.greenBlock).setUnlocalizedName("greenFencegate").setCreativeTab(greenTab).setHardness(6.5F);

		greenApple = new ItemGreenApple(MoreOresConfig.greenAppleID, 10, 3.0F, false).setUnlocalizedName("greenApple").setCreativeTab(greenTab);

		greenEnchantedApple = new ItemEnchantedGreenApple(MoreOresConfig.greenEnchantedAppleID, 14, 3.3F, false).setUnlocalizedName("greenEncantedApple").setCreativeTab(greenTab);

		greenNugget = new ItemGeneralNugget(MoreOresConfig.greenNuggetID).setUnlocalizedName("greenNugget").setCreativeTab(greenTab);

		greenChunklet = new ItemGeneralChunklet(MoreOresConfig.greenChunkletID).setUnlocalizedName("greenChunklet").setCreativeTab(greenTab);

		greenChunkletMolded = new ItemGeneralChunkletMolded(MoreOresConfig.greenChunkletMoldedID).setUnlocalizedName("greenChunkletMolded").setCreativeTab(greenTab);

		greenBucketEmpty = new ItemGreenBucket(MoreOresConfig.greenBucketEmptyID, 0).setUnlocalizedName("moreores:greenBucketEmpty").setCreativeTab(greenTab).setMaxStackSize(16);
		greenBucketWater = new ItemGreenBucket(MoreOresConfig.greenBucketWaterID, Block.waterMoving.blockID).setUnlocalizedName("moreores:greenBucketWater").setCreativeTab(greenTab).setContainerItem(greenBucketEmpty).setMaxStackSize(1);
		greenBucketLava = new ItemGreenBucket(MoreOresConfig.greenBucketLavaID, Block.lavaMoving.blockID).setUnlocalizedName("moreores:greenBucketLava").setCreativeTab(greenTab).setContainerItem(greenBucketEmpty).setMaxStackSize(1);

		greenFuel = new ItemGeneralFuel(MoreOresConfig.greenFuelID).setUnlocalizedName("greenFuel").setCreativeTab(greenTab);

		greenTorch = new BlockGreenTorch(MoreOresConfig.greenTorchID).setUnlocalizedName("greenTorch").setCreativeTab(greenTab).setHardness(0.0F).setLightValue(1.0F).setLightOpacity(0).setStepSound(Block.soundWoodFootstep);

		greenCrop = new BlockGreenCrop(MoreOresConfig.greenCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("moreores:greenCrop");

		greenSeeds = new ItemGeneralSeeds(MoreOresConfig.greenSeedsID, MoreOres.greenCrop.blockID, Block.tilledField.blockID).setUnlocalizedName("greenSeeds").setCreativeTab(greenTab);

		//grenade
		grenade = new ItemGrenade(MoreOresConfig.grenadeID).setUnlocalizedName("grenade").setCreativeTab(greenTab);

		EntityRegistry.registerModEntity(EntityGrenade.class, "grenade", 40, this, 100, 3, true);

		//green apple tree
		greenLog = new BlockGreenLog(MoreOresConfig.greenLogID).setUnlocalizedName("greenLog").setCreativeTab(greenTab).setHardness(2.0F).setStepSound(Block.soundWoodFootstep);
		greenLeaves = new BlockGreenLeaves(MoreOresConfig.greenLeavesID).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("greenLeaves").setCreativeTab(greenTab);
		greenSapling = new BlockGreenSapling(MoreOresConfig.greenSaplingID, 0).setUnlocalizedName("greenSapling").setCreativeTab(greenTab).setHardness(0.0F).setStepSound(Block.soundGrassFootstep);

		//Green Apple Planks
		greenPlanks = new BlockGeneralPlanks(MoreOresConfig.greenPlanksID).setUnlocalizedName("greenPlanks").setCreativeTab(greenTab).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep);

		greenStairsWood = new BlockGeneralStairs(MoreOresConfig.greenStairsWoodID, MoreOres.greenPlanks, 0).setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("greenStairsWood").setCreativeTab(greenTab).setLightOpacity(0);

		//grenium walls
		greenWalls = new BlockGeneralWalls(MoreOresConfig.greenWallsID, MoreOres.greenBlock, MoreOres.greenBlock).setUnlocalizedName("greenWalls").setCreativeTab(greenTab);


		/*
		 * 
		 */


		//yagniss ids and declarations
		yellowSword = new ItemYellowSword(MoreOresConfig.yellowSwordID, toolYellow).setUnlocalizedName("yellowSword").setCreativeTab(yellowTab);
		yellowPickaxe = new ItemYellowPickaxe(MoreOresConfig.yellowPickaxeID, toolYellow).setUnlocalizedName("yellowPickaxe").setCreativeTab(yellowTab);
		yellowAxe = new ItemYellowAxe(MoreOresConfig.yellowAxeID, toolYellow).setUnlocalizedName("yellowAxe").setCreativeTab(yellowTab);
		yellowShovel = new ItemYellowShovel(MoreOresConfig.yellowShovelID, toolYellow).setUnlocalizedName("yellowShovel").setCreativeTab(yellowTab);
		yellowHoe = new ItemYellowHoe(MoreOresConfig.yellowHoeID, toolYellow).setUnlocalizedName("yellowHoe").setCreativeTab(yellowTab);
		yellowPaxcel = new ItemYellowPaxcel(MoreOresConfig.yellowPaxcelID, toolYellow).setUnlocalizedName("yellowPaxcel").setCreativeTab(yellowTab);

		yellowStaff = new ItemYellowStaff(MoreOresConfig.yellowStaffID).setUnlocalizedName("yellowStaff").setCreativeTab(yellowTab);

		yellowHelmet = new ItemYellowHelmet(MoreOresConfig.yellowHelmetID, armorYellow, proxy.addArmor("yellow"), 0).setUnlocalizedName("yellowHelmet").setCreativeTab(yellowTab);
		yellowChestplate = new ItemYellowChestplate(MoreOresConfig.yellowChestplateID, armorYellow, proxy.addArmor("yellow"), 1).setUnlocalizedName("yellowChestplate").setCreativeTab(yellowTab);
		yellowLeggings = new ItemYellowLeggings(MoreOresConfig.yellowLeggingsID, armorYellow, proxy.addArmor("yellow"), 2).setUnlocalizedName("yellowLeggings").setCreativeTab(yellowTab);
		yellowBoots = new ItemYellowBoots(MoreOresConfig.yellowBootsID, armorYellow, proxy.addArmor("yellow"), 3).setUnlocalizedName("yellowBoots").setCreativeTab(yellowTab);

		yellowOre = new BlockGeneralOre(MoreOresConfig.yellowOreID, Material.rock).setUnlocalizedName("yellowOre").setCreativeTab(yellowTab).setHardness(2.0F).setResistance(12.0F).setStepSound(Block.soundStoneFootstep);
		yellowBlock = new BlockYellowBlock(MoreOresConfig.yellowBlockID, Material.iron).setUnlocalizedName("yellowBlock").setCreativeTab(yellowTab).setHardness(3.0F).setResistance(20.0F).setStepSound(Block.soundMetalFootstep);
		ingotYellow = new ItemGeneralIngot(MoreOresConfig.ingotYellowID).setUnlocalizedName("ingotYellow").setCreativeTab(yellowTab);

		yellowGlass = new BlockGeneralGlass(MoreOresConfig.yellowGlassID, Material.glass, false).setUnlocalizedName("yellowGlass").setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setCreativeTab(yellowTab);

		yellowStairs = new BlockGeneralStairs(MoreOresConfig.yellowStairsID, MoreOres.yellowBlock, 0).setHardness(1.0F).setResistance(2.5F).setUnlocalizedName("YellowStairs").setCreativeTab(yellowTab).setLightOpacity(0);

		yellowLadder = new BlockGeneralLadder(MoreOresConfig.yellowLadderID).setHardness(1.0F).setUnlocalizedName("yellowLadder").setCreativeTab(yellowTab);

		yellowFence = new BlockGeneralFence(MoreOresConfig.yellowFenceID, "moreores:yellowBlock", Material.iron).setUnlocalizedName("yellowFence").setCreativeTab(yellowTab).setHardness(6.0F).setResistance(20.0F);
		yellowFencegate = new BlockGeneralFencegate(MoreOresConfig.yellowFencegateID, MoreOres.yellowBlock).setUnlocalizedName("yellowFencegate").setCreativeTab(yellowTab).setHardness(6.0F);

		lemon = new ItemLemon(MoreOresConfig.lemonID, 7, 2.7F, false).setUnlocalizedName("lemon").setCreativeTab(yellowTab);

		enchantedLemon = new ItemEnchantedLemon(MoreOresConfig.enchantedLemonID, 9, 3.0F, false).setUnlocalizedName("enchantedLemon").setCreativeTab(yellowTab);

		yellowNugget = new ItemGeneralNugget(MoreOresConfig.yellowNuggetID).setUnlocalizedName("yellowNugget").setCreativeTab(yellowTab);

		yellowChunklet = new ItemGeneralChunklet(MoreOresConfig.yellowChunkletID).setUnlocalizedName("yellowChunklet").setCreativeTab(yellowTab);

		yellowChunkletMolded = new ItemGeneralChunkletMolded(MoreOresConfig.yellowChunkletMoldedID).setUnlocalizedName("yellowChunkletMolded").setCreativeTab(yellowTab);

		yellowBucketEmpty = new ItemYellowBucket(MoreOresConfig.yellowBucketEmptyID, 0).setUnlocalizedName("moreores:yellowBucketEmpty").setCreativeTab(yellowTab).setMaxStackSize(16);
		yellowBucketWater = new ItemYellowBucket(MoreOresConfig.yellowBucketWaterID, Block.waterMoving.blockID).setUnlocalizedName("moreores:yellowBucketWater").setCreativeTab(yellowTab).setContainerItem(yellowBucketEmpty).setMaxStackSize(1);

		yellowFuel = new ItemGeneralFuel(MoreOresConfig.yellowFuelID).setUnlocalizedName("yellowFuel").setCreativeTab(yellowTab);

		yellowTorch = new BlockYellowTorch(MoreOresConfig.yellowTorchID).setUnlocalizedName("yellowTorch").setCreativeTab(yellowTab).setHardness(0.0F).setLightValue(1.0F).setLightOpacity(0).setStepSound(Block.soundWoodFootstep);

		yellowCrop = new BlockYellowCrop(MoreOresConfig.yellowCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("moreores:yellowCrop");

		yellowSeeds = new ItemGeneralSeeds(MoreOresConfig.yellowSeedsID, MoreOres.yellowCrop.blockID, Block.tilledField.blockID).setUnlocalizedName("yellowSeeds").setCreativeTab(yellowTab);

		//lemon tree
		yellowLog = new BlockYellowLog(MoreOresConfig.yellowLogID).setUnlocalizedName("yellowLog").setCreativeTab(yellowTab).setHardness(2.0F).setStepSound(Block.soundWoodFootstep);
		yellowLeaves = new BlockYellowLeaves(MoreOresConfig.yellowLeavesID).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("yellowLeaves").setCreativeTab(yellowTab);
		yellowSapling = new BlockYellowSapling(MoreOresConfig.yellowSaplingID, 0).setUnlocalizedName("yellowSapling").setCreativeTab(yellowTab).setHardness(0.0F).setStepSound(Block.soundGrassFootstep);

		//Lemon Planks
		yellowPlanks = new BlockGeneralPlanks(MoreOresConfig.yellowPlanksID).setUnlocalizedName("yellowPlanks").setCreativeTab(yellowTab).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep);

		yellowStairsWood = new BlockGeneralStairs(MoreOresConfig.yellowStairsWoodID, MoreOres.yellowPlanks, 0).setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("yellowStairsWood").setCreativeTab(yellowTab).setLightOpacity(0);

		//yagniss walls
		yellowWalls = new BlockGeneralWalls(MoreOresConfig.yellowWallsID, MoreOres.yellowBlock, MoreOres.yellowBlock).setUnlocalizedName("yellowWalls").setCreativeTab(yellowTab);


		/*
		 * 
		 */


		//Origum ids and declarations
		orangeSword = new ItemOrangeSword(MoreOresConfig.orangeSwordID, toolOrange).setUnlocalizedName("orangeSword").setCreativeTab(orangeTab);
		orangePickaxe = new ItemOrangePickaxe(MoreOresConfig.orangePickaxeID, toolOrange).setUnlocalizedName("orangePickaxe").setCreativeTab(orangeTab);
		orangeAxe = new ItemOrangeAxe(MoreOresConfig.orangeAxeID, toolOrange).setUnlocalizedName("orangeAxe").setCreativeTab(orangeTab);
		orangeShovel = new ItemOrangeShovel(MoreOresConfig.orangeShovelID, toolOrange).setUnlocalizedName("orangeShovel").setCreativeTab(orangeTab);
		orangeHoe = new ItemOrangeHoe(MoreOresConfig.orangeHoeID, toolOrange).setUnlocalizedName("orangeHoe").setCreativeTab(orangeTab);
		orangePaxcel = new ItemOrangePaxcel(MoreOresConfig.orangePaxcelID, toolOrange).setUnlocalizedName("orangePaxcel").setCreativeTab(orangeTab);

		orangeStaff = new ItemOrangeStaff(MoreOresConfig.orangeStaffID).setUnlocalizedName("orangeStaff").setCreativeTab(orangeTab);
		EntityRegistry.registerModEntity(EntityLava.class, "lava", 41, this, 100, 3, true);
		EntityRegistry.registerModEntity(EntityLavaReplace.class, "lavaReplace", 42, this, 100, 3, true);

		orangeHelmet = new ItemOrangeHelmet(MoreOresConfig.orangeHelmetID, armorOrange, proxy.addArmor("orange"), 0).setUnlocalizedName("orangeHelmet").setCreativeTab(orangeTab);
		orangeChestplate = new ItemOrangeChestplate(MoreOresConfig.orangeChestplateID, armorOrange, proxy.addArmor("orange"), 1).setUnlocalizedName("orangeChestplate").setCreativeTab(orangeTab);
		orangeLeggings = new ItemOrangeLeggings(MoreOresConfig.orangeLeggingsID, armorOrange, proxy.addArmor("orange"), 2).setUnlocalizedName("orangeLeggings").setCreativeTab(orangeTab);
		orangeBoots = new ItemOrangeBoots(MoreOresConfig.orangeBootsID, armorOrange, proxy.addArmor("orange"), 3).setUnlocalizedName("orangeBoots").setCreativeTab(orangeTab);		

		orangeOre = new BlockGeneralOre(MoreOresConfig.orangeOreID, Material.rock).setUnlocalizedName("orangeOre").setCreativeTab(orangeTab).setHardness(3.0F).setResistance(15.0F).setStepSound(Block.soundStoneFootstep);
		orangeBlock = new BlockOrangeBlock(MoreOresConfig.orangeBlockID, Material.iron).setUnlocalizedName("orangeBlock").setCreativeTab(orangeTab).setHardness(5.0F).setResistance(17.0F).setStepSound(Block.soundMetalFootstep);

		orangeGlass = new BlockGeneralGlass(MoreOresConfig.orangeGlassID, Material.glass, false).setUnlocalizedName("orangeGlass").setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setCreativeTab(orangeTab);

		orangeStairs = new BlockGeneralStairs(MoreOresConfig.orangeStairsID, MoreOres.orangeBlock, 0).setHardness(1.5F).setResistance(3.5F).setUnlocalizedName("orangeStairs").setCreativeTab(orangeTab).setLightOpacity(0);

		orangeLadder = new BlockGeneralLadder(MoreOresConfig.orangeLadderID).setHardness(1.0F).setUnlocalizedName("orangeLadder").setCreativeTab(orangeTab);

		orangeFence = new BlockGeneralFence(MoreOresConfig.orangeFenceID, "moreores:orangeBlock", Material.iron).setUnlocalizedName("orangeFence").setCreativeTab(orangeTab).setHardness(5.0F).setResistance(30.0F);
		orangeFencegate = new BlockGeneralFencegate(MoreOresConfig.orangeFencegateID, MoreOres.orangeBlock).setUnlocalizedName("orangeFencegate").setCreativeTab(orangeTab).setHardness(5.0F);

		orange = new ItemOrange(MoreOresConfig.orangeID, 6, 2.5F, false).setUnlocalizedName("orange").setCreativeTab(orangeTab);

		orangeEnchanted = new ItemEnchantedOrange(MoreOresConfig.orangeEnchantedID, 8, 2.8F, false).setUnlocalizedName("orangeEnchanted").setCreativeTab(orangeTab);

		orangeNugget = new ItemGeneralNugget(MoreOresConfig.orangeNuggetID).setUnlocalizedName("orangeNugget").setCreativeTab(orangeTab);

		orangeChunklet = new ItemGeneralChunklet(MoreOresConfig.orangeChunkletID).setUnlocalizedName("orangeChunklet").setCreativeTab(orangeTab);

		orangeChunkletMolded = new ItemGeneralChunkletMolded(MoreOresConfig.orangeChunkletMoldedID).setUnlocalizedName("orangeChunkletMolded").setCreativeTab(orangeTab);

		orangeBucketEmpty = new ItemOrangeBucket(MoreOresConfig.orangeBucketEmptyID, 0).setUnlocalizedName("moreores:orangeBucketEmpty").setCreativeTab(orangeTab).setMaxStackSize(16);
		orangeBucketWater = new ItemOrangeBucket(MoreOresConfig.orangeBucketWaterID, Block.waterMoving.blockID).setUnlocalizedName("moreores:orangeBucketWater").setCreativeTab(orangeTab).setContainerItem(orangeBucketEmpty).setMaxStackSize(1);

		orangeFuel = new ItemGeneralFuel(MoreOresConfig.orangeFuelID).setUnlocalizedName("orangeFuel").setCreativeTab(orangeTab);

		orangeTorch = new BlockOrangeTorch(MoreOresConfig.orangeTorchID).setUnlocalizedName("orangeTorch").setCreativeTab(orangeTab).setHardness(0.0F).setLightValue(1.0F).setLightOpacity(0).setStepSound(Block.soundWoodFootstep);

		orangeCrop = new BlockOrangeCrop(MoreOresConfig.orangeCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("moreores:orangeCrop");

		orangeSeeds = new ItemGeneralSeeds(MoreOresConfig.orangeSeedsID, MoreOres.orangeCrop.blockID, Block.tilledField.blockID).setUnlocalizedName("orangeSeeds").setCreativeTab(orangeTab);

		//orange tree
		orangeLog = new BlockOrangeLog(MoreOresConfig.orangeLogID).setUnlocalizedName("orangeLog").setCreativeTab(orangeTab).setHardness(2.0F).setStepSound(Block.soundWoodFootstep);
		orangeLeaves = new BlockOrangeLeaves(MoreOresConfig.orangeLeavesID).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("orangeLeaves").setCreativeTab(orangeTab);
		orangeSapling = new BlockOrangeSapling(MoreOresConfig.orangeSaplingID, 0).setUnlocalizedName("orangeSapling").setCreativeTab(orangeTab).setHardness(0.0F).setStepSound(Block.soundGrassFootstep);

		//orange planks
		orangePlanks = new BlockGeneralPlanks(MoreOresConfig.orangePlanksID).setUnlocalizedName("orangePlanks").setCreativeTab(orangeTab).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep);

		orangeStairsWood = new BlockGeneralStairs(MoreOresConfig.orangeStairsWoodID, MoreOres.orangePlanks, 0).setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("orangeStairsWood").setCreativeTab(orangeTab).setLightOpacity(0);

		//origum walls
		orangeWalls = new BlockGeneralWalls(MoreOresConfig.orangeWallsID, MoreOres.orangeBlock, MoreOres.orangeBlock).setUnlocalizedName("orangeWalls").setCreativeTab(orangeTab);


		/*
		 * 
		 */


		//Blosper ids and declarations
		blueSword = new ItemBlueSword(MoreOresConfig.blueSwordID, toolBlue).setUnlocalizedName("blueSword").setCreativeTab(blueTab);
		bluePickaxe = new ItemBluePickaxe(MoreOresConfig.bluePickaxeID, toolBlue).setUnlocalizedName("bluePickaxe").setCreativeTab(blueTab);
		blueAxe = new ItemBlueAxe(MoreOresConfig.blueAxeID, toolBlue).setUnlocalizedName("blueAxe").setCreativeTab(blueTab);
		blueShovel = new ItemBlueShovel(MoreOresConfig.blueShovelID, toolBlue).setUnlocalizedName("blueShovel").setCreativeTab(blueTab);
		blueHoe = new ItemBlueHoe(MoreOresConfig.blueHoeID, toolBlue).setUnlocalizedName("blueHoe").setCreativeTab(blueTab);

		blueStaff = new ItemBlueStaff(MoreOresConfig.blueStaffID).setUnlocalizedName("blueStaff").setCreativeTab(blueTab);
		EntityRegistry.registerModEntity(EntityWater.class, "water", 43, this, 100, 3, true);
		EntityRegistry.registerModEntity(EntityWaterReplace.class, "waterReplace", 44, this, 100, 3, true);

		blueHelmet = new ItemBlueHelmet(MoreOresConfig.blueHelmetID, armorBlue, proxy.addArmor("blue"), 0).setUnlocalizedName("blueHelmet").setCreativeTab(blueTab);
		blueChestplate = new ItemBlueChestplate(MoreOresConfig.blueChestplateID, armorBlue, proxy.addArmor("blue"), 1).setUnlocalizedName("blueChestplate").setCreativeTab(blueTab);
		blueLeggings = new ItemBlueLeggings(MoreOresConfig.blueLeggingsID, armorBlue, proxy.addArmor("blue"), 2).setUnlocalizedName("blueLeggings").setCreativeTab(blueTab);
		blueBoots = new ItemBlueBoots(MoreOresConfig.blueBootsID, armorBlue, proxy.addArmor("blue"), 3).setUnlocalizedName("blueBoots").setCreativeTab(blueTab);		

		blueOre = new BlockGeneralOre(MoreOresConfig.blueOreID, Material.rock).setUnlocalizedName("blueOre").setCreativeTab(blueTab).setHardness(5.0F).setResistance(25.0F).setStepSound(Block.soundStoneFootstep).setLightValue(0.7F);
		blueBlock = new BlockBlueBlock(MoreOresConfig.blueBlockID, Material.iron).setUnlocalizedName("blueBlock").setCreativeTab(blueTab).setHardness(7.0F).setResistance(45.0F).setStepSound(Block.soundMetalFootstep).setLightValue(1.0F);
		ingotBlue = new ItemBlueIngot(MoreOresConfig.ingotBlueID).setUnlocalizedName("ingotBlue").setCreativeTab(blueTab);

		blueGlass = new BlockGeneralGlass(MoreOresConfig.blueGlassID, Material.glass, false).setUnlocalizedName("blueGlass").setHardness(0.3F).setResistance(28.0F).setStepSound(Block.soundGlassFootstep).setCreativeTab(blueTab);

		blueStairs = new BlockGeneralStairs(MoreOresConfig.blueStairsID, MoreOres.blueBlock, 0).setHardness(2.5F).setResistance(4.5F).setUnlocalizedName("blueStairs").setCreativeTab(blueTab).setLightOpacity(0);

		blueLadder = new BlockGeneralLadder(MoreOresConfig.blueLadderID).setHardness(2.0F).setUnlocalizedName("blueLadder").setCreativeTab(blueTab);

		blueFence = new BlockGeneralFence(MoreOresConfig.blueFenceID, "moreores:blueBlock", Material.iron).setUnlocalizedName("blueFence").setCreativeTab(blueTab).setHardness(7.0F).setResistance(45.0F);
		blueFencegate = new BlockGeneralFencegate(MoreOresConfig.blueFencegateID, MoreOres.blueBlock).setUnlocalizedName("blueFencegate").setCreativeTab(blueTab).setHardness(7.0F);

		blueberry = new ItemBlueberry(MoreOresConfig.blueberryID, 12, 3.2F, false).setUnlocalizedName("blueApple").setCreativeTab(blueTab);

		blueberryEnchanted = new ItemEnchantedBlueberry(MoreOresConfig.blueberryEnchantedID, 16, 3.6F, false).setUnlocalizedName("blueberryEnchanted").setCreativeTab(blueTab);

		blueNugget = new ItemGeneralNugget(MoreOresConfig.blueNuggetID).setUnlocalizedName("blueNugget").setCreativeTab(blueTab);

		blueChunklet = new ItemGeneralChunklet(MoreOresConfig.blueChunkletID).setUnlocalizedName("blueChunklet").setCreativeTab(blueTab);

		blueChunkletMolded = new ItemGeneralChunkletMolded(MoreOresConfig.blueChunkletMoldedID).setUnlocalizedName("blueChunkletMolded").setCreativeTab(blueTab);

		blueBucketEmpty = new ItemBlueBucket(MoreOresConfig.blueBucketEmptyID, 0).setUnlocalizedName("moreores:blueBucketEmpty").setCreativeTab(blueTab).setMaxStackSize(16);
		blueBucketWater = new ItemBlueBucket(MoreOresConfig.blueBucketWaterID, Block.waterMoving.blockID).setUnlocalizedName("moreores:blueBucketWater").setCreativeTab(blueTab).setContainerItem(blueBucketEmpty).setMaxStackSize(1);
		blueBucketLava = new ItemBlueBucket(MoreOresConfig.blueBucketLavaID, Block.lavaMoving.blockID).setUnlocalizedName("moreores:blueBucketLava").setCreativeTab(blueTab).setContainerItem(blueBucketEmpty).setMaxStackSize(1);

		blueFuel = new ItemGeneralFuel(MoreOresConfig.blueFuelID).setUnlocalizedName("blueFuel").setCreativeTab(blueTab);

		blueTorch = new BlockBlueTorch(MoreOresConfig.blueTorchID).setUnlocalizedName("blueTorch").setCreativeTab(blueTab).setHardness(0.0F).setLightValue(1.0F).setLightOpacity(0).setStepSound(Block.soundWoodFootstep);

		blueCrop = new BlockBlueCrop(MoreOresConfig.blueCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("moreores:blueCrop");

		blueSeeds = new ItemGeneralSeeds(MoreOresConfig.blueSeedsID, MoreOres.blueCrop.blockID, Block.tilledField.blockID).setUnlocalizedName("blueSeeds").setCreativeTab(blueTab);		

		//blue tree
		blueLog = new BlockBlueLog(MoreOresConfig.blueLogID).setUnlocalizedName("blueLog").setCreativeTab(blueTab).setHardness(2.0F).setStepSound(Block.soundWoodFootstep);
		blueLeaves = new BlockBlueLeaves(MoreOresConfig.blueLeavesID).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("blueLeaves").setCreativeTab(blueTab);
		blueSapling = new BlockBlueSapling(MoreOresConfig.blueSaplingID, 0).setUnlocalizedName("blueSapling").setCreativeTab(blueTab).setHardness(0.0F).setStepSound(Block.soundGrassFootstep);

		//Blueberry Planks
		bluePlanks = new BlockGeneralPlanks(MoreOresConfig.bluePlanksID).setUnlocalizedName("bluePlanks").setCreativeTab(blueTab).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep);

		blueStairsWood = new BlockGeneralStairs(MoreOresConfig.blueStairsWoodID, MoreOres.bluePlanks, 0).setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("blueStairsWood").setCreativeTab(blueTab).setLightOpacity(0);

		//blosper walls
		blueWalls = new BlockGeneralWalls(MoreOresConfig.blueWallsID, MoreOres.blueBlock, MoreOres.blueBlock).setUnlocalizedName("blueWalls").setCreativeTab(blueTab);


		/*
		 * 
		 */


		//Kalfur ids and declarations
		purpleSword = new ItemPurpleSword(MoreOresConfig.purpleSwordID, toolPurple).setUnlocalizedName("purpleSword").setCreativeTab(purpleTab);
		purplePickaxe = new ItemPurplePickaxe(MoreOresConfig.purplePickaxeID, toolPurple).setUnlocalizedName("purplePickaxe").setCreativeTab(purpleTab);
		purpleAxe = new ItemPurpleAxe(MoreOresConfig.purpleAxeID, toolPurple).setUnlocalizedName("purpleAxe").setCreativeTab(purpleTab);
		purpleShovel = new ItemPurpleShovel(MoreOresConfig.purpleShovelID, toolPurple).setUnlocalizedName("purpleShovel").setCreativeTab(purpleTab);
		purpleHoe = new ItemPurpleHoe(MoreOresConfig.purpleHoeID, toolPurple).setUnlocalizedName("purpleHoe").setCreativeTab(purpleTab);
		purplePaxcel = new ItemPurplePaxcel(MoreOresConfig.purplePaxcelID, toolPurple).setUnlocalizedName("purplePaxcel").setCreativeTab(purpleTab);

		purpleStaff = new ItemPurpleStaff(MoreOresConfig.purpleStaffID).setUnlocalizedName("purpleStaff").setCreativeTab(purpleTab);

		purpleHelmet = new ItemPurpleHelmet(MoreOresConfig.purpleHelmetID, armorPurple, proxy.addArmor("purple"), 0).setUnlocalizedName("purpleHelmet").setCreativeTab(purpleTab);
		purpleChestplate = new ItemPurpleChestplate(MoreOresConfig.purpleChestplateID, armorPurple, proxy.addArmor("purple"), 1).setUnlocalizedName("purpleChestplate").setCreativeTab(purpleTab);
		purpleLeggings = new ItemPurpleLeggings(MoreOresConfig.purpleLeggingsID, armorPurple, proxy.addArmor("purple"), 2).setUnlocalizedName("purpleLeggings").setCreativeTab(purpleTab);
		purpleBoots = new ItemPurpleBoots(MoreOresConfig.purpleBootsID, armorPurple, proxy.addArmor("purple"), 3).setUnlocalizedName("purpleBoots").setCreativeTab(purpleTab);		

		purpleOre = new BlockGeneralOre(MoreOresConfig.purpleOreID, Material.rock).setUnlocalizedName("purpleOre").setCreativeTab(purpleTab).setHardness(4.0F).setResistance(18.0F).setStepSound(Block.soundStoneFootstep);
		purpleBlock = new BlockPurpleBlock(MoreOresConfig.purpleBlockID, Material.iron).setUnlocalizedName("purpleBlock").setCreativeTab(purpleTab).setHardness(6.5F).setResistance(36.0F).setStepSound(Block.soundMetalFootstep);
		ingotPurple = new ItemGeneralIngot(MoreOresConfig.ingotPurpleID).setUnlocalizedName("ingotPurple").setCreativeTab(purpleTab);

		purpleGlass = new BlockGeneralGlass(MoreOresConfig.purpleGlassID, Material.glass, false).setUnlocalizedName("purpleGlass").setHardness(0.3F).setResistance(25.0F).setStepSound(Block.soundGlassFootstep).setCreativeTab(purpleTab);

		purpleStairs = new BlockGeneralStairs(MoreOresConfig.purpleStairsID, MoreOres.purpleBlock, 0).setHardness(1.5F).setResistance(3.5F).setUnlocalizedName("purpleStairs").setCreativeTab(purpleTab).setLightOpacity(0);

		purpleLadder = new BlockGeneralLadder(MoreOresConfig.purpleLadderID).setHardness(1.0F).setUnlocalizedName("purpleLadder").setCreativeTab(purpleTab);

		purpleFence = new BlockGeneralFence(MoreOresConfig.purpleFenceID, "moreores:purpleBlock", Material.iron).setUnlocalizedName("purpleFence").setCreativeTab(purpleTab).setHardness(8.0F).setResistance(30.0F);
		purpleFencegate = new BlockGeneralFencegate(MoreOresConfig.purpleFencegateID, MoreOres.purpleBlock).setUnlocalizedName("purpleFencegate").setCreativeTab(purpleTab).setHardness(8.0F);

		purpleNugget = new ItemGeneralNugget(MoreOresConfig.purpleNuggetID).setUnlocalizedName("purpleNugget").setCreativeTab(purpleTab);

		purpleChunklet = new ItemGeneralChunklet(MoreOresConfig.purpleChunkletID).setUnlocalizedName("purpleChunklet").setCreativeTab(purpleTab);

		purpleChunkletMolded = new ItemGeneralChunkletMolded(MoreOresConfig.purpleChunkletMoldedID).setUnlocalizedName("purpleChunkletMolded").setCreativeTab(purpleTab);

		purpleBucketEmpty = new ItemPurpleBucket(MoreOresConfig.purpleBucketEmptyID, 0).setUnlocalizedName("moreores:purpleBucketEmpty").setCreativeTab(purpleTab).setMaxStackSize(16);
		purpleBucketWater = new ItemPurpleBucket(MoreOresConfig.purpleBucketWaterID, Block.waterMoving.blockID).setUnlocalizedName("moreores:purpleBucketWater").setCreativeTab(purpleTab).setContainerItem(purpleBucketEmpty).setMaxStackSize(1);
		purpleBucketLava = new ItemPurpleBucket(MoreOresConfig.purpleBucketLavaID, Block.lavaMoving.blockID).setUnlocalizedName("moreores:purpleBucketLava").setCreativeTab(purpleTab).setContainerItem(purpleBucketEmpty).setMaxStackSize(1);

		purpleFuel = new ItemGeneralFuel(MoreOresConfig.purpleFuelID).setUnlocalizedName("purpleFuel").setCreativeTab(purpleTab);

		purpleTorch = new BlockPurpleTorch(MoreOresConfig.purpleTorchID).setUnlocalizedName("purpleTorch").setCreativeTab(purpleTab).setHardness(0.0F).setLightValue(1.0F).setLightOpacity(0).setStepSound(Block.soundWoodFootstep);

		purpleCrop = new BlockPurpleCrop(MoreOresConfig.purpleCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("moreores:purpleCrop");

		purpleSeeds = new ItemGeneralSeeds(MoreOresConfig.purpleSeedsID, MoreOres.purpleCrop.blockID, Block.slowSand.blockID).setUnlocalizedName("purpleSeeds").setCreativeTab(purpleTab);

		//Kalfur walls
		purpleWalls = new BlockGeneralWalls(MoreOresConfig.purpleWallsID, MoreOres.purpleBlock, MoreOres.purpleBlock).setUnlocalizedName("purpleWalls").setCreativeTab(purpleTab);



		/*
		 * 
		 */


		//enoudra ids and declarations
		blackSword = new ItemBlackSword(MoreOresConfig.blackSwordID, toolBlack).setUnlocalizedName("blackSword").setCreativeTab(blackTab);
		blackPickaxe = new ItemBlackPickaxe(MoreOresConfig.blackPickaxeID, toolBlack).setUnlocalizedName("blackPickaxe").setCreativeTab(blackTab);
		blackAxe = new ItemBlackAxe(MoreOresConfig.blackAxeID, toolBlack).setUnlocalizedName("blackAxe").setCreativeTab(blackTab);
		blackShovel = new ItemBlackShovel(MoreOresConfig.blackShovelID, toolBlack).setUnlocalizedName("blackShovel").setCreativeTab(blackTab);
		blackHoe = new ItemBlackHoe(MoreOresConfig.blackHoeID, toolBlack).setUnlocalizedName("blackHoe").setCreativeTab(blackTab);
		blackPaxcel = new ItemBlackPaxcel(MoreOresConfig.blackPaxcelID, toolBlack).setUnlocalizedName("blackPaxcel").setCreativeTab(blackTab);

		blackStaff = new ItemBlackStaff(MoreOresConfig.blackStaffID).setUnlocalizedName("blackStaff").setCreativeTab(blackTab);

		blackHelmet = new ItemBlackHelmet(MoreOresConfig.blackHelmetID, armorBlack, proxy.addArmor("black"), 0).setUnlocalizedName("blackHelmet").setCreativeTab(blackTab);
		blackChestplate = new ItemBlackChestplate(MoreOresConfig.blackChestplateID, armorBlack, proxy.addArmor("black"), 1).setUnlocalizedName("blackChestplate").setCreativeTab(blackTab);
		blackLeggings = new ItemBlackLeggings(MoreOresConfig.blackLeggingsID, armorBlack, proxy.addArmor("black"), 2).setUnlocalizedName("blackLeggings").setCreativeTab(blackTab);
		blackBoots = new ItemBlackBoots(MoreOresConfig.blackBootsID, armorBlack, proxy.addArmor("black"), 3).setUnlocalizedName("blackBoots").setCreativeTab(blackTab);		

		blackOre = new BlockGeneralOre(MoreOresConfig.blackOreID, Material.rock).setUnlocalizedName("blackOre").setCreativeTab(blackTab).setHardness(4.0F).setResistance(18.0F).setStepSound(Block.soundStoneFootstep);
		blackBlock = new BlockBlackBlock(MoreOresConfig.blackBlockID, Material.iron).setUnlocalizedName("blackBlock").setCreativeTab(blackTab).setHardness(6.5F).setResistance(36.0F).setStepSound(Block.soundMetalFootstep);
		ingotBlack = new ItemGeneralIngot(MoreOresConfig.ingotblackID).setUnlocalizedName("ingotBlack").setCreativeTab(blackTab);

		blackGlass = new BlockGeneralGlass(MoreOresConfig.blackGlassID, Material.glass, false).setUnlocalizedName("blackGlass").setHardness(0.3F).setResistance(25.0F).setStepSound(Block.soundGlassFootstep).setCreativeTab(blackTab);

		blackStairs = new BlockGeneralStairs(MoreOresConfig.blackStairsID, MoreOres.blackBlock, 0).setHardness(1.5F).setResistance(3.5F).setUnlocalizedName("blackStairs").setCreativeTab(blackTab).setLightOpacity(0);

		blackLadder = new BlockGeneralLadder(MoreOresConfig.blackLadderID).setHardness(1.0F).setUnlocalizedName("blackLadder").setCreativeTab(blackTab);

		blackFence = new BlockGeneralFence(MoreOresConfig.blackFenceID, "moreores:blackBlock", Material.iron).setUnlocalizedName("blackFence").setCreativeTab(blackTab).setHardness(9.0F).setResistance(30.0F);
		blackFencegate = new BlockGeneralFencegate(MoreOresConfig.blackFencegateID, MoreOres.blackBlock).setUnlocalizedName("blackFencegate").setCreativeTab(blackTab).setHardness(9.0F);

		blackNugget = new ItemGeneralNugget(MoreOresConfig.blackNuggetID).setUnlocalizedName("blackNugget").setCreativeTab(blackTab);

		blackBucketEmpty = new ItemBlackBucket(MoreOresConfig.blackBucketEmptyID, 0).setUnlocalizedName("moreores:blackBucketEmpty").setCreativeTab(blackTab).setMaxStackSize(16);
		blackBucketWater = new ItemBlackBucket(MoreOresConfig.blackBucketWaterID, Block.waterMoving.blockID).setUnlocalizedName("moreores:blackBucketWater").setCreativeTab(blackTab).setContainerItem(blackBucketEmpty).setMaxStackSize(1);
		blackBucketLava = new ItemBlackBucket(MoreOresConfig.blackBucketLavaID, Block.lavaMoving.blockID).setUnlocalizedName("moreores:blackBucketLava").setCreativeTab(blackTab).setContainerItem(blackBucketEmpty).setMaxStackSize(1);

		blackFuel = new ItemGeneralFuel(MoreOresConfig.blackFuelID).setUnlocalizedName("blackFuel").setCreativeTab(blackTab);

		blackTorch = new BlockBlackTorch(MoreOresConfig.blackTorchID).setUnlocalizedName("blackTorch").setCreativeTab(blackTab).setHardness(0.0F).setLightValue(1.0F).setLightOpacity(0).setStepSound(Block.soundWoodFootstep);

		//enoudra walls
		blackWalls = new BlockGeneralWalls(MoreOresConfig.blackWallsID, MoreOres.blackBlock, MoreOres.blackBlock).setUnlocalizedName("blackWalls").setCreativeTab(blackTab);



		/*
		 * 
		 */


		//iron rods
		ironRod = new ItemIronRod(MoreOresConfig.ironRodID).setUnlocalizedName("ironRod").setCreativeTab(blueTab);


		//xray block and secret paste
		xrayBlock = new BlockXrayBlock(MoreOresConfig.xrayBlockID, Material.glass).setUnlocalizedName("xrayBlock").setCreativeTab(orangeTab).setHardness(0.1F).setStepSound(Block.soundGlassFootstep);

		secretPaste = new ItemSecretPaste(MoreOresConfig.secretPasteID).setUnlocalizedName("secretPaste").setCreativeTab(orangeTab);


		/*
		 * 
		 */


		//doors
		orangeDoorBlock = new BlockOrangeDoor(MoreOresConfig.orangeDoorBlockID, Material.iron).setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("orangeDoor").func_111022_d("orangeDoor");
		orangeDoorItem = new ItemOrangeDoor(MoreOresConfig.orangeDoorItemID, Material.iron).setUnlocalizedName("orangeDoorItem").setCreativeTab(orangeTab);
		orangeWoodDoorBlock = new BlockOrangeDoor(MoreOresConfig.orangeWoodDoorBlockID, Material.wood).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("orangeWoodDoor").func_111022_d("orangeWoodDoor");
		orangeWoodDoorItem = new ItemOrangeWoodDoor(MoreOresConfig.orangeWoodDoorItemID, Material.wood).setUnlocalizedName("orangeWoodDoorItem").setCreativeTab(orangeTab);

		yellowDoorBlock = new BlockYellowDoor(MoreOresConfig.yellowDoorBlockID, Material.iron).setHardness(5.0F).setUnlocalizedName("yellowDoor").func_111022_d("yellowDoor");
		yellowDoorItem = new ItemYellowDoor(MoreOresConfig.yellowDoorItemID, Material.iron).setUnlocalizedName("yellowDoorItem").setCreativeTab(yellowTab);
		yellowWoodDoorBlock = new BlockYellowDoor(MoreOresConfig.yellowWoodDoorBlockID, Material.wood).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("yellowWoodDoor").func_111022_d("yellowWoodDoor");
		yellowWoodDoorItem = new ItemYellowWoodDoor(MoreOresConfig.yellowWoodDoorItemID, Material.wood).setUnlocalizedName("yellowWoodDoorItem").setCreativeTab(yellowTab);

		greenDoorBlock = new BlockGreenDoor(MoreOresConfig.greenDoorBlockID, Material.iron).setHardness(5.0F).setUnlocalizedName("greenDoor").func_111022_d("greenDoor");
		greenDoorItem = new ItemGreenDoor(MoreOresConfig.greenDoorItemID, Material.iron).setUnlocalizedName("greenDoorItem").setCreativeTab(greenTab);
		greenWoodDoorBlock = new BlockGreenDoor(MoreOresConfig.greenWoodDoorBlockID, Material.wood).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("greenWoodDoor").func_111022_d("greenWoodDoor");
		greenWoodDoorItem = new ItemGreenWoodDoor(MoreOresConfig.greenWoodDoorItemID, Material.wood).setUnlocalizedName("greenWoodDoorItem").setCreativeTab(greenTab);

		blueDoorBlock = new BlockBlueDoor(MoreOresConfig.blueDoorBlockID, Material.iron).setHardness(5.0F).setUnlocalizedName("blueDoor").func_111022_d("blueDoor");
		blueDoorItem = new ItemBlueDoor(MoreOresConfig.blueDoorItemID, Material.iron).setUnlocalizedName("blueDoorItem").setCreativeTab(blueTab);
		blueWoodDoorBlock = new BlockBlueDoor(MoreOresConfig.blueWoodDoorBlockID, Material.wood).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("blueWoodDoor").func_111022_d("blueWoodDoor");
		blueWoodDoorItem = new ItemBlueWoodDoor(MoreOresConfig.blueWoodDoorItemID, Material.wood).setUnlocalizedName("blueWoodDoorItem").setCreativeTab(blueTab);

		rainbowDoorBlock = new BlockRainbowDoor(MoreOresConfig.rainbowDoorBlockID, Material.iron).setHardness(5.0F).setUnlocalizedName("rainbowDoor").func_111022_d("rainbowDoor");
		rainbowDoorItem = new ItemRainbowDoor(MoreOresConfig.rainbowDoorItemID, Material.iron).setUnlocalizedName("rainbowDoorItem").setCreativeTab(rainbowTab);
		rainbowWoodDoorBlock = new BlockRainbowDoor(MoreOresConfig.rainbowWoodDoorBlockID, Material.wood).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("rainbowWoodDoor").func_111022_d("rainbowWoodDoor");
		rainbowWoodDoorItem = new ItemRainbowWoodDoor(MoreOresConfig.rainbowWoodDoorItemID, Material.wood).setUnlocalizedName("rainbowWoodDoorItem").setCreativeTab(rainbowTab);

		purpleDoorBlock = new BlockPurpleDoor(MoreOresConfig.purpleDoorBlockID, Material.iron).setHardness(5.0F).setUnlocalizedName("purpleDoor");
		purpleDoorItem = new ItemPurpleDoor(MoreOresConfig.purpleDoorItemID, Material.iron).setUnlocalizedName("purpleDoorItem").setCreativeTab(purpleTab);

		blackDoorBlock = new BlockBlackDoor(MoreOresConfig.blackDoorBlockID, Material.iron).setHardness(5.0F).setUnlocalizedName("blackDoor");
		blackDoorItem = new ItemBlackDoor(MoreOresConfig.blackDoorItemID, Material.iron).setUnlocalizedName("blackDoorItem").setCreativeTab(blackTab);


		//trapdoors
		orangeTrapdoor = new BlockGeneralTrapdoor(MoreOresConfig.orangeTrapdoorID, Material.iron).setUnlocalizedName("orangeTrapdoor").setCreativeTab(orangeTab);

		yellowTrapdoor = new BlockGeneralTrapdoor(MoreOresConfig.yellowTrapdoorID, Material.iron).setUnlocalizedName("yellowTrapdoor").setCreativeTab(yellowTab);

		greenTrapdoor = new BlockGeneralTrapdoor(MoreOresConfig.greenTrapdoorID, Material.iron).setUnlocalizedName("greenTrapdoor").setCreativeTab(greenTab);

		blueTrapdoor = new BlockGeneralTrapdoor(MoreOresConfig.blueTrapdoorID, Material.iron).setUnlocalizedName("blueTrapdoor").setCreativeTab(blueTab);

		rainbowTrapdoor = new BlockGeneralTrapdoor(MoreOresConfig.rainbowTrapdoorID, Material.iron).setUnlocalizedName("rainbowTrapdoor").setCreativeTab(rainbowTab);

		purpleTrapdoor = new BlockGeneralTrapdoor(MoreOresConfig.purpleTrapdoorID, Material.iron).setUnlocalizedName("purpleTrapdoor").setCreativeTab(purpleTab);

		blackTrapdoor = new BlockGeneralTrapdoor(MoreOresConfig.blackTrapdoorID, Material.iron).setUnlocalizedName("blackTrapdoor").setCreativeTab(blackTab);


		//origum furnace
		orangeFurnaceIdle = new BlockOrangeFurnace(MoreOresConfig.orangeFurnaceIdleID, false).setUnlocalizedName("orangeFurnaceIdle").setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setCreativeTab(orangeTab);
		orangeFurnaceBurning = new BlockOrangeFurnace(MoreOresConfig.orangeFurnaceBurningID, true).setUnlocalizedName("orangeFurnaceBurning").setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setLightValue(0.875F);

		//yagniss furnace
		yellowFurnaceIdle = new BlockYellowFurnace(MoreOresConfig.yellowFurnaceIdleID, false).setUnlocalizedName("yellowFurnaceIdle").setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setCreativeTab(yellowTab);
		yellowFurnaceBurning = new BlockYellowFurnace(MoreOresConfig.yellowFurnaceBurningID, true).setUnlocalizedName("yellowFurnaceBurning").setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setLightValue(0.875F);		

		//grenium furnace
		greenFurnaceIdle = new BlockGreenFurnace(MoreOresConfig.greenFurnaceIdleID, false).setUnlocalizedName("greenFurnaceIdle").setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setCreativeTab(greenTab);
		greenFurnaceBurning = new BlockGreenFurnace(MoreOresConfig.greenFurnaceBurningID, true).setUnlocalizedName("greenFurnaceBurning").setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setLightValue(0.875F);

		//blosper furnace
		blueFurnaceIdle = new BlockBlueFurnace(MoreOresConfig.blueFurnaceIdleID, false).setUnlocalizedName("blueFurnaceIdle").setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setCreativeTab(blueTab);
		blueFurnaceBurning = new BlockBlueFurnace(MoreOresConfig.blueFurnaceBurningID, true).setUnlocalizedName("blueFurnaceBurning").setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setLightValue(0.875F);

		//rainbow furnace
		rainbowFurnaceIdle = new BlockRainbowFurnace(MoreOresConfig.rainbowFurnaceIdleID, false).setUnlocalizedName("rainbowFurnaceIdle").setStepSound(Block.soundMetalFootstep).setCreativeTab(rainbowTab).setHardness(3.5F);
		rainbowFurnaceBurning = new BlockRainbowFurnace(MoreOresConfig.rainbowFurnaceBurningID, true).setUnlocalizedName("rainbowFurnaceBurning").setStepSound(Block.soundMetalFootstep).setLightValue(0.875F).setHardness(3.5F);

		//blosper furnace
		purpleFurnaceIdle = new BlockPurpleFurnace(MoreOresConfig.purpleFurnaceIdleID, false).setUnlocalizedName("purpleFurnaceIdle").setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setCreativeTab(purpleTab);
		purpleFurnaceBurning = new BlockPurpleFurnace(MoreOresConfig.purpleFurnaceBurningID, true).setUnlocalizedName("purpleFurnaceBurning").setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setLightValue(0.875F);

		//enoudra furnace
		blackFurnaceIdle = new BlockBlackFurnace(MoreOresConfig.blackFurnaceIdleID, false).setUnlocalizedName("blackFurnaceIdle").setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setCreativeTab(blackTab);
		blackFurnaceBurning = new BlockBlackFurnace(MoreOresConfig.blackFurnaceBurningID, true).setUnlocalizedName("blackFurnaceBurning").setHardness(3.5F).setStepSound(Block.soundMetalFootstep).setLightValue(0.875F);


		//crusher
		crusherIdle = new BlockCrusher(MoreOresConfig.crusherIdleID, false).setUnlocalizedName("crusherIdle").setCreativeTab(machinesTab).setHardness(3.5F);
		crusherRunning = new BlockCrusher(MoreOresConfig.crusherRunningID, true).setUnlocalizedName("crusherRunning").setLightValue(0.45F).setHardness(3.5F);

		crushedItems = new ItemGeneralCrushedItems(MoreOresConfig.crushedItemsID).setUnlocalizedName("crushedItems").setCreativeTab(machinesTab);

		crusher = new ItemCrusher(MoreOresConfig.crusherID).setUnlocalizedName("crusher").setCreativeTab(machinesTab);


		//extractor
		extractorIdle = new BlockExtractor(MoreOresConfig.extractorIdleID, false).setUnlocalizedName("extractorIdle").setCreativeTab(machinesTab).setHardness(3.5F);
		extractorRunning = new BlockExtractor(MoreOresConfig.extractorRunningID, true).setUnlocalizedName("extractorRunning").setLightValue(0.45F).setHardness(3.5F);

		rubber = new ItemRubber(MoreOresConfig.rubberID).setUnlocalizedName("rubber").setCreativeTab(machinesTab);


		//rubber band
		rubberBand = new ItemRubberBand(MoreOresConfig.rubberBandID).setUnlocalizedName("rubberBand").setCreativeTab(machinesTab);


		//slime drops
		orangeJelly = new ItemGeneralJelly(MoreOresConfig.orangeJellyID, 5, 1.5F, false).setUnlocalizedName("orangeJelly").setCreativeTab(orangeTab);		
		yellowJelly = new ItemGeneralJelly(MoreOresConfig.yellowJellyID, 5, 1.5F, false).setUnlocalizedName("yellowJelly").setCreativeTab(yellowTab);		
		greenJelly = new ItemGeneralJelly(MoreOresConfig.greenJellyID, 6, 1.7F, false).setUnlocalizedName("greenJelly").setCreativeTab(greenTab);
		blueJelly = new ItemGeneralJelly(MoreOresConfig.blueJellyID, 6, 1.7F, false).setUnlocalizedName("blueJelly").setCreativeTab(blueTab);


		//trampoline
		trampoline = new BlockTrampoline(MoreOresConfig.trampolineID, Material.cloth).setUnlocalizedName("trampoline").setCreativeTab(yellowTab);


		//slabs
		//orange slabs
		orangeSingleSlab = (BlockHalfSlab) new BlockOrangeSlab(MoreOresConfig.orangeSingleSlabID, false).setUnlocalizedName("orangeSlab").setCreativeTab(orangeTab).setHardness(2.0F).setResistance(10.0F).setLightOpacity(0);
		orangeDoubleSlab = (BlockHalfSlab) new BlockOrangeSlab(MoreOresConfig.orangeDoubleSlabID, true).setUnlocalizedName("orangeSlab").setHardness(2.0F).setResistance(10.0F);

		//yellow slabs
		yellowSingleSlab = (BlockHalfSlab) new BlockYellowSlab(MoreOresConfig.yellowSingleSlabID, false).setUnlocalizedName("yellowSlab").setCreativeTab(yellowTab).setHardness(2.0F).setResistance(10.0F).setLightOpacity(0);
		yellowDoubleSlab = (BlockHalfSlab) new BlockYellowSlab(MoreOresConfig.yellowDoubleSlabID, true).setUnlocalizedName("yellowSlab").setHardness(2.0F).setResistance(10.0F);

		//green slabs
		greenSingleSlab = (BlockHalfSlab) new BlockGreenSlab(MoreOresConfig.greenSingleSlabID, false).setUnlocalizedName("greenSlab").setCreativeTab(greenTab).setHardness(2.0F).setResistance(10.0F).setLightOpacity(0);
		greenDoubleSlab = (BlockHalfSlab) new BlockGreenSlab(MoreOresConfig.greenDoubleSlabID, true).setUnlocalizedName("greenSlab").setHardness(2.0F).setResistance(10.0F);

		//blue slabs
		blueSingleSlab = (BlockHalfSlab) new BlockBlueSlab(MoreOresConfig.blueSingleSlabID, false).setUnlocalizedName("blueSlab").setCreativeTab(blueTab).setHardness(2.0F).setResistance(10.0F).setLightOpacity(0);
		blueDoubleSlab = (BlockHalfSlab) new BlockBlueSlab(MoreOresConfig.blueDoubleSlabID, true).setUnlocalizedName("blueSlab").setHardness(2.0F).setResistance(10.0F);

		//rainbow slabs
		rainbowSingleSlab = (BlockHalfSlab) new BlockRainbowSlab(MoreOresConfig.rainbowSingleSlabID, false).setUnlocalizedName("rainbowSlab").setCreativeTab(rainbowTab).setHardness(2.0F).setResistance(10.0F).setLightOpacity(0);
		rainbowDoubleSlab = (BlockHalfSlab) new BlockRainbowSlab(MoreOresConfig.rainbowDoubleSlabID, true).setUnlocalizedName("rainbowSlab").setHardness(2.0F).setResistance(10.0F);

		//purple slabs
		purpleSingleSlab = (BlockHalfSlab) new BlockPurpleSlab(MoreOresConfig.purpleSingleSlabID, false).setUnlocalizedName("purpleSlab").setCreativeTab(purpleTab).setHardness(2.0F).setResistance(10.0F).setLightOpacity(0);
		purpleDoubleSlab = (BlockHalfSlab) new BlockPurpleSlab(MoreOresConfig.purpleDoubleSlabID, true).setUnlocalizedName("purpleSlab").setHardness(2.0F).setResistance(10.0F);

		//black slabs
		blackSingleSlab = (BlockHalfSlab) new BlockBlackSlab(MoreOresConfig.blackSingleSlabID, false).setUnlocalizedName("blackSlab").setCreativeTab(blackTab).setHardness(2.0F).setResistance(10.0F).setLightOpacity(0);
		blackDoubleSlab = (BlockHalfSlab) new BlockBlackSlab(MoreOresConfig.blackDoubleSlabID, true).setUnlocalizedName("blackSlab").setHardness(2.0F).setResistance(10.0F);


		//night vision goggles
		nightVisionGoggles = new ItemNightVisionGoggles(MoreOresConfig.nightVisionGogglesID, MoreOres.nightVision, proxy.addArmor("nightvision"), 0).setUnlocalizedName("nightVisionGoggle").setCreativeTab(machinesTab);


		//wood fence and Fencegates
		orangeWoodFence = new BlockGeneralFence(MoreOresConfig.orangeWoodFenceID, "moreores:orangePlanks", Material.wood).setUnlocalizedName("orangeWoodFence").setCreativeTab(orangeTab).setHardness(4.0F);
		orangeWoodFencegate = new BlockGeneralFencegate(MoreOresConfig.orangeWoodFencegateID, MoreOres.orangePlanks).setUnlocalizedName("orangeWoodFencegate").setCreativeTab(orangeTab).setHardness(4.0F);

		yellowWoodFence = new BlockGeneralFence(MoreOresConfig.yellowWoodFenceID, "moreores:yellowPlanks", Material.wood).setUnlocalizedName("yellowWoodFence").setCreativeTab(yellowTab).setHardness(5.0F);
		yellowWoodFencegate = new BlockGeneralFencegate(MoreOresConfig.yellowWoodFencegateID, MoreOres.yellowPlanks).setUnlocalizedName("yellowWoodFencegate").setCreativeTab(yellowTab).setHardness(5.0F);

		greenWoodFence = new BlockGeneralFence(MoreOresConfig.greenWoodFenceID, "moreores:greenPlanks", Material.wood).setUnlocalizedName("greenWoodFence").setCreativeTab(greenTab).setHardness(6.0F);
		greenWoodFencegate = new BlockGeneralFencegate(MoreOresConfig.greenWoodFencegateID, MoreOres.greenPlanks).setUnlocalizedName("greenWoodFencegate").setCreativeTab(greenTab).setHardness(6.0F);

		blueWoodFence = new BlockGeneralFence(MoreOresConfig.blueWoodFenceID, "moreores:bluePlanks", Material.wood).setUnlocalizedName("blueWoodFence").setCreativeTab(blueTab).setHardness(7.0F);
		blueWoodFencegate = new BlockGeneralFencegate(MoreOresConfig.blueWoodFencegateID, MoreOres.bluePlanks).setUnlocalizedName("blueWoodFencegate").setCreativeTab(blueTab).setHardness(7.0F);

		rainbowWoodFence = new BlockGeneralFence(MoreOresConfig.rainbowWoodFenceID, "moreores:rainbowPlanks", Material.wood).setUnlocalizedName("rainbowWoodFence").setCreativeTab(rainbowTab).setHardness(8.0F);
		rainbowWoodFencegate = new BlockGeneralFencegate(MoreOresConfig.rainbowWoodFencegateID, MoreOres.rainbowPlanks).setUnlocalizedName("rainbowWoodFencegate").setCreativeTab(rainbowTab).setHardness(8.0F);


		//Vines
		orangeVines = new BlockGeneralVines(MoreOresConfig.orangeVinesID).setHardness(0.2F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("orangeVines").setCreativeTab(orangeTab);

		yellowVines = new BlockGeneralVines(MoreOresConfig.yellowVinesID).setHardness(0.2F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("yellowVines").setCreativeTab(yellowTab);

		greenVines = new BlockGeneralVines(MoreOresConfig.greenVinesID).setHardness(0.2F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("greenVines").setCreativeTab(greenTab);

		blueVines = new BlockGeneralVines(MoreOresConfig.blueVinesID).setHardness(0.2F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("blueVines").setCreativeTab(blueTab);

		rainbowVines = new BlockGeneralVines(MoreOresConfig.rainbowVinesID).setHardness(0.2F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("rainbowVines").setCreativeTab(rainbowTab);


		//pressure plates
		orangePressurePlate = new BlockGeneralPressurePlate(MoreOresConfig.orangePressurePlateID, "moreores:orangeBlock", Material.rock, EnumMobType.mobs).setHardness(0.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("orangePressurePlate").setCreativeTab(orangeTab);
		orangeWoodPressurePlate = new BlockGeneralPressurePlate(MoreOresConfig.orangeWoodPressurePlateID, "moreores:orangePlanks", Material.wood, EnumMobType.everything).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("orangeWoodPressurePlate").setCreativeTab(orangeTab);

		yellowPressurePlate = new BlockGeneralPressurePlate(MoreOresConfig.yellowPressurePlateID, "moreores:yellowBlock", Material.rock, EnumMobType.mobs).setHardness(0.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("yellowPressurePlate").setCreativeTab(yellowTab);
		yellowWoodPressurePlate = new BlockGeneralPressurePlate(MoreOresConfig.yellowWoodPressurePlateID, "moreores:yellowPlanks", Material.wood, EnumMobType.everything).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("yellowWoodPressurePlate").setCreativeTab(yellowTab);

		greenPressurePlate = new BlockGeneralPressurePlate(MoreOresConfig.greenPressurePlateID, "moreores:greenBlock", Material.rock, EnumMobType.mobs).setHardness(0.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("greenPressurePlate").setCreativeTab(greenTab);
		greenWoodPressurePlate = new BlockGeneralPressurePlate(MoreOresConfig.greenWoodPressurePlateID, "moreores:greenPlanks", Material.wood, EnumMobType.everything).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("greenWoodPressurePlate").setCreativeTab(greenTab);

		bluePressurePlate = new BlockGeneralPressurePlate(MoreOresConfig.bluePressurePlateID, "moreores:blueBlock", Material.rock, EnumMobType.mobs).setHardness(0.2F).setHardness(0.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("bluePressurePlate").setCreativeTab(blueTab);
		blueWoodPressurePlate = new BlockGeneralPressurePlate(MoreOresConfig.blueWoodPressurePlateID, "moreores:bluePlanks", Material.wood, EnumMobType.everything).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("blueWoodPressurePlate").setCreativeTab(blueTab);	

		rainbowPressurePlate = new BlockGeneralPressurePlate(MoreOresConfig.rainbowPressurePlateID, "moreores:rainbowBlock", Material.rock, EnumMobType.mobs).setHardness(0.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("rainbowPressurePlate").setCreativeTab(rainbowTab);
		rainbowWoodPressurePlate = new BlockGeneralPressurePlate(MoreOresConfig.rainbowWoodPressurePlateID, "moreores:rainbowPlanks", Material.wood, EnumMobType.everything).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("rainbowWoodPressurePlate").setCreativeTab(rainbowTab);

		purplePressurePlate = new BlockGeneralPressurePlate(MoreOresConfig.purplePressurePlateID, "moreores:purpleBlock", Material.rock, EnumMobType.mobs).setHardness(0.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("purplePressurePlate").setCreativeTab(purpleTab);

		blackPressurePlate = new BlockGeneralPressurePlate(MoreOresConfig.blackPressurePlateID, "moreores:blackBlock", Material.rock, EnumMobType.mobs).setHardness(0.5F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("blackPressurePlate").setCreativeTab(blackTab);


		orangeArrow = new ItemArrows(MoreOresConfig.orangeArrowID).setUnlocalizedName("orangeArrow").func_111206_d("orangeArrow").setCreativeTab(orangeTab);
		EntityRegistry.registerModEntity(EntityOrangeArrow.class, "orangeArrow", 45, this, 100, 3, true);

		yellowArrow = new ItemArrows(MoreOresConfig.yellowArrowID).setUnlocalizedName("yellowArrow").func_111206_d("yellowArrow").setCreativeTab(yellowTab);
		EntityRegistry.registerModEntity(EntityYellowArrow.class, "yellowArrow", 46, this, 100, 3, true);

		greenArrow = new ItemArrows(MoreOresConfig.greenArrowID).setUnlocalizedName("greenArrow").func_111206_d("greenArrow").setCreativeTab(greenTab);
		EntityRegistry.registerModEntity(EntityGreenArrow.class, "greenArrow", 47, this, 100, 3, true);

		blueArrow = new ItemArrows(MoreOresConfig.blueArrowID).setUnlocalizedName("blueArrow").func_111206_d("blueArrow").setCreativeTab(blueTab);
		EntityRegistry.registerModEntity(EntityBlueArrow.class, "blueArrow", 48, this, 100, 3, true);

		purpleArrow = new ItemArrows(MoreOresConfig.purpleArrowID).setUnlocalizedName("purpleArrow").func_111206_d("purpleArrow").setCreativeTab(purpleTab);
		EntityRegistry.registerModEntity(EntityPurpleArrow.class, "purpleArrow", 49, this, 100, 3, true);

		blackArrow = new ItemArrows(MoreOresConfig.blackArrowID).setUnlocalizedName("blackArrow").func_111206_d("blackArrow").setCreativeTab(blackTab);
		EntityRegistry.registerModEntity(EntityBlackArrow.class, "blackArrow", 50, this, 100, 3, true);


		/*
		 * 
		 */


		//language registries
		new LanguageRegistryMoreOres();
	}


	@EventHandler
	public void Init(FMLInitializationEvent event) {

		//crafting handler
		GameRegistry.registerCraftingHandler(moreOresCraftingHandler);

		//trees world gen file registry
		GameRegistry.registerWorldGenerator(new WorldGeneratorTrees());

		//ores world gen file registry
		GameRegistry.registerWorldGenerator(new WorldGeneratorOres());	

		//event
		MinecraftForge.EVENT_BUS.register(new EventsMoreOres());

		//Fuel handler
		GameRegistry.registerFuelHandler(new FuelHandlerMoreOres());

		//gui handler
		NetworkRegistry.instance().registerGuiHandler(instance, guihandler);

		//connection handler for startup message
		NetworkRegistry.instance().registerConnectionHandler(new ConnectionHandlerMoreOres());

		//tick handler
		proxy.registerServerTickHandler();

		//modstats
		Modstats.instance().getReporter().registerMod(this);


		/*
		 * 
		 */


		GameRegistry.registerBlock(rainbowLog);
		GameRegistry.registerBlock(rainbowSapling);
		GameRegistry.registerBlock(rainbowLeaves);        

		//rainbow block registrations
		GameRegistry.registerBlock(rainbowBlock);
		GameRegistry.registerBlock(rainbowOre);

		GameRegistry.registerBlock(rainbowStairs);

		GameRegistry.registerBlock(rainbowLadder);

		GameRegistry.registerBlock(rainbowFence);
		GameRegistry.registerBlock(rainbowFencegate);

		GameRegistry.registerBlock(rainbowTorch);

		GameRegistry.registerBlock(rainbowGlass);

		GameRegistry.registerBlock(rainbowPlanks);

		GameRegistry.registerBlock(rainbowStairsWood);

		GameRegistry.registerBlock(rainbowWalls);

		GameRegistry.registerBlock(rainbowFire, "RainbowFire");

		GameRegistry.registerBlock(rainbowPortal, "RainbowPortal");

		GameRegistry.registerBlock(rainbowGrass, "RainbowGrass");

		GameRegistry.registerBlock(rainbowDirt, "RainbowDirt");

		GameRegistry.registerBlock(rainbowStone, "RainbowStone");

		//rainbow blocks minable with iron or more pickaxes only
		MinecraftForge.setBlockHarvestLevel(rainbowOre, "pickaxe", 2);

		MinecraftForge.setBlockHarvestLevel(rainbowBlock, "pickaxe", 2);

		MinecraftForge.setBlockHarvestLevel(rainbowStairs, "pickaxe", 2);

		MinecraftForge.setBlockHarvestLevel(rainbowFence, "pickaxe", 2);

		MinecraftForge.setBlockHarvestLevel(rainbowDirt, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(rainbowGrass, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(rainbowStone, "pickaxe", 0);

		//world gen for dimension
		rainbowBiome = new BiomeRainbowBiome(MoreOresConfig.rainbowBiomeID);
		GameRegistry.registerWorldGenerator(new WorldGeneratorRainbowTrees(false));

		//Register WorldProvider for Dimension
		DimensionManager.registerProviderType(MoreOresConfig.rainbowDimID, WorldProviderRainbow.class, true);
		DimensionManager.registerDimension(MoreOresConfig.rainbowDimID, MoreOresConfig.rainbowDimID);


		/*
		 * 
		 */


		if(MoreOresConfig.mobsAllowed){
			//slimes
			//orange slime
			EntityRegistry.registerModEntity(EntityOrangeSlime.class, "OrangeSlime", 80, this, 100, 3, true);
			EntityRegistry.addSpawn(EntityOrangeSlime.class, 7, 2, 4, EnumCreatureType.monster, BiomeGenBase.swampland);
			EntityEgg(EntityOrangeSlime.class, 0xF5580A, 0xBD4F19);

			//yellow slime
			EntityRegistry.registerModEntity(EntityYellowSlime.class, "YellowSlime", 8, this, 100, 3, true);
			EntityRegistry.addSpawn(EntityYellowSlime.class, 7, 2, 4, EnumCreatureType.monster, BiomeGenBase.swampland);
			EntityEgg(EntityYellowSlime.class, 0xFCF912, 0xC4C223);

			//green slime
			EntityRegistry.registerModEntity(EntityGreenSlime.class, "GreenSlime", 82, this, 100, 3, true);
			EntityRegistry.addSpawn(EntityGreenSlime.class, 7, 2, 4, EnumCreatureType.monster, BiomeGenBase.swampland);
			EntityEgg(EntityGreenSlime.class, 0x20F727, 0x22A126);

			//blue slime
			EntityRegistry.registerModEntity(EntityBlueSlime.class, "BlueSlime", 83, this, 100, 3, true);
			EntityRegistry.addSpawn(EntityBlueSlime.class, 7, 2, 4, EnumCreatureType.monster, BiomeGenBase.swampland);
			EntityEgg(EntityBlueSlime.class, 0x2259F2, 0x1E409E);


			//creepers
			//green creeper
			EntityRegistry.registerModEntity(EntityOrangeCreeper.class, "OrangeCreeper", 84, this, 100, 3, true);
			EntityRegistry.addSpawn(EntityOrangeCreeper.class, 7, 2, 5, EnumCreatureType.monster, BiomeGenBase.swampland, BiomeGenBase.plains, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.taiga, BiomeGenBase.beach, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.taigaHills);
			EntityEgg(EntityOrangeCreeper.class, 0xF5580A, 0xFF0000);

			//yellow creeper
			EntityRegistry.registerModEntity(EntityYellowCreeper.class, "YellowCreeper", 85, this, 100, 3, true);
			EntityRegistry.addSpawn(EntityYellowCreeper.class, 6, 2, 5, EnumCreatureType.monster, BiomeGenBase.swampland, BiomeGenBase.plains, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.taiga, BiomeGenBase.beach, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.taigaHills);
			EntityEgg(EntityYellowCreeper.class, 0xFCF912, 0xFF0000);


			//green creeper
			EntityRegistry.registerModEntity(EntityGreenCreeper.class, "GreenCreeper", 86, this, 100, 3, true);
			EntityRegistry.addSpawn(EntityGreenCreeper.class, 4, 2, 4, EnumCreatureType.monster, BiomeGenBase.swampland, BiomeGenBase.plains, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.taiga, BiomeGenBase.beach, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.taigaHills);
			EntityEgg(EntityGreenCreeper.class, 0x20F727, 0xFF0000);


			//blue creeper
			EntityRegistry.registerModEntity(EntityBlueCreeper.class, "BlueCreeper", 87, this, 100, 3, true);
			EntityRegistry.addSpawn(EntityBlueCreeper.class, 2, 1, 3, EnumCreatureType.monster, BiomeGenBase.swampland, BiomeGenBase.plains, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.taiga, BiomeGenBase.beach, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.taigaHills);
			EntityEgg(EntityBlueCreeper.class, 0x2259F2, 0xFF0000);
		}


		//Biomes
		if(MoreOresConfig.biomesAllowed == true){
			greenBiome = new BiomeGreenBiome(MoreOresConfig.greenBiomeID).setBiomeName("\u00A7aGreen\u00A7f");
			GameRegistry.addBiome(greenBiome);

			yellowBiome = new BiomeYellowBiome(MoreOresConfig.yellowBiomeID).setBiomeName("\u00A7eYellow\u00A7f");
			GameRegistry.addBiome(yellowBiome);

			blueBiome = new BiomeBlueBiome(MoreOresConfig.blueBiomeID).setBiomeName("\u00A79Blue\u00A7f");
			GameRegistry.addBiome(blueBiome);

			orangeBiome = new BiomeOrangeBiome(MoreOresConfig.orangeBiomeID).setBiomeName("\u00A76Orange\u00A7f");
			GameRegistry.addBiome(orangeBiome);
		}




		/*
		 * 
		 */


		//recipes
		new MoreOresRecipes();


		/*
		 * 
		 */


		//chest additions
		new MoreOresChestAdditions();


		/*
		 * 
		 */


		//Grenium block registrations
		GameRegistry.registerBlock(greenBlock);
		GameRegistry.registerBlock(greenOre);

		GameRegistry.registerBlock(greenStairs);

		GameRegistry.registerBlock(greenLadder);

		GameRegistry.registerBlock(greenFence);
		GameRegistry.registerBlock(greenFencegate);

		GameRegistry.registerBlock(greenGlass);

		GameRegistry.registerBlock(greenPlanks);

		GameRegistry.registerBlock(greenStairsWood);

		GameRegistry.registerBlock(greenWalls);

		GameRegistry.registerBlock(greenTorch);

		GameRegistry.registerBlock(greenLog);
		GameRegistry.registerBlock(greenSapling);
		GameRegistry.registerBlock(greenLeaves);

		//Grenium blocks minable with iron or more pickaxes only
		MinecraftForge.setBlockHarvestLevel(greenOre, "pickaxe", 2);

		MinecraftForge.setBlockHarvestLevel(greenBlock, "pickaxe", 2);

		MinecraftForge.setBlockHarvestLevel(greenStairs, "pickaxe", 2);

		MinecraftForge.setBlockHarvestLevel(greenFence, "pickaxe", 2);


		/*
		 * 
		 */


		//Yagniss block registrations
		GameRegistry.registerBlock(yellowBlock);
		GameRegistry.registerBlock(yellowOre);

		GameRegistry.registerBlock(yellowStairs);

		GameRegistry.registerBlock(yellowLadder);

		GameRegistry.registerBlock(yellowFence);
		GameRegistry.registerBlock(yellowFencegate);

		GameRegistry.registerBlock(yellowGlass);

		GameRegistry.registerBlock(yellowPlanks);

		GameRegistry.registerBlock(yellowStairsWood);

		GameRegistry.registerBlock(yellowWalls);

		GameRegistry.registerBlock(yellowTorch);

		GameRegistry.registerBlock(yellowLog);
		GameRegistry.registerBlock(yellowSapling);
		GameRegistry.registerBlock(yellowLeaves);

		//Yagniss blocks minable with stone or more pickaxes only
		MinecraftForge.setBlockHarvestLevel(yellowOre, "pickaxe", 1);

		MinecraftForge.setBlockHarvestLevel(yellowBlock, "pickaxe", 1);

		MinecraftForge.setBlockHarvestLevel(yellowStairs, "pickaxe", 1);

		MinecraftForge.setBlockHarvestLevel(yellowFence, "pickaxe", 1);


		/*
		 * 
		 */


		//Origum block registrations
		GameRegistry.registerBlock(orangeBlock);
		GameRegistry.registerBlock(orangeOre);

		GameRegistry.registerBlock(orangeStairs);

		GameRegistry.registerBlock(orangeLadder);

		GameRegistry.registerBlock(orangeFence);
		GameRegistry.registerBlock(orangeFencegate);

		GameRegistry.registerBlock(orangeGlass);

		GameRegistry.registerBlock(orangePlanks);

		GameRegistry.registerBlock(orangeStairsWood);

		GameRegistry.registerBlock(orangeWalls);

		GameRegistry.registerBlock(orangeTorch);

		GameRegistry.registerBlock(orangeLog);
		GameRegistry.registerBlock(orangeSapling);
		GameRegistry.registerBlock(orangeLeaves);


		//Origum blocks minable with iron or more pickaxes only
		MinecraftForge.setBlockHarvestLevel(orangeOre, "pickaxe", 1);

		MinecraftForge.setBlockHarvestLevel(orangeBlock, "pickaxe", 1);

		MinecraftForge.setBlockHarvestLevel(orangeStairs, "pickaxe", 1);

		MinecraftForge.setBlockHarvestLevel(orangeFence, "pickaxe", 1);


		/*
		 * 
		 */


		//Blosper block registrations
		GameRegistry.registerBlock(blueBlock);
		GameRegistry.registerBlock(blueOre);

		GameRegistry.registerBlock(blueStairs);

		GameRegistry.registerBlock(blueLadder);

		GameRegistry.registerBlock(blueFence);
		GameRegistry.registerBlock(blueFencegate);

		GameRegistry.registerBlock(blueGlass);

		GameRegistry.registerBlock(bluePlanks);

		GameRegistry.registerBlock(blueStairsWood);

		GameRegistry.registerBlock(blueWalls);

		GameRegistry.registerBlock(blueTorch);

		GameRegistry.registerBlock(blueLog);
		GameRegistry.registerBlock(blueSapling);
		GameRegistry.registerBlock(blueLeaves);

		//Blosper blocks minable with iron or more pickaxes only
		MinecraftForge.setBlockHarvestLevel(blueOre, "pickaxe", 2);

		MinecraftForge.setBlockHarvestLevel(blueBlock, "pickaxe", 2);

		MinecraftForge.setBlockHarvestLevel(blueStairs, "pickaxe", 2);

		MinecraftForge.setBlockHarvestLevel(blueFence, "pickaxe", 2);


		/*
		 * 
		 */


		//kalfur block registrations
		GameRegistry.registerBlock(purpleBlock);
		GameRegistry.registerBlock(purpleOre);

		GameRegistry.registerBlock(purpleStairs);

		GameRegistry.registerBlock(purpleLadder);

		GameRegistry.registerBlock(purpleFence);
		GameRegistry.registerBlock(purpleFencegate);

		GameRegistry.registerBlock(purpleGlass);

		GameRegistry.registerBlock(purpleWalls);

		GameRegistry.registerBlock(purpleTorch);

		//kalfur blocks minable with iron or more pickaxes only
		MinecraftForge.setBlockHarvestLevel(purpleOre, "pickaxe", 2);

		MinecraftForge.setBlockHarvestLevel(purpleBlock, "pickaxe", 2);

		MinecraftForge.setBlockHarvestLevel(purpleStairs, "pickaxe", 2);

		MinecraftForge.setBlockHarvestLevel(purpleFence, "pickaxe", 2);


		/*
		 * 
		 */


		//enoudra block registrations
		GameRegistry.registerBlock(blackBlock);
		GameRegistry.registerBlock(blackOre);

		GameRegistry.registerBlock(blackStairs);

		GameRegistry.registerBlock(blackLadder);

		GameRegistry.registerBlock(blackFence);
		GameRegistry.registerBlock(blackFencegate);

		GameRegistry.registerBlock(blackGlass);

		GameRegistry.registerBlock(blackWalls);

		GameRegistry.registerBlock(blackTorch);

		//enoudra blocks minable with iron or more pickaxes only
		MinecraftForge.setBlockHarvestLevel(blackOre, "pickaxe", 2);

		MinecraftForge.setBlockHarvestLevel(blackBlock, "pickaxe", 2);

		MinecraftForge.setBlockHarvestLevel(blackStairs, "pickaxe", 2);

		MinecraftForge.setBlockHarvestLevel(blackFence, "pickaxe", 2);


		/*
		 * 
		 */


		//xray block
		GameRegistry.registerBlock(xrayBlock);

		//wooden fences and fencegates
		GameRegistry.registerBlock(orangeWoodFence);
		GameRegistry.registerBlock(orangeWoodFencegate);
		GameRegistry.registerBlock(yellowWoodFence);
		GameRegistry.registerBlock(yellowWoodFencegate);
		GameRegistry.registerBlock(greenWoodFence);
		GameRegistry.registerBlock(greenWoodFencegate);
		GameRegistry.registerBlock(blueWoodFence);
		GameRegistry.registerBlock(blueWoodFencegate);
		GameRegistry.registerBlock(rainbowWoodFence);
		GameRegistry.registerBlock(rainbowWoodFencegate);

		//vines
		GameRegistry.registerBlock(orangeVines);
		GameRegistry.registerBlock(yellowVines);
		GameRegistry.registerBlock(greenVines);
		GameRegistry.registerBlock(blueVines);
		GameRegistry.registerBlock(rainbowVines);

		//pressure plates
		GameRegistry.registerBlock(orangePressurePlate);
		GameRegistry.registerBlock(orangeWoodPressurePlate);

		GameRegistry.registerBlock(yellowPressurePlate);
		GameRegistry.registerBlock(yellowWoodPressurePlate);

		GameRegistry.registerBlock(greenPressurePlate);
		GameRegistry.registerBlock(greenWoodPressurePlate);

		GameRegistry.registerBlock(bluePressurePlate);
		GameRegistry.registerBlock(blueWoodPressurePlate);

		GameRegistry.registerBlock(rainbowPressurePlate);
		GameRegistry.registerBlock(rainbowWoodPressurePlate);

		GameRegistry.registerBlock(purplePressurePlate);

		GameRegistry.registerBlock(blackPressurePlate);

		//trapdoors
		GameRegistry.registerBlock(orangeTrapdoor);
		GameRegistry.registerBlock(yellowTrapdoor);
		GameRegistry.registerBlock(greenTrapdoor);
		GameRegistry.registerBlock(blueTrapdoor);
		GameRegistry.registerBlock(rainbowTrapdoor);
		GameRegistry.registerBlock(purpleTrapdoor);
		GameRegistry.registerBlock(blackTrapdoor);

		//furnaces
		GameRegistry.registerBlock(orangeFurnaceIdle);
		GameRegistry.registerTileEntity(TileEntityOrangeFurnace.class, "orangeFurnace"); 

		GameRegistry.registerBlock(yellowFurnaceIdle);
		GameRegistry.registerTileEntity(TileEntityYellowFurnace.class, "yellowFurnace");

		GameRegistry.registerBlock(greenFurnaceIdle);
		GameRegistry.registerTileEntity(TileEntityGreenFurnace.class, "greenFurnace"); 

		GameRegistry.registerBlock(blueFurnaceIdle);
		GameRegistry.registerTileEntity(TileEntityBlueFurnace.class, "blueFurnace"); 

		GameRegistry.registerBlock(rainbowFurnaceIdle);
		GameRegistry.registerTileEntity(TileEntityRainbowFurnace.class, "rainbowFurnace"); 

		GameRegistry.registerBlock(purpleFurnaceIdle);
		GameRegistry.registerTileEntity(TileEntityPurpleFurnace.class, "purpleFurnace"); 

		GameRegistry.registerBlock(blackFurnaceIdle);
		GameRegistry.registerTileEntity(TileEntityBlackFurnace.class, "blackFurnace"); 

		//crusher
		GameRegistry.registerBlock(crusherIdle);
		GameRegistry.registerTileEntity(TileEntityCrusher.class, "crusher"); 

		//extractor
		GameRegistry.registerBlock(extractorIdle);
		GameRegistry.registerTileEntity(TileEntityExtractor.class, "extractor"); 

		//trampoline
		GameRegistry.registerBlock(trampoline);


		/*
		 * 
		 */

		proxy.registerRenderThings();

	}


	//achievements
	static void addAchievementLocalizations()
	{
		addAchievementName("goingGreen", "Discover More Ores!");
		addAchievementDesc("goingGreen", "Discover Grenium");

		addAchievementName("discovery", "Discover More Ores!");
		addAchievementDesc("discovery", "Discover Skorpio's added ores");

		addAchievementName("comfortability", "Achieve Comfortability!");
		addAchievementDesc("comfortability", "Craft one of Skorpio's Paxcels");

		addAchievementName("closet", "Coming Out Of The Closet!");
		addAchievementDesc("closet", "Get out of the closet and go into the real world (hint* build a portal *hint)");
	}

	//achievements
	private static void addAchievementName(String ach, String name)
	{
		LanguageRegistry.instance().addStringLocalization("achievement." + ach, "en_US", name);
	}

	//achievements
	private static void addAchievementDesc(String ach, String desc)
	{
		LanguageRegistry.instance().addStringLocalization("achievement." + ach + ".desc", "en_US", desc);
	}


	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		proxy.registerKeys();

		Item.itemsList[orangeSingleSlab.blockID] = (new ItemSlab(orangeSingleSlab.blockID - 256, (BlockHalfSlab)orangeSingleSlab, (BlockHalfSlab)orangeDoubleSlab, false)).setUnlocalizedName("orangeSlab");
		Item.itemsList[yellowSingleSlab.blockID] = (new ItemSlab(yellowSingleSlab.blockID - 256, (BlockHalfSlab)yellowSingleSlab, (BlockHalfSlab)yellowDoubleSlab, false)).setUnlocalizedName("yellowSlab");
		Item.itemsList[greenSingleSlab.blockID] = (new ItemSlab(greenSingleSlab.blockID - 256, (BlockHalfSlab)greenSingleSlab, (BlockHalfSlab)greenDoubleSlab, false)).setUnlocalizedName("greenSlab");
		Item.itemsList[blueSingleSlab.blockID] = (new ItemSlab(blueSingleSlab.blockID - 256, (BlockHalfSlab)blueSingleSlab, (BlockHalfSlab)blueDoubleSlab, false)).setUnlocalizedName("blueSlab");
		Item.itemsList[rainbowSingleSlab.blockID] = (new ItemSlab(rainbowSingleSlab.blockID - 256, (BlockHalfSlab)rainbowSingleSlab, (BlockHalfSlab)rainbowDoubleSlab, false)).setUnlocalizedName("rainbowSlab");
		Item.itemsList[purpleSingleSlab.blockID] = (new ItemSlab(purpleSingleSlab.blockID - 256, (BlockHalfSlab)purpleSingleSlab, (BlockHalfSlab)purpleDoubleSlab, false)).setUnlocalizedName("purpleSlab");
		Item.itemsList[blackSingleSlab.blockID] = (new ItemSlab(blackSingleSlab.blockID - 256, (BlockHalfSlab)blackSingleSlab, (BlockHalfSlab)blackDoubleSlab, false)).setUnlocalizedName("blackSlab");
	}

}
