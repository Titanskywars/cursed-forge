/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cursedforge.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.cursedforge.block.SnowlandPortalBlock;
import net.mcreator.cursedforge.block.MarioBlock;
import net.mcreator.cursedforge.CursedForgeMod;

import java.util.function.Function;

public class CursedForgeModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CursedForgeMod.MODID);
	public static final DeferredBlock<Block> MARIO = register("mario", MarioBlock::new);
	public static final DeferredBlock<Block> SNOWLAND_PORTAL = register("snowland_portal", SnowlandPortalBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}