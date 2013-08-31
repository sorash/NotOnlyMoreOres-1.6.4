package moreores.tools;

import moreores.PacketHandlerMoreOres;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemRenderCrossbow implements IItemRenderer {

	private PacketHandlerMoreOres packet;
	private EntityPlayer player;

	protected ModelCrossbow model;

	private final ResourceLocation resourceLocation = new ResourceLocation("moreores", "textures/models/ModelCrossbow.png");
	private final ResourceLocation resourceLocation_0 = new ResourceLocation("moreores", "textures/models/ModelCrossbow_0.png");
	private final ResourceLocation resourceLocation_1 = new ResourceLocation("moreores", "textures/models/ModelCrossbow_1.png");
	private final ResourceLocation resourceLocation_2 = new ResourceLocation("moreores", "textures/models/ModelCrossbow_2.png");
	private final ResourceLocation resourceLocation_3 = new ResourceLocation("moreores", "textures/models/ModelCrossbow_3.png");
	private final ResourceLocation resourceLocation_4 = new ResourceLocation("moreores", "textures/models/ModelCrossbow_4.png");
	private final ResourceLocation resourceLocation_5 = new ResourceLocation("moreores", "textures/models/ModelCrossbow_5.png");

	public ItemRenderCrossbow(){
		model = new ModelCrossbow();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch(type){
		case EQUIPPED: return true;
		case EQUIPPED_FIRST_PERSON: return true;
		default: return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return false;
	}

	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch(type){
		case EQUIPPED:{
			GL11.glPushMatrix();

			if(packet.mode == 0){
				Minecraft.getMinecraft().renderEngine.func_110577_a(resourceLocation_0);
			}
			else if(packet.mode == 1){
				Minecraft.getMinecraft().renderEngine.func_110577_a(resourceLocation_1);
			}
			else if(packet.mode == 2){
				Minecraft.getMinecraft().renderEngine.func_110577_a(resourceLocation_2);
			}
			else if(packet.mode == 3){
				Minecraft.getMinecraft().renderEngine.func_110577_a(resourceLocation_3);
			}
			else if(packet.mode == 4){
				Minecraft.getMinecraft().renderEngine.func_110577_a(resourceLocation_4);
			}
			else if(packet.mode == 5){
				Minecraft.getMinecraft().renderEngine.func_110577_a(resourceLocation_5);
			}
			else{
				Minecraft.getMinecraft().renderEngine.func_110577_a(resourceLocation);
			}

			GL11.glRotatef(-145F, 0.0F, 0.0F, 100.0F);
			GL11.glRotatef(5F, 0.0F, 100.0F, 0.0F);

			float scale = 0.85F;
			GL11.glScalef(scale, scale, scale);

			if(data[1] != null && data[1] instanceof EntityPlayer){
				if(!((EntityPlayer)data[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && !((Minecraft.getMinecraft().currentScreen instanceof GuiInventory || Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative) && RenderManager.instance.playerViewY == 180.0F))){
					GL11.glTranslatef(-1.05F, -0.035F, -0.075F);
				}
			}
			else{
				GL11.glTranslatef(-0.85F, -0.035F, -0.075F);
			}

			model.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

			GL11.glPopMatrix();
		}

		case EQUIPPED_FIRST_PERSON:{
			GL11.glPushMatrix();

			if(packet.mode == 0){
				Minecraft.getMinecraft().renderEngine.func_110577_a(resourceLocation_0);
			}
			else if(packet.mode == 1){
				Minecraft.getMinecraft().renderEngine.func_110577_a(resourceLocation_1);
			}
			else if(packet.mode == 2){
				Minecraft.getMinecraft().renderEngine.func_110577_a(resourceLocation_2);
			}
			else if(packet.mode == 3){
				Minecraft.getMinecraft().renderEngine.func_110577_a(resourceLocation_3);
			}
			else if(packet.mode == 4){
				Minecraft.getMinecraft().renderEngine.func_110577_a(resourceLocation_4);
			}
			else if(packet.mode == 5){
				Minecraft.getMinecraft().renderEngine.func_110577_a(resourceLocation_5);
			}
			else{
				Minecraft.getMinecraft().renderEngine.func_110577_a(resourceLocation);
			}

			GL11.glRotatef(-145F, 0.0F, 0.0F, 100.0F);
			GL11.glRotatef(5F, 0.0F, 100.0F, 0.0F);

			if(packet.crossbowMode == 1){
				GL11.glRotatef(-25F, 0.0F, 0.0F, 100.0F);
			}

			if(packet.crossbowMode == 3){
				GL11.glTranslatef(0.25F, -0.05F, -0.43F);
				GL11.glRotatef(-6F, 0.0F, 100.0F, 0.0F);
				GL11.glRotatef(-3.8F, 1.0F, 0.0F, 0.0F);
				GL11.glRotatef(5F, 0.0F, 1.0F, 0.0F);
			}

			GL11.glRotatef(5F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(-30F, 0.0F, 0.0F, 1.0F);
			GL11.glRotatef(20F, 0.0F, 0.0F, 1.0F);
			GL11.glTranslatef(-0.495F, -0.50F, -0.56F);

			if(data[1] != null && data[1] instanceof EntityPlayer){
				if(Minecraft.getMinecraft().gameSettings.thirdPersonView == 0){
					if(!((Minecraft.getMinecraft().currentScreen instanceof GuiInventory) || (Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative))){
						model.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
					}
				}
			}

			GL11.glPopMatrix();
		}

		default:
			break;
		}
	}

}
