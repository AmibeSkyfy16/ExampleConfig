package ch.skyfy.exampleconfig.config;

import java.util.ArrayList;
import java.util.List;

public class CustomStructureGeneration {
    public int spacing;
    public List<String> blacklistedBiomes;
    public CustomStructureGeneration() {
        spacing = 128;
        blacklistedBiomes = new ArrayList<>(){{
           add("badlands") ;
        }};
    }
}
