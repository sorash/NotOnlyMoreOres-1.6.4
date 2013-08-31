package moreores;

import moreores.items.ItemIntroBook;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.NetLoginHandler;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet1Login;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.common.network.IConnectionHandler;
import cpw.mods.fml.common.network.Player;

public class ConnectionHandlerMoreOres implements IConnectionHandler {

	EntityPlayer entityplayer;
	
	public static boolean flag;
	
	private static ItemIntroBook book;
	
	@Override
	public void playerLoggedIn(Player player, NetHandler netHandler, INetworkManager manager) {

		if(player instanceof EntityPlayer)
		{
			entityplayer = (EntityPlayer) player;
		}

		if(entityplayer != null)
		{
			entityplayer.addChatMessage("\u00A73Skorpio's \u00A75NotOnlyMoreOres \u00A76Mod \u00A7ev" + MoreOres.version + " \u00A74Activated.");
			
			if(entityplayer.inventory.getStackInSlot(0) == null){
				if(!flag){
					entityplayer.inventory.setInventorySlotContents(0, book.reading);
					flag = true;
				}
			}
		}
	}

	@Override
	public String connectionReceived(NetLoginHandler netHandler, INetworkManager manager) {
		return null;
	}

	@Override
	public void connectionOpened(NetHandler netClientHandler, String server, int port, INetworkManager manager) {

	}

	@Override
	public void connectionOpened(NetHandler netClientHandler, MinecraftServer server, INetworkManager manager) {

	}

	@Override
	public void connectionClosed(INetworkManager manager) {

	}

	@Override
	public void clientLoggedIn(NetHandler clientHandler, INetworkManager manager, Packet1Login login) {

	}

}
