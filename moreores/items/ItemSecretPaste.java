package moreores.items;

import moreores.MoreOres;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSecretPaste extends Item{

	public ItemSecretPaste(int par1) {
		super(par1);
		setMaxDamage(3);
	}

	public void registerIcons(IconRegister iconRegister){
		itemIcon = iconRegister.registerIcon("moreores:secretPaste");
	}

	//turn blocks right clicked to xray block
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	{
		if(!par3World.isRemote)
		{
			par3World.setBlock(par4, par5, par6, MoreOres.xrayBlock.blockID);
			return true;

		}
		else
			return false;
	}

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if (!par3EntityPlayer.capabilities.isCreativeMode) {
			par1ItemStack.damageItem(getMaxDamage() -2, par3EntityPlayer);
		}

		return par1ItemStack;
	}
}
