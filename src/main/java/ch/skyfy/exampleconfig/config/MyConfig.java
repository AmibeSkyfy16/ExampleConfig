package ch.skyfy.exampleconfig.config;

import ch.skyfy.exampleconfig.Exampleconfig;
import ch.skyfy.exampleconfig.config.core.ConfigData;
import ch.skyfy.exampleconfig.config.xraylite.XrayLiteSettings;

/**
 *
 * This class is loaded by reflection
 *
 * This class contains all loaded configurations for the mods
 *
 * Coder can access this code
 */
public class MyConfig {
    public static final ConfigData<CustomTreeGeneration> CUSTOM_TREE_GENERATION = new ConfigData<>("generation\\CustomTreeGeneration.json", CustomTreeGeneration.class);
    public static final ConfigData<CustomBridgeGeneration> CUSTOM_BRIDGE_GENERATION = new ConfigData<>("generation\\CustomBridgeGeneration.json", CustomBridgeGeneration.class);
    public static final ConfigData<CustomStructureGeneration> CUSTOM_STRUCTURE_GENERATION = new ConfigData<>("generation\\CustomStructureGeneration.json", CustomStructureGeneration.class);
    public static final ConfigData<ItemsRarity> ITEMS_RARITY = new ConfigData<>("loot\\itemsRarity.json", ItemsRarity.class);
    public static final ConfigData<globalConfig> GLOBAL_CONFIG = new ConfigData<>("global.json", globalConfig.class);
    public static final ConfigData<XrayLiteSettings> XRAY_LITE_SETTINGS = new ConfigData<>("\\xraylite\\settings.json", XrayLiteSettings.class);
    static {
        Exampleconfig.LOGGER.info(MyConfig.class.getName() + " has been loaded");
    }
}
