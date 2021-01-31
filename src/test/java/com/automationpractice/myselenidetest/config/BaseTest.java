package com.automationpractice.myselenidetest.config;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {

    @BeforeAll
    public static void setUp() {
        Configuration.fastSetValue = true;
        Configuration.baseUrl = "http://automationpractice.com/index.php";
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }

}
