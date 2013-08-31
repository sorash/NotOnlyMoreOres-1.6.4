package moreores.blocks.enoudra;

import java.util.List;
import java.util.Random;

import moreores.MoreOres;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBlackSlab extends BlockHalfSlab
{
    /** The type of tree this slab came from. */
    public static final String[] types = new String[] {"blackSlab"};
    
    public BlockBlackSlab(int par1, boolean par2)
    {
        super(par1, par2, Material.iron);
    }

    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2)
    {
        int k = par2 & 1;

        if (this.isDoubleSlab && (par2 & 1) != 0)
        {
            par1 = 1;
        }

        return par1 != 1 && par1 != 0 ? this.blockIcon : this.blockIcon;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return MoreOres.blackSingleSlab.blockID;
    }

    /**
     * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
     * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
     */
    protected ItemStack createStackedBlock(int par1)
    {
        return new ItemStack(MoreOres.blackSingleSlab.blockID, 2, par1 & 7);
    }

    /**
     * Returns the slab block name with step type.
     */
    public String getFullSlabName(int par1)
    {
             if ((par1 < 0) || (par1 >= types.length))
             {
             par1 = 0;
             }

             return super.getUnlocalizedName() + "." + types[par1];
    }
    
    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon("moreores:blackBlock");
    }
    
    private static boolean isBlockSingleSlab(int par0)
    {
        return par0 == MoreOres.blackSingleSlab.blockID;
    }
    
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return isBlockSingleSlab(this.blockID) ? this.blockID : (this.blockID == MoreOres.blackDoubleSlab.blockID ? MoreOres.blackSingleSlab.blockID : (this.blockID == MoreOres.blackDoubleSlab.blockID ? MoreOres.blackSingleSlab.blockID : MoreOres.blackSingleSlab.blockID));
    }
}
