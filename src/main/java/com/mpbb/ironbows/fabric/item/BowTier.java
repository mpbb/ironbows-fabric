package com.mpbb.ironbows.fabric.item;

import net.minecraft.recipe.Ingredient;

public interface BowTier {
	int getUses();
	
	float getAttackDamageBonus();
	
	int getEnchantmentValue();
	
	Ingredient getRepairIngredient();
}
