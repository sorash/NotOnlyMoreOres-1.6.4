package moreores;

import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class ServerProxyMoreOres{

	public void registerRenderThings(){

	}

	public int addArmor(String string){
		return 0;
	}

	public void registerServerTickHandler(){
		
		TickRegistry.registerTickHandler(new TickHandlerMoreOres(), Side.SERVER);
	}

	public void registerKeys() {

	}
}
