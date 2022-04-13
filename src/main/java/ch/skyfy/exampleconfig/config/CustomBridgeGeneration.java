package ch.skyfy.exampleconfig.config;

import java.util.ArrayList;
import java.util.List;

public class CustomBridgeGeneration {
    public int minSpacingBetweenTwoBridges;
    public boolean allowTreasureBridge;
    public List<String> lootForTreasureBridge;
    public CustomBridgeGeneration() {
        minSpacingBetweenTwoBridges = 64;
        allowTreasureBridge = true;
        lootForTreasureBridge = new ArrayList<>(){{
           add("gold_ingot");
           add("dirt");
           add("stone_shovel");
        }};
    }
}
