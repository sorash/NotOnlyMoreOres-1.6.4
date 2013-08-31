package moreores.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

public class ItemCrusher extends Item{

	private Minecraft mc;
	
	private static final ResourceLocation field_110897_a = new ResourceLocation("textures/entity/slime/slime.png");
	
	public ItemCrusher(int par1) {
		super(par1);
	}

	public void registerIcons(IconRegister iconRegister){
		itemIcon = iconRegister.registerIcon("moreores:crusher");
	}
}
