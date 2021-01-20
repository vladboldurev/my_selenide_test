package com.automationpractice.myselenidetest;

import com.automationpractice.myselenidetest.config.BaseTest;
import com.automationpractice.myselenidetest.pages.HomePage;
import com.automationpractice.myselenidetest.widgets.ProductList;
import org.junit.jupiter.api.Test;

import com.automationpractice.myselenidetest.widgets.homepage.HomeSlider;


public class HomePageTest extends BaseTest{

    @Test
    public void checkTheDisplayOfThePopularProducts(){
        HomePage homePage =new HomePage();
        homePage.open();
        homePage.popularTabClick();
        ProductList productList = homePage.productList();
        productList.shouldHaveProductsSize(7);
    }

    @Test
    public void checkTheDisplayOfTheBestSellerProducts(){
        HomePage homePage =new HomePage();
        homePage.open();
        homePage.bestSellersTabClick();
        ProductList productList = homePage.productList();
        productList.shouldHaveProductsSize(7);
    }

    @Test
    public void checkSlider(){
        HomePage homePage =new HomePage();
        homePage.open();
        HomeSlider homeSlider = homePage.homeSlider();
//        should be visible
//        size slider
//


    }


}
