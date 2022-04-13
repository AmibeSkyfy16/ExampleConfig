package ch.skyfy.exampleconfig.config.betterend;

public class Biome {
    public final String name;
    public final boolean enabled;
    public Biome(String name) {
        this.name = name;
        enabled = true; // enabled by default
    }
}
