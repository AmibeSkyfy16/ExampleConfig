package ch.skyfy.exampleconfig.config.xraylite;

public class XrayLiteSettings {
    public boolean showLava;
    public boolean showOverlay;
    public byte range;
    public XrayLiteSettings() {
        showLava = false;
        showOverlay = true;
        range = 3;
    }
}
