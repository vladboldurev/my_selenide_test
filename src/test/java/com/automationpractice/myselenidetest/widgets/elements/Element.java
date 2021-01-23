package com.automationpractice.myselenidetest.widgets.elements;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;

public class Element {

    protected final SelenideElement container;

    public Element(SelenideElement container){
        this.container = container;
    }

    @Step
    public SelenideElement element(){ return this.container;}

    @Step
    public void click(){ this.container.click();}

    @Step
    public void hover(){ this.container.hover();}

    @Step
    public void shouldBeVisible(){
        this.container.shouldBe(visible);
    }
}