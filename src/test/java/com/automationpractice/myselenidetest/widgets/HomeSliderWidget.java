package com.automationpractice.myselenidetest.widgets;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import io.qameta.allure.Step;


public class HomeSliderWidget extends AbstractWidget {

    private final By ROOT_ELEMENT = By.id("homeslider");
    private final By PREV_BUTTON = By.cssSelector(".bx-prev");
    private final By NEXT_BUTTON = By.cssSelector(".next-prev");
    private final By SLIDER_IMAGES = By.cssSelector("li[class=\"homeslider-container\"]");

    public HomeSliderWidget(){
        setRootElement(this.ROOT_ELEMENT);
    }

    @Step
    public void prevTabClick(){
        getRootElement().find(PREV_BUTTON).click();
    }

    @Step
    public void nextTabClick(){
        getRootElement().find(NEXT_BUTTON).click();
    }

    @Step
    public ElementsCollection sliderImages(){
        return getRootElement().findAll(SLIDER_IMAGES);
    }

    @Step
    public void shouldHaveSize(int size){
        this.sliderImages().shouldHaveSize(size);
    }

    @Step
    public void shouldHaveIsImage(){
        ElementsCollection sliderImages = this.sliderImages();
        for(int i=0; i < sliderImages.size(); i++){
            sliderImages.get(i).find(IMG_TAG).isImage();
        }
    }

    public int sliderImagesSize(){
        return this.sliderImages().size();
    }

}
