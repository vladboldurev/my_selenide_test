package com.automationpractice.myselenidetest.widgets;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;




import com.automationpractice.myselenidetest.widgets.elements.LinkElement;


public class MainTopMenuWidget extends AbstractWidget{

    private final By ROOT_ELEMENT = By.id("block_top_menu");
    private final By WOMEN_MENU = byText("Women");
    private final By DRESSES_MENU = byCssSelector("ul[class*=\"sf-menu\"] > li  > a[title=\"Dresses\"]");
    private final By T_SHIRTS = byText("T-shirts");
    private final By WOMEN_TOP_SUB_MENU = byText("Tops");
    private final By WOMEN_TOP_BLOUSES_SUB_MENU = byCssSelector("ul[class*=\"submenu-container\"] a[title=\"Blouses\"]");
    private final By WOMEN_TOP_T_SHIRTS_SUB_MENU = byCssSelector("ul[class*=\"submenu-container\"] a[title=\"T-shirts\"]");
    private final By WOMEN_DRESSES_SUB_MENU = byText("Dresses");
    private final By WOMEN_CASUAL_DRESSES_SUB_MENU = byCssSelector("ul[class*=\"submenu-container\"] a[title=\"Casual Dresses\"]");
    private final By WOMEN_EVENING_DRESSES_SUB_MENU = byCssSelector("ul[class*=\"submenu-container\"] a[title=\"Evening Dresses\"]");
    private final By WOMEN_SUMMER_DRESSES_SUB_MENU = byCssSelector("ul[class*=\"submenu-container\"] a[title=\"Summer Dresses\"]");


    public MainTopMenuWidget(){
        setRootElement(ROOT_ELEMENT);
    }

    public LinkElement womenMenu(){
        return new LinkElement(getRootElement().find(WOMEN_MENU).parent());
    }

    public LinkElement dressesMenu(){
        return new LinkElement(getRootElement().find(DRESSES_MENU).parent());
    }

    public LinkElement tShirtsMenu(){
        return new LinkElement(getRootElement().find(T_SHIRTS).parent());
    }

    public LinkElement womenSubMenu(){
        return new LinkElement(this.womenMenu().getRootElement().find(UL_TAG));
    }

    public LinkElement dressesSubMenu(){
        return new LinkElement(this.dressesMenu().getRootElement().find(UL_TAG));
    }

    public LinkElement womenTopsSubMenu(){
        return new LinkElement(this.womenSubMenu().getRootElement().find(WOMEN_TOP_SUB_MENU).parent());
    }

    public LinkElement womenDressesSubMenu(){
        return new LinkElement(this.womenSubMenu().getRootElement().find(WOMEN_DRESSES_SUB_MENU).parent());
    }

    public LinkElement womenTopsTShirtsSubMenu(){
        return new LinkElement(this.womenTopsSubMenu().getRootElement().find(WOMEN_TOP_T_SHIRTS_SUB_MENU).parent());
    }

    public LinkElement womenTopsBlousesSubMenu(){
        return new LinkElement(this.womenTopsSubMenu().getRootElement().find(WOMEN_TOP_BLOUSES_SUB_MENU).parent());
    }

    public LinkElement womenCasualDressesSubMenu(){
        return new LinkElement(this.womenDressesSubMenu().getRootElement().find(WOMEN_CASUAL_DRESSES_SUB_MENU).parent());
    }

    public LinkElement womenEveningDressesSubMenu(){
        return new LinkElement(this.womenTopsSubMenu().getRootElement().find(WOMEN_EVENING_DRESSES_SUB_MENU).parent());
    }

    public LinkElement womenSummerDressesSubMenu(){
        return new LinkElement(this.womenTopsSubMenu().getRootElement().find(WOMEN_SUMMER_DRESSES_SUB_MENU).parent());
    }

    public MainTopMenuWidget hoverWomenMenu(){
        this.womenMenu().hover();
        return this;
    }

    public MainTopMenuWidget hoverDressesMenu(){
        this.dressesMenu().hover();
        return this;
    }

    public MainTopMenuWidget hoverTShirtsMenu(){
        this.tShirtsMenu().hover();
        return this;
    }

    public void womenSubMenuShouldBeVisible(){ this.womenSubMenu().waitForVisible(); }

    public void dressesSubMenuShouldBeVisible(){ this.dressesSubMenu().waitForVisible(); }
}
