package com.lazarev.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${host}.properties")
public interface HostConfig extends Config {

    @Config.Key("URLSelenoid")
    String getSelenoid();

    @Config.Key("browser")
    String getBrowser();

    @Config.Key("browserVersion")
    String getBrowserVersion();
}
