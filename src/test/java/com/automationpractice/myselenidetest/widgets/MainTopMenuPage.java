package com.automationpractice.myselenidetest.widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

import com.automationpractice.myselenidetest.widgets.elements.LinkElement;


public class MainTopMenuPage {

    private static final SelenideElement container =  $("#block_top_menu");

    public SelenideElement element(){return container;}

    public LinkElement womenMenu(){
        return new LinkElement(container.find(byText("Women")).parent());
    }

    public LinkElement dressesMenu(){
        return new LinkElement(container.find(byCssSelector("ul[class*=\"sf-menu\"] > li  > a[title=\"Dresses\"]")).parent());
    }

    public LinkElement tShirtsMenu(){
        return new LinkElement(container.find(byText("T-shirts")).parent());
    }

    public LinkElement womenSubMenu(){
        return new LinkElement(this.womenMenu().element().find(byTagName("ul")));
    }

    public LinkElement dressesSubMenu(){
        return new LinkElement(this.dressesMenu().element().find(byTagName("ul")));
    }

    public LinkElement womenTopsSubMenu(){
        return new LinkElement(this.womenSubMenu().element().find(byText("Tops")).parent());
    }

    public LinkElement womenDressesSubMenu(){
        return new LinkElement(this.womenSubMenu().element().find(byText("Dresses")).parent());
    }

    public LinkElement womenTopsTShirtsSubMenu(){
        return new LinkElement(this.womenTopsSubMenu().element()
                                                      .find(byTagName("ul"))
                                                      .find(byText("T-shirts")).parent());
    }

    public LinkElement womenCasualDressesSubMenu(){
        return new LinkElement(this.womenDressesSubMenu().element()
                                                         .find(byTagName("ul"))
                                                         .find(byText("Casual Dresses")).parent());
    }

    public LinkElement womenEveningDressesSubMenu(){
        return new LinkElement(this.womenTopsSubMenu().element()
                                                      .find(byTagName("ul"))
                                                      .find(byText("Evening Dresses")).parent());
    }

    public LinkElement womenSummerDressesSubMenu(){
        return new LinkElement(this.womenTopsSubMenu().element()
                                                      .find(byTagName("ul"))
                                                      .find(byText("Summer Dresses")).parent());
    }

    public MainTopMenuPage hoverWomenMenu(){
        this.womenMenu().hover();
        return this;
    }

    public MainTopMenuPage hoverDressesMenu(){
        this.dressesMenu().hover();
        return this;
    }

    public MainTopMenuPage hoverTShirtsMenu(){
        this.tShirtsMenu().hover();
        return this;
    }

    public void womenSubMenuShouldBeVisible(){ this.womenSubMenu().shouldBeVisible(); }

    public void dressesSubMenuShouldBeVisible(){ this.dressesSubMenu().shouldBeVisible(); }
}
