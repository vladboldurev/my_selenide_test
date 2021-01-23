package com.automationpractice.myselenidetest.widgets.elements;

import com.codeborne.selenide.SelenideElement;

public class LinkElement extends Element {

    private String href;

    public LinkElement(SelenideElement container) {
        this(container, new String(""));
    }

    public LinkElement(SelenideElement container, String href) {
        super(container);
        this.href = href;
    }

}
