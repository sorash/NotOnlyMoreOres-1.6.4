package moreores;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class CraftingHandlerMoreOres implements ICraftingHandler{

	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {
		//comfortability achievement
		if(item.itemID == MoreOres.orangePaxcel.itemID){
			player.addStat(MoreOres.comfortability, 1);
		}

		if(item.itemID == MoreOres.yellowPaxcel.itemID){
			player.addStat(MoreOres.comfortability, 1);
		}

		if(item.itemID == MoreOres.greenPaxcel.itemID){
			player.addStat(MoreOres.comfortability, 1);
		}

		if(item.itemID == MoreOres.bluePaxcel.itemID){
			player.addStat(MoreOres.comfortability, 1);
		}
	}

	public void onSmelting(EntityPlayer player, ItemStack item) {
		//going green achievement
		if(item.itemID == MoreOres.ingotGreen.itemID){
			player.addStat(MoreOres.goingGreen, 1);
		}

		//discovery achievement
		if(item.itemID == MoreOres.ingotOrange.itemID){
			player.addStat(MoreOres.discovery, 1);
		}
	}

}
