package moreores.creativetabs;

import moreores.MoreOres;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class OrangeTab extends CreativeTabs {

	public OrangeTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	
	public int getTabIconItemIndex(){
		return MoreOres.orangePaxcel.itemID;
	}
	
	public String getTranslatedTabLabel(){
		return "\u00A76Skorpio's Origum";
	}
	
}
