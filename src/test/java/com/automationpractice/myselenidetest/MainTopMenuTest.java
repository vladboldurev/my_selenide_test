package com.automationpractice.myselenidetest;

import com.automationpractice.myselenidetest.config.BaseTest;
import com.automationpractice.myselenidetest.widgets.MainTopMenuWidget;
import org.junit.jupiter.api.Test;

public class MainTopMenuTest extends BaseTest {

    @Test
    public void checkMainTopMenu(){
        MainTopMenuWidget mainTopMenuPage = new MainTopMenuWidget();
        mainTopMenuPage.hoverWomenMenu()
                       .womenSubMenuShouldBeVisible();

        mainTopMenuPage.hoverDressesMenu()
                       .dressesSubMenuShouldBeVisible();

    }
}
