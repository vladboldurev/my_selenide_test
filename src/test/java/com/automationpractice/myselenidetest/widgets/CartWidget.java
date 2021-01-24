package com.automationpractice.myselenidetest.widgets;

import org.openqa.selenium.By;

public class CartWidget extends AbstractWidget{

    private final By ROOT_ELEMENT = By.className("shopping_cart");

    public CartWidget(){
        setRootElement(ROOT_ELEMENT);
    }

}
