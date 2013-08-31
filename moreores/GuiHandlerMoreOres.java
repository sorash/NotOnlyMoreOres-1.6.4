package moreores;

import moreores.furnaces.ContainerBlackFurnace;
import moreores.furnaces.ContainerBlueFurnace;
import moreores.furnaces.ContainerGreenFurnace;
import moreores.furnaces.ContainerOrangeFurnace;
import moreores.furnaces.ContainerPurpleFurnace;
import moreores.furnaces.ContainerRainbowFurnace;
import moreores.furnaces.ContainerYellowFurnace;
import moreores.furnaces.GuiBlackFurnace;
import moreores.furnaces.GuiBlueFurnace;
import moreores.furnaces.GuiGreenFurnace;
import moreores.furnaces.GuiOrangeFurnace;
import moreores.furnaces.GuiPurpleFurnace;
import moreores.furnaces.GuiRainbowFurnace;
import moreores.furnaces.GuiYellowFurnace;
import moreores.furnaces.TileEntityBlackFurnace;
import moreores.furnaces.TileEntityBlueFurnace;
import moreores.furnaces.TileEntityGreenFurnace;
import moreores.furnaces.TileEntityOrangeFurnace;
import moreores.furnaces.TileEntityPurpleFurnace;
import moreores.furnaces.TileEntityRainbowFurnace;
import moreores.furnaces.TileEntityYellowFurnace;
import moreores.machines.ContainerCrusher;
import moreores.machines.ContainerExtractor;
import moreores.machines.GuiCrusher;
import moreores.machines.GuiExtractor;
import moreores.machines.TileEntityCrusher;
import moreores.machines.TileEntityExtractor;
import moreores.tools.ContainerCrossbow;
import moreores.tools.GuiCrossbow;
import moreores.tools.rainbow.ContainerRainbowStaff;
import moreores.tools.rainbow.GuiRainbowStaff;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandlerMoreOres implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);

		if(tile_entity instanceof TileEntityOrangeFurnace){
			return new ContainerOrangeFurnace(player.inventory, (TileEntityOrangeFurnace) tile_entity);
		}
		else if(tile_entity instanceof TileEntityYellowFurnace){
			return new ContainerYellowFurnace(player.inventory, (TileEntityYellowFurnace) tile_entity);
		}
		else if(tile_entity instanceof TileEntityGreenFurnace){
			return new ContainerGreenFurnace(player.inventory, (TileEntityGreenFurnace) tile_entity);
		}
		else if(tile_entity instanceof TileEntityBlueFurnace){
			return new ContainerBlueFurnace(player.inventory, (TileEntityBlueFurnace) tile_entity);
		}
		else if(tile_entity instanceof TileEntityRainbowFurnace){
			return new ContainerRainbowFurnace(player.inventory, (TileEntityRainbowFurnace) tile_entity);
		}

		else if(tile_entity instanceof TileEntityCrusher){
			return new ContainerCrusher(player.inventory, (TileEntityCrusher) tile_entity);
		}

		else if(tile_entity instanceof TileEntityExtractor){
			return new ContainerExtractor(player.inventory, (TileEntityExtractor) tile_entity);
		}

		else if(tile_entity instanceof TileEntityPurpleFurnace){
			return new ContainerPurpleFurnace(player.inventory, (TileEntityPurpleFurnace) tile_entity);
		}
		
		else if(tile_entity instanceof TileEntityBlackFurnace){
			return new ContainerBlackFurnace(player.inventory, (TileEntityBlackFurnace) tile_entity);
		}
		
		//rainbow staff
		else if (ID == 1){
			return new ContainerRainbowStaff(player.inventory);
		}
		
		//crossbow
		else if (ID == 2){
			return new ContainerCrossbow(player.inventory);
		}

		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);

		if(tile_entity instanceof TileEntityOrangeFurnace){
			return new GuiOrangeFurnace(player.inventory, (TileEntityOrangeFurnace) tile_entity);
		}
		else if(tile_entity instanceof TileEntityYellowFurnace){
			return new GuiYellowFurnace(player.inventory, (TileEntityYellowFurnace) tile_entity);
		}
		else if(tile_entity instanceof TileEntityGreenFurnace){
			return new GuiGreenFurnace(player.inventory, (TileEntityGreenFurnace) tile_entity);
		}
		else if(tile_entity instanceof TileEntityBlueFurnace){
			return new GuiBlueFurnace(player.inventory, (TileEntityBlueFurnace) tile_entity);
		}
		else if(tile_entity instanceof TileEntityRainbowFurnace){
			return new GuiRainbowFurnace(player.inventory, (TileEntityRainbowFurnace) tile_entity);
		}

		else if(tile_entity instanceof TileEntityCrusher){
			return new GuiCrusher(player.inventory, (TileEntityCrusher) tile_entity);
		}

		else if(tile_entity instanceof TileEntityExtractor){
			return new GuiExtractor(player.inventory, (TileEntityExtractor) tile_entity);
		}

		else if(tile_entity instanceof TileEntityPurpleFurnace){
			return new GuiPurpleFurnace(player.inventory, (TileEntityPurpleFurnace) tile_entity);
		}
		
		else if(tile_entity instanceof TileEntityBlackFurnace){
			return new GuiBlackFurnace(player.inventory, (TileEntityBlackFurnace) tile_entity);
		}

		//rainbow staff
		else if (ID == 1){
			return new GuiRainbowStaff(player.inventory);
		}
		
		//crossbow
		else if (ID == 2){
			return new GuiCrossbow(player.inventory);
		}

		return null;
	}

}
