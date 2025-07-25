package net.mcreator.cursedforge.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.PiglinRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PiglinModel;

import net.mcreator.cursedforge.entity.IdiotEntity;

public class IdiotRenderer extends MobRenderer<IdiotEntity, PiglinRenderState, PiglinModel> {
	private IdiotEntity entity = null;

	public IdiotRenderer(EntityRendererProvider.Context context) {
		super(context, new PiglinModel(context.bakeLayer(ModelLayers.PIGLIN)), 0.5f);
	}

	@Override
	public PiglinRenderState createRenderState() {
		return new PiglinRenderState();
	}

	@Override
	public void extractRenderState(IdiotEntity entity, PiglinRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(PiglinRenderState state) {
		return ResourceLocation.parse("cursed_forge:textures/entities/noob-skin-18528621.png");
	}
}