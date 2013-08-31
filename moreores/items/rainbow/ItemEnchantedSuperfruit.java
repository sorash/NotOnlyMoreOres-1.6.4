package moreores.items.rainbow;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEnchantedSuperfruit extends ItemFood{

	public ItemEnchantedSuperfruit(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
		this.setAlwaysEdible();
	}

	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		itemIcon = iconRegister.registerIcon("moreores:superfruit");
	}
	
	public void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par3EntityPlayer.addPotionEffect((new PotionEffect(Potion.regeneration.getId(), 9000, 3)));
        par3EntityPlayer.addPotionEffect((new PotionEffect(Potion.resistance.getId(), 9000, 2)));
        par3EntityPlayer.addPotionEffect((new PotionEffect(Potion.fireResistance.getId(), 9000, 2)));
    }

}
