package net.fabricmc.example;

import net.minecraft.recipe.Ingredient;

public interface BowTier {
	int getUses();
	
	float getAttackDamageBonus();
	
	int getEnchantmentValue();
	
	Ingredient getRepairIngredient();
}
