package com.automationpractice.myselenidetest.config;

import com.codeborne.selenide.Configuration;

public class BaseTest {
    {
        Configuration.fastSetValue = false;
        Configuration.baseUrl = "http://automationpractice.com/index.php";
    }
}
