package moreores.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;

public class ItemGeneralCrushedItems extends Item{

	public static final String[] crushedItemNames = new String[] {"crushedIron", "crushedGold", "crushedDiamond", "crushedEmerald", "crushedOrigum", "crushedYagniss", "crushedGrenium", "crushedBlosper", "crushedKalfur", "crushedEnoudra"};
	public static final String[] textureFiles = new String[] {"moreores:crushedIron", "moreores:crushedGold", "moreores:crushedDiamond", "moreores:crushedEmerald", "moreores:crushedOrigum", "moreores:crushedYagniss", "moreores:crushedGrenium", "moreores:crushedBlosper", "moreores:crushedKalfur", "moreores:crushedEnoudra"};
    private Icon[] textures;
	
    
	public ItemGeneralCrushedItems(int par1) {
		super(par1);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
	}

	public Icon getIconFromDamage(int par1)
	{
		int j = MathHelper.clamp_int(par1, 0, 10);
		return this.textures[j];
	}
	
	public String getItemDisplayName(ItemStack is)
	{
		switch (is.getItemDamage())
		{
			case 0: return "Crushed Iron";
			case 1: return "Crushed Gold";
			case 2: return "Crushed Diamond";
			case 3: return "Crushed Emerald";
			case 4: return "Crushed Origum";
			case 5: return "Crushed Yagniss";
			case 6: return "Crushed Grenium";
			case 7: return "Crushed Blosper";
			case 8: return "Crushed Kalfur";
			case 9: return "Crushed Enoudra";
		}
		return "Unknown";
	}
    
    public int getMetaData(int par1){
    	return par1;
    }
	
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
    	for (int j = 0; j < 10; ++j)
    	{
    		par3List.add(new ItemStack(par1, 1, j));
    	}
    }
    
    public void registerIcons(IconRegister par1IconRegister)
    {
             this.textures = new Icon[textureFiles.length];
            
             for (int i = 0; i < textureFiles.length; ++i)
             {
                     this.textures[i] = par1IconRegister.registerIcon(textureFiles[i]);
             }
    }
}
