package com.github.thedeathlycow.moregeodes.features;

import com.github.thedeathlycow.moregeodes.tag.ModBiomeTags;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;

import java.util.Objects;

public class ModFeatures {

    public static void placeFeaturesInBiomes() {
        BiomeModifications.addFeature
                (
                        BiomeSelectors.categories(Biome.Category.MOUNTAIN).or(BiomeSelectors.tag(ModBiomeTags.HAS_EMERALD_GEODE)),
                        GenerationStep.Feature.UNDERGROUND_DECORATION,
                        Objects.requireNonNull(ModPlacedFeatures.EMERALD_GEODE.getKey().orElse(null))
                );

        BiomeModifications.addFeature
                (
                        BiomeSelectors.foundInTheNether().or(BiomeSelectors.tag(ModBiomeTags.HAS_QUARTZ_GEODE)),
                        GenerationStep.Feature.UNDERGROUND_DECORATION,
                        Objects.requireNonNull(ModPlacedFeatures.QUARTZ_GEODE.getKey().orElse(null))
                );

        BiomeModifications.addFeature
                (
                        BiomeSelectors.foundInOverworld().or(BiomeSelectors.tag(ModBiomeTags.HAS_DIAMOND_GEODE)),
                        GenerationStep.Feature.UNDERGROUND_DECORATION,
                        Objects.requireNonNull(ModPlacedFeatures.DIAMOND_GEODE.getKey().orElse(null))
                );
    }
}
