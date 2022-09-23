package com.mpbb.ironbows.fabric;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mpbb.ironbows.fabric.item.Items;

public class IronBows implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		new Items();
		LOGGER.info("Hello Fabric world!");
		Items.BOWS.forEach(bow -> {
			ModelPredicateProviderRegistry.register(bow, new Identifier("pull"),
					(itemStack, clientWorld, livingEntity, i) -> {
						if (livingEntity == null) {
							return 0.0F;
						}
						return livingEntity.getActiveItem() != itemStack ? 0.0F
								: (itemStack.getMaxUseTime() - livingEntity.getItemUseTimeLeft()) / 20.0F;
					});
			ModelPredicateProviderRegistry.register(bow, new Identifier("pulling"),
					(itemStack, clientWorld, livingEntity, i) -> {
						if (livingEntity == null) {
							return 0.0F;
						}
						return livingEntity.isUsingItem() && livingEntity.getActiveItem() == itemStack ? 1.0F : 0.0F;
					});
		});

	}
}
