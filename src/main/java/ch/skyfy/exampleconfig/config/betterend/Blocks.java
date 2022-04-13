package ch.skyfy.exampleconfig.config.betterend;

import java.util.HashMap;
import java.util.Map;

public class Blocks {
    public final Map<String, Boolean> generatedBlocks;
    public Blocks() {
        generatedBlocks = new HashMap<>();
        generatedBlocks.put("endstone_dust", true);
        generatedBlocks.put("end_mycelium", true);
        generatedBlocks.put("chorus_nylium", true);
    }
}
