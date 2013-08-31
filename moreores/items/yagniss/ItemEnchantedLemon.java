package moreores.items.yagniss;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemEnchantedLemon extends ItemFood{

	public ItemEnchantedLemon(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
		this.setAlwaysEdible();
	}

	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		itemIcon = iconRegister.registerIcon("moreores:lemon");
	}
	
	public void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par3EntityPlayer.addPotionEffect((new PotionEffect(Potion.regeneration.getId(), 3500, 0)));
        par3EntityPlayer.addPotionEffect((new PotionEffect(Potion.resistance.getId(), 3500, 0)));
        par3EntityPlayer.addPotionEffect((new PotionEffect(Potion.fireResistance.getId(), 3500, 0)));
    }
	
}
