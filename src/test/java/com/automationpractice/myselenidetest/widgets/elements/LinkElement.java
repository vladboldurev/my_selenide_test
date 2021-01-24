package com.automationpractice.myselenidetest.widgets.elements;

import com.codeborne.selenide.SelenideElement;
import com.automationpractice.myselenidetest.widgets.AbstractWidget;

public class LinkElement extends  AbstractWidget{

    private String href;

    public LinkElement(SelenideElement rootElement) {
        this(rootElement, new String(""));
    }

    public LinkElement(SelenideElement rootElement, String href) {
        setRootElement(rootElement);
        this.href = href;
    }

}
