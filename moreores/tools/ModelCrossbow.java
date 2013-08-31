package moreores.tools;

import moreores.PacketHandlerMoreOres;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCrossbow extends ModelBase
{
	private PacketHandlerMoreOres packet;

	//fields
	ModelRenderer base;
	ModelRenderer arm1a;
	ModelRenderer arm1b;
	ModelRenderer arm1c;
	ModelRenderer arm1d;
	ModelRenderer arm1e;
	ModelRenderer arm1f;
	ModelRenderer arm1g;
	ModelRenderer arm1h;
	ModelRenderer arm1i;
	ModelRenderer arm2a;
	ModelRenderer arm2b;
	ModelRenderer arm2c;
	ModelRenderer arm2d;
	ModelRenderer arm2e;
	ModelRenderer arm2f;
	ModelRenderer arm2g;
	ModelRenderer arm2h;
	ModelRenderer arm2i;
	ModelRenderer arm2j;
	ModelRenderer nose1;
	ModelRenderer nose2;
	ModelRenderer nose3;
	ModelRenderer handle;
	ModelRenderer trigger1;
	ModelRenderer trigger2;
	ModelRenderer string1;
	ModelRenderer string2;
	ModelRenderer string3;
	ModelRenderer stringHolder;
	ModelRenderer reloadingString1;
	ModelRenderer reloadingString2;
	ModelRenderer reloadingString3;
	ModelRenderer arrowBody;
	ModelRenderer arrowHead1;
	ModelRenderer arrowHead2;
	ModelRenderer arrowHead3;

	public ModelCrossbow()
	{
		textureWidth = 64;
		textureHeight = 64;

		base = new ModelRenderer(this, 0, 6);
		base.addBox(0F, 0F, 0F, 20, 2, 4);
		base.setRotationPoint(-12F, 0F, -2F);
		base.setTextureSize(64, 32);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
		arm1a = new ModelRenderer(this, 0, 0);
		arm1a.addBox(0F, 0F, 0F, 2, 2, 2);
		arm1a.setRotationPoint(-9.3F, 0F, 1F);
		arm1a.setTextureSize(64, 32);
		arm1a.mirror = true;
		setRotation(arm1a, 0F, -1.418984F, 0F);
		arm1b = new ModelRenderer(this, 0, 0);
		arm1b.addBox(0F, 0F, 0F, 2, 2, 2);
		arm1b.setRotationPoint(-9F, 0F, 2.8F);
		arm1b.setTextureSize(64, 32);
		arm1b.mirror = true;
		setRotation(arm1b, 0F, -1.344626F, 0F);
		arm1c = new ModelRenderer(this, 0, 0);
		arm1c.addBox(0F, 0F, 0F, 2, 2, 2);
		arm1c.setRotationPoint(-8.65F, 0F, 4.2F);
		arm1c.setTextureSize(64, 32);
		arm1c.mirror = true;
		setRotation(arm1c, 0F, -1.195912F, 0F);
		arm1d = new ModelRenderer(this, 0, 0);
		arm1d.addBox(0F, 0F, 0F, 2, 2, 2);
		arm1d.setRotationPoint(-8.2F, 0F, 5.5F);
		arm1d.setTextureSize(64, 32);
		arm1d.mirror = true;
		setRotation(arm1d, 0F, -0.9356617F, 0F);
		arm1e = new ModelRenderer(this, 0, 0);
		arm1e.addBox(0F, 0F, 0F, 2, 2, 2);
		arm1e.setRotationPoint(-7.3F, 0F, 6.7F);
		arm1e.setTextureSize(64, 32);
		arm1e.mirror = true;
		setRotation(arm1e, 0F, -0.7148621F, 0F);
		arm1f = new ModelRenderer(this, 0, 0);
		arm1f.addBox(0F, 0F, 0F, 2, 2, 2);
		arm1f.setRotationPoint(-6F, 0F, 7.9F);
		arm1f.setTextureSize(64, 32);
		arm1f.mirror = true;
		setRotation(arm1f, 0F, -0.6010542F, 0F);
		arm1g = new ModelRenderer(this, 0, 0);
		arm1g.addBox(0F, 0F, 0F, 2, 2, 2);
		arm1g.setRotationPoint(-5F, 0F, 8.7F);
		arm1g.setTextureSize(64, 32);
		arm1g.mirror = true;
		setRotation(arm1g, 0F, -0.286172F, 0F);
		arm1h = new ModelRenderer(this, 0, 0);
		arm1h.addBox(0F, 0F, 0F, 2, 2, 2);
		arm1h.setRotationPoint(-5F, 0F, 8.7F);
		arm1h.setTextureSize(64, 32);
		arm1h.mirror = true;
		setRotation(arm1h, 0F, -0.1745329F, 0F);
		arm1i = new ModelRenderer(this, 0, 0);
		arm1i.addBox(0F, 0F, 0F, 2, 2, 2);
		arm1i.setRotationPoint(-4F, 0F, 9.1F);
		arm1i.setTextureSize(64, 32);
		arm1i.mirror = true;
		setRotation(arm1i, 0F, 0F, 0F);
		arm2a = new ModelRenderer(this, 0, 0);
		arm2a.addBox(0F, 0F, 0F, 2, 2, 2);
		arm2a.setRotationPoint(-9.2F, 0F, -3.5F);
		arm2a.setTextureSize(64, 32);
		arm2a.mirror = true;
		setRotation(arm2a, 0F, -1.642055F, 0F);
		arm2b = new ModelRenderer(this, 0, 0);
		arm2b.addBox(0F, 0F, 0F, 2, 2, 2);
		arm2b.setRotationPoint(-8.7F, 0F, -5F);
		arm2b.setTextureSize(64, 32);
		arm2b.mirror = true;
		setRotation(arm2b, 0F, -1.865127F, 0F);
		arm2c = new ModelRenderer(this, 0, 0);
		arm2c.addBox(0F, 0F, 0F, 2, 2, 2);
		arm2c.setRotationPoint(-7.9F, 0F, -6.4F);
		arm2c.setTextureSize(64, 32);
		arm2c.mirror = true;
		setRotation(arm2c, 0F, -2.070745F, 0F);
		arm2d = new ModelRenderer(this, 0, 0);
		arm2d.addBox(0F, 0F, 0F, 2, 2, 2);
		arm2d.setRotationPoint(-7F, 0F, -7.5F);
		arm2d.setTextureSize(64, 32);
		arm2d.mirror = true;
		setRotation(arm2d, 0F, -2.221732F, 0F);
		arm2e = new ModelRenderer(this, 0, 0);
		arm2e.addBox(0F, 0F, 0F, 2, 2, 2);
		arm2e.setRotationPoint(-5.9F, 0F, -8.7F);
		arm2e.setTextureSize(64, 32);
		arm2e.mirror = true;
		setRotation(arm2e, 0F, -2.326452F, 0F);
		arm2f = new ModelRenderer(this, 0, 0);
		arm2f.addBox(0F, 0F, 0F, 2, 2, 2);
		arm2f.setRotationPoint(-4.6F, 0F, -9.6F);
		arm2f.setTextureSize(64, 32);
		arm2f.mirror = true;
		setRotation(arm2f, 0F, -2.529798F, 0F);
		arm2g = new ModelRenderer(this, 0, 0);
		arm2g.addBox(0F, 0F, 0F, 2, 2, 2);
		arm2g.setRotationPoint(-3.2F, 0F, -10.3F);
		arm2g.setTextureSize(64, 32);
		arm2g.mirror = true;
		setRotation(arm2g, 0F, -2.680784F, 0F);
		arm2h = new ModelRenderer(this, 0, 0);
		arm2h.addBox(0F, 0F, 0F, 2, 2, 2);
		arm2h.setRotationPoint(-2.6F, 0F, -10.5F);
		arm2h.setTextureSize(64, 32);
		arm2h.mirror = true;
		setRotation(arm2h, 0F, -2.733351F, 0F);
		arm2i = new ModelRenderer(this, 0, 0);
		arm2i.addBox(0F, 0F, 0F, 2, 2, 2);
		arm2i.setRotationPoint(-1.8F, 0F, -10.3F);
		arm2i.setTextureSize(64, 32);
		arm2i.mirror = true;
		setRotation(arm2i, 0F, -3.141593F, 0F);
		arm2j = new ModelRenderer(this, 0, 0);
		arm2j.addBox(0F, 0F, 0F, 2, 2, 2);
		arm2j.setRotationPoint(-2.4F, 0F, -10.4F);
		arm2j.setTextureSize(64, 32);
		arm2j.mirror = true;
		setRotation(arm2j, 0F, -2.872977F, 0F);
		nose1 = new ModelRenderer(this, 0, 21);
		nose1.addBox(0F, 0F, 0F, 2, 1, 1);
		nose1.setRotationPoint(-13.5F, 0.3F, -1.5F);
		nose1.setTextureSize(64, 32);
		nose1.mirror = true;
		setRotation(nose1, 0F, 0F, 0F);
		nose2 = new ModelRenderer(this, 0, 21);
		nose2.addBox(0F, 0F, 0F, 2, 1, 1);
		nose2.setRotationPoint(-13.5F, 0.8F, -0.5F);
		nose2.setTextureSize(64, 32);
		nose2.mirror = true;
		setRotation(nose2, 0F, 0F, 0F);
		nose3 = new ModelRenderer(this, 0, 21);
		nose3.addBox(0F, 0F, 0F, 2, 1, 1);
		nose3.setRotationPoint(-13.5F, 0.25F, 0.5F);
		nose3.setTextureSize(64, 32);
		nose3.mirror = true;
		setRotation(nose3, 0F, 0F, 0F);
		handle = new ModelRenderer(this, 0, 15);
		handle.addBox(0F, 0F, 0F, 5, 1, 2);
		handle.setRotationPoint(-0.2F, 1F, -1F);
		handle.setTextureSize(64, 32);
		handle.mirror = true;
		setRotation(handle, 0F, 0F, 1.041001F);
		trigger1 = new ModelRenderer(this, 18, 15);
		trigger1.addBox(0F, 0F, 0F, 2, 1, 2);
		trigger1.setRotationPoint(-1.2F, 3F, -1F);
		trigger1.setTextureSize(64, 32);
		trigger1.mirror = true;
		setRotation(trigger1, 0F, 0F, 0F);
		trigger2 = new ModelRenderer(this, 29, 15);
		trigger2.addBox(0F, 0F, 0F, 1, 1, 2);
		trigger2.setRotationPoint(-2.2F, 2F, -1F);
		trigger2.setTextureSize(64, 32);
		trigger2.mirror = true;
		setRotation(trigger2, 0F, 0F, 0F);
		string1 = new ModelRenderer(this, 0, 27);
		string1.addBox(0F, 0F, 0F, 13, 1, 1);
		string1.setRotationPoint(-3F, 1F, -12F);
		string1.setTextureSize(64, 32);
		string1.mirror = true;
		setRotation(string1, 0F, -0.8805538F, -0.2570796F);
		string2 = new ModelRenderer(this, 29, 27);
		string2.addBox(0F, 0F, 0F, 12, 1, 1);
		string2.setRotationPoint(-3.2F, 1F, 10.5F);
		string2.setTextureSize(64, 32);
		string2.mirror = true;
		setRotation(string2, 0F, 0.8858446F, -0.2532596F);
		string3 = new ModelRenderer(this, 0, 30);
		string3.addBox(0F, 0F, 0F, 1, 1, 4);
		string3.setRotationPoint(4F, -1F, -2F);
		string3.setTextureSize(64, 32);
		string3.mirror = true;
		setRotation(string3, 0F, 0F, 0F);
		stringHolder = new ModelRenderer(this, 51, 8);
		stringHolder.addBox(0F, 0F, 0F, 1, 2, 2);
		stringHolder.setRotationPoint(3F, -2F, -1F);
		stringHolder.setTextureSize(64, 32);
		stringHolder.mirror = true;
		setRotation(stringHolder, 0F, 0F, 0F);
		reloadingString1 = new ModelRenderer(this, 0, 39);
		reloadingString1.addBox(0F, 0F, 0F, 1, 1, 9);
		reloadingString1.setRotationPoint(-3F, 1F, -11F);
		reloadingString1.setTextureSize(64, 32);
		reloadingString1.mirror = true;
		setRotation(reloadingString1, 0.2276157F, 0F, 0F);
		reloadingString2 = new ModelRenderer(this, 22, 40);
		reloadingString2.addBox(0F, 0F, 0F, 1, 1, 8);
		reloadingString2.setRotationPoint(-3F, -1F, 2.2F);
		reloadingString2.setTextureSize(64, 32);
		reloadingString2.mirror = true;
		setRotation(reloadingString2, -0.2443461F, 0F, 0F);
		reloadingString3 = new ModelRenderer(this, 43, 41);
		reloadingString3.addBox(0F, 0F, 0F, 1, 1, 5);
		reloadingString3.setRotationPoint(-3F, -1F, -2.5F);
		reloadingString3.setTextureSize(64, 32);
		reloadingString3.mirror = true;
		setRotation(reloadingString3, 0F, 0F, 0F);
		arrowBody = new ModelRenderer(this, 0, 54);
		arrowBody.addBox(0F, 0F, 0F, 18, 1, 1);
		arrowBody.setRotationPoint(-14F, -1F, -0.5F);
		arrowBody.setTextureSize(64, 32);
		arrowBody.mirror = true;
		setRotation(arrowBody, 0F, 0F, 0F);
		arrowHead1 = new ModelRenderer(this, 48, 52);
		arrowHead1.addBox(0F, 0F, 0F, 1, 1, 3);
		arrowHead1.setRotationPoint(-14F, -1F, 0.3F);
		arrowHead1.setTextureSize(64, 32);
		arrowHead1.mirror = true;
		setRotation(arrowHead1, 0F, 0.7853982F, 0F);
		arrowHead2 = new ModelRenderer(this, 48, 52);
		arrowHead2.addBox(0F, 0F, 0F, 1, 1, 3);
		arrowHead2.setRotationPoint(-13.2F, -1F, 0.3F);
		arrowHead2.setTextureSize(64, 32);
		arrowHead2.mirror = true;
		setRotation(arrowHead2, 0F, 2.356194F, 0F);
		arrowHead3 = new ModelRenderer(this, 39, 54);
		arrowHead3.addBox(0F, 0F, 0F, 3, 1, 1);
		arrowHead3.setRotationPoint(-11F, -1.8F, -0.5F);
		arrowHead3.setTextureSize(64, 32);
		arrowHead3.mirror = true;
		setRotation(arrowHead3, 0F, 0F, 2.530727F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		base.render(f5);
		arm1a.render(f5);
		arm1b.render(f5);
		arm1c.render(f5);
		arm1d.render(f5);
		arm1e.render(f5);
		arm1f.render(f5);
		arm1g.render(f5);
		arm1h.render(f5);
		arm1i.render(f5);
		arm2a.render(f5);
		arm2b.render(f5);
		arm2c.render(f5);
		arm2d.render(f5);
		arm2e.render(f5);
		arm2f.render(f5);
		arm2g.render(f5);
		arm2h.render(f5);
		arm2i.render(f5);
		arm2j.render(f5);
		nose1.render(f5);
		nose2.render(f5);
		nose3.render(f5);
		handle.render(f5);
		trigger1.render(f5);
		trigger2.render(f5);
		stringHolder.render(f5);
		
		if(packet.crossbowMode == 1){
			reloadingString1.render(f5);
			reloadingString2.render(f5);
			reloadingString3.render(f5);
		}
		
		else{
			if(packet.crossbowMode == 3){
				if(packet.crossbowMode == 1){
					reloadingString1.render(f5);
					reloadingString2.render(f5);
					reloadingString3.render(f5);
				}
				
				else{
					string1.render(f5);
					string2.render(f5);
					string3.render(f5);
					arrowBody.render(f5);
					arrowHead1.render(f5);
					arrowHead2.render(f5);
					arrowHead3.render(f5);
				}
			}
			
			string1.render(f5);
			string2.render(f5);
			string3.render(f5);
			arrowBody.render(f5);
			arrowHead1.render(f5);
			arrowHead2.render(f5);
			arrowHead3.render(f5);
		}
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
