package moreores.tools.rainbow;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Random;

import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiRainbowStaff extends GuiContainer {

	private static final ResourceLocation resourceLocation = new ResourceLocation("moreores", "textures/gui/rainbowStaff.png");

	private static EntityPlayer entityPlayer;

	public GuiRainbowStaff(InventoryPlayer inventoryPlayer) {

		super(new ContainerRainbowStaff(inventoryPlayer));
		xSize = 248;
		ySize = 186;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int x, int y) {

	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float opacity, int x, int y) {

		this.buttonList.clear();

		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

		this.mc.func_110434_K().func_110577_a(resourceLocation);

		int xStart = (width - xSize) / 2 + 35;
		int yStart = (height - ySize) / 2;
		this.drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);

		this.buttonList.add(new GuiButton(0, xStart + 10, yStart + 15, 75, 20, "\u00A7eLightning"));
		this.buttonList.add(new GuiButton(1, xStart + 92, yStart + 15, 75, 20, "\u00A7aFireball"));
		this.buttonList.add(new GuiButton(2, xStart + 10, yStart + 73, 75, 20, "\u00A79Water"));
		this.buttonList.add(new GuiButton(3, xStart + 92, yStart + 73, 75, 20, "\u00A76Lava"));
		this.buttonList.add(new GuiButton(4, xStart + 10, yStart + 130, 75, 20, "\u00A75Wither Heads"));
		this.buttonList.add(new GuiButton(5, xStart + 92, yStart + 130, 75, 20, "\u00A78Teleportation"));
	}

	protected void actionPerformed(GuiButton guibutton) {
		switch(guibutton.id) {
		case 0:
			this.mc.displayGuiScreen((GuiScreen)null);
			this.mc.thePlayer.addChatMessage("You chose \u00a7eLightning \u00a7fmode");
			break;
		case 1:
			this.mc.displayGuiScreen((GuiScreen)null);
			this.mc.thePlayer.addChatMessage("You chose \u00a7aFireball \u00a7fmode");
			break;
		case 2:
			this.mc.displayGuiScreen((GuiScreen)null);
			this.mc.thePlayer.addChatMessage("You chose \u00a79Water \u00a7fmode");
			break;
		case 3:
			this.mc.displayGuiScreen((GuiScreen)null);
			this.mc.thePlayer.addChatMessage("You chose \u00a76Lava \u00a7fmode");
			break;
		case 4:
			this.mc.displayGuiScreen((GuiScreen)null);
			this.mc.thePlayer.addChatMessage("You chose \u00a75Wither Heads \u00a7fmode");
			break;
		case 5:
			this.mc.displayGuiScreen((GuiScreen)null);
			this.mc.thePlayer.addChatMessage("You chose \u00a78Teleportation \u00a7fmode");
			break;
		default:
			break;
		}
		
		//which button
		if(guibutton.id == 0){
			ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
			DataOutputStream outputStream = new DataOutputStream(bos);
			try {
				//mode
				outputStream.writeInt(0);
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
				EntityPlayerMP player = (EntityPlayerMP) entityPlayer;
			} else if (side == Side.CLIENT) {
				// We are on the client side.
				EntityClientPlayerMP player = (EntityClientPlayerMP) entityPlayer;
				PacketDispatcher.sendPacketToServer(packet);
				System.out.println("sending packet 0");
			} else {
				// We are on the Bukkit server.
			}
		}

		//which button
		else if(guibutton.id == 1){
			ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
			DataOutputStream outputStream = new DataOutputStream(bos);
			try {
				//mode 
				outputStream.writeInt(1);
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
				EntityPlayerMP player = (EntityPlayerMP) entityPlayer;
			} else if (side == Side.CLIENT) {
				// We are on the client side.
				EntityClientPlayerMP player = (EntityClientPlayerMP) entityPlayer;
				PacketDispatcher.sendPacketToServer(packet);
				System.out.println("sending packet 1");
			} else {
				// We are on the Bukkit server.
			}
		}

		//which button
		else if(guibutton.id == 2){
			ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
			DataOutputStream outputStream = new DataOutputStream(bos);
			try {
				//mode 
				outputStream.writeInt(2);
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
				EntityPlayerMP player = (EntityPlayerMP) entityPlayer;
			} else if (side == Side.CLIENT) {
				// We are on the client side.
				EntityClientPlayerMP player = (EntityClientPlayerMP) entityPlayer;
				PacketDispatcher.sendPacketToServer(packet);
				System.out.println("sending packet 2");
			} else {
				// We are on the Bukkit server.
			}
		}

		//which button
		else if(guibutton.id == 3){
			ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
			DataOutputStream outputStream = new DataOutputStream(bos);
			try {
				//mode 
				outputStream.writeInt(3);
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
				EntityPlayerMP player = (EntityPlayerMP) entityPlayer;
			} else if (side == Side.CLIENT) {
				// We are on the client side.
				EntityClientPlayerMP player = (EntityClientPlayerMP) entityPlayer;
				PacketDispatcher.sendPacketToServer(packet);
				System.out.println("sending packet 3");
			} else {
				// We are on the Bukkit server.
			}
		}

		//which button
		else if(guibutton.id == 4){
			ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
			DataOutputStream outputStream = new DataOutputStream(bos);
			try {
				//mode 
				outputStream.writeInt(4);
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
				EntityPlayerMP player = (EntityPlayerMP) entityPlayer;
			} else if (side == Side.CLIENT) {
				// We are on the client side.
				EntityClientPlayerMP player = (EntityClientPlayerMP) entityPlayer;
				PacketDispatcher.sendPacketToServer(packet);
				System.out.println("sending packet 4");
			} else {
				// We are on the Bukkit server.
			}
		}

		//which button
		else if(guibutton.id == 5){
			ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
			DataOutputStream outputStream = new DataOutputStream(bos);
			try {
				//mode 
				outputStream.writeInt(5);
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
				EntityPlayerMP player = (EntityPlayerMP) entityPlayer;
			} else if (side == Side.CLIENT) {
				// We are on the client side.
				EntityClientPlayerMP player = (EntityClientPlayerMP) entityPlayer;
				PacketDispatcher.sendPacketToServer(packet);
				System.out.println("sending packet 5");
			} else {
				// We are on the Bukkit server.
			}
		}
	}

	@Override
	public void onGuiClosed() {

		super.onGuiClosed();

		if (mc.thePlayer != null) {
			for (ItemStack itemStack : mc.thePlayer.inventory.mainInventory) {
				if (itemStack != null) {

				}
			}
		}
	}
}