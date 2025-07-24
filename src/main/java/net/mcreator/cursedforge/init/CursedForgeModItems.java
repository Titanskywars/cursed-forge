/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cursedforge.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.cursedforge.item.MyBoyfriendItem;
import net.mcreator.cursedforge.item.MintsItem;
import net.mcreator.cursedforge.item.MeatballItem;
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

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}