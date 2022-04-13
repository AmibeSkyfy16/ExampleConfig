package ch.skyfy.exampleconfig.config.betterend;

import ch.skyfy.exampleconfig.config.core.ConfigData;

public class BetterEndConfigs {
    public static final ConfigData<Biomes> BIOMES = new ConfigData<>("\\betterend\\generation\\biomes.json", Biomes.class);
    public static final ConfigData<Blocks> BLOCKS = new ConfigData<>("\\betterend\\generation\\blocks.json", Blocks.class);
    public static final ConfigData<Recipes> RECIPES = new ConfigData<>("\\betterend\\recipes.json", Recipes.class);
}
