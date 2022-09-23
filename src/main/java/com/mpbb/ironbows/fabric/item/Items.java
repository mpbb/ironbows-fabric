package com.mpbb.ironbows.fabric.item;

import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.fabricmc.fabric.api.event.registry.RegistryAttribute;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.SimpleRegistry;

public class Items {
	public static final SimpleRegistry<TieredBowItem> BOWS = FabricRegistryBuilder.createSimple(TieredBowItem.class, new Identifier("ironbows")).attribute(RegistryAttribute.SYNCED).buildAndRegister();
	
	public static final Item IRON_BOW = Registry.register(BOWS, new Identifier("ironbows", "iron_bow"), new TieredBowItem(BowTiers.IRON, new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item GOLDEN_BOW = Registry.register(BOWS, new Identifier("ironbows", "golden_bow"), new TieredBowItem(BowTiers.GOLDEN, new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item DIAMOND_BOW = Registry.register(BOWS, new Identifier("ironbows", "diamond_bow"), new TieredBowItem(BowTiers.DIAMOND, new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item EMERALD_BOW = Registry.register(BOWS, new Identifier("ironbows", "emerald_bow"), new TieredBowItem(BowTiers.EMERALD, new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item NETHERITE_BOW = Registry.register(BOWS, new Identifier("ironbows", "netherite_bow"), new TieredBowItem(BowTiers.NETHERITE, new Item.Settings().group(ItemGroup.COMBAT)));
}
