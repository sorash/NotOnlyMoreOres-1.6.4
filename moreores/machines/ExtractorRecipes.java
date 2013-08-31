package moreores.machines;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import moreores.MoreOres;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class ExtractorRecipes
{
    private static final ExtractorRecipes extractingBase = new ExtractorRecipes();

    /** The list of Extracting results. */
    private Map extractingList = new HashMap();
    private Map experienceList = new HashMap();
    private HashMap<List<Integer>, ItemStack> metaExtractingList = new HashMap<List<Integer>, ItemStack>();
    private HashMap<List<Integer>, Float> metaExperience = new HashMap<List<Integer>, Float>();

    /**
     * Used to call methods addExtracting and getExtractingResult.
     */
    public static final ExtractorRecipes extracting()
    {
        return extractingBase;
    }

    private ExtractorRecipes()
    {
    	this.addExtracting(Block.wood.blockID, new ItemStack(MoreOres.rubber, 2), 0.4F);
    	this.addExtracting(MoreOres.orangeLog.blockID, new ItemStack(MoreOres.rubber, 2), 0.4F);
    	this.addExtracting(MoreOres.yellowLog.blockID, new ItemStack(MoreOres.rubber, 2), 0.4F);
    	this.addExtracting(MoreOres.greenLog.blockID, new ItemStack(MoreOres.rubber, 3), 0.45F);
    	this.addExtracting(MoreOres.blueLog.blockID, new ItemStack(MoreOres.rubber, 3), 0.45F);
    }

    /**
     * Adds a Extracting recipe.
     */
    public void addExtracting(int par1, ItemStack par2ItemStack, float par3)
    {
        this.extractingList.put(Integer.valueOf(par1), par2ItemStack);
        this.experienceList.put(Integer.valueOf(par2ItemStack.itemID), Float.valueOf(par3));
    }

    /**
     * Returns the Extracting result of an item.
     * Deprecated in favor of a metadata sensitive version
     */
    @Deprecated
    public ItemStack getExtractingResult(int par1)
    {
        return (ItemStack)this.extractingList.get(Integer.valueOf(par1));
    }

    public Map getExtractingList()
    {
        return this.extractingList;
    }

    @Deprecated //In favor of ItemStack sensitive version
    public float getExperience(int par1)
    {
        return this.experienceList.containsKey(Integer.valueOf(par1)) ? ((Float)this.experienceList.get(Integer.valueOf(par1))).floatValue() : 0.0F;
    }

    /**
     * A metadata sensitive version of adding a furnace recipe.
     */
    public void addExtracting(int itemID, int metadata, ItemStack itemstack, float experience)
    {
        metaExtractingList.put(Arrays.asList(itemID, metadata), itemstack);
        metaExperience.put(Arrays.asList(itemstack.itemID, itemstack.getItemDamage()), experience);
    }

    /**
     * Used to get the resulting ItemStack form a source ItemStack
     * @param item The Source ItemStack
     * @return The result ItemStack
     */
    public ItemStack getExtractingResult(ItemStack item) 
    {
        if (item == null)
        {
            return null;
        }
        ItemStack ret = (ItemStack)metaExtractingList.get(Arrays.asList(item.itemID, item.getItemDamage()));
        if (ret != null) 
        {
            return ret;
        }
        return (ItemStack)extractingList.get(Integer.valueOf(item.itemID));
    }

    /**
     * Grabs the amount of base experience for this item to give when pulled from the furnace slot.
     */
    public float getExperience(ItemStack item)
    {
        if (item == null || item.getItem() == null)
        {
            return 0;
        }
        float ret = item.getItem().getSmeltingExperience(item);
        if (ret < 0 && metaExperience.containsKey(Arrays.asList(item.itemID, item.getItemDamage())))
        {
            ret = metaExperience.get(Arrays.asList(item.itemID, item.getItemDamage()));
        }
        if (ret < 0 && experienceList.containsKey(item.itemID))
        {
            ret = ((Float)experienceList.get(item.itemID)).floatValue();
        }
        return (ret < 0 ? 0 : ret);
    }

    public Map<List<Integer>, ItemStack> getMetaExtractingList()
    {
        return metaExtractingList;
    }
}
