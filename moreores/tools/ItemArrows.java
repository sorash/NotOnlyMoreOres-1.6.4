package moreores.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

public class ItemArrows extends Item{
	
	public ItemArrows(int par1) {
		super(par1);
		this.maxStackSize = 64;
	}

	public void registerIcons(IconRegister par1IconRegister)
	{
		if(this.field_111218_cA == "orangeArrow"){
			itemIcon = par1IconRegister.registerIcon("moreores:orangeArrow");
		}
		
		if(this.field_111218_cA == "yellowArrow"){
			itemIcon = par1IconRegister.registerIcon("moreores:yellowArrow");
		}
		
		if(this.field_111218_cA == "greenArrow"){
			itemIcon = par1IconRegister.registerIcon("moreores:greenArrow");
		}
		
		if(this.field_111218_cA == "blueArrow"){
			itemIcon = par1IconRegister.registerIcon("moreores:blueArrow");
		}
		
		if(this.field_111218_cA == "purpleArrow"){
			itemIcon = par1IconRegister.registerIcon("moreores:purpleArrow");
		}
		
		if(this.field_111218_cA == "blackArrow"){
			itemIcon = par1IconRegister.registerIcon("moreores:blackArrow");
		}
	}
}
