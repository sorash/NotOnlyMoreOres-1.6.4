package moreores;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class PacketHandlerMoreOres implements IPacketHandler{

	public static int mode;
	public static int crossbowMode;
	
	private EntityPlayer entityPlayer;

	@Override
	public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {
		if(packet.channel.equals("MoreOresMod")){
			handlePacket(packet);
		}
	}

	public void handlePacket(Packet250CustomPayload packet){
		DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(packet.data));

		int guiMode;

		try{
			guiMode = inputStream.readInt();
				System.out.println("receiving packet");
		}catch(IOException e){
			e.printStackTrace();
			return;
		}

			System.out.println("mode is: " + guiMode);

		if(guiMode == 0){
			mode = 0;
		}

		else if(guiMode == 1){
			mode = 1;
		}

		else if(guiMode == 2){
			mode = 2;
		}

		else if(guiMode == 3){
			mode = 3;
		}

		else if(guiMode == 4){
			mode = 4;
		}

		else if(guiMode == 5){
			mode = 5;
		}

		//not gui, crossbow reloading
		else if(guiMode == 6){
			crossbowMode = 1;
		}

		//not gui, crossbow ready to fire
		else if(guiMode == 7){
			crossbowMode = 2;
		}

		//not gui, crossbow aim
		else if(guiMode == 8){
			crossbowMode = 3;
		}

		//not gui, stopping crossbow aim
		else if(guiMode == 9){
			crossbowMode = 2;
		}
	}
}
