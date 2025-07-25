/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cursedforge.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.cursedforge.CursedForgeMod;

public class CursedForgeModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, CursedForgeMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> MARIO = REGISTRY.register("mario", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("cursed_forge", "mario")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HOWCANIBEHOMOPHOBIC = REGISTRY.register("howcanibehomophobic", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("cursed_forge", "howcanibehomophobic")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MY_BOYFRIEND = REGISTRY.register("my_boyfriend", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("cursed_forge", "my_boyfriend")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BADPIFFIWS = REGISTRY.register("badpiffiws", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("cursed_forge", "badpiffiws")));
}