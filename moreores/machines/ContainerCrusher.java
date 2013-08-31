package moreores.machines;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ContainerCrusher extends Container
{
    private TileEntityCrusher crusher;
    private int lastCookTime = 0;
    private int lastBurnTime = 0;
    private int lastItemBurnTime = 0;

    public ContainerCrusher(InventoryPlayer par1InventoryPlayer, TileEntityCrusher par2TileEntityCrusher)
    {
        this.crusher = par2TileEntityCrusher;
        this.addSlotToContainer(new Slot(par2TileEntityCrusher, 1, 56, 17));
        this.addSlotToContainer(new Slot(par2TileEntityCrusher, 0, 56, 53));
        this.addSlotToContainer(new SlotCrusher(par1InventoryPlayer.player, par2TileEntityCrusher, 2, 116, 35));
        int i;

        for (i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(par1InventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (i = 0; i < 9; ++i)
        {
            this.addSlotToContainer(new Slot(par1InventoryPlayer, i, 8 + i * 18, 142));
        }
    }

    public void addCraftingToCrafters(ICrafting par1ICrafting)
    {
        super.addCraftingToCrafters(par1ICrafting);
        par1ICrafting.sendProgressBarUpdate(this, 0, this.crusher.crusherCookTime);
        par1ICrafting.sendProgressBarUpdate(this, 1, this.crusher.crusherBurnTime);
        par1ICrafting.sendProgressBarUpdate(this, 2, this.crusher.currentItemBurnTime);
    }

    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for (int i = 0; i < this.crafters.size(); ++i)
        {
            ICrafting icrafting = (ICrafting)this.crafters.get(i);

            if (this.lastCookTime != this.crusher.crusherCookTime)
            {
                icrafting.sendProgressBarUpdate(this, 0, this.crusher.crusherCookTime);
            }

            if (this.lastBurnTime != this.crusher.crusherBurnTime)
            {
                icrafting.sendProgressBarUpdate(this, 1, this.crusher.crusherBurnTime);
            }

            if (this.lastItemBurnTime != this.crusher.currentItemBurnTime)
            {
                icrafting.sendProgressBarUpdate(this, 2, this.crusher.currentItemBurnTime);
            }
        }

        this.lastCookTime = this.crusher.crusherCookTime;
        this.lastBurnTime = this.crusher.crusherBurnTime;
        this.lastItemBurnTime = this.crusher.currentItemBurnTime;
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int par1, int par2)
    {
        if (par1 == 0)
        {
            this.crusher.crusherCookTime = par2;
        }

        if (par1 == 1)
        {
            this.crusher.crusherBurnTime = par2;
        }

        if (par1 == 2)
        {
            this.crusher.currentItemBurnTime = par2;
        }
    }

    public boolean canInteractWith(EntityPlayer par1EntityPlayer)
    {
        return this.crusher.isUseableByPlayer(par1EntityPlayer);
    }

    @Override
    /**
     * Called when a player shift-clicks on a slot. You must override this or you will crash when someone does that.
     */
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(par2);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (par2 == 2)
            {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (par2 != 1 && par2 != 0)
            {
                if (CrusherRecipes.crushing().getCrushingResult(itemstack1) != null)
                {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return null;
                    }
                }
                else if (TileEntityCrusher.isItemFuel(itemstack1))
                {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return null;
                    }
                }
                else if (par2 >= 3 && par2 < 30)
                {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
                    {
                        return null;
                    }
                }
                else if (par2 >= 30 && par2 < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 3, 39, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
        }

        return itemstack;
    }
}
