package moreores.machines;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import moreores.MoreOres;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CrusherRecipes
{
    private static final CrusherRecipes crushingBase = new CrusherRecipes();

    /** The list of crushing results. */
    private Map crushingList = new HashMap();
    private Map experienceList = new HashMap();
    private HashMap<List<Integer>, ItemStack> metaCrushingList = new HashMap<List<Integer>, ItemStack>();
    private HashMap<List<Integer>, Float> metaExperience = new HashMap<List<Integer>, Float>();

    /**
     * Used to call methods addcrushing and getcrushingResult.
     */
    public static final CrusherRecipes crushing()
    {
        return crushingBase;
    }

    private CrusherRecipes()
    {
    	this.addCrushing(Item.ingotIron.itemID, new ItemStack(MoreOres.crushedItems, 3, 0), 0.7F);
        this.addCrushing(Item.ingotGold.itemID, new ItemStack(MoreOres.crushedItems, 3, 1), 0.7F); 
        this.addCrushing(Item.diamond.itemID, new ItemStack(MoreOres.crushedItems, 3, 2), 0.7F);
        this.addCrushing(Item.emerald.itemID, new ItemStack(MoreOres.crushedItems, 3, 3), 0.7F);
        this.addCrushing(MoreOres.ingotOrange.itemID, new ItemStack(MoreOres.crushedItems, 3, 4), 0.7F);
        this.addCrushing(MoreOres.ingotYellow.itemID, new ItemStack(MoreOres.crushedItems, 3, 5), 0.7F);
        this.addCrushing(MoreOres.ingotGreen.itemID, new ItemStack(MoreOres.crushedItems, 3, 6), 0.7F);
        this.addCrushing(MoreOres.ingotBlue.itemID, new ItemStack(MoreOres.crushedItems, 3, 7), 0.7F);
        this.addCrushing(MoreOres.ingotPurple.itemID, new ItemStack(MoreOres.crushedItems, 3, 8), 0.7F);
        this.addCrushing(MoreOres.ingotBlack.itemID, new ItemStack(MoreOres.crushedItems, 3, 9), 0.7F);
    }

    /**
     * Adds a crushing recipe.
     */
    public void addCrushing(int par1, ItemStack par2ItemStack, float par3)
    {
        this.crushingList.put(Integer.valueOf(par1), par2ItemStack);
        this.experienceList.put(Integer.valueOf(par2ItemStack.itemID), Float.valueOf(par3));
    }

    /**
     * Returns the crushing result of an item.
     * Deprecated in favor of a metadata sensitive version
     */
    @Deprecated
    public ItemStack getcrushingResult(int par1)
    {
        return (ItemStack)this.crushingList.get(Integer.valueOf(par1));
    }

    public Map getcrushingList()
    {
        return this.crushingList;
    }

    @Deprecated //In favor of ItemStack sensitive version
    public float getExperience(int par1)
    {
        return this.experienceList.containsKey(Integer.valueOf(par1)) ? ((Float)this.experienceList.get(Integer.valueOf(par1))).floatValue() : 0.0F;
    }

    /**
     * A metadata sensitive version of adding a furnace recipe.
     */
    public void addcrushing(int itemID, int metadata, ItemStack itemstack, float experience)
    {
        metaCrushingList.put(Arrays.asList(itemID, metadata), itemstack);
        metaExperience.put(Arrays.asList(itemstack.itemID, itemstack.getItemDamage()), experience);
    }

    /**
     * Used to get the resulting ItemStack form a source ItemStack
     * @param item The Source ItemStack
     * @return The result ItemStack
     */
    public ItemStack getCrushingResult(ItemStack item) 
    {
        if (item == null)
        {
            return null;
        }
        ItemStack ret = (ItemStack)metaCrushingList.get(Arrays.asList(item.itemID, item.getItemDamage()));
        if (ret != null) 
        {
            return ret;
        }
        return (ItemStack)crushingList.get(Integer.valueOf(item.itemID));
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

    public Map<List<Integer>, ItemStack> getMetacrushingList()
    {
        return metaCrushingList;
    }
}
