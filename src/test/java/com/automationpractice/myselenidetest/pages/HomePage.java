package com.automationpractice.myselenidetest.pages;

import com.automationpractice.myselenidetest.widgets.homepage.HomeSlider;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

import com.automationpractice.myselenidetest.widgets.ProductList;
import com.automationpractice.myselenidetest.widgets.elements.LinkElement;

public class HomePage {

    private final static SelenideElement centerColumn = $("#center_column");
    private final static SelenideElement homePagePopularTab =
            $("#home-page-tabs").find(byText("Popular")).parent();
    private final static SelenideElement homePageBestSellersTab =
            $("#home-page-tabs").find(byText("Best Sellers")).parent();

    @Step
    public void open(){
        Selenide.open("/");
    }

    @Step
    public void popularTabClick(){
        popularTab().click();
    }

    @Step
    public void bestSellersTabClick(){
        bestSellersTab().click();
    }

    public ProductList productList(){
        return new ProductList(centerColumn);
    }

    public HomeSlider homeSlider(){
        return new HomeSlider();
    }

    public LinkElement popularTab(){
        return new LinkElement(homePagePopularTab);
    }

    public LinkElement bestSellersTab(){
        return new LinkElement(homePageBestSellersTab);
    }



}
