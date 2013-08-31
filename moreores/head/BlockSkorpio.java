package moreores.head;

import java.util.ArrayList;
import java.util.Random;

import moreores.MoreOres;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSkorpio extends BlockContainer
{

	private boolean flag = false;

	public BlockSkorpio(int par1)
	{
		super(par1, Material.circuits);
		this.setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
	}

	/**
	 * The type of render function that is called for this block
	 */
	public int getRenderType()
	{
		return -1;
	}

	/**
	 * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
	 * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
	 */
	public boolean isOpaqueCube()
	{
		return false;
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	 */
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	/**
	 * Updates the blocks bounds based on its current state. Args: world, x, y, z
	 */
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{
		int l = par1IBlockAccess.getBlockMetadata(par2, par3, par4) & 7;

		switch (l)
		{
		case 1:
		default:
			this.setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
			break;
		case 2:
			this.setBlockBounds(0.25F, 0.25F, 0.5F, 0.75F, 0.75F, 1.0F);
			break;
		case 3:
			this.setBlockBounds(0.25F, 0.25F, 0.0F, 0.75F, 0.75F, 0.5F);
			break;
		case 4:
			this.setBlockBounds(0.5F, 0.25F, 0.25F, 1.0F, 0.75F, 0.75F);
			break;
		case 5:
			this.setBlockBounds(0.0F, 0.25F, 0.25F, 0.5F, 0.75F, 0.75F);
		}
	}

	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
	 * cleared to be reused)
	 */
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
		return super.getCollisionBoundingBoxFromPool(par1World, par2, par3, par4);
	}

	/**
	 * Called when the block is placed in the world.
	 */
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
	{
		int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
		par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
	}

	/**
	 * Returns a new instance of a block's tile entity class. Called on placing the block.
	 */
	public TileEntity createNewTileEntity(World par1World)
	{
		return new TileEntitySkorpio();
	}

	@SideOnly(Side.CLIENT)

	/**
	 * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
	 */
	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return MoreOres.skorpio.itemID;
	}

	/**
	 * Get the block's damage value (for use with pick block).
	 */
	public int getDamageValue(World par1World, int par2, int par3, int par4)
	{
		TileEntity tileentity = par1World.getBlockTileEntity(par2, par3, par4);
		return tileentity != null && tileentity instanceof TileEntitySkorpio ? ((TileEntitySkorpio)tileentity).getSkullType() : super.getDamageValue(par1World, par2, par3, par4);
	}

	/**
	 * Determines the damage on the item the block drops. Used in cloth and wood.
	 */
	public int damageDropped(int par1)
	{
		return par1;
	}

	/**
	 * Called when the block is attempted to be harvested
	 */
	public void onBlockHarvested(World par1World, int par2, int par3, int par4, int par5, EntityPlayer par6EntityPlayer)
	{
		if (par6EntityPlayer.capabilities.isCreativeMode)
		{
			par5 |= 8;
			par1World.setBlockMetadataWithNotify(par2, par3, par4, par5, 4);
		}

		dropBlockAsItem(par1World, par2, par3, par4, par5, 0);

		super.onBlockHarvested(par1World, par2, par3, par4, par5, par6EntityPlayer);
	}

	/**
	 * ejects contained items into the world, and notifies neighbours of an update, as appropriate
	 */
	public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
	{
		super.breakBlock(par1World, par2, par3, par4, par5, par6);
	}

	@Override
	public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
	{
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		if ((metadata & 8) == 0)
		{
			ItemStack itemstack = new ItemStack(MoreOres.skorpio.itemID, 1, this.getDamageValue(world, x, y, z));
			TileEntitySkorpio tileentityskull = (TileEntitySkorpio)world.getBlockTileEntity(x, y, z);

			if (tileentityskull == null)
			{
				return drops;
			}
			if (tileentityskull.getSkullType() == 3 && tileentityskull.getExtraType() != null && tileentityskull.getExtraType().length() > 0)
			{
				itemstack.setTagCompound(new NBTTagCompound());
				itemstack.getTagCompound().setString("SkullOwner", tileentityskull.getExtraType());
			}
			drops.add(itemstack);
		}
		return drops;
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return MoreOres.skorpio.itemID;
	}

	private boolean func_82528_d(World par1World, int par2, int par3, int par4, int par5)
	{
		if (par1World.getBlockId(par2, par3, par4) != this.blockID)
		{
			return false;
		}
		else
		{
			TileEntity tileentity = par1World.getBlockTileEntity(par2, par3, par4);
			return tileentity != null && tileentity instanceof TileEntitySkorpio ? ((TileEntitySkorpio)tileentity).getSkullType() == par5 : false;
		}
	}

	@SideOnly(Side.CLIENT)

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	public void registerIcons(IconRegister par1IconRegister) {}

	@SideOnly(Side.CLIENT)

	/**
	 * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
	 */
	public Icon getIcon(int par1, int par2)
	{
		return MoreOres.rainbowBlock.getBlockTextureFromSide(par1);
	}

	@SideOnly(Side.CLIENT)

	/**
	 * Gets the icon name of the ItemBlock corresponding to this block. Used by hoppers.
	 */
	public String getItemIconName()
	{
		return ItemSkorpio.field_94587_a[0];
	}

	/**
	 * A randomly called display update to be able to add particles or other items for display
	 */
	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		for (int l = 0; l < 4; ++l)
		{
			double d0 = (double)((float)par2 + par5Random.nextFloat());
			double d1 = (double)((float)par3 + par5Random.nextFloat());
			double d2 = (double)((float)par4 + par5Random.nextFloat());
			double d3 = 0.0D;
			double d4 = 0.0D;
			double d5 = 0.0D;
			int i1 = par5Random.nextInt(2) * 2 - 1;
			d3 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;
			d4 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;
			d5 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;

			if (par1World.getBlockId(par2 - 1, par3, par4) != this.blockID && par1World.getBlockId(par2 + 1, par3, par4) != this.blockID)
			{
				d0 = (double)par2 + 0.5D + 0.25D * (double)i1;
				d3 = (double)(par5Random.nextFloat() * 2.0F * (float)i1);
			}
			else
			{
				d2 = (double)par4 + 0.5D + 0.25D * (double)i1;
				d5 = (double)(par5Random.nextFloat() * 2.0F * (float)i1);
			}

			par1World.spawnParticle("enchantmenttable", d0, d1, d2, d3, d4, d5);
		}
	}

	InventoryLargeChest chest;
	/**
	 * Called upon block activation (right click on the block.)
	 */
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		if(!par1World.isRemote){

			if(flag == true){
				par5EntityPlayer.addChatMessage("\u00A73USE THEM \u00A74\u00A7lWISELY!");
				par5EntityPlayer.inventory.setInventorySlotContents(0, new ItemStack(MoreOres.rainbowSword));
				par5EntityPlayer.inventory.setInventorySlotContents(1, new ItemStack(MoreOres.rainbowPickaxe));
				par5EntityPlayer.inventory.setInventorySlotContents(2, new ItemStack(MoreOres.rainbowAxe));
				par5EntityPlayer.inventory.setInventorySlotContents(3, new ItemStack(MoreOres.rainbowShovel));
				par5EntityPlayer.inventory.setInventorySlotContents(4, new ItemStack(MoreOres.rainbowHoe));
				par5EntityPlayer.inventory.setInventorySlotContents(5, new ItemStack(MoreOres.rainbowHelmet));
				par5EntityPlayer.inventory.setInventorySlotContents(6, new ItemStack(MoreOres.rainbowChestplate));
				par5EntityPlayer.inventory.setInventorySlotContents(7, new ItemStack(MoreOres.rainbowLeggings));
				par5EntityPlayer.inventory.setInventorySlotContents(8, new ItemStack(MoreOres.rainbowBoots));

				par1World.setBlock(par2, par3, par4, 0);

				double d0 = (double)((float)par2 + 0.5F);
				double d1 = (double)((float)par3 + 0.7F);
				double d2 = (double)((float)par4 + 0.5F);
				double d3 = 0.2199999988079071D;
				double d4 = 0.27000001072883606D;

				par1World.spawnParticle("largesmoke", d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
				par1World.spawnParticle("largesmoke", d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
				par1World.spawnParticle("largesmoke", d0 + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
				par1World.spawnParticle("largesmoke", d0 + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
				par1World.spawnParticle("largesmoke", d0, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
				par1World.spawnParticle("largesmoke", d0, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
				par1World.spawnParticle("largesmoke", d0, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
				par1World.spawnParticle("largesmoke", d0, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
				par1World.spawnParticle("largesmoke", d0, d1, d2, 0.0D, 0.0D, 0.0D);
				par1World.spawnParticle("largesmoke", d0, d1, d2, 0.0D, 0.0D, 0.0D);
				
				par5EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 40, 100));
				par5EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 40, 100));
				par1World.spawnEntityInWorld(new EntityLightningBolt(par1World, par2, par3, par4));
			}

			if(flag == false){
				if(par5EntityPlayer.inventory.getStackInSlot(0) != null || par5EntityPlayer.inventory.getStackInSlot(1) != null || par5EntityPlayer.inventory.getStackInSlot(2) != null || par5EntityPlayer.inventory.getStackInSlot(3) != null || par5EntityPlayer.inventory.getStackInSlot(4) != null || par5EntityPlayer.inventory.getStackInSlot(5) != null || par5EntityPlayer.inventory.getStackInSlot(6) != null || par5EntityPlayer.inventory.getStackInSlot(7) != null || par5EntityPlayer.inventory.getStackInSlot(8) != null){

					par5EntityPlayer.addChatMessage("\u00A7lI SUGGEST YOU EMPTY YOUR INVENTORY BEFORE YOU SPEAK TO ME.");
					par5EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.getId(), 100, 100));
					flag = true;

				}
			}
		}

		return true;
	}
}
