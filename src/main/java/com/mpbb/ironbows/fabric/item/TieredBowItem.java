package com.mpbb.ironbows.fabric.item;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class TieredBowItem extends BowItem {
	private final BowTier tier;

	public TieredBowItem(BowTier tier, Settings settings) {
		super(settings.maxDamage(tier.getUses()));
		this.tier = tier;
	}
	
	@Override
	public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
		// TODO Auto-generated method stub
		super.onStoppedUsing(stack, world, user, remainingUseTicks);
	}
	
	@Override
	public int getEnchantability() {
		return this.tier.getEnchantmentValue();
	}
	
	@Override
	public boolean canRepair(ItemStack stack, ItemStack ingredient) {
		return this.tier.getRepairIngredient().test(ingredient);
	}
	
	@Override
	public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
		tooltip.add(Text.literal("+" + Float.toString(this.tier.getAttackDamageBonus()) + " ")
				.append(Text.translatable("item.ironbows.damage_tooltip"))
				.formatted(Formatting.DARK_GREEN));
		super.appendTooltip(stack, world, tooltip, context);
	}

}
