package moreores.creativetabs;

import moreores.MoreOres;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RainbowTab extends CreativeTabs {

	public RainbowTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	
	public int getTabIconItemIndex(){
		return MoreOres.rainbowPaxcel.itemID;
	}
	
	public String getTranslatedTabLabel(){
		return "\u00A7cS\u00A76k\u00A7eo\u00A7ar\u00A7bp\u00A79i\u00A75o\u00A7c'\u00A76s \u00A7cR\u00A76a\u00A7ei\u00A7an\u00A7bb\u00A79o\u00A75w";
	}
	
}
