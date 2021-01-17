package com.automationpractice.myselenidetest.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

import com.automationpractice.myselenidetest.widgets.ProductList;
import com.automationpractice.myselenidetest.widgets.LinkButton;

public class HomePage {

    private final static SelenideElement centerColumn = $("#center_column");
    private final static SelenideElement homePagePopularTab = $("#home-page-tabs").find(byText("Popular"));
    private final static SelenideElement homePageBestSellersTab = $("#home-page-tabs").find(byText("Best Sellers"));

    @Step
    public void open(){
        Selenide.open("/");
    }

    @Step
    public ProductList popularTabClick(){
        popularTab().click();
        return productList();
    }

    @Step
    public ProductList bestSellersTabClick(){
        popularTab().click();
        return productList();
    }

    public ProductList productList(){
        return new ProductList(centerColumn);
    }

    public LinkButton popularTab(){
        return new LinkButton(homePagePopularTab);
    }

    public LinkButton bestSellersTab(){
        return new LinkButton(homePageBestSellersTab);
    }



}
