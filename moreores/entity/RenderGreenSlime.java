package moreores.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGreenSlime extends RenderLiving
{
	private static final ResourceLocation field_110897_a = new ResourceLocation("moreores", "textures/entity/greenSlime.png");
    private ModelBase scaleAmount;

    public RenderGreenSlime(ModelBase par1ModelBase, ModelBase par2ModelBase, float par3)
    {
        super(par1ModelBase, par3);
        this.scaleAmount = par2ModelBase;
    }

    /**
     * Determines whether Slime Render should pass or not.
     */
    protected int shouldSlimeRenderPass(EntityGreenSlime par1EntityGreenSlime, int par2, float par3)
    {
        if (par1EntityGreenSlime.isInvisible())
        {
            return 0;
        }
        else if (par2 == 0)
        {
            this.setRenderPassModel(this.scaleAmount);
            GL11.glEnable(GL11.GL_NORMALIZE);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            return 1;
        }
        else
        {
            if (par2 == 1)
            {
                GL11.glDisable(GL11.GL_BLEND);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            }

            return -1;
        }
    }

    /**
     * sets the scale for the slime based on getSlimeSize in EntityGreenSlime
     */
    protected void scaleSlime(EntityGreenSlime par1EntityGreenSlime, float par2)
    {
        float f1 = (float)par1EntityGreenSlime.getSlimeSize();
        float f2 = (par1EntityGreenSlime.field_70812_c + (par1EntityGreenSlime.field_70811_b - par1EntityGreenSlime.field_70812_c) * par2) / (f1 * 0.5F + 1.0F);
        float f3 = 1.0F / (f2 + 1.0F);
        GL11.glScalef(f3 * f1, 1.0F / f3 * f1, f3 * f1);
    }

    protected ResourceLocation func_110896_a(EntityGreenSlime par1EntityGreenSlime)
    {
        return field_110897_a;
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.scaleSlime((EntityGreenSlime)par1EntityLivingBase, par2);
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityLivingBase par1EntityLivingBase, int par2, float par3)
    {
        return this.shouldSlimeRenderPass((EntityGreenSlime)par1EntityLivingBase, par2, par3);
    }

    protected ResourceLocation func_110775_a(Entity par1Entity)
    {
        return this.func_110896_a((EntityGreenSlime)par1Entity);
    }
}
