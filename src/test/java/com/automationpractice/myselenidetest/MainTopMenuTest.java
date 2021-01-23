package com.automationpractice.myselenidetest;

import com.automationpractice.myselenidetest.config.BaseTest;
import com.automationpractice.myselenidetest.widgets.MainTopMenuPage;
import org.junit.jupiter.api.Test;

public class MainTopMenuTest extends BaseTest {

    @Test
    public void checkMainTopMenu(){
        MainTopMenuPage mainTopMenuPage = new MainTopMenuPage();
        mainTopMenuPage.hoverWomenMenu()
                       .womenSubMenuShouldBeVisible();

        mainTopMenuPage.hoverDressesMenu()
                       .dressesSubMenuShouldBeVisible();

    }
}
