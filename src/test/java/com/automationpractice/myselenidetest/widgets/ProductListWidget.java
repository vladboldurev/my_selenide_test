package com.automationpractice.myselenidetest.widgets;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$$;

public class ProductListWidget extends AbstractWidget {

    private final By PRODUCT_LIST = byCssSelector(".product_list");
    private final By PRODUCT_ELEMENTS = byCssSelector(".ajax_block_product");

    public ProductListWidget(SelenideElement rootElement){
        setRootElement(rootElement);
    }

    public SelenideElement element(){
        return getRootElement().findAll(PRODUCT_LIST).findBy(visible);
    }

    public ElementsCollection productElements(){
        return element().findAll(PRODUCT_ELEMENTS);
    }

    @Step
    public void shouldHaveProductsSize(int size){
        this.productElements().shouldHaveSize(size);
    }

    @Step
    public int productSize(){ return this.productElements().size();}
}
