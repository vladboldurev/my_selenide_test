package com.automationpractice.myselenidetest.widgets;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$$;

public class ProductList {

    private SelenideElement container;

    public ProductList(SelenideElement container){
        this.container = container;
    }

    public SelenideElement element(){
        return this.container.findAll(byCssSelector(".product_list")).findBy(visible);
    }

    public ElementsCollection productElements(){
        return element().findAll(By.cssSelector(".ajax_block_product"));
    }

    @Step
    public void shouldHaveProductsSize(int size){
        this.productElements().shouldHaveSize(size);
    }

    @Step
    public int productSize(){ return this.productElements().size();}
}
