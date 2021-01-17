package com.automationpractice.myselenidetest;

import com.automationpractice.myselenidetest.config.BaseTest;
import com.automationpractice.myselenidetest.pages.HomePage;
import com.automationpractice.myselenidetest.widgets.ProductList;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void checkTheDisplayOfThePopularProducts(){
        HomePage homePage =new HomePage();
        homePage.open();
        ProductList productList = homePage.popularTabClick();
        productList.shouldHaveProductsSize(17);
    }

    @Test
    public void checkTheDisplayOfTheBestSellerProducts(){
        HomePage homePage =new HomePage();
        homePage.open();
        ProductList productList= homePage.popularTabClick();
        productList.shouldHaveProductsSize(7);
    }


}
