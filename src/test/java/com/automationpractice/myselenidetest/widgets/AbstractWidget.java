package com.automationpractice.myselenidetest.widgets;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class AbstractWidget {

    protected final By IMG_TAG =  byTagName("img");
    protected final By UL_TAG =  byTagName("ul");

    private SelenideElement rootElement;
    private By rootBy;

    protected SelenideElement getRootElement(){
        return (this.rootElement == null) ? $(this.rootBy): this.rootElement;
    }

    protected void setRootElement(SelenideElement rootElement){
        this.rootElement = rootElement;
    }

    protected void setRootElement(By rootElement){
        this.rootBy = rootElement;
    }

    @Step
    public AbstractWidget waitForVisible(){
        getRootElement().shouldBe(visible);
        return this;
    }

    @Step
    public AbstractWidget click(){
        getRootElement().click();
        return this;
    }

    @Step
    public AbstractWidget hover(){
        getRootElement().hover();
        return this;
    }

    public boolean isVisible(){
        return getRootElement().isDisplayed();
    }

    public WebElement getChildElementByLocator(By byLocator){
        return getRootElement().find(byLocator);
    }

    public ElementsCollection getChildElementsByLocator(By byLocator){
        return getRootElement().findAll(byLocator);
    }
}
