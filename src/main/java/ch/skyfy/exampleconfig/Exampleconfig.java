package ch.skyfy.exampleconfig;

import ch.skyfy.exampleconfig.config.MyConfig;
import ch.skyfy.exampleconfig.config.core.BetterConfig;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Exampleconfig implements ModInitializer {

    public static final String MOD_ID = "exampleconfig";

    public static final Logger LOGGER = LogManager.getLogger("ExampleConfig");

    @Override
    public void onInitialize() {
        if(BetterConfig.initialize(new Class[]{MyConfig.class})) return;
        System.out.println("...");
    }
}
