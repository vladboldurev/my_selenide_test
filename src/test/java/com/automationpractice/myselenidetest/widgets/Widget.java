package com.automationpractice.myselenidetest.widgets;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public class Widget {

    private final SelenideElement container;

    public Widget(SelenideElement container){
        this.container = container;
    }

    @Step
    public SelenideElement element(){ return this.container;}

    @Step
    public void click(){ this.container.click();}

    @Step
    public void hover(){ this.container.hover();}

}