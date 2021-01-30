package com.automationpractice.myselenidetest;

import com.automationpractice.myselenidetest.config.BaseTest;
import com.automationpractice.myselenidetest.pages.HomePage;
import com.automationpractice.myselenidetest.widgets.ProductListWidget;
import org.junit.jupiter.api.Test;

import com.automationpractice.myselenidetest.widgets.HomeSliderWidget;


public class HomePageTest extends BaseTest{

    @Test
    public void checkTheDisplayOfThePopularProducts(){
        HomePage homePage =new HomePage();
        homePage.open();
        homePage.popularTabClick();
        ProductListWidget productList = homePage.productList();
        productList.shouldHaveProductsSize(7);
    }

    @Test
    public void checkTheDisplayOfTheBestSellerProducts(){
        HomePage homePage =new HomePage();
        homePage.open();
        homePage.bestSellersTabClick();
        ProductListWidget productList = homePage.productList();
        productList.shouldHaveProductsSize(7);
    }

    @Test
    public void checkSlider(){
        HomePage homePage =new HomePage();
        homePage.open();
        HomeSliderWidget homeSlider = homePage.homeSlider();
        homeSlider.shouldHaveIsImage();
        homeSlider.shouldHaveSize(3);
    }


}
