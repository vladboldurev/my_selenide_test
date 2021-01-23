package com.automationpractice.myselenidetest.widgets.homepage;

import com.automationpractice.myselenidetest.widgets.elements.Element;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import io.qameta.allure.Step;

import static  com.codeborne.selenide.Selenide.$;


public class HomeSlider{

    private static final SelenideElement container = $("#homeslider");

    @Step
    public void prevTabClick(){
        this.container.find(By.cssSelector(".bx-prev")).click();
    }

    @Step
    public void nextTabClick(){
        this.container.find(By.cssSelector(".next-prev")).click();
    }

    @Step
    public ElementsCollection sliderImages(){
        return this.container.findAll(By.cssSelector("li[class=\"homeslider-container\"]"));
    }

    @Step
    public void shouldHaveSize(int size){
        this.sliderImages().shouldHaveSize(size);
    }

    @Step
    public void shouldHaveIsImage(){
        ElementsCollection sliderImages = this.sliderImages();
        for(int i=0; i < sliderImages.size(); i++){
            sliderImages.get(i).find(By.cssSelector("img")).isImage();
        }
    }

    public int sliderImagesSize(){
        return this.sliderImages().size();
    }

}