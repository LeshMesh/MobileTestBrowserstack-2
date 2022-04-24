package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:emulator.properties"})
public interface EmulatorConfig extends Config {

        @Key("appPackage")
        String appPackage();

        @Key("appActivity")
        String appActivity();

        @Key("serverUrl")
        String serverUrl();

        @Key("appUrl")
        String appUrl();

        @Key("appPath")
        String appPath();
    }
