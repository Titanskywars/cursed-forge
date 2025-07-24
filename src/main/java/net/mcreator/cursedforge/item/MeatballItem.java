package net.mcreator.cursedforge.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class MeatballItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1, 100f, 0, 20000, TagKey.create(Registries.ITEM, ResourceLocation.parse("cursed_forge:meatball_repair_items")));

	public MeatballItem(Item.Properties properties) {
		super(TOOL_MATERIAL, -1f, -2.4f, properties);
	}
}