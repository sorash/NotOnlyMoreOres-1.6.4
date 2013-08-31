package moreores.dimension;

import java.util.Random;

import moreores.MoreOres;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRainbowOre extends Block{

    @SideOnly(Side.CLIENT)
    public static Icon[] theIcon;
	
	public BlockRainbowOre(int id, Material mat){
		super(id, mat);
	}

    public Icon getIcon(int par1, int par2)
    {
        return this.theIcon[0];
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
    	this.theIcon = new Icon[] {par1IconRegister.registerIcon("moreores:rainbowOre"), par1IconRegister.registerIcon("moreores:rainbowOre")};
    }
    
    @SideOnly(Side.CLIENT)
    public static Icon func_94424_b(String par0Str)
    {
        return MoreOres.rainbowOre.getUnlocalizedName() == "rainbowOre" ? BlockRainbowOre.theIcon[0] : (par0Str == "rainbowOre" ? BlockRainbowOre.theIcon[0] : (par0Str == "rainbowOre" ? BlockRainbowOre.theIcon[0] : (par0Str == "rainbowOre" ? BlockRainbowOre.theIcon[0] : null)));
    }
	
	public int idDropped(int par1, Random rand, int par2){
		return this.blockID;
	}
	
	public int quantityDropped(){
		return 1;
	}
}
