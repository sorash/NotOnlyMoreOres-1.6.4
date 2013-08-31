package moreores.particles;

import moreores.MoreOres;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityBreakingFX;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;

public class MoreOresParticleEffects
{
	private static Minecraft mc = Minecraft.getMinecraft();
	private static World theWorld = mc.theWorld;

	public static EntityFX spawnParticle(String particleName, double par2, double par4, double par6, double par8, double par10, double par12)
	{
		if (mc != null && mc.renderViewEntity != null && mc.effectRenderer != null)
		{
			int var14 = mc.gameSettings.particleSetting;

			if (var14 == 1 && theWorld.rand.nextInt(3) == 0)
			{
				var14 = 2;
			}

			double var15 = mc.renderViewEntity.posX - par2;
			double var17 = mc.renderViewEntity.posY - par4;
			double var19 = mc.renderViewEntity.posZ - par6;
			EntityFX var21 = null;
			double var22 = 16.0D;

			if (var15 * var15 + var17 * var17 + var19 * var19 > var22 * var22)
			{
				return null;
			}
			else if (var14 > 1)
			{
				return null;
			}
			else
			{
				if (particleName.equals("greenSmoke"))
				{
					var21 = new EntityGreenSmokeFX(theWorld, par2, par4, par6, (float)par8, (float)par10, (float)par12);
				}
				else if (particleName.equals("greenFlame"))
				{
					var21 = new EntityGreenFlameFX(theWorld, par2, par4, par6, (float)par8, (float)par10, (float)par12);
				}
				
				else if (particleName.equals("yellowSmoke"))
				{
					var21 = new EntityYellowSmokeFX(theWorld, par2, par4, par6, (float)par8, (float)par10, (float)par12);
				}
				else if (particleName.equals("yellowFlame"))
				{
					var21 = new EntityYellowFlameFX(theWorld, par2, par4, par6, (float)par8, (float)par10, (float)par12);
				}
				
				else if (particleName.equals("orangeSmoke"))
				{
					var21 = new EntityOrangeSmokeFX(theWorld, par2, par4, par6, (float)par8, (float)par10, (float)par12);
				}
				else if (particleName.equals("orangeFlame"))
				{
					var21 = new EntityOrangeFlameFX(theWorld, par2, par4, par6, (float)par8, (float)par10, (float)par12);
				}
				
				else if (particleName.equals("blueSmoke"))
				{
					var21 = new EntityBlueSmokeFX(theWorld, par2, par4, par6, (float)par8, (float)par10, (float)par12);
				}
				else if (particleName.equals("blueFlame"))
				{
					var21 = new EntityBlueFlameFX(theWorld, par2, par4, par6, (float)par8, (float)par10, (float)par12);
				}
				
				else if (particleName.equals("purpleSmoke"))
				{
					var21 = new EntityPurpleSmokeFX(theWorld, par2, par4, par6, (float)par8, (float)par10, (float)par12);
				}
				else if (particleName.equals("purpleFlame"))
				{
					var21 = new EntityPurpleFlameFX(theWorld, par2, par4, par6, (float)par8, (float)par10, (float)par12);
				}
				
				else if (particleName.equals("blackSmoke"))
				{
					var21 = new EntityBlackSmokeFX(theWorld, par2, par4, par6, (float)par8, (float)par10, (float)par12);
				}
				else if (particleName.equals("blackFlame"))
				{
					var21 = new EntityBlackFlameFX(theWorld, par2, par4, par6, (float)par8, (float)par10, (float)par12);
				}
				
				
				else if (particleName.equals("orangeSlime"))
				{
					var21 = new EntityBreakingFX(theWorld, par2, par4, par6, MoreOres.orangeJelly);
				}
				else if (particleName.equals("yellowSlime"))
				{
					var21 = new EntityBreakingFX(theWorld, par2, par4, par6, MoreOres.yellowJelly);
				}
				else if (particleName.equals("greenSlime"))
				{
					var21 = new EntityBreakingFX(theWorld, par2, par4, par6, MoreOres.greenJelly);
				}
				else if (particleName.equals("blueSlime"))
				{
					var21 = new EntityBreakingFX(theWorld, par2, par4, par6, MoreOres.blueJelly);
				}
				
				
				mc.effectRenderer.addEffect((EntityFX)var21);
				return (EntityFX)var21;
			}
		}
		return null;
	}
}