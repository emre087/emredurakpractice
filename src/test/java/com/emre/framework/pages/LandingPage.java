package com.emre.framework.pages;

import com.emre.framework.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {



    public LandingPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//span[@class='mat-mdc-button-touch-target'])[1]")
    public WebElement pramieBetrangen;

    @FindBy (xpath = "//div[@class='flex w-full justify-center px-6 pt-5 pb-6 border-0 image-contain ng-star-inserted']")
    public WebElement firstPdfButton;


    @FindBy (xpath = "//div[@class='flex w-full justify-center px-6 pt-5 pb-6 border-0 image-contain ng-star-inserted']")
    public WebElement secondPdfButton;


    @FindBy (xpath = "(//div[@class='flex justify-center items-center'])[1]")
    public WebElement weiterButton;











}
