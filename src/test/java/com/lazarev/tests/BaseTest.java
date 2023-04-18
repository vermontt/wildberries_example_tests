package com.lazarev.tests;

import com.codeborne.selenide.Configuration;
import com.lazarev.config.HostConfig;
import com.lazarev.pages.BasketPage;
import com.lazarev.pages.MainPage;
import com.lazarev.pages.SearchPage;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {

    public static  HostConfig config = ConfigFactory.newInstance().create(HostConfig.class);
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    BasketPage basketPage = new BasketPage();

    @BeforeAll
    static void setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;

        Configuration.baseUrl = "https://www.wildberries.ru/";

        Configuration.browser = config.getBrowser();
        Configuration.remote = config.getSelenoid();
        Configuration.browserVersion = config.getBrowserVersion();
    }
}