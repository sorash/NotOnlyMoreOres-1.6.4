package moreores.creativetabs;

import moreores.MoreOres;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlackTab extends CreativeTabs {

	public BlackTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	
	public int getTabIconItemIndex(){
		return MoreOres.blackPaxcel.itemID;
	}
	
	public String getTranslatedTabLabel(){
		return "\u00A78Skorpio's Enoudra";
	}
	
}
