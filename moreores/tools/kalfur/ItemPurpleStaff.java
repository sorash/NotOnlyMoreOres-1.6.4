package moreores.tools.kalfur;

import moreores.MoreOres;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemPurpleStaff extends ItemSword{

	public ItemPurpleStaff(int par1) {
		super(par1, MoreOres.toolPurple);
		setMaxDamage(150);
	}

	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("moreores:purpleStaff");
	}
	
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}
	
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.rare;
	}
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
		if(itemstack.getItemDamage() == 0){    
			itemstack.damageItem(10, entityplayer);
			if (!world.isRemote) {
				Vec3 look = entityplayer.getLookVec();
				EntityWitherSkull skull = new EntityWitherSkull(world, entityplayer, 1, 1, 1);
				skull.setPosition(
						entityplayer.posX + look.xCoord,
						entityplayer.posY + look.yCoord + 1,
						entityplayer.posZ + look.zCoord);
				skull.accelerationX = look.xCoord * 0.1;
				skull.accelerationY = look.yCoord * 0.1;
				skull.accelerationZ = look.zCoord * 0.1;
	            world.spawnEntityInWorld(skull);
	            world.playSoundEffect(entityplayer.posX, entityplayer.posY, entityplayer.posZ, "mob.wither.idle", 1.0F, 1.0F);
			}
			itemstack.setItemDamage(149);
		}
		return itemstack;
	}
	
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
    {
            if(itemstack.getItemDamage() > 0)
            {
                    itemstack.damageItem(-1, (EntityLivingBase)entity);
            }
    }

	
}
