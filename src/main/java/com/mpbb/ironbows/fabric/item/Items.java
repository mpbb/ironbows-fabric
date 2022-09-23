package com.mpbb.ironbows.fabric.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {
	public static final TieredBowItem IRON_BOW = Registry.register(Registry.ITEM, new Identifier("ironbows", "iron_bow"), new TieredBowItem(BowTiers.IRON, new Item.Settings().group(ItemGroup.COMBAT)));
	public static final TieredBowItem GOLDEN_BOW = Registry.register(Registry.ITEM, new Identifier("ironbows", "golden_bow"), new TieredBowItem(BowTiers.GOLDEN, new Item.Settings().group(ItemGroup.COMBAT)));
	public static final TieredBowItem DIAMOND_BOW = Registry.register(Registry.ITEM, new Identifier("ironbows", "diamond_bow"), new TieredBowItem(BowTiers.DIAMOND, new Item.Settings().group(ItemGroup.COMBAT)));
	public static final TieredBowItem EMERALD_BOW = Registry.register(Registry.ITEM, new Identifier("ironbows", "emerald_bow"), new TieredBowItem(BowTiers.EMERALD, new Item.Settings().group(ItemGroup.COMBAT)));
	public static final TieredBowItem NETHERITE_BOW = Registry.register(Registry.ITEM, new Identifier("ironbows", "netherite_bow"), new TieredBowItem(BowTiers.NETHERITE, new Item.Settings().group(ItemGroup.COMBAT)));
}
