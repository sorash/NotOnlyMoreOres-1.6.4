package moreores;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandlerMoreOres implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		int var1 = fuel.itemID;
		
		if(var1 == MoreOres.orangeFuel.itemID){
			return 1000;
		}
		else if(var1 == MoreOres.yellowFuel.itemID){
			return 2000;
		}
		else if(var1 == MoreOres.greenFuel.itemID){
			return 3000;
		}
		else if(var1 == MoreOres.blueFuel.itemID){
			return 4000;
		}
		else if(var1 == MoreOres.rainbowFuel.itemID){
			return 5000;
		}
		else if(var1 == MoreOres.purpleFuel.itemID){
			return 4500;
		}
		else if(var1 == MoreOres.blackFuel.itemID){
			return 4750;
		}
		else if(var1 == MoreOres.greenBucketLava.itemID){
			return 20000;
		}
		else if(var1 == MoreOres.blueBucketLava.itemID){
			return 20000;
		}
		else if(var1 == MoreOres.rainbowBucketLava.itemID){
			return 20000;
		}
		else if(var1 == MoreOres.purpleBucketLava.itemID){
			return 20000;
		}
		else if(var1 == MoreOres.blackBucketLava.itemID){
			return 20000;
		}
		else if(var1 == Block.furnaceIdle.blockID){
			return 20000;
		}
		else{
			return 0;
		}
	}

}
