package guru.qa.config;

import org.aeonbits.owner.ConfigFactory;

public class Credentials {
    public static BrowserstackConfig configBrow = ConfigFactory.create(BrowserstackConfig.class, System.getProperties());
    public static EmulatorConfig configEmul = ConfigFactory.create(EmulatorConfig.class, System.getProperties());
}
