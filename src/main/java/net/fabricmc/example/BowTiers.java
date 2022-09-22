package net.fabricmc.example;

import java.util.function.Supplier;

import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

public enum BowTiers implements BowTier {
	IRON(768, 1.0f, 1, () -> {
		return Ingredient.ofItems(Items.IRON_INGOT);
	}), GOLDEN(576, 1.5f, 2, () -> {
		return Ingredient.ofItems(Items.GOLD_INGOT);
	}), DIAMOND(1920, 2.5f, 2, () -> {
		return Ingredient.ofItems(Items.DIAMOND);
	}), EMERALD(2304, 3.0f, 2, () -> {
		return Ingredient.ofItems(Items.EMERALD);
	}), NETHERITE(3456, 5.0f, 2, () -> {
		return Ingredient.ofItems(Items.NETHERITE_INGOT);
	});

	private final int uses;
	private final float damage;
	private final int enchantmentValue;
	private final Lazy<Ingredient> repairIngredient;

	private BowTiers(int uses, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
		this.uses = uses;
		this.damage = damage;
		this.enchantmentValue = enchantmentValue;
		this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
	}

	public int getUses() {
		return this.uses;
	}

	public float getAttackDamageBonus() {
		return this.damage;
	}

	public int getEnchantmentValue() {
		return this.enchantmentValue;
	}

	public Ingredient getRepairIngredient() {
		return this.repairIngredient.get();
	}
}
