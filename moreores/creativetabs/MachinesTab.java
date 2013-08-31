package moreores.creativetabs;

import moreores.MoreOres;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MachinesTab extends CreativeTabs {

	public MachinesTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	
	public int getTabIconItemIndex(){
		return MoreOres.crusherIdle.blockID;
	}
	
	public String getTranslatedTabLabel(){
		return "Skorpio's Machinery";
	}
	
}
