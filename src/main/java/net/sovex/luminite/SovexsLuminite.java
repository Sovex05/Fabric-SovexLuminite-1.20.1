package net.sovex.luminite;

import net.fabricmc.api.ModInitializer;

import net.sovex.luminite.item.ModItemGroups;
import net.sovex.luminite.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SovexsLuminite implements ModInitializer {
	public static final String MOD_ID = "sovexs-luminite";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
	}
}