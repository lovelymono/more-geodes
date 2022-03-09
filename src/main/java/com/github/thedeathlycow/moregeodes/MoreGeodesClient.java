package com.github.thedeathlycow.moregeodes;

import com.github.thedeathlycow.moregeodes.blocks.ModBlocks;
import com.github.thedeathlycow.moregeodes.features.ModFeatures;
import com.github.thedeathlycow.moregeodes.item.ModItems;
import net.fabricmc.api.ClientModInitializer;

public class MoreGeodesClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        MoreGeodes.LOGGER.info("Beginning More Geodes client initialization");
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        ModFeatures.placedFeaturesInBiomes();
        ModBlocks.registerCutouts();
        MoreGeodes.LOGGER.info("More Geodes client initialized!");
    }
}