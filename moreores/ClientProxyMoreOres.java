package moreores;

import moreores.entity.EntityBlueCreeper;
import moreores.entity.EntityBlueSlime;
import moreores.entity.EntityGreenCreeper;
import moreores.entity.EntityGreenSlime;
import moreores.entity.EntityOrangeCreeper;
import moreores.entity.EntityOrangeSlime;
import moreores.entity.EntityYellowCreeper;
import moreores.entity.EntityYellowSlime;
import moreores.entity.ModelBlueSlime;
import moreores.entity.ModelGreenSlime;
import moreores.entity.ModelOrangeSlime;
import moreores.entity.ModelYellowSlime;
import moreores.entity.RenderBlueCreeper;
import moreores.entity.RenderBlueSlime;
import moreores.entity.RenderGreenCreeper;
import moreores.entity.RenderGreenSlime;
import moreores.entity.RenderOrangeCreeper;
import moreores.entity.RenderOrangeSlime;
import moreores.entity.RenderYellowCreeper;
import moreores.entity.RenderYellowSlime;
import moreores.entity.projectile.EntityBlackArrow;
import moreores.entity.projectile.EntityBlueArrow;
import moreores.entity.projectile.EntityGreenArrow;
import moreores.entity.projectile.EntityGrenade;
import moreores.entity.projectile.EntityLava;
import moreores.entity.projectile.EntityLavaReplace;
import moreores.entity.projectile.EntityOrangeArrow;
import moreores.entity.projectile.EntityPurpleArrow;
import moreores.entity.projectile.EntityWater;
import moreores.entity.projectile.EntityWaterReplace;
import moreores.entity.projectile.EntityYellowArrow;
import moreores.entity.projectile.RenderBlackArrow;
import moreores.entity.projectile.RenderBlueArrow;
import moreores.entity.projectile.RenderGreenArrow;
import moreores.entity.projectile.RenderGrenade;
import moreores.entity.projectile.RenderLava;
import moreores.entity.projectile.RenderOrangeArrow;
import moreores.entity.projectile.RenderPurpleArrow;
import moreores.entity.projectile.RenderWater;
import moreores.entity.projectile.RenderYellowArrow;
import moreores.head.RenderSkorpio;
import moreores.head.TileEntitySkorpio;
import moreores.tools.ItemRenderCrossbow;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod.EventHandler;


public class ClientProxyMoreOres extends ServerProxyMoreOres{

	@Override
	public void registerRenderThings(){

		super.registerRenderThings();

		//grenade
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderGrenade(MoreOres.grenade));

		//arrows
		RenderingRegistry.registerEntityRenderingHandler(EntityOrangeArrow.class, new RenderOrangeArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityYellowArrow.class, new RenderYellowArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityGreenArrow.class, new RenderGreenArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityBlueArrow.class, new RenderBlueArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityPurpleArrow.class, new RenderPurpleArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityBlackArrow.class, new RenderBlackArrow());

		//water staff
		RenderingRegistry.registerEntityRenderingHandler(EntityWater.class, new RenderWater(MoreOres.blueStaff));
		RenderingRegistry.registerEntityRenderingHandler(EntityWaterReplace.class, new RenderWater(MoreOres.blueStaff));

		//lava staff
		RenderingRegistry.registerEntityRenderingHandler(EntityLava.class, new RenderLava(MoreOres.orangeStaff));
		RenderingRegistry.registerEntityRenderingHandler(EntityLavaReplace.class, new RenderLava(MoreOres.orangeStaff));

		//slimes
		RenderingRegistry.registerEntityRenderingHandler(EntityOrangeSlime.class, new RenderOrangeSlime(new ModelOrangeSlime(1), new ModelOrangeSlime(0), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityYellowSlime.class, new RenderYellowSlime(new ModelYellowSlime(1), new ModelYellowSlime(0), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityGreenSlime.class, new RenderGreenSlime(new ModelGreenSlime(1), new ModelGreenSlime(0), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityBlueSlime.class, new RenderBlueSlime(new ModelBlueSlime(1), new ModelBlueSlime(0), 0));

		//creepers
		RenderingRegistry.registerEntityRenderingHandler(EntityOrangeCreeper.class, new RenderOrangeCreeper());
		RenderingRegistry.registerEntityRenderingHandler(EntityYellowCreeper.class, new RenderYellowCreeper());
		RenderingRegistry.registerEntityRenderingHandler(EntityGreenCreeper.class, new RenderGreenCreeper());
		RenderingRegistry.registerEntityRenderingHandler(EntityBlueCreeper.class, new RenderBlueCreeper());

		//head
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySkorpio.class, new RenderSkorpio());

		//crossbow
		MinecraftForgeClient.registerItemRenderer(MoreOres.greenCrossbow.itemID, (IItemRenderer)new ItemRenderCrossbow());
	}

	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}


	@EventHandler
	public static void init(){
		MinecraftForge.EVENT_BUS.register(new CraftingHandlerMoreOres());
	}

	@Override
	public void registerKeys()
	{
		KeyBindingRegistry.registerKeyBinding(new KeyHandlerMoreOres(MoreOres.instance.KEY_AIM));
	}
}
