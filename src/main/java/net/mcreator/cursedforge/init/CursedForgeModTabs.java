/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cursedforge.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.cursedforge.CursedForgeMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CursedForgeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CursedForgeMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CursedForgeModItems.MEATBALL.get());
			tabData.accept(CursedForgeModItems.MARIODISK.get());
			tabData.accept(CursedForgeModItems.GAYDISK.get());
			tabData.accept(CursedForgeModItems.MY_BOYFRIEND.get());
			tabData.accept(CursedForgeModItems.BADPIGGIES.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(CursedForgeModItems.MINTS.get());
			tabData.accept(CursedForgeModItems.BURGER.get());
		}
	}
}