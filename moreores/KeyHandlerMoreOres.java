package moreores;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.relauncher.Side;

public class KeyHandlerMoreOres extends KeyHandler {

	private EntityPlayer entityPlayer;
	private PacketHandlerMoreOres packet;
	public boolean blah;

	public KeyHandlerMoreOres(int keyBindings) 
	{
		super(new KeyBinding[]{new KeyBinding("Crossbow Aim", keyBindings)}, new boolean[]{false});
	}

	@Override
	public String getLabel() {
		return "NotOnlyMoreOres KeyHandler";
	}

	@Override
	public void keyDown(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd, boolean isRepeat) {
		if (kb.keyDescription=="Crossbow Aim") {	
			if(packet.crossbowMode != 1){
				if(!(Minecraft.getMinecraft().currentScreen instanceof GuiChat)){
					ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
					DataOutputStream outputStream = new DataOutputStream(bos);
					try {
						outputStream.writeInt(8);
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
						System.out.println("sending packet");
					} else {
						// We are on the Bukkit server.
					}
				}
			}
		}
	}

	@Override
	public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd) {
		if (kb.keyDescription=="Crossbow Aim"){	
			ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
			DataOutputStream outputStream = new DataOutputStream(bos);
			try {
				outputStream.writeInt(9);
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
				System.out.println("sending packet");
			} else {
				// We are on the Bukkit server.
			}
		}
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.CLIENT);
	}
}			