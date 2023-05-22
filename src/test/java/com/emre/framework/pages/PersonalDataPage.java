package com.emre.framework.pages;

import com.emre.framework.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDataPage {

    public PersonalDataPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@class='rounded w-full pl-4 ng-pristine ng-valid ng-star-inserted ng-touched']")
    public WebElement vornameInput;

    @FindBy (xpath = "(//input[@class='rounded w-full pl-4 ng-pristine ng-valid ng-star-inserted ng-touched'])[2]")
    public WebElement nachNameInput;

    @FindBy (xpath = "(//input[@class='rounded w-full pl-4 ng-pristine ng-valid ng-star-inserted ng-touched'])[1]")
    public WebElement emailAdressInput;

















}
