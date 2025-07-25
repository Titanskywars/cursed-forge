/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cursedforge.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cursedforge.item.SnowlandItem;
import net.mcreator.cursedforge.item.MyBoyfriendItem;
import net.mcreator.cursedforge.item.MintsItem;
import net.mcreator.cursedforge.item.MeatballItem;
import net.mcreator.cursedforge.item.MeatarmorItem;
import net.mcreator.cursedforge.item.MariodiskItem;
import net.mcreator.cursedforge.item.GaydiskItem;
import net.mcreator.cursedforge.item.BurgerItem;
import net.mcreator.cursedforge.item.BadpiggiesItem;
import net.mcreator.cursedforge.CursedForgeMod;

import java.util.function.Function;

public class CursedForgeModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CursedForgeMod.MODID);
	public static final DeferredItem<Item> MEATBALL = register("meatball", MeatballItem::new);
	public static final DeferredItem<Item> MINTS = register("mints", MintsItem::new);
	public static final DeferredItem<Item> BURGER = register("burger", BurgerItem::new);
	public static final DeferredItem<Item> MARIODISK = register("mariodisk", MariodiskItem::new);
	public static final DeferredItem<Item> GAYDISK = register("gaydisk", GaydiskItem::new);
	public static final DeferredItem<Item> MY_BOYFRIEND = register("my_boyfriend", MyBoyfriendItem::new);
	public static final DeferredItem<Item> BADPIGGIES = register("badpiggies", BadpiggiesItem::new);
	public static final DeferredItem<Item> PEPE_SPAWN_EGG = register("pepe_spawn_egg", properties -> new SpawnEggItem(CursedForgeModEntities.PEPE.get(), properties));
	public static final DeferredItem<Item> MARIO = block(CursedForgeModBlocks.MARIO);
	public static final DeferredItem<Item> MEATARMOR_HELMET = register("meatarmor_helmet", MeatarmorItem.Helmet::new);
	public static final DeferredItem<Item> MEATARMOR_CHESTPLATE = register("meatarmor_chestplate", MeatarmorItem.Chestplate::new);
	public static final DeferredItem<Item> MEATARMOR_LEGGINGS = register("meatarmor_leggings", MeatarmorItem.Leggings::new);
	public static final DeferredItem<Item> MEATARMOR_BOOTS = register("meatarmor_boots", MeatarmorItem.Boots::new);
	public static final DeferredItem<Item> IDIOT_SPAWN_EGG = register("idiot_spawn_egg", properties -> new SpawnEggItem(CursedForgeModEntities.IDIOT.get(), properties));
	public static final DeferredItem<Item> SNOWLAND = register("snowland", SnowlandItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}