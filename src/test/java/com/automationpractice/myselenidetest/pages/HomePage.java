package com.automationpractice.myselenidetest.pages;

import com.automationpractice.myselenidetest.widgets.HomeSliderWidget;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

import com.automationpractice.myselenidetest.widgets.ProductListWidget;
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

    public ProductListWidget productList(){
        return new ProductListWidget(centerColumn);
    }

    public HomeSliderWidget homeSlider(){
        return new HomeSliderWidget();
    }

    public LinkElement popularTab(){
        return new LinkElement(homePagePopularTab);
    }

    public LinkElement bestSellersTab(){
        return new LinkElement(homePageBestSellersTab);
    }



}
