package com.mpbb.ironbows.fabric;

import net.fabricmc.api.ModInitializer;

import com.mpbb.ironbows.fabric.item.Items;

public class Main implements ModInitializer {

	@Override
	public void onInitialize() {
		new Items();

	}
}
