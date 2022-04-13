package ch.skyfy;

import ch.skyfy.exampleconfig.config.MyConfig;

public class Test {
    @org.junit.jupiter.api.Test
    public void classPath(){
        var getCanonicalName = MyConfig.class.getCanonicalName();
        System.out.println(getCanonicalName);
    }
}
