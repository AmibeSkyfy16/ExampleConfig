package ch.skyfy.exampleconfig.config.core;

public class ConfigData<C> {
    public final C config;
    public ConfigData(String relativeFilePath, Class<C> cClass) {
        config = ConfigUtils.getOrCreateConfig(cClass, relativeFilePath);
    }
}
