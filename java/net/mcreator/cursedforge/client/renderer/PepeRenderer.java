package net.mcreator.cursedforge.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.CreeperRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.cursedforge.entity.PepeEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class PepeRenderer extends MobRenderer<PepeEntity, CreeperRenderState, CreeperModel> {
	private PepeEntity entity = null;

	public PepeRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public CreeperRenderState createRenderState() {
		return new CreeperRenderState();
	}

	@Override
	public void extractRenderState(PepeEntity entity, CreeperRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(CreeperRenderState state) {
		return ResourceLocation.parse("cursed_forge:textures/entities/image.png");
	}

	@Override
	protected void scale(CreeperRenderState state, PoseStack poseStack) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}
}