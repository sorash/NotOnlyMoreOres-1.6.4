package moreores;

import moreores.blocks.blosper.BlockBlueSapling;
import moreores.blocks.grenium.BlockGreenSapling;
import moreores.blocks.origum.BlockOrangeSapling;
import moreores.blocks.yagniss.BlockYellowSapling;
import moreores.dimension.BlockRainbowSapling;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.item.ItemExpireEvent;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class EventsMoreOres
{
	private int BlockID;

	@ForgeSubscribe
	public void onUseBonemeal(BonemealEvent event)
	{

		if (event.ID == MoreOres.blueSapling.blockID)
		{
			event.setResult(Event.Result.ALLOW);

			if (!event.world.isRemote)
			{
				if (event.world.rand.nextFloat() < 0.45D)
				{
					((BlockBlueSapling)MoreOres.blueSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
				}
			}
		}

		if (event.ID == MoreOres.greenSapling.blockID)
		{
			event.setResult(Event.Result.ALLOW);

			if (!event.world.isRemote)
			{
				if (event.world.rand.nextFloat() < 0.45D)
				{
					((BlockGreenSapling)MoreOres.greenSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
				}
			}
		}

		if (event.ID == MoreOres.yellowSapling.blockID)
		{
			event.setResult(Event.Result.ALLOW);

			if (!event.world.isRemote)
			{
				if (event.world.rand.nextFloat() < 0.45D)
				{
					((BlockYellowSapling)MoreOres.yellowSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
				}
			}
		}

		if (event.ID == MoreOres.orangeSapling.blockID)
		{
			event.setResult(Event.Result.ALLOW);

			if (!event.world.isRemote)
			{
				if (event.world.rand.nextFloat() < 0.45D)
				{
					((BlockOrangeSapling)MoreOres.orangeSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
				}
			}
		}

		if (event.ID == MoreOres.rainbowSapling.blockID)
		{
			event.setResult(Event.Result.ALLOW);

			if (!event.world.isRemote)
			{
				if (event.world.rand.nextFloat() < 0.45D)
				{
					((BlockRainbowSapling)MoreOres.rainbowSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
				}
			}
		}
	}
}