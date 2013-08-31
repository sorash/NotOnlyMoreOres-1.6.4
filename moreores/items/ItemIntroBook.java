package moreores.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemEditableBook;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemIntroBook extends ItemEditableBook
{
	public static ItemStack reading;

	static
	{
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setString("author", "Guess Who? :3");
		nbt.setString("title", "NotOnlyMoreOres");

		NBTTagList pages = new NBTTagList();
		pages.appendTag(new NBTTagString("1", "Hey there handsome! ;) How are you doing today? " +
				"I see that you chose to play with this \u00a7nawesome\u00a7r mod that you found, \u00a7oSkorpio's NotOnlyMoreOres Mod\u00a7r! Just wanted to tell you some wise stuff about it! " +
				"Flip to the next page please! :)"));
		pages.appendTag(new NBTTagString("2", "First of all, if you're just a normal player, I want you to have fun. Understood? Alright. " +
				"Are you a youtuber who's going to review this mod? Alright listen up man. You \u00a7lNEED TO READ THE THREAD FULLY \u00a70alright? ;) Thanks! :3 Flip again! :)"));
		pages.appendTag(new NBTTagString("3", "And if you have any suggestions, PLEASE visit the thread for the mod and give the author a little help! :) " +
				"Now go, have fun! :D I'll talk to you later! <3" +
				"                               P.S. you seem to like flipping, so why don't you do it one more time? :3"));
		pages.appendTag(new NBTTagString("4", "\u00a7bT\u00a71R\u00a72O\u00a73L\u00a74O\u00a75L\u00a76O\u00a77L\u00a78O\u00a7aL \u00a70nothing here! GOTCHA! x) \u00a7kSkorpio"));

		nbt.setTag("pages", pages);
		reading = new ItemStack(Item.writtenBook);
		reading.setTagCompound(nbt);
	}

	public ItemIntroBook(int id)
	{
		super(id);
		setContainerItem(this);
		setMaxStackSize(1);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int itemId, CreativeTabs creativeTab, List subTypes)
	{
		subTypes.add(reading);
	}
}