package moreores;

import java.util.EnumSet;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class TickHandlerMoreOres implements ITickHandler {

	private boolean flag = false;
	private boolean flag2 = false;

	private void onPlayerTick(EntityPlayer player) {

		//for night vision goggles
		if (player.getCurrentItemOrArmor(4) != null) {
			ItemStack helmet = player.getCurrentItemOrArmor(4);

			if (helmet.getItem() == MoreOres.nightVisionGoggles) {
				
				player.addPotionEffect((new PotionEffect(Potion.nightVision.getId(), 300, 0)));
			}
		}


		//for blue armor
		if (player.getCurrentItemOrArmor(4) != null ) {
			ItemStack helmet = player.getCurrentItemOrArmor(4);

			if (helmet.getItem() == MoreOres.blueHelmet ) {
			}
		}

		if(player.getCurrentItemOrArmor(1) != null){
			ItemStack boots = player.getCurrentItemOrArmor(1);
			if(boots.getItem() == MoreOres.blueBoots){
				player.addPotionEffect((new PotionEffect(Potion.resistance.getId(), 60, 0)));
			}
		}

		if(player.getCurrentItemOrArmor(2) != null){
			ItemStack legs = player.getCurrentItemOrArmor(2);
			if(legs.getItem() == MoreOres.blueLeggings){
				player.addPotionEffect((new PotionEffect(Potion.fireResistance.getId(), 60, 0)));
			}
		}


		//for green armor
		if(player.getCurrentItemOrArmor(1) != null){
			ItemStack boots = player.getCurrentItemOrArmor(1);
			if(boots.getItem() == MoreOres.greenBoots){
				player.addPotionEffect((new PotionEffect(Potion.moveSpeed.getId(), 60, 0)));
			}
		}

		if(player.getCurrentItemOrArmor(2) != null){
			ItemStack legs = player.getCurrentItemOrArmor(2);
			if(legs.getItem() == MoreOres.greenLeggings){
				player.addPotionEffect((new PotionEffect(Potion.resistance.getId(), 60, 0)));
			}
		}


		//message when holding lighter
		if(player.getCurrentEquippedItem() != null){
			ItemStack lighter = player.getCurrentEquippedItem();
			if(lighter.getItem() == MoreOres.rainbowLighter){
				if (flag == false){
					player.addChatMessage("\u00A7cG\u00A76o\u00A7ei\u00A7an\u00A7bg \u00A79S\u00A75o\u00A7cm\u00A76e\u00A7ew\u00A7ah\u00A7be\u00A79r\u00A75e\u00A7c? \u00A76;)");
					flag = true;
				}
			}
		}
	}

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {

		if (type.equals(EnumSet.of(TickType.PLAYER)))
		{
			onPlayerTick((EntityPlayer)tickData[0]);
		}

	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {

	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.PLAYER, TickType.SERVER);
	}

	@Override
	public String getLabel() {
		return "NotOnlyMoreOres TickHandler";
	}

}