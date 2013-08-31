package moreores.creativetabs;

import moreores.MoreOres;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class YellowTab extends CreativeTabs {

	public YellowTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	
	public int getTabIconItemIndex(){
		return MoreOres.yellowPaxcel.itemID;
	}
	
	public String getTranslatedTabLabel(){
		return "\u00A7eSkorpio's Yagniss";
	}
	
}
