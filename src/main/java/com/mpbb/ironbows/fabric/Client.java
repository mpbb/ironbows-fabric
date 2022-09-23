package com.mpbb.ironbows.fabric;

import com.mpbb.ironbows.fabric.item.Items;
import com.mpbb.ironbows.fabric.item.TieredBowItem;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

public class Client implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		this.registerBowPredicate(Items.IRON_BOW);
		this.registerBowPredicate(Items.GOLDEN_BOW);
		this.registerBowPredicate(Items.DIAMOND_BOW);
		this.registerBowPredicate(Items.EMERALD_BOW);
		this.registerBowPredicate(Items.NETHERITE_BOW);
	}

	private void registerBowPredicate(TieredBowItem bowItem) {
		ModelPredicateProviderRegistry.register(bowItem, new Identifier("pull"),
				(itemStack, clientWorld, livingEntity, i) -> {
					if (livingEntity == null) {
						return 0.0F;
					}
					return livingEntity.getActiveItem() != itemStack ? 0.0F
							: (itemStack.getMaxUseTime() - livingEntity.getItemUseTimeLeft()) / 20.0F;
				});
		ModelPredicateProviderRegistry.register(bowItem, new Identifier("pulling"),
				(itemStack, clientWorld, livingEntity, i) -> {
					if (livingEntity == null) {
						return 0.0F;
					}
					return livingEntity.isUsingItem() && livingEntity.getActiveItem() == itemStack ? 1.0F : 0.0F;
				});
	}
}