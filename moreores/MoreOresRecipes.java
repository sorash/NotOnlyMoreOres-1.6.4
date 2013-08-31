package moreores;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class MoreOresRecipes {

	public MoreOresRecipes(){

		//Grenium Recipes

		/*
		 * Grenium Armour Recipes
		 */

		//Grenium Helmet
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenHelmet), 
				"xxx", 
				"x x",
				'x', MoreOres.ingotGreen);

		//Grenium Chestplate
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenChestplate), 
				"x x", 
				"xxx", 
				"xxx",
				'x', MoreOres.ingotGreen);

		//Grenium Pants
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenLeggings), 
				"xxx", 
				"x x", 
				"x x",
				'x', MoreOres.ingotGreen);

		//Grenium Boots
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenBoots), 
				"x x", 
				"x x",
				'x', MoreOres.ingotGreen);


		/*
		 * Grenium Tool set
		 */

		//Grenium Sword
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenSword),
				"x",
				"x",
				"y",
				'x', MoreOres.ingotGreen, 'y',MoreOres.ironRod);


		//Grenium Pickaxe
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenPickaxe),
				"xxx",
				" y ",
				" y ",
				'x', MoreOres.ingotGreen, 'y',MoreOres.ironRod);


		//Grenium Axe
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenAxe),
				"xx ",
				"xy ",
				" y ",
				'x', MoreOres.ingotGreen, 'y',MoreOres.ironRod);


		//Grenium Shovel
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenShovel),
				"x",
				"y",
				"y",
				'x', MoreOres.ingotGreen, 'y',MoreOres.ironRod);


		//Grenium Hoe
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenHoe),
				"xx ",
				" y ",
				" y ",
				'x', MoreOres.ingotGreen, 'y',MoreOres.ironRod);

		//Grenium Paxcel
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenPaxcel),
				"xzq",
				"wyc",
				" y ",
				'x', MoreOres.greenAxe, 'y', MoreOres.ironRod, 'z', MoreOres.greenPickaxe, 'q', MoreOres.greenShovel, 'w', MoreOres.greenSword, 'c', MoreOres.greenHoe);

		//Grenium Crossbow
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenCrossbow),
				"xyy",
				"yz ",
				"y x",
				'x', Item.stick, 'y', MoreOres.ingotGreen, 'z', Item.bow);

		//Grenium ingots to Grenium block
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenBlock),
				"xxx",
				"xxx",
				"xxx",
				'x', MoreOres.ingotGreen);

		//Grenium block to Grenium ingots
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.ingotGreen, 9), new ItemStack(MoreOres.greenBlock));

		//Grenium ladder
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenLadder),
				"x x",
				"xxx",
				"x x",
				'x', MoreOres.ingotGreen);

		//green enchanted apple
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenEnchantedApple), 
				" x ",
				"xyx",
				" x ",
				'x', MoreOres.greenBlock, 'y', Item.appleRed);

		//green enchanted apple alternative
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenEnchantedApple), 
				" x ",
				"xyx",
				" x ",
				'x', MoreOres.ingotGreen, 'y', MoreOres.greenApple);

		//Grenium fence
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenFence, 2),
				"xxx",
				"xxx",
				'x', MoreOres.ingotGreen);

		//Grenium fence gate
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenFencegate),
				"xyx",
				"xyx",
				'x', MoreOres.ingotGreen, 'y', MoreOres.greenBlock);

		//Grenium nuggets to Grenium ingot
		GameRegistry.addRecipe(new ItemStack(MoreOres.ingotGreen), 
				"xxx",
				"xxx",
				"xxx",
				'x', MoreOres.greenNugget);

		//Grenium bucket
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenBucketEmpty),
				"x x",
				" x ",
				'x', MoreOres.ingotGreen);

		//Grenium torch
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenTorch),
				"x",
				"y",
				'x', MoreOres.greenFuel, 'y', MoreOres.ironRod);

		//Grenium stairs
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenStairs, 4),
				"  x",
				" xx",
				"xxx",
				'x', MoreOres.ingotGreen);

		//Green glass
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenGlass, 4),
				"xxx",
				"xyx",
				"xxx",
				'x', MoreOres.greenNugget, 'y', Block.glass);

		//grenium fuel
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenFuel, 2),
				" x ",
				"xyx",
				" x ",
				'x', MoreOres.greenNugget, 'y', Item.coal);

		//grenade
		GameRegistry.addRecipe(new ItemStack(MoreOres.grenade),
				" xy",
				"zqz",
				"czc",
				'x', Item.flint, 'y', Item.stick, 'z', MoreOres.greenNugget, 'c', MoreOres.ingotGreen, 'q', Item.gunpowder);

		//grenium staff
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenStaff),
				"yxy",
				"zqz",
				" q ",
				'x', MoreOres.ingotGreen, 'y', MoreOres.grenade, 'z', MoreOres.greenNugget, 'q', MoreOres.ironRod);

		//grenium Seeds
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenSeeds),
				"yxy",
				" z ",
				"yxy",
				'x', MoreOres.ingotGreen, 'y', MoreOres.greenNugget,'z', Item.seeds);

		//grenium Seeds alternative
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenSeeds),
				"y y",
				"xzx",
				"y y",
				'x', MoreOres.ingotGreen, 'y', MoreOres.greenNugget, 'z', Item.seeds);

		//grenium molded chunklet to grenium nugget
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenNugget),
				" x ",
				"xxx",
				" x ",
				'x', MoreOres.greenChunkletMolded);

		//Green Apple Planks to sticks
		GameRegistry.addRecipe(new ItemStack(Item.stick, 4),
				"x",
				"x",
				'x', MoreOres.greenPlanks);

		//Green Apple Planks to crafting table
		GameRegistry.addRecipe(new ItemStack(Block.workbench),
				"xx",
				"xx",
				'x', MoreOres.greenPlanks);

		//Green Apple Planks to chest
		GameRegistry.addRecipe(new ItemStack(Block.chest),
				"xxx",
				"x x",
				"xxx",
				'x', MoreOres.greenPlanks);

		//Green Apple Planks to door
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenWoodDoorItem),
				"xx",
				"xx",
				"xx",
				'x', MoreOres.greenPlanks);

		//Green Apple Planks to bowl
		GameRegistry.addRecipe(new ItemStack(Item.bowlEmpty),
				"x x",
				" x ",
				'x', MoreOres.greenPlanks);

		//Green Apple Planks to pressure plate
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenWoodPressurePlate),
				"xx",
				'x', MoreOres.greenPlanks);

		//Green Apple Planks to boat
		GameRegistry.addRecipe(new ItemStack(Item.boat),
				"x x",
				"xxx",
				'x', MoreOres.greenPlanks);

		//Green Apple Planks to trapdoor
		GameRegistry.addRecipe(new ItemStack(Block.trapdoor, 2),
				"xxx",
				"xxx",
				'x', MoreOres.greenPlanks);

		//wood tools
		GameRegistry.addRecipe(new ItemStack(Item.swordWood),
				"x",
				"x",
				"y",
				'x', MoreOres.greenPlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.pickaxeWood),
				"xxx",
				" y ",
				" y ",
				'x', MoreOres.greenPlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.axeWood),
				"xx ",
				"xy ",
				" y ",
				'x', MoreOres.greenPlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.shovelWood),
				"x",
				"y",
				"y",
				'x', MoreOres.greenPlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.hoeWood),
				"xx ",
				" y ",
				" y ",
				'x', MoreOres.greenPlanks, 'y', Item.stick);

		//Fencegate
		GameRegistry.addRecipe(new ItemStack(Block.fenceGate),
				"yxy",
				"yxy",
				'x', MoreOres.greenPlanks, 'y', Item.stick);

		//sign
		GameRegistry.addRecipe(new ItemStack(Item.sign, 3),
				"xxx",
				"xxx",
				" y ",
				'x', MoreOres.greenPlanks, 'y', Item.stick);

		//bed
		GameRegistry.addRecipe(new ItemStack(Item.bed),
				"yyy",
				"xxx",
				'x', MoreOres.greenPlanks, 'y', Block.cloth);

		//note block
		GameRegistry.addRecipe(new ItemStack(Block.music),
				"xxx",
				"xyx",
				"xxx",
				'x', MoreOres.greenPlanks, 'y', Item.redstone);

		//jukebox
		GameRegistry.addRecipe(new ItemStack(Block.jukebox),
				"xxx",
				"xyx",
				"xxx",
				'x', MoreOres.greenPlanks, 'y', Item.diamond);

		//piston
		GameRegistry.addRecipe(new ItemStack(Block.pistonBase),
				"xxx",
				"qyq",
				"qzq",
				'x', MoreOres.greenPlanks, 'y', MoreOres.ironRod, 'z', Item.redstone, 'q', Block.cobblestone);

		//bookshelf
		GameRegistry.addRecipe(new ItemStack(Block.bookShelf),
				"xxx",
				"yyy",
				"xxx",
				'x', MoreOres.greenPlanks, 'y', Item.book);

		//stairs
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenStairsWood, 4),
				"  x",
				" xx",
				"xxx",
				'x', MoreOres.greenPlanks);

		//sapling
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenSapling),
				" x ",
				"xyx",
				" x ",
				'x', MoreOres.greenApple, 'y', Block.sapling);

		//walls
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenWalls, 6),
				"xxx",
				"xxx",
				'x', MoreOres.greenBlock);

		//trapdoor
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenTrapdoor, 4),
				"xxx",
				"xxx",
				'x', MoreOres.greenBlock);

		//furnace
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenFurnaceIdle),
				"x x",
				" y ",
				"x x",
				'x', MoreOres.greenBlock, 'y', Block.furnaceIdle);

		//pressure plate
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenPressurePlate),
				"xx",
				'x', MoreOres.greenBlock);
		
		//black arrow
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenArrow, 5), 
				"z", 
				"x",
				"y",
				'x', Item.stick, 'y', Item.feather, 'z', new ItemStack(Item.dyePowder, 1, 15));
		
		//Green Apple Plank to button
		GameRegistry.addShapelessRecipe(new ItemStack(Block.woodenButton), new ItemStack(MoreOres.greenPlanks));

		//Grenium ingot to Grenium nugget
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.greenNugget, 9), new ItemStack(MoreOres.ingotGreen));

		//green logs to Green Apple Planks
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.greenPlanks, 4), new ItemStack(MoreOres.greenLog));

		//Grenium Ore smelts to Grenium ingot
		GameRegistry.addSmelting(MoreOres.greenOre.blockID, new ItemStack(MoreOres.ingotGreen), 1F);

		//grenium chunklet smelts to grenium chunklet molded
		GameRegistry.addSmelting(MoreOres.greenChunklet.itemID, new ItemStack(MoreOres.greenChunkletMolded), 0.5F);


		/*
		 * 
		 */


		//Yagniss Recipes

		/*
		 * Yagniss Armour Recipes
		 */

		//Yagniss Helmet
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowHelmet), 
				"xxx", 
				"x x",
				'x', MoreOres.ingotYellow);

		//Yagniss Chestplate
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowChestplate), 
				"x x", 
				"xxx", 
				"xxx",
				'x', MoreOres.ingotYellow);

		//Yagniss Pants
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowLeggings), 
				"xxx", 
				"x x", 
				"x x",
				'x', MoreOres.ingotYellow);

		//Yagniss Boots
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowBoots), 
				"x x", 
				"x x",
				'x', MoreOres.ingotYellow);


		/*
		 * Yagniss Tool set
		 */

		//Yagniss Sword
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowSword),
				"x",
				"x",
				"y",
				'x', MoreOres.ingotYellow, 'y',Item.stick);


		//Yagniss Pickaxe
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowPickaxe),
				"xxx",
				" y ",
				" y ",
				'x', MoreOres.ingotYellow, 'y',Item.stick);


		//Yagniss Axe
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowAxe),
				"xx ",
				"xy ",
				" y ",
				'x', MoreOres.ingotYellow, 'y',Item.stick);


		//Yagniss Shovel
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowShovel),
				"x",
				"y",
				"y",
				'x', MoreOres.ingotYellow, 'y',Item.stick);


		//Yagniss Hoe
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowHoe),
				"xx ",
				" y ",
				" y ",
				'x', MoreOres.ingotYellow, 'y',Item.stick);

		//Yagniss Paxcel
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowPaxcel),
				"xzq",
				"wyc",
				" y ",
				'x', MoreOres.yellowAxe, 'y', Item.stick, 'z', MoreOres.yellowPickaxe, 'q', MoreOres.yellowShovel, 'w', MoreOres.yellowSword, 'c', MoreOres.yellowHoe);

		//Yagniss ingots to Yagniss block
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowBlock),
				"xxx",
				"xxx",
				"xxx",
				'x', MoreOres.ingotYellow);

		//Yagniss block to Yagniss ingots
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.ingotYellow, 9), new ItemStack(MoreOres.yellowBlock));

		//Yagniss ladder
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowLadder),
				"x x",
				"xxx",
				"x x",
				'x', MoreOres.ingotYellow);

		//yellow enchanted apple
		GameRegistry.addRecipe(new ItemStack(MoreOres.enchantedLemon), 
				" x ",
				"xyx",
				" x ",
				'x', MoreOres.ingotYellow, 'y', MoreOres.lemon);

		//Yagniss fence
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowFence, 2),
				"xxx",
				"xxx",
				'x', MoreOres.ingotYellow);

		//Yagniss fence gate
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowFencegate),
				"xyx",
				"xyx",
				'x', MoreOres.ingotYellow, 'y', MoreOres.yellowBlock);

		//Yagniss nuggets to Yagniss ingot
		GameRegistry.addRecipe(new ItemStack(MoreOres.ingotYellow), 
				"xxx",
				"xxx",
				"xxx",
				'x', MoreOres.yellowNugget);

		//Yagniss bucket
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowBucketEmpty),
				"x x",
				" x ",
				'x', MoreOres.ingotYellow);

		//yagniss torch
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowTorch),
				"x",
				"y",
				'x', MoreOres.yellowFuel, 'y', Item.stick);

		//Yagniss stairs
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowStairs, 4),
				"  x",
				" xx",
				"xxx",
				'x', MoreOres.ingotYellow);

		//Yellow glass
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowGlass, 4),
				"xxx",
				"xyx",
				"xxx",
				'x', MoreOres.yellowNugget, 'y', Block.glass);

		//yagniss fuel
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowFuel, 2),
				" x ",
				"xyx",
				" x ",
				'x', MoreOres.yellowNugget, 'y', Item.coal);

		//yagniss staff
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowStaff),
				"yxy",
				"zqz",
				" q ",
				'x', MoreOres.ingotYellow, 'y', MoreOres.yellowFuel, 'z', MoreOres.yellowNugget, 'q', Item.stick);

		//yagniss Seeds
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowSeeds),
				"yxy",
				" z ",
				"yxy",
				'x', MoreOres.ingotYellow, 'y', MoreOres.yellowNugget,'z', Item.seeds);

		//yagniss Seeds alternative
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowSeeds),
				"y y",
				"xzx",
				"y y",
				'x', MoreOres.ingotYellow, 'y', MoreOres.yellowNugget, 'z', Item.seeds);

		//yagniss molded chunklet to yagniss nugget
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowNugget),
				" x ",
				"xxx",
				" x ",
				'x', MoreOres.yellowChunkletMolded);

		//Lemon Planks to sticks
		GameRegistry.addRecipe(new ItemStack(Item.stick, 4),
				"x",
				"x",
				'x', MoreOres.yellowPlanks);

		//Lemon Planks to crafting table
		GameRegistry.addRecipe(new ItemStack(Block.workbench),
				"xx",
				"xx",
				'x', MoreOres.yellowPlanks);

		//Lemon Planks to chest
		GameRegistry.addRecipe(new ItemStack(Block.chest),
				"xxx",
				"x x",
				"xxx",
				'x', MoreOres.yellowPlanks);

		//Lemon Planks to door
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowWoodDoorItem),
				"xx",
				"xx",
				"xx",
				'x', MoreOres.yellowPlanks);

		//Lemon Planks to bowl
		GameRegistry.addRecipe(new ItemStack(Item.bowlEmpty),
				"x x",
				" x ",
				'x', MoreOres.yellowPlanks);

		//Lemon Planks to pressure plate
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowWoodPressurePlate),
				"xx",
				'x', MoreOres.yellowPlanks);

		//Lemon Planks to boat
		GameRegistry.addRecipe(new ItemStack(Item.boat),
				"x x",
				"xxx",
				'x', MoreOres.yellowPlanks);

		//Lemon Planks to trapdoor
		GameRegistry.addRecipe(new ItemStack(Block.trapdoor, 2),
				"xxx",
				"xxx",
				'x', MoreOres.yellowPlanks);

		//wood tools
		GameRegistry.addRecipe(new ItemStack(Item.swordWood),
				"x",
				"x",
				"y",
				'x', MoreOres.yellowPlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.pickaxeWood),
				"xxx",
				" y ",
				" y ",
				'x', MoreOres.yellowPlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.axeWood),
				"xx ",
				"xy ",
				" y ",
				'x', MoreOres.yellowPlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.shovelWood),
				"x",
				"y",
				"y",
				'x', MoreOres.yellowPlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.hoeWood),
				"xx ",
				" y ",
				" y ",
				'x', MoreOres.yellowPlanks, 'y', Item.stick);

		//Fencegate
		GameRegistry.addRecipe(new ItemStack(Block.fenceGate),
				"yxy",
				"yxy",
				'x', MoreOres.yellowPlanks, 'y', Item.stick);

		//sign
		GameRegistry.addRecipe(new ItemStack(Item.sign, 3),
				"xxx",
				"xxx",
				" y ",
				'x', MoreOres.yellowPlanks, 'y', Item.stick);

		//bed
		GameRegistry.addRecipe(new ItemStack(Item.bed),
				"yyy",
				"xxx",
				'x', MoreOres.yellowPlanks, 'y', Block.cloth);

		//note block
		GameRegistry.addRecipe(new ItemStack(Block.music),
				"xxx",
				"xyx",
				"xxx",
				'x', MoreOres.yellowPlanks, 'y', Item.redstone);

		//jukebox
		GameRegistry.addRecipe(new ItemStack(Block.jukebox),
				"xxx",
				"xyx",
				"xxx",
				'x', MoreOres.yellowPlanks, 'y', Item.diamond);

		//piston
		GameRegistry.addRecipe(new ItemStack(Block.pistonBase),
				"xxx",
				"qyq",
				"qzq",
				'x', MoreOres.yellowPlanks, 'y', MoreOres.ironRod, 'z', Item.redstone, 'q', Block.cobblestone);

		//bookshelf
		GameRegistry.addRecipe(new ItemStack(Block.bookShelf),
				"xxx",
				"yyy",
				"xxx",
				'x', MoreOres.yellowPlanks, 'y', Item.book);

		//stairs
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowStairsWood, 4),
				"  x",
				" xx",
				"xxx",
				'x', MoreOres.yellowPlanks);

		//sapling
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowSapling),
				" x ",
				"xyx",
				" x ",
				'x', MoreOres.lemon, 'y', Block.sapling);

		//walls
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowWalls, 6),
				"xxx",
				"xxx",
				'x', MoreOres.yellowBlock);

		//trapdoor
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowTrapdoor, 4),
				"xxx",
				"xxx",
				'x', MoreOres.yellowBlock);

		//furnace
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowFurnaceIdle),
				"x x",
				" y ",
				"x x",
				'x', MoreOres.yellowBlock, 'y', Block.furnaceIdle);
		
		//pressure plate
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowPressurePlate),
				"xx",
				'x', MoreOres.yellowBlock);
		
		//yellow arrow
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowArrow, 5), 
				"z", 
				"x",
				"y",
				'x', Item.stick, 'y', Item.feather, 'z', Item.flintAndSteel);

		//Lemon Plank to button
		GameRegistry.addShapelessRecipe(new ItemStack(Block.woodenButton), new ItemStack(MoreOres.yellowPlanks));

		//Yagniss ingot to Yagniss nugget
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.yellowNugget, 9), new ItemStack(MoreOres.ingotYellow));

		//yellow logs to Lemon Planks
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.yellowPlanks, 4), new ItemStack(MoreOres.yellowLog));

		//Yagniss Ore smelts to Yagniss ingot
		GameRegistry.addSmelting(MoreOres.yellowOre.blockID, new ItemStack(MoreOres.ingotYellow), 1F);

		//yagniss chunklet smelts to yagniss chunklet molded
		GameRegistry.addSmelting(MoreOres.yellowChunklet.itemID, new ItemStack(MoreOres.yellowChunkletMolded), 0.5F);


		/*
		 * 
		 */


		//Origum Recipes

		/*
		 * Origum Armour Recipes
		 */

		//Origum Helmet
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeHelmet), 
				"xxx", 
				"x x",
				'x', MoreOres.ingotOrange);

		//Origum Chestplate
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeChestplate), 
				"x x", 
				"xxx", 
				"xxx",
				'x', MoreOres.ingotOrange);

		//Origum Pants
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeLeggings), 
				"xxx", 
				"x x", 
				"x x",
				'x', MoreOres.ingotOrange);

		//Origum Boots
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeBoots), 
				"x x", 
				"x x",
				'x', MoreOres.ingotOrange);


		/*
		 * Origum Tool set
		 */

		//Origum Sword
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeSword),
				"x",
				"x",
				"y",
				'x', MoreOres.ingotOrange, 'y',Item.stick);


		//Origum Pickaxe
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangePickaxe),
				"xxx",
				" y ",
				" y ",
				'x', MoreOres.ingotOrange, 'y',Item.stick);


		//Origum Axe
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeAxe),
				"xx ",
				"xy ",
				" y ",
				'x', MoreOres.ingotOrange, 'y',Item.stick);


		//Origum Shovel
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeShovel),
				"x",
				"y",
				"y",
				'x', MoreOres.ingotOrange, 'y',Item.stick);


		//Origum Hoe
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeHoe),
				"xx ",
				" y ",
				" y ",
				'x', MoreOres.ingotOrange, 'y',Item.stick);

		//Origum Paxcel
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangePaxcel),
				"xzq",
				"wyc",
				" y ",
				'x', MoreOres.orangeAxe, 'y', Item.stick, 'z', MoreOres.orangePickaxe, 'q', MoreOres.orangeShovel, 'w', MoreOres.orangeSword, 'c', MoreOres.orangeHoe);

		//Origum staff
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeStaff),
				"yxy",
				"zqz",
				" q ",
				'x', MoreOres.ingotOrange, 'y', Item.bucketEmpty, 'z', MoreOres.orangeNugget, 'q', Item.stick);
		
		//Origum ingots to Origum block
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeBlock),
				"xxx",
				"xxx",
				"xxx",
				'x', MoreOres.ingotOrange);

		//Origum block to Origum ingots
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.ingotOrange, 9), new ItemStack(MoreOres.orangeBlock));

		//Origum ladder
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeLadder),
				"x x",
				"xxx",
				"x x",
				'x', MoreOres.ingotOrange);

		//enchanted orange
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeEnchanted),
				" x ",
				"xyx",
				" x ",
				'x', MoreOres.ingotOrange, 'y', MoreOres.orange);

		//Origum fence
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeFence, 2),
				"xxx",
				"xxx",
				'x', MoreOres.ingotOrange);

		//Origum fence gate
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeFencegate),
				"xyx",
				"xyx",
				'x', MoreOres.ingotOrange, 'y', MoreOres.orangeBlock);

		//Origum nuggets to Origum ingot
		GameRegistry.addRecipe(new ItemStack(MoreOres.ingotOrange), 
				"xxx",
				"xxx",
				"xxx",
				'x', MoreOres.orangeNugget);

		//Origum bucket
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeBucketEmpty),
				"x x",
				" x ",
				'x', MoreOres.ingotOrange);

		//origum torch
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeTorch),
				"x",
				"y",
				'x', MoreOres.orangeFuel, 'y', Item.stick);

		//Origum stairs
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeStairs, 4),
				"  x",
				" xx",
				"xxx",
				'x', MoreOres.ingotOrange);

		//Orange glass
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeGlass, 4),
				"xxx",
				"xyx",
				"xxx",
				'x', MoreOres.orangeNugget, 'y', Block.glass);

		//origum fuel
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeFuel, 2),
				" x ",
				"xyx",
				" x ",
				'x', MoreOres.orangeNugget, 'y', Item.coal);

		//origum Seeds
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeSeeds),
				"yxy",
				" z ",
				"yxy",
				'x', MoreOres.ingotOrange, 'y', MoreOres.orangeNugget,'z', Item.seeds);

		//origum Seeds alternative
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeSeeds),
				"y y",
				"xzx",
				"y y",
				'x', MoreOres.ingotOrange, 'y', MoreOres.orangeNugget, 'z', Item.seeds);

		//origum molded chunklet to origum nugget
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeNugget),
				" x ",
				"xxx",
				" x ",
				'x', MoreOres.orangeChunkletMolded);

		//orange planks to sticks
		GameRegistry.addRecipe(new ItemStack(Item.stick, 4),
				"x",
				"x",
				'x', MoreOres.orangePlanks);

		//orange planks to crafting table
		GameRegistry.addRecipe(new ItemStack(Block.workbench),
				"xx",
				"xx",
				'x', MoreOres.orangePlanks);

		//orange planks to chest
		GameRegistry.addRecipe(new ItemStack(Block.chest),
				"xxx",
				"x x",
				"xxx",
				'x', MoreOres.orangePlanks);

		//orange planks to door
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeWoodDoorItem),
				"xx",
				"xx",
				"xx",
				'x', MoreOres.orangePlanks);

		//orange planks to bowl
		GameRegistry.addRecipe(new ItemStack(Item.bowlEmpty),
				"x x",
				" x ",
				'x', MoreOres.orangePlanks);

		//orange planks to pressure plate
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeWoodPressurePlate),
				"xx",
				'x', MoreOres.orangePlanks);

		//orange planks to boat
		GameRegistry.addRecipe(new ItemStack(Item.boat),
				"x x",
				"xxx",
				'x', MoreOres.orangePlanks);

		//orange planks to trapdoor
		GameRegistry.addRecipe(new ItemStack(Block.trapdoor, 2),
				"xxx",
				"xxx",
				'x', MoreOres.orangePlanks);

		//wood tools
		GameRegistry.addRecipe(new ItemStack(Item.swordWood),
				"x",
				"x",
				"y",
				'x', MoreOres.orangePlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.pickaxeWood),
				"xxx",
				" y ",
				" y ",
				'x', MoreOres.orangePlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.axeWood),
				"xx ",
				"xy ",
				" y ",
				'x', MoreOres.orangePlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.shovelWood),
				"x",
				"y",
				"y",
				'x', MoreOres.orangePlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.hoeWood),
				"xx ",
				" y ",
				" y ",
				'x', MoreOres.orangePlanks, 'y', Item.stick);

		//Fencegate
		GameRegistry.addRecipe(new ItemStack(Block.fenceGate),
				"yxy",
				"yxy",
				'x', MoreOres.orangePlanks, 'y', Item.stick);

		//sign
		GameRegistry.addRecipe(new ItemStack(Item.sign, 3),
				"xxx",
				"xxx",
				" y ",
				'x', MoreOres.orangePlanks, 'y', Item.stick);

		//bed
		GameRegistry.addRecipe(new ItemStack(Item.bed),
				"yyy",
				"xxx",
				'x', MoreOres.orangePlanks, 'y', Block.cloth);

		//note block
		GameRegistry.addRecipe(new ItemStack(Block.music),
				"xxx",
				"xyx",
				"xxx",
				'x', MoreOres.orangePlanks, 'y', Item.redstone);

		//jukebox
		GameRegistry.addRecipe(new ItemStack(Block.jukebox),
				"xxx",
				"xyx",
				"xxx",
				'x', MoreOres.orangePlanks, 'y', Item.diamond);

		//piston
		GameRegistry.addRecipe(new ItemStack(Block.pistonBase),
				"xxx",
				"qyq",
				"qzq",
				'x', MoreOres.orangePlanks, 'y', MoreOres.ironRod, 'z', Item.redstone, 'q', Block.cobblestone);

		//bookshelf
		GameRegistry.addRecipe(new ItemStack(Block.bookShelf),
				"xxx",
				"yyy",
				"xxx",
				'x', MoreOres.orangePlanks, 'y', Item.book);

		//stairs
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeStairsWood, 4),
				"  x",
				" xx",
				"xxx",
				'x', MoreOres.orangePlanks);

		//sapling
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeSapling),
				" x ",
				"xyx",
				" x ",
				'x', MoreOres.orange, 'y', Block.sapling);

		//walls
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeWalls, 6),
				"xxx",
				"xxx",
				'x', MoreOres.orangeBlock);

		//trapdoor
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeTrapdoor, 4),
				"xxx",
				"xxx",
				'x', MoreOres.orangeBlock);

		//furnace
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeFurnaceIdle),
				"x x",
				" y ",
				"x x",
				'x', MoreOres.orangeBlock, 'y', Block.furnaceIdle);
		
		//pressure plate
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangePressurePlate),
				"xx",
				'x', MoreOres.orangeBlock);
		
		//black arrow
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackArrow, 5), 
				"z", 
				"x",
				"y",
				'x', Item.stick, 'y', Item.feather, 'z', Item.bucketLava);

		//orange plank to button
		GameRegistry.addShapelessRecipe(new ItemStack(Block.woodenButton), new ItemStack(MoreOres.orangePlanks));

		//Origum ingot to Origum nugget
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.orangeNugget, 9), new ItemStack(MoreOres.ingotOrange));

		//orange logs to orange planks
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.orangePlanks, 4), new ItemStack(MoreOres.orangeLog));

		//Origum Ore smelts to Origum ingot
		GameRegistry.addSmelting(MoreOres.orangeOre.blockID, new ItemStack(MoreOres.ingotOrange), 1F);

		//origum chunklet smelts to origum chunklet molded
		GameRegistry.addSmelting(MoreOres.orangeChunklet.itemID, new ItemStack(MoreOres.orangeChunkletMolded), 0.5F);


		/*
		 * 
		 */


		//Blosper Recipes

		/*
		 * Blosper Armour Recipes
		 */

		//Blosper Helmet
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueHelmet), 
				"xxx", 
				"x x",
				'x', MoreOres.ingotBlue);

		//Blosper Chestplate
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueChestplate), 
				"x x", 
				"xxx", 
				"xxx",
				'x', MoreOres.ingotBlue);

		//Blosper Pants
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueLeggings), 
				"xxx", 
				"x x", 
				"x x",
				'x', MoreOres.ingotBlue);

		//Blosper Boots
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueBoots), 
				"x x", 
				"x x",
				'x', MoreOres.ingotBlue);


		/*
		 * Blosper Tool set
		 */
		//Blosper Sword
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueSword),
				"x",
				"x",
				"y",
				'x', MoreOres.ingotBlue, 'y',MoreOres.ironRod);


		//Blosper Pickaxe
		GameRegistry.addRecipe(new ItemStack(MoreOres.bluePickaxe),
				"xxx",
				" y ",
				" y ",
				'x', MoreOres.ingotBlue, 'y',MoreOres.ironRod);


		//Blosper Axe
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueAxe),
				"xx ",
				"xy ",
				" y ",
				'x', MoreOres.ingotBlue, 'y',MoreOres.ironRod);


		//Blosper Shovel
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueShovel),
				"x",
				"y",
				"y",
				'x', MoreOres.ingotBlue, 'y',MoreOres.ironRod);


		//Blosper Hoe
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueHoe),
				"xx ",
				" y ",
				" y ",
				'x', MoreOres.ingotBlue, 'y',MoreOres.ironRod);

		//Blosper Paxcel
		GameRegistry.addRecipe(new ItemStack(MoreOres.bluePaxcel),
				"xzq",
				"wyc",
				" y ",
				'x', MoreOres.blueAxe, 'y', MoreOres.ironRod, 'z', MoreOres.bluePickaxe, 'q', MoreOres.blueShovel, 'w', MoreOres.blueSword, 'c', MoreOres.blueHoe);

		//Blosper staff
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueStaff),
				"yxy",
				"zqz",
				" q ",
				'x', MoreOres.ingotBlue, 'y', Item.bucketEmpty, 'z', MoreOres.blueNugget, 'q', MoreOres.ironRod);
		
		//Blosper ingots to Blosper block
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueBlock),
				"xxx",
				"xxx",
				"xxx",
				'x', MoreOres.ingotBlue);

		//Blosper block to Blosper ingots
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.ingotBlue, 9), new ItemStack(MoreOres.blueBlock));

		//Blosper ladder
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueLadder),
				"x x",
				"xxx",
				"x x",
				'x', MoreOres.ingotBlue);

		//enchanted blueberry
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueberryEnchanted),
				" x ",
				"xyx",
				" x ",
				'x', MoreOres.ingotBlue, 'y', MoreOres.blueberry);

		//Blosper fence
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueFence, 2),
				"xxx",
				"xxx",
				'x', MoreOres.ingotBlue);

		//Blosper fence gate
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueFencegate),
				"xyx",
				"xyx",
				'x', MoreOres.ingotBlue, 'y', MoreOres.blueBlock);

		//Blosper nuggets to Blosper ingot
		GameRegistry.addRecipe(new ItemStack(MoreOres.ingotBlue), 
				"xxx",
				"xxx",
				"xxx",
				'x', MoreOres.blueNugget);

		//Blosper bucket
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueBucketEmpty),
				"x x",
				" x ",
				'x', MoreOres.ingotBlue);

		//blosper torch
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueTorch),
				"x",
				"y",
				'x', MoreOres.blueFuel, 'y', MoreOres.ironRod);

		//Blosper stairs
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueStairs, 4),
				"  x",
				" xx",
				"xxx",
				'x', MoreOres.ingotBlue);

		//blue glass
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueGlass, 4),
				"xxx",
				"xyx",
				"xxx",
				'x', MoreOres.blueNugget, 'y', Block.glass);

		//Blosper fuel
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueFuel, 2),
				" x ",
				"xyx",
				" x ",
				'x', MoreOres.blueNugget, 'y', Item.coal);

		//blosper Seeds
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueSeeds),
				"yxy",
				" z ",
				"yxy",
				'x', MoreOres.ingotBlue, 'y', MoreOres.blueNugget,'z', Item.seeds);

		//blosper Seeds alternative
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueSeeds),
				"y y",
				"xzx",
				"y y",
				'x', MoreOres.ingotBlue, 'y', MoreOres.blueNugget, 'z', Item.seeds);

		//Blosper molded chunklet to blosper nugget
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueNugget),
				" x ",
				"xxx",
				" x ",
				'x', MoreOres.blueChunkletMolded);

		//Blueberry Planks to sticks
		GameRegistry.addRecipe(new ItemStack(Item.stick, 4),
				"x",
				"x",
				'x', MoreOres.bluePlanks);

		//Blueberry Planks to crafting table
		GameRegistry.addRecipe(new ItemStack(Block.workbench),
				"xx",
				"xx",
				'x', MoreOres.bluePlanks);

		//Blueberry Planks to chest
		GameRegistry.addRecipe(new ItemStack(Block.chest),
				"xxx",
				"x x",
				"xxx",
				'x', MoreOres.bluePlanks);

		//Blueberry Planks to door
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueWoodDoorItem),
				"xx",
				"xx",
				"xx",
				'x', MoreOres.bluePlanks);

		//Blueberry Planks to bowl
		GameRegistry.addRecipe(new ItemStack(Item.bowlEmpty),
				"x x",
				" x ",
				'x', MoreOres.bluePlanks);

		//Blueberry Planks to pressure plate
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueWoodPressurePlate),
				"xx",
				'x', MoreOres.bluePlanks);

		//Blueberry Planks to boat
		GameRegistry.addRecipe(new ItemStack(Item.boat),
				"x x",
				"xxx",
				'x', MoreOres.bluePlanks);

		//Blueberry Planks to trapdoor
		GameRegistry.addRecipe(new ItemStack(Block.trapdoor, 2),
				"xxx",
				"xxx",
				'x', MoreOres.bluePlanks);

		//wood tools
		GameRegistry.addRecipe(new ItemStack(Item.swordWood),
				"x",
				"x",
				"y",
				'x', MoreOres.bluePlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.pickaxeWood),
				"xxx",
				" y ",
				" y ",
				'x', MoreOres.bluePlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.axeWood),
				"xx ",
				"xy ",
				" y ",
				'x', MoreOres.bluePlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.shovelWood),
				"x",
				"y",
				"y",
				'x', MoreOres.bluePlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.hoeWood),
				"xx ",
				" y ",
				" y ",
				'x', MoreOres.bluePlanks, 'y', Item.stick);

		//Fencegate
		GameRegistry.addRecipe(new ItemStack(Block.fenceGate),
				"yxy",
				"yxy",
				'x', MoreOres.bluePlanks, 'y', Item.stick);

		//sign
		GameRegistry.addRecipe(new ItemStack(Item.sign, 3),
				"xxx",
				"xxx",
				" y ",
				'x', MoreOres.bluePlanks, 'y', Item.stick);

		//bed
		GameRegistry.addRecipe(new ItemStack(Item.bed),
				"yyy",
				"xxx",
				'x', MoreOres.bluePlanks, 'y', Block.cloth);

		//note block
		GameRegistry.addRecipe(new ItemStack(Block.music),
				"xxx",
				"xyx",
				"xxx",
				'x', MoreOres.bluePlanks, 'y', Item.redstone);

		//jukebox
		GameRegistry.addRecipe(new ItemStack(Block.jukebox),
				"xxx",
				"xyx",
				"xxx",
				'x', MoreOres.bluePlanks, 'y', Item.diamond);

		//piston
		GameRegistry.addRecipe(new ItemStack(Block.pistonBase),
				"xxx",
				"qyq",
				"qzq",
				'x', MoreOres.bluePlanks, 'y', MoreOres.ironRod, 'z', Item.redstone, 'q', Block.cobblestone);

		//bookshelf
		GameRegistry.addRecipe(new ItemStack(Block.bookShelf),
				"xxx",
				"yyy",
				"xxx",
				'x', MoreOres.bluePlanks, 'y', Item.book);

		//stairs
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueStairsWood, 4),
				"  x",
				" xx",
				"xxx",
				'x', MoreOres.bluePlanks);

		//sapling
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueSapling),
				" x ",
				"xyx",
				" x ",
				'x', MoreOres.blueberry, 'y', Block.sapling);

		//walls
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueWalls, 6),
				"xxx",
				"xxx",
				'x', MoreOres.blueBlock);

		//trapdoor
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueTrapdoor, 4),
				"xxx",
				"xxx",
				'x', MoreOres.blueBlock);

		//furnace
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueFurnaceIdle),
				"x x",
				" y ",
				"x x",
				'x', MoreOres.blueBlock, 'y', Block.furnaceIdle);
		
		//pressure plate
		GameRegistry.addRecipe(new ItemStack(MoreOres.bluePressurePlate),
				"xx",
				'x', MoreOres.blueBlock);
		
		//blue arrow
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueArrow, 5), 
				"z", 
				"x",
				"y",
				'x', Item.stick, 'y', Item.feather, 'z', Item.bucketWater);

		//blue plank to button
		GameRegistry.addShapelessRecipe(new ItemStack(Block.woodenButton), new ItemStack(MoreOres.bluePlanks));

		//Blosper ingot to Blosper nugget
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.blueNugget, 9), new ItemStack(MoreOres.ingotBlue));

		//blue logs to Blueberry Planks
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.bluePlanks, 4), new ItemStack(MoreOres.blueLog));

		//Blosper Ore smelts to Blosper ingot
		GameRegistry.addSmelting(MoreOres.blueOre.blockID, new ItemStack(MoreOres.ingotBlue), 1F);

		//blosper chunklet smelts to blosper chunklet molded
		GameRegistry.addSmelting(MoreOres.blueChunklet.itemID, new ItemStack(MoreOres.blueChunkletMolded), 0.5F);
		
		
		/*
		 * 
		 */


		//rainbow Recipes

		/*
		 * rainbow Armour Recipes
		 */

		//rainbow Helmet
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowHelmet), 
				"xxx", 
				"x x",
				'x', MoreOres.ingotRainbow);

		//rainbow Chestplate
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowChestplate), 
				"x x", 
				"xxx", 
				"xxx",
				'x', MoreOres.ingotRainbow);

		//rainbow Pants
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowLeggings), 
				"xxx", 
				"x x", 
				"x x",
				'x', MoreOres.ingotRainbow);

		//rainbow Boots
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowBoots), 
				"x x", 
				"x x",
				'x', MoreOres.ingotRainbow);


		/*
		 * rainbow Tool set
		 */
		//rainbow Sword
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowSword),
				"x",
				"x",
				"y",
				'x', MoreOres.ingotRainbow, 'y',MoreOres.ironRod);


		//rainbow Pickaxe
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowPickaxe),
				"xxx",
				" y ",
				" y ",
				'x', MoreOres.ingotRainbow, 'y',MoreOres.ironRod);


		//rainbow Axe
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowAxe),
				"xx ",
				"xy ",
				" y ",
				'x', MoreOres.ingotRainbow, 'y',MoreOres.ironRod);


		//rainbow Shovel
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowShovel),
				"x",
				"y",
				"y",
				'x', MoreOres.ingotRainbow, 'y',MoreOres.ironRod);


		//rainbow Hoe
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowHoe),
				"xx ",
				" y ",
				" y ",
				'x', MoreOres.ingotRainbow, 'y',MoreOres.ironRod);

		//rainbow Paxcel
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowPaxcel),
				"xzq",
				"wyc",
				" y ",
				'x', MoreOres.rainbowAxe, 'y', MoreOres.ironRod, 'z', MoreOres.rainbowPickaxe, 'q', MoreOres.rainbowShovel, 'w', MoreOres.rainbowSword, 'c', MoreOres.rainbowHoe);

		//rainbow staff
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowStaff),
				"dxy",
				"bqz",
				"aqc",
				'x', MoreOres.ingotRainbow, 'd', MoreOres.orangeStaff, 'y', MoreOres.yellowStaff, 'b', MoreOres.greenStaff, 'z', MoreOres.blueStaff, 'a', MoreOres.purpleStaff, 'c', MoreOres.blackStaff, 'q', MoreOres.ironRod);
		
		//rainbow ingots to rainbow block
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowBlock),
				"xxx",
				"xxx",
				"xxx",
				'x', MoreOres.ingotRainbow);

		//rainbow block to rainbow ingots
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.ingotRainbow, 9), new ItemStack(MoreOres.rainbowBlock));

		//rainbow ladder
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowLadder),
				"x x",
				"xxx",
				"x x",
				'x', MoreOres.ingotRainbow);

		//enchanted superfruit
		GameRegistry.addRecipe(new ItemStack(MoreOres.superfruitEnchanted),
				" x ",
				"xyx",
				" x ",
				'x', MoreOres.ingotRainbow, 'y', MoreOres.superfruit);

		//rainbow fence
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowFence, 2),
				"xxx",
				"xxx",
				'x', MoreOres.ingotRainbow);

		//rainbow fence gate
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowFencegate),
				"xyx",
				"xyx",
				'x', MoreOres.ingotRainbow, 'y', MoreOres.rainbowBlock);

		//rainbow nuggets to rainbow ingot
		GameRegistry.addRecipe(new ItemStack(MoreOres.ingotRainbow), 
				"xxx",
				"xxx",
				"xxx",
				'x', MoreOres.rainbowNugget);

		//rainbow bucket
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowBucketEmpty),
				"x x",
				" x ",
				'x', MoreOres.ingotRainbow);

		//rainbow torch
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowTorch),
				"x",
				"y",
				'x', MoreOres.rainbowFuel, 'y', MoreOres.ironRod);

		//rainbow stairs
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowStairs, 4),
				"  x",
				" xx",
				"xxx",
				'x', MoreOres.ingotRainbow);

		//rainbow glass
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowGlass, 4),
				"xxx",
				"xyx",
				"xxx",
				'x', MoreOres.rainbowNugget, 'y', Block.glass);

		//rainbow fuel
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowFuel, 2),
				" x ",
				"xyx",
				" x ",
				'x', MoreOres.rainbowNugget, 'y', Item.coal);

		//rainbow Seeds
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowSeeds),
				"yxy",
				" z ",
				"yxy",
				'x', MoreOres.ingotRainbow, 'y', MoreOres.rainbowNugget,'z', Item.seeds);

		//rainbow Seeds alternative
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowSeeds),
				"y y",
				"xzx",
				"y y",
				'x', MoreOres.ingotRainbow, 'y', MoreOres.rainbowNugget, 'z', Item.seeds);

		//rainbow molded chunklet to rainbow nugget
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowNugget),
				" x ",
				"xxx",
				" x ",
				'x', MoreOres.rainbowChunkletMolded);

		//superfruit Planks to sticks
		GameRegistry.addRecipe(new ItemStack(Item.stick, 4),
				"x",
				"x",
				'x', MoreOres.rainbowPlanks);

		//superfruit Planks to crafting table
		GameRegistry.addRecipe(new ItemStack(Block.workbench),
				"xx",
				"xx",
				'x', MoreOres.rainbowPlanks);

		//superfruit Planks to chest
		GameRegistry.addRecipe(new ItemStack(Block.chest),
				"xxx",
				"x x",
				"xxx",
				'x', MoreOres.rainbowPlanks);

		//superfruit Planks to door
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowWoodDoorItem),
				"xx",
				"xx",
				"xx",
				'x', MoreOres.rainbowPlanks);

		//superfruit Planks to bowl
		GameRegistry.addRecipe(new ItemStack(Item.bowlEmpty),
				"x x",
				" x ",
				'x', MoreOres.rainbowPlanks);

		//superfruit Planks to pressure plate
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenWoodPressurePlate),
				"xx",
				'x', MoreOres.rainbowPlanks);

		//superfruit Planks to boat
		GameRegistry.addRecipe(new ItemStack(Item.boat),
				"x x",
				"xxx",
				'x', MoreOres.rainbowPlanks);

		//superfruit Planks to trapdoor
		GameRegistry.addRecipe(new ItemStack(Block.trapdoor, 2),
				"xxx",
				"xxx",
				'x', MoreOres.rainbowPlanks);

		//wood tools
		GameRegistry.addRecipe(new ItemStack(Item.swordWood),
				"x",
				"x",
				"y",
				'x', MoreOres.rainbowPlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.pickaxeWood),
				"xxx",
				" y ",
				" y ",
				'x', MoreOres.rainbowPlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.axeWood),
				"xx ",
				"xy ",
				" y ",
				'x', MoreOres.rainbowPlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.shovelWood),
				"x",
				"y",
				"y",
				'x', MoreOres.rainbowPlanks, 'y', Item.stick);

		GameRegistry.addRecipe(new ItemStack(Item.hoeWood),
				"xx ",
				" y ",
				" y ",
				'x', MoreOres.rainbowPlanks, 'y', Item.stick);

		//Fencegate
		GameRegistry.addRecipe(new ItemStack(Block.fenceGate),
				"yxy",
				"yxy",
				'x', MoreOres.rainbowPlanks, 'y', Item.stick);

		//sign
		GameRegistry.addRecipe(new ItemStack(Item.sign, 3),
				"xxx",
				"xxx",
				" y ",
				'x', MoreOres.rainbowPlanks, 'y', Item.stick);

		//bed
		GameRegistry.addRecipe(new ItemStack(Item.bed),
				"yyy",
				"xxx",
				'x', MoreOres.rainbowPlanks, 'y', Block.cloth);

		//note block
		GameRegistry.addRecipe(new ItemStack(Block.music),
				"xxx",
				"xyx",
				"xxx",
				'x', MoreOres.rainbowPlanks, 'y', Item.redstone);

		//jukebox
		GameRegistry.addRecipe(new ItemStack(Block.jukebox),
				"xxx",
				"xyx",
				"xxx",
				'x', MoreOres.rainbowPlanks, 'y', Item.diamond);

		//piston
		GameRegistry.addRecipe(new ItemStack(Block.pistonBase),
				"xxx",
				"qyq",
				"qzq",
				'x', MoreOres.rainbowPlanks, 'y', MoreOres.ironRod, 'z', Item.redstone, 'q', Block.cobblestone);

		//bookshelf
		GameRegistry.addRecipe(new ItemStack(Block.bookShelf),
				"xxx",
				"yyy",
				"xxx",
				'x', MoreOres.rainbowPlanks, 'y', Item.book);

		//stairs
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowStairsWood, 4),
				"  x",
				" xx",
				"xxx",
				'x', MoreOres.rainbowPlanks);

		//sapling
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowSapling),
				" x ",
				"xyx",
				" x ",
				'x', MoreOres.superfruit, 'y', Block.sapling);

		//walls
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowWalls, 6),
				"xxx",
				"xxx",
				'x', MoreOres.rainbowBlock);

		//trapdoor
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowTrapdoor, 4),
				"xxx",
				"xxx",
				'x', MoreOres.rainbowBlock);

		//furnace
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowFurnaceIdle),
				"x x",
				" y ",
				"x x",
				'x', MoreOres.rainbowBlock, 'y', Block.furnaceIdle);
		
		//lighter
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowLighter),
				"x ",
				" y",
				'x', MoreOres.ingotPurple, 'y', Item.ingotIron);
		
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowLighter),
				" x",
				"y ",
				'x', MoreOres.ingotPurple, 'y', Item.ingotIron);
		
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowLighter),
				"y ",
				" x",
				'x', MoreOres.ingotPurple, 'y', Item.ingotIron);
		
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowLighter),
				" y",
				"x ",
				'x', MoreOres.ingotPurple, 'y', Item.ingotIron);
		
		//pressure plate
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowPressurePlate),
				"xx",
				'x', MoreOres.rainbowBlock);

		//rainbow plank to button
		GameRegistry.addShapelessRecipe(new ItemStack(Block.woodenButton), new ItemStack(MoreOres.rainbowPlanks));

		//rainbow ingot to rainbow nugget
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.rainbowNugget, 9), new ItemStack(MoreOres.ingotRainbow));

		//rainbow logs to superfruit Planks
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.rainbowPlanks, 4), new ItemStack(MoreOres.rainbowLog));

		//rainbow Ore smelts to rainbow ingot
		GameRegistry.addSmelting(MoreOres.rainbowOre.blockID, new ItemStack(MoreOres.ingotRainbow), 1F);

		//rainbow chunklet smelts to rainbow chunklet molded
		GameRegistry.addSmelting(MoreOres.rainbowChunklet.itemID, new ItemStack(MoreOres.rainbowChunkletMolded), 0.5F);


		/*
		 * 
		 */


		//secrets and trolls
		GameRegistry.addSmelting(Block.furnaceIdle.blockID, new ItemStack(Block.furnaceBurning), 1.0F);
		GameRegistry.addShapelessRecipe(new ItemStack(Block.furnaceIdle), new ItemStack(Block.dirt));


		//iron rod
		GameRegistry.addRecipe(new ItemStack(MoreOres.ironRod, 3),
				"x",
				"x",
				'x', Item.ingotIron);


		//xray block
		GameRegistry.addRecipe(new ItemStack(MoreOres.xrayBlock, 7),
				"yxy",
				"xzx",
				"yxy",
				'x', Block.glass, 'y', MoreOres.ironRod, 'z', MoreOres.secretPaste);


		//crusher
		GameRegistry.addRecipe(new ItemStack(MoreOres.crusherIdle),
				"yxy",
				"xzx",
				"yxy",
				'z', Block.furnaceIdle, 'x', new ItemStack(Item.dyePowder, 1, 0), 'y', Block.obsidian);

		//crusher item
		GameRegistry.addRecipe(new ItemStack(MoreOres.crusher),
				" x ",
				" x ",
				"yyy",
				'x', MoreOres.ironRod, 'y', Block.stone);

		//rubber to trampoline
		GameRegistry.addRecipe(new ItemStack(MoreOres.trampoline),
				"xxx",
				"xxx",
				'x', MoreOres.rubber);
		
		//rubber to rubber band
		GameRegistry.addRecipe(new ItemStack(MoreOres.rubberBand, 2),
				"xx",
				'x', MoreOres.rubber);
		
		//night vision goggles
		GameRegistry.addRecipe(new ItemStack(MoreOres.nightVisionGoggles),
				"xyx",
				"xzx",
				"yqy",
				'x', MoreOres.rubberBand, 'y', MoreOres.ingotGreen, 'z', Block.glass, 'q', new ItemStack(Item.dyePowder, 15));
		
		//extractor
		GameRegistry.addRecipe(new ItemStack(MoreOres.extractorIdle),
				"yxy",
				"xzx",
				"yxy",
				'z', Item.bucketEmpty, 'x', new ItemStack(Item.dyePowder, 1, 0), 'y', Block.obsidian);


		//secret paste
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.secretPaste, 1), new Object[] { Item.bucketWater, new ItemStack(Item.dyePowder, 1, 0), MoreOres.ingotBlue, MoreOres.ingotGreen, MoreOres.ingotOrange, MoreOres.ingotYellow});
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.secretPaste, 1), new Object[] { Item.bucketWater, new ItemStack(Item.dyePowder, 1, 1), MoreOres.ingotBlue, MoreOres.ingotGreen, MoreOres.ingotOrange, MoreOres.ingotYellow});
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.secretPaste, 1), new Object[] { Item.bucketWater, new ItemStack(Item.dyePowder, 1, 2), MoreOres.ingotBlue, MoreOres.ingotGreen, MoreOres.ingotOrange, MoreOres.ingotYellow});
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.secretPaste, 1), new Object[] { Item.bucketWater, new ItemStack(Item.dyePowder, 1, 3), MoreOres.ingotBlue, MoreOres.ingotGreen, MoreOres.ingotOrange, MoreOres.ingotYellow});
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.secretPaste, 1), new Object[] { Item.bucketWater, new ItemStack(Item.dyePowder, 1, 4), MoreOres.ingotBlue, MoreOres.ingotGreen, MoreOres.ingotOrange, MoreOres.ingotYellow});
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.secretPaste, 1), new Object[] { Item.bucketWater, new ItemStack(Item.dyePowder, 1, 5), MoreOres.ingotBlue, MoreOres.ingotGreen, MoreOres.ingotOrange, MoreOres.ingotYellow});
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.secretPaste, 1), new Object[] { Item.bucketWater, new ItemStack(Item.dyePowder, 1, 6), MoreOres.ingotBlue, MoreOres.ingotGreen, MoreOres.ingotOrange, MoreOres.ingotYellow});
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.secretPaste, 1), new Object[] { Item.bucketWater, new ItemStack(Item.dyePowder, 1, 7), MoreOres.ingotBlue, MoreOres.ingotGreen, MoreOres.ingotOrange, MoreOres.ingotYellow});
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.secretPaste, 1), new Object[] { Item.bucketWater, new ItemStack(Item.dyePowder, 1, 8), MoreOres.ingotBlue, MoreOres.ingotGreen, MoreOres.ingotOrange, MoreOres.ingotYellow});
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.secretPaste, 1), new Object[] { Item.bucketWater, new ItemStack(Item.dyePowder, 1, 9), MoreOres.ingotBlue, MoreOres.ingotGreen, MoreOres.ingotOrange, MoreOres.ingotYellow});
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.secretPaste, 1), new Object[] { Item.bucketWater, new ItemStack(Item.dyePowder, 1, 10), MoreOres.ingotBlue, MoreOres.ingotGreen, MoreOres.ingotOrange, MoreOres.ingotYellow});
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.secretPaste, 1), new Object[] { Item.bucketWater, new ItemStack(Item.dyePowder, 1, 11), MoreOres.ingotBlue, MoreOres.ingotGreen, MoreOres.ingotOrange, MoreOres.ingotYellow});
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.secretPaste, 1), new Object[] { Item.bucketWater, new ItemStack(Item.dyePowder, 1, 12), MoreOres.ingotBlue, MoreOres.ingotGreen, MoreOres.ingotOrange, MoreOres.ingotYellow});
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.secretPaste, 1), new Object[] { Item.bucketWater, new ItemStack(Item.dyePowder, 1, 13), MoreOres.ingotBlue, MoreOres.ingotGreen, MoreOres.ingotOrange, MoreOres.ingotYellow});
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.secretPaste, 1), new Object[] { Item.bucketWater, new ItemStack(Item.dyePowder, 1, 14), MoreOres.ingotBlue, MoreOres.ingotGreen, MoreOres.ingotOrange, MoreOres.ingotYellow});
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.secretPaste, 1), new Object[] { Item.bucketWater, new ItemStack(Item.dyePowder, 1, 15), MoreOres.ingotBlue, MoreOres.ingotGreen, MoreOres.ingotOrange, MoreOres.ingotYellow});


		//doors
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeDoorItem),
				"xx",
				"xx",
				"xx",
				'x', MoreOres.ingotOrange);

		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowDoorItem),
				"xx",
				"xx",
				"xx",
				'x', MoreOres.ingotYellow);

		GameRegistry.addRecipe(new ItemStack(MoreOres.greenDoorItem),
				"xx",
				"xx",
				"xx",
				'x', MoreOres.ingotGreen);

		GameRegistry.addRecipe(new ItemStack(MoreOres.blueDoorItem),
				"xx",
				"xx",
				"xx",
				'x', MoreOres.ingotBlue);
		
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowDoorItem),
				"xx",
				"xx",
				"xx",
				'x', MoreOres.ingotRainbow);


		//crushed items to ingots
		//crushed iron to ingot
		GameRegistry.addRecipe(new ItemStack(Item.ingotIron),
				"xx",
				'x', new ItemStack(MoreOres.crushedItems, 1, 0));

		//crushed gold to ingot
		GameRegistry.addRecipe(new ItemStack(Item.ingotGold),
				"xx",
				'x', new ItemStack(MoreOres.crushedItems, 1, 1));

		//crushed diamond to diamond
		GameRegistry.addRecipe(new ItemStack(Item.diamond),
				"xx",
				'x', new ItemStack(MoreOres.crushedItems, 1, 2));

		//crushed emerlad to emerlad
		GameRegistry.addRecipe(new ItemStack(Item.emerald),
				"xx",
				'x', new ItemStack(MoreOres.crushedItems, 1, 3));

		//crushed origum to ingot
		GameRegistry.addRecipe(new ItemStack(MoreOres.ingotOrange),
				"xx",
				'x', new ItemStack(MoreOres.crushedItems, 1, 4));

		//crushed yagniss to ingot
		GameRegistry.addRecipe(new ItemStack(MoreOres.ingotYellow),
				"xx",
				'x', new ItemStack(MoreOres.crushedItems, 1, 5));

		//crushed grenium to ingot
		GameRegistry.addRecipe(new ItemStack(MoreOres.ingotGreen),
				"xx",
				'x', new ItemStack(MoreOres.crushedItems, 1, 6));

		//crushed blosper to ingot
		GameRegistry.addRecipe(new ItemStack(MoreOres.ingotBlue),
				"xx",
				'x', new ItemStack(MoreOres.crushedItems, 1, 7));


		//wood fence and Fencegates
		//orange fence
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeWoodFence, 2),
				"yyy",
				"xxx",
				'x', Item.stick, 'y', MoreOres.orangePlanks);

		//orange fence gate
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeWoodFencegate),
				"xyx",
				"xyx",
				'x', Item.stick, 'y', MoreOres.orangePlanks);

		//lemon fence
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowWoodFence, 2),
				"yyy",
				"xxx",
				'x', Item.stick, 'y', MoreOres.yellowPlanks);

		//lemon fence gate
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowWoodFencegate),
				"xyx",
				"xyx",
				'x', Item.stick, 'y', MoreOres.yellowPlanks);

		//green apple fence
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenWoodFence, 2),
				"yyy",
				"xxx",
				'x', Item.stick, 'y', MoreOres.greenPlanks);

		//green apple fence gate
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenWoodFencegate),
				"xyx",
				"xyx",
				'x', Item.stick, 'y', MoreOres.greenPlanks);

		//blueberry fence
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueWoodFence, 2),
				"yyy",
				"xxx",
				'x', Item.stick, 'y', MoreOres.bluePlanks);

		//blueberry fence gate
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueWoodFencegate),
				"xyx",
				"xyx",
				'x', Item.stick, 'y', MoreOres.bluePlanks);
		
		//rainbow fence
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowWoodFence, 2),
				"yyy",
				"xxx",
				'x', Item.stick, 'y', MoreOres.rainbowPlanks);

		//superfruit fence gate
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowWoodFencegate),
				"xyx",
				"xyx",
				'x', Item.stick, 'y', MoreOres.rainbowPlanks);



		//slabs
		//origum slabs
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeSingleSlab, 6, 0),
				"xxx",
				'x', MoreOres.orangeBlock);

		//orange planks slabs
		GameRegistry.addRecipe(new ItemStack(MoreOres.orangeSingleSlab, 6, 1),
				"xxx",
				'x', MoreOres.orangePlanks);

		//yagniss slabs
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowSingleSlab, 6, 0),
				"xxx",
				'x', MoreOres.yellowBlock);

		//lemon planks slabs
		GameRegistry.addRecipe(new ItemStack(MoreOres.yellowSingleSlab, 6, 1),
				"xxx",
				'x', MoreOres.yellowPlanks);

		//grenium slabs
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenSingleSlab, 6, 0),
				"xxx",
				'x', MoreOres.greenBlock);

		//green apple planks slabs
		GameRegistry.addRecipe(new ItemStack(MoreOres.greenSingleSlab, 6, 1),
				"xxx",
				'x', MoreOres.greenPlanks);

		//blosper slabs
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueSingleSlab, 6, 0),
				"xxx",
				'x', MoreOres.blueBlock);

		//blueberry planks slabs
		GameRegistry.addRecipe(new ItemStack(MoreOres.blueSingleSlab, 6, 1),
				"xxx",
				'x', MoreOres.bluePlanks);
		
		//rainbow slabs
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowSingleSlab, 6, 0),
				"xxx",
				'x', MoreOres.rainbowBlock);
		
		//superfruit planks slabs
		GameRegistry.addRecipe(new ItemStack(MoreOres.rainbowSingleSlab, 6, 1),
				"xxx",
				'x', MoreOres.rainbowPlanks);


		/*
		 * 
		 */


		//Kalfur Recipes

		/*
		 * Kalfur Armour Recipes
		 */

		//Kalfur Helmet
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleHelmet), 
				"xxx", 
				"x x",
				'x', MoreOres.ingotPurple);

		//Kalfur Chestplate
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleChestplate), 
				"x x", 
				"xxx", 
				"xxx",
				'x', MoreOres.ingotPurple);

		//Kalfur Pants
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleLeggings), 
				"xxx", 
				"x x", 
				"x x",
				'x', MoreOres.ingotPurple);

		//Kalfur Boots
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleBoots), 
				"x x", 
				"x x",
				'x', MoreOres.ingotPurple);

		/*
		 * Kalfur Tool set
		 */

		//Kalfur Sword
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleSword),
				"x",
				"x",
				"y",
				'x', MoreOres.ingotPurple, 'y',MoreOres.ironRod);


		//Kalfur Pickaxe
		GameRegistry.addRecipe(new ItemStack(MoreOres.purplePickaxe),
				"xxx",
				" y ",
				" y ",
				'x', MoreOres.ingotPurple, 'y',MoreOres.ironRod);


		//Kalfur Axe
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleAxe),
				"xx ",
				"xy ",
				" y ",
				'x', MoreOres.ingotPurple, 'y',MoreOres.ironRod);


		//Kalfur Shovel
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleShovel),
				"x",
				"y",
				"y",
				'x', MoreOres.ingotPurple, 'y',MoreOres.ironRod);


		//Kalfur Hoe
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleHoe),
				"xx ",
				" y ",
				" y ",
				'x', MoreOres.ingotPurple, 'y',MoreOres.ironRod);

		//Kalfur Paxcel
		GameRegistry.addRecipe(new ItemStack(MoreOres.purplePaxcel),
				"xzq",
				"wyc",
				" y ",
				'x', MoreOres.purpleAxe, 'y', MoreOres.ironRod, 'z', MoreOres.purplePickaxe, 'q', MoreOres.purpleShovel, 'w', MoreOres.purpleSword, 'c', MoreOres.purpleHoe);

		//Kalfur staff
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleStaff),
				"yxd",
				"zqz",
				" q ",
				'x', MoreOres.ingotPurple, 'y', Item.coal, 'd', Item.bone, 'z', MoreOres.purpleNugget, 'q', MoreOres.ironRod);
		
		//Kalfur ingots to Kalfur block
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleBlock),
				"xxx",
				"xxx",
				"xxx",
				'x', MoreOres.ingotPurple);

		//Kalfur block to Kalfur ingots
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.ingotPurple, 9), new ItemStack(MoreOres.purpleBlock));

		//Kalfur ladder
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleLadder),
				"x x",
				"xxx",
				"x x",
				'x', MoreOres.ingotPurple);

		//Kalfur fence
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleFence, 2),
				"xxx",
				"xxx",
				'x', MoreOres.ingotPurple);

		//Kalfur fence gate
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleFencegate),
				"xyx",
				"xyx",
				'x', MoreOres.ingotPurple, 'y', MoreOres.purpleBlock);

		//Kalfur nuggets to Kalfur ingot
		GameRegistry.addRecipe(new ItemStack(MoreOres.ingotPurple), 
				"xxx",
				"xxx",
				"xxx",
				'x', MoreOres.purpleNugget);

		//Kalfur bucket
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleBucketEmpty),
				"x x",
				" x ",
				'x', MoreOres.ingotPurple);

		//Kalfur torch
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleTorch),
				"x",
				"y",
				'x', MoreOres.purpleFuel, 'y', MoreOres.ironRod);

		//Kalfur stairs
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleStairs, 4),
				"  x",
				" xx",
				"xxx",
				'x', MoreOres.ingotPurple);

		//purple glass
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleGlass, 4),
				"xxx",
				"xyx",
				"xxx",
				'x', MoreOres.purpleNugget, 'y', Block.glass);

		//Kalfur fuel
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleFuel, 2),
				" x ",
				"xyx",
				" x ",
				'x', MoreOres.purpleNugget, 'y', Item.coal);

		//Kalfur Seeds
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleSeeds),
				"yxy",
				" z ",
				"yxy",
				'x', MoreOres.ingotPurple, 'y', MoreOres.purpleNugget,'z', Item.seeds);

		//Kalfur Seeds alternative
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleSeeds),
				"y y",
				"xzx",
				"y y",
				'x', MoreOres.ingotPurple, 'y', MoreOres.purpleNugget, 'z', Item.seeds);

		//Kalfur molded chunklet to Kalfur nugget
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleNugget),
				" x ",
				"xxx",
				" x ",
				'x', MoreOres.purpleChunkletMolded);

		//walls
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleWalls, 6),
				"xxx",
				"xxx",
				'x', MoreOres.purpleBlock);

		//trapdoor
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleTrapdoor, 4),
				"xxx",
				"xxx",
				'x', MoreOres.purpleBlock);

		//furnace
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleFurnaceIdle),
				"x x",
				" y ",
				"x x",
				'x', MoreOres.purpleBlock, 'y', Block.furnaceIdle);
		
		//pressure plate
		GameRegistry.addRecipe(new ItemStack(MoreOres.purplePressurePlate),
				"xx",
				'x', MoreOres.purpleBlock);
		
		//purple arrow
		GameRegistry.addRecipe(new ItemStack(MoreOres.purpleArrow, 5), 
				"z", 
				"x",
				"y",
				'x', Item.stick, 'y', Item.feather, 'z', Block.netherStalk);

		//Kalfur ingot to Kalfur nugget
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.purpleNugget, 9), new ItemStack(MoreOres.ingotPurple));

		//Kalfur Ore smelts to Kalfur ingot
		GameRegistry.addSmelting(MoreOres.purpleOre.blockID, new ItemStack(MoreOres.ingotPurple), 1F);

		//Kalfur chunklet smelts to Kalfur chunklet molded
		GameRegistry.addSmelting(MoreOres.purpleChunklet.itemID, new ItemStack(MoreOres.purpleChunkletMolded), 0.5F);
		
		
		/*
		 * 
		 */


		//enoudra Recipes

		/*
		 * enoudra Armour Recipes
		 */

		//enoudra Helmet
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackHelmet), 
				"xxx", 
				"x x",
				'x', MoreOres.ingotBlack);

		//enoudra Chestplate
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackChestplate), 
				"x x", 
				"xxx", 
				"xxx",
				'x', MoreOres.ingotBlack);

		//enoudra Pants
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackLeggings), 
				"xxx", 
				"x x", 
				"x x",
				'x', MoreOres.ingotBlack);

		//enoudra Boots
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackBoots), 
				"x x", 
				"x x",
				'x', MoreOres.ingotBlack);


		/*
		 * enoudra Tool set
		 */

		//enoudra Sword
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackSword),
				"x",
				"x",
				"y",
				'x', MoreOres.ingotBlack, 'y',MoreOres.ironRod);


		//enoudra Pickaxe
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackPickaxe),
				"xxx",
				" y ",
				" y ",
				'x', MoreOres.ingotBlack, 'y',MoreOres.ironRod);


		//enoudra Axe
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackAxe),
				"xx ",
				"xy ",
				" y ",
				'x', MoreOres.ingotBlack, 'y',MoreOres.ironRod);


		//enoudra Shovel
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackShovel),
				"x",
				"y",
				"y",
				'x', MoreOres.ingotBlack, 'y',MoreOres.ironRod);


		//enoudra Hoe
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackHoe),
				"xx ",
				" y ",
				" y ",
				'x', MoreOres.ingotBlack, 'y',MoreOres.ironRod);

		//enoudra Paxcel
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackPaxcel),
				"xzq",
				"wyc",
				" y ",
				'x', MoreOres.blackAxe, 'y', MoreOres.ironRod, 'z', MoreOres.blackPickaxe, 'q', MoreOres.blackShovel, 'w', MoreOres.blackSword, 'c', MoreOres.blackHoe);

		//enoudra staff
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackStaff),
				"yxy",
				"zqz",
				" q ",
				'x', MoreOres.ingotBlack, 'y', Item.enderPearl, 'z', MoreOres.blackNugget, 'q', MoreOres.ironRod);
		
		//enoudra ingots to enoudra block
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackBlock),
				"xxx",
				"xxx",
				"xxx",
				'x', MoreOres.ingotBlack);

		//enoudra block to enoudra ingots
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.ingotBlack, 9), new ItemStack(MoreOres.blackBlock));

		//enoudra ladder
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackLadder),
				"x x",
				"xxx",
				"x x",
				'x', MoreOres.ingotBlack);

		//enoudra fence
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackFence, 2),
				"xxx",
				"xxx",
				'x', MoreOres.ingotBlack);

		//enoudra fence gate
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackFencegate),
				"xyx",
				"xyx",
				'x', MoreOres.ingotBlack, 'y', MoreOres.blackBlock);

		//enoudra nuggets to enoudra ingot
		GameRegistry.addRecipe(new ItemStack(MoreOres.ingotBlack), 
				"xxx",
				"xxx",
				"xxx",
				'x', MoreOres.blackNugget);

		//enoudra bucket
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackBucketEmpty),
				"x x",
				" x ",
				'x', MoreOres.ingotBlack);

		//enoudra torch
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackTorch),
				"x",
				"y",
				'x', MoreOres.blackFuel, 'y', MoreOres.ironRod);

		//enoudra stairs
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackStairs, 4),
				"  x",
				" xx",
				"xxx",
				'x', MoreOres.ingotBlack);

		//black glass
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackGlass, 4),
				"xxx",
				"xyx",
				"xxx",
				'x', MoreOres.blackNugget, 'y', Block.glass);

		//enoudra fuel
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackFuel, 2),
				" x ",
				"xyx",
				" x ",
				'x', MoreOres.blackNugget, 'y', Item.coal);

		//walls
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackWalls, 6),
				"xxx",
				"xxx",
				'x', MoreOres.blackBlock);

		//trapdoor
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackTrapdoor, 4),
				"xxx",
				"xxx",
				'x', MoreOres.blackBlock);

		//furnace
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackFurnaceIdle),
				"x x",
				" y ",
				"x x",
				'x', MoreOres.blackBlock, 'y', Block.furnaceIdle);
		
		//pressure plate
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackPressurePlate),
				"xx",
				'x', MoreOres.blackBlock);
		
		//black arrow
		GameRegistry.addRecipe(new ItemStack(MoreOres.blackArrow, 5), 
				"z", 
				"x",
				"y",
				'x', Item.stick, 'y', Item.feather, 'z', Item.enderPearl);

		//enoudra ingot to enoudra nugget
		GameRegistry.addShapelessRecipe(new ItemStack(MoreOres.blackNugget, 9), new ItemStack(MoreOres.ingotBlack));

		//enoudra Ore smelts to enoudra ingot
		GameRegistry.addSmelting(MoreOres.blackOre.blockID, new ItemStack(MoreOres.ingotBlack), 1F);

	}

}
