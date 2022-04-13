package ch.skyfy.exampleconfig.config.betterend;

import ch.skyfy.exampleconfig.config.betterend.Biome;

import java.util.ArrayList;
import java.util.List;

public class Biomes {
    public final List<Biome> biomes;
    public Biomes() {
        biomes = new ArrayList<>();
        biomes.add(new Biome("foggy_mushroomland"));
        biomes.add(new Biome("chorus_forest"));
        biomes.add(new Biome("dust_wastelands"));
        biomes.add(new Biome("megalake"));
    }
}
