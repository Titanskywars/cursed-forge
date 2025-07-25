package net.mcreator.cursedforge.item;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.cursedforge.CursedForgeMod;

public class MyBoyfriendItem extends Item {
	public MyBoyfriendItem(Item.Properties properties) {
		super(properties.stacksTo(1).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(CursedForgeMod.MODID, "my_boyfriend"))));
	}
}