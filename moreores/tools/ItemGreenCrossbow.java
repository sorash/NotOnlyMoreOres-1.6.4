package moreores.tools;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.relauncher.Side;
import moreores.MoreOres;
import moreores.PacketHandlerMoreOres;
import moreores.entity.projectile.EntityBlackArrow;
import moreores.entity.projectile.EntityBlueArrow;
import moreores.entity.projectile.EntityGreenArrow;
import moreores.entity.projectile.EntityOrangeArrow;
import moreores.entity.projectile.EntityPurpleArrow;
import moreores.entity.projectile.EntityYellowArrow;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class ItemGreenCrossbow extends Item
{
	private static PacketHandlerMoreOres packet;

	private static boolean flag1 = false;
	private static boolean flag2 = true;

	private static boolean flag3 = false;
	private static boolean flag4 = true;

	public boolean isReloading = false;

	private EntityPlayer entityPlayer;

	public ItemGreenCrossbow(int par1)
	{
		super(par1);
		this.maxStackSize = 1;
		this.setMaxDamage(50);
	}

	/**
	 * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
	 */
	public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
	{
		if(par1ItemStack.getItemDamage() == 0){
			int j = this.getMaxItemUseDuration(par1ItemStack) - par4;

			ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, j);
			MinecraftForge.EVENT_BUS.post(event);
			if (event.isCanceled())
			{
				return;
			}
			j = event.charge;

			boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

			if (flag || par3EntityPlayer.inventory.hasItem(MoreOres.orangeArrow.itemID) || par3EntityPlayer.inventory.hasItem(MoreOres.yellowArrow.itemID) || par3EntityPlayer.inventory.hasItem(MoreOres.greenArrow.itemID) || par3EntityPlayer.inventory.hasItem(MoreOres.blueArrow.itemID) || par3EntityPlayer.inventory.hasItem(MoreOres.purpleArrow.itemID) || par3EntityPlayer.inventory.hasItem(MoreOres.blackArrow.itemID))
			{
				EntityOrangeArrow entityorangearrow = new EntityOrangeArrow(par2World, par3EntityPlayer);
				EntityYellowArrow entityyellowarrow = new EntityYellowArrow(par2World, par3EntityPlayer);
				EntityGreenArrow entitygreenarrow = new EntityGreenArrow(par2World, par3EntityPlayer);
				EntityBlueArrow entitybluearrow = new EntityBlueArrow(par2World, par3EntityPlayer);
				EntityPurpleArrow entitypurplearrow = new EntityPurpleArrow(par2World, par3EntityPlayer);
				EntityBlackArrow entityblackarrow = new EntityBlackArrow(par2World, par3EntityPlayer);

				float f;
				f = 1.0F;
				par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

				if (flag)
				{
				}
				else
				{
					if(packet.mode == 0){
						par3EntityPlayer.inventory.consumeInventoryItem(MoreOres.orangeArrow.itemID);
					}

					else if(packet.mode == 1){
						par3EntityPlayer.inventory.consumeInventoryItem(MoreOres.yellowArrow.itemID);
					}

					else if(packet.mode == 2){
						par3EntityPlayer.inventory.consumeInventoryItem(MoreOres.greenArrow.itemID);
					}

					else if(packet.mode == 3){
						par3EntityPlayer.inventory.consumeInventoryItem(MoreOres.blueArrow.itemID);
					}

					else if(packet.mode == 4){
						par3EntityPlayer.inventory.consumeInventoryItem(MoreOres.purpleArrow.itemID);
					}

					else if(packet.mode == 5){
						par3EntityPlayer.inventory.consumeInventoryItem(MoreOres.blackArrow.itemID);
					}
				}

				if (!par2World.isRemote)
				{
					if(packet.mode == 0){
						Vec3 look = par3EntityPlayer.getLookVec();
						if(packet.crossbowMode == 3){
							entityorangearrow.setPosition(
									par3EntityPlayer.posX + look.xCoord,
									par3EntityPlayer.posY + look.yCoord + 1.5,
									par3EntityPlayer.posZ + look.zCoord);
							entityorangearrow.motionX = look.xCoord + look.xCoord;
							entityorangearrow.motionY = look.yCoord + look.yCoord;
							entityorangearrow.motionZ = look.zCoord + look.zCoord;
							par2World.spawnEntityInWorld(entityorangearrow);
						}
						else{
							entityorangearrow.motionX = look.xCoord + look.xCoord;
							entityorangearrow.motionY = look.yCoord + look.yCoord;
							entityorangearrow.motionZ = look.zCoord + look.zCoord;
							par2World.spawnEntityInWorld(entityorangearrow);
						}
					}

					else if(packet.mode == 1){
						Vec3 look = par3EntityPlayer.getLookVec();
						if(packet.crossbowMode == 3){
							entityyellowarrow.setPosition(
									par3EntityPlayer.posX + look.xCoord,
									par3EntityPlayer.posY + look.yCoord + 1.5,
									par3EntityPlayer.posZ + look.zCoord);
							entityyellowarrow.motionX = look.xCoord + look.xCoord;
							entityyellowarrow.motionY = look.yCoord + look.yCoord;
							entityyellowarrow.motionZ = look.zCoord + look.zCoord;
							par2World.spawnEntityInWorld(entityyellowarrow);
						}
						else{
							entityyellowarrow.motionX = look.xCoord + look.xCoord;
							entityyellowarrow.motionY = look.yCoord + look.yCoord;
							entityyellowarrow.motionZ = look.zCoord + look.zCoord;
							par2World.spawnEntityInWorld(entityyellowarrow);
						}
					}

					else if(packet.mode == 2){
						Vec3 look = par3EntityPlayer.getLookVec();
						if(packet.crossbowMode == 3){
							entitygreenarrow.setPosition(
									par3EntityPlayer.posX + look.xCoord,
									par3EntityPlayer.posY + look.yCoord + 1.5,
									par3EntityPlayer.posZ + look.zCoord);
							entitygreenarrow.motionX = look.xCoord + look.xCoord;
							entitygreenarrow.motionY = look.yCoord + look.yCoord;
							entitygreenarrow.motionZ = look.zCoord + look.zCoord;
							par2World.spawnEntityInWorld(entitygreenarrow);
						}
						else{
							entitygreenarrow.motionX = look.xCoord + look.xCoord;
							entitygreenarrow.motionY = look.yCoord + look.yCoord;
							entitygreenarrow.motionZ = look.zCoord + look.zCoord;
							par2World.spawnEntityInWorld(entitygreenarrow);
						}
					}

					else if(packet.mode == 3){
						Vec3 look = par3EntityPlayer.getLookVec();
						if(packet.crossbowMode == 3){
							entitybluearrow.setPosition(
									par3EntityPlayer.posX + look.xCoord,
									par3EntityPlayer.posY + look.yCoord + 1.5,
									par3EntityPlayer.posZ + look.zCoord);
							entitybluearrow.motionX = look.xCoord + look.xCoord;
							entitybluearrow.motionY = look.yCoord + look.yCoord;
							entitybluearrow.motionZ = look.zCoord + look.zCoord;
							par2World.spawnEntityInWorld(entitybluearrow);
						}
						else{
							entitybluearrow.motionX = look.xCoord + look.xCoord;
							entitybluearrow.motionY = look.yCoord + look.yCoord;
							entitybluearrow.motionZ = look.zCoord + look.zCoord;
							par2World.spawnEntityInWorld(entitybluearrow);
						}
					}

					else if(packet.mode == 4){
						Vec3 look = par3EntityPlayer.getLookVec();
						if(packet.crossbowMode == 3){
							entitypurplearrow.setPosition(
									par3EntityPlayer.posX + look.xCoord,
									par3EntityPlayer.posY + look.yCoord + 1.5,
									par3EntityPlayer.posZ + look.zCoord);
							entitypurplearrow.motionX = look.xCoord + look.xCoord;
							entitypurplearrow.motionY = look.yCoord + look.yCoord;
							entitypurplearrow.motionZ = look.zCoord + look.zCoord;
							par2World.spawnEntityInWorld(entitypurplearrow);
						}
						else{
							entitypurplearrow.motionX = look.xCoord + look.xCoord;
							entitypurplearrow.motionY = look.yCoord + look.yCoord;
							entitypurplearrow.motionZ = look.zCoord + look.zCoord;
							par2World.spawnEntityInWorld(entitypurplearrow);
						}
					}

					else if(packet.mode == 5){
						Vec3 look = par3EntityPlayer.getLookVec();
						if(packet.crossbowMode == 3){
							entityblackarrow.setPosition(
									par3EntityPlayer.posX + look.xCoord,
									par3EntityPlayer.posY + look.yCoord + 1.5,
									par3EntityPlayer.posZ + look.zCoord);
							entityblackarrow.motionX = look.xCoord + look.xCoord;
							entityblackarrow.motionY = look.yCoord + look.yCoord;
							entityblackarrow.motionZ = look.zCoord + look.zCoord;
							par2World.spawnEntityInWorld(entityblackarrow);
						}
						else{
							entityblackarrow.motionX = look.xCoord + look.xCoord;
							entityblackarrow.motionY = look.yCoord + look.yCoord;
							entityblackarrow.motionZ = look.zCoord + look.zCoord;
							par2World.spawnEntityInWorld(entityblackarrow);
						}
					}
				}

				if(!flag || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0)
					par1ItemStack.setItemDamage(49);
			}
		}
	}

	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		return par1ItemStack;
	}

	/**
	 * How long it takes to use or consume an item
	 */
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
	{
		return 72000;
	}


	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if(par3EntityPlayer.isSneaking()){
			par3EntityPlayer.openGui(MoreOres.instance, 2, par2World, 0, 0, 0);
		}
		else{
			ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer, par1ItemStack);
			MinecraftForge.EVENT_BUS.post(event);
			if (event.isCanceled())
			{
				return event.result;
			}

			if(packet.mode == 0){
				if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(MoreOres.orangeArrow.itemID))
				{
					par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
				}
			}

			if(packet.mode == 1){
				if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(MoreOres.yellowArrow.itemID))
				{
					par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
				}
			}

			if(packet.mode == 2){
				if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(MoreOres.greenArrow.itemID))
				{
					par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
				}
			}

			if(packet.mode == 3){
				if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(MoreOres.blueArrow.itemID))
				{
					par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
				}
			}

			if(packet.mode == 4){
				if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(MoreOres.purpleArrow.itemID))
				{
					par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
				}
			}

			if(packet.mode == 5){
				if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(MoreOres.blackArrow.itemID))
				{
					par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
				}
			}
		}
		return par1ItemStack;
	}

	/**
	 * Return the enchantability factor of the item, most of the time is based on material.
	 */
	public int getItemEnchantability()
	{
		return 30;
	}

	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
		if(par1ItemStack.getItemDamage() > 0)
		{
			par1ItemStack.damageItem(-1, (EntityLivingBase)par3Entity);
			EntityPlayer player = (EntityPlayer)par3Entity;
			if(par1ItemStack.getItemDamage() == 0){
				if(flag1 == false){
					player.addChatMessage("\u00a7a[Crossbow]\u00a7f Ready to fire!");
					isReloading = false;
					flag1 = true;
				}
			}

			if(isReloading == false){
				ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
				DataOutputStream outputStream = new DataOutputStream(bos);
				try {
					outputStream.writeInt(7);
				} catch (Exception ex) {
					ex.printStackTrace();
				}

				Packet250CustomPayload packet = new Packet250CustomPayload();
				packet.channel = "MoreOresMod";
				packet.data = bos.toByteArray();
				packet.length = bos.size();

				Side side = FMLCommonHandler.instance().getEffectiveSide();
				if (side == Side.SERVER) {
					// We are on the server side.
					EntityPlayerMP playerMP = (EntityPlayerMP) entityPlayer;
				} else if (side == Side.CLIENT) {
					// We are on the client side.
					EntityClientPlayerMP playerMP = (EntityClientPlayerMP) entityPlayer;
					PacketDispatcher.sendPacketToServer(packet);
					System.out.println("sending packet ready to fire");
				} else {
					// We are on the Bukkit server.
				}
			}

			if(flag1 == true){
				flag2 = false;
			}

			if(par1ItemStack.getItemDamage() == 1){
				flag2 = true;
			}

			if(flag2 == true){
				flag1 = false;
			}

			if(par1ItemStack.getItemDamage() > 1){
				if(flag3 == false){
					player.addChatMessage("\u00a7a[Crossbow]\u00a7f Reloading...");
					isReloading = true;
					flag3 = true;
				}
			}

			if(isReloading == true){
				ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
				DataOutputStream outputStream = new DataOutputStream(bos);
				try {
					outputStream.writeInt(6);
				} catch (Exception ex) {
					ex.printStackTrace();
				}

				Packet250CustomPayload packet = new Packet250CustomPayload();
				packet.channel = "MoreOresMod";
				packet.data = bos.toByteArray();
				packet.length = bos.size();

				Side side = FMLCommonHandler.instance().getEffectiveSide();
				if (side == Side.SERVER) {
					// We are on the server side.
					EntityPlayerMP playerMP = (EntityPlayerMP) entityPlayer;
				} else if (side == Side.CLIENT) {
					// We are on the client side.
					EntityClientPlayerMP playerMP = (EntityClientPlayerMP) entityPlayer;
					PacketDispatcher.sendPacketToServer(packet);
					System.out.println("sending packet reloading");
				} else {
					// We are on the Bukkit server.
				}
			}

			if(flag3 == true){
				flag4 = false;
			}

			if(par1ItemStack.getItemDamage() == 1){
				flag4 = true;
			}

			if(flag4 == true){
				flag3 = false;
			}
		}
	}

	public void registerIcons(IconRegister iconRegister){
		itemIcon = iconRegister.registerIcon("moreores:greenCrossbow");
	}
}
