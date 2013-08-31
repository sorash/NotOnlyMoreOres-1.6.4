package moreores.creativetabs;

import moreores.MoreOres;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlueTab extends CreativeTabs {

	public BlueTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	
	public int getTabIconItemIndex(){
		return MoreOres.bluePaxcel.itemID;
	}
	
	public String getTranslatedTabLabel(){
		return "\u00A79Skorpio's Blosper";
	}
	
}
