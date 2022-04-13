package ch.skyfy.exampleconfig.config;

public class globalConfig {
    public boolean sendInfoMessageToPlayerWhoJoining;
    public boolean displayToolTips;
    public int delayBetweenNewToolTips;
    public globalConfig() {
        sendInfoMessageToPlayerWhoJoining = true;
        displayToolTips = true;
        delayBetweenNewToolTips = 360_000;
    }
}
