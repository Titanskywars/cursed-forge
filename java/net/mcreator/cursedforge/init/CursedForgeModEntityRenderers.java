/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cursedforge.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.cursedforge.client.renderer.PepeRenderer;
import net.mcreator.cursedforge.client.renderer.IdiotRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CursedForgeModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CursedForgeModEntities.PEPE.get(), PepeRenderer::new);
		event.registerEntityRenderer(CursedForgeModEntities.IDIOT.get(), IdiotRenderer::new);
	}
}