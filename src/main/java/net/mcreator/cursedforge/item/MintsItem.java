package net.mcreator.cursedforge.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class MintsItem extends Item {
	public MintsItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(1).saturationModifier(-1f).build()));
	}
}