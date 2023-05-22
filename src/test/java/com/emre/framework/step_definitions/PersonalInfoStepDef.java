package com.emre.framework.step_definitions;

import com.emre.framework.pages.LandingPage;
import com.emre.framework.pages.PersonalDataPage;
import com.emre.framework.utilities.BrowserUtils;
import com.emre.framework.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import javax.swing.*;

public class PersonalInfoStepDef {
    LandingPage x = new LandingPage();
    PersonalDataPage y =  new PersonalDataPage();

    @Given("I am on onpier onboarding page")
    public void i_am_on_onpier_onboarding_page() {
        Driver.getDriver().get("https://thg-greenair.dev.wgv.onpier.de/onboarding");
        BrowserUtils.sleep(3);

    }
    @When("I click pramie beantragen")
    public void i_click_pramie_beantragen() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,400)");
        x.pramieBetrangen.click();
        BrowserUtils.sleep(3);


    }
    @When("I upload PDF files to vorderseite and rückseite")
    public void i_upload_pdf_files_to_vorderseite_and_rückseite() {
        x.firstPdfButton.sendKeys("C:\\Users\\emred\\OneDrive\\Desktop");
        BrowserUtils.sleep(3);
        x.secondPdfButton.sendKeys("C:\\Users\\emred\\OneDrive\\Desktop");
        BrowserUtils.sleep(2);



    }
    @When("I click weiter")
    public void i_click_weiter() {
        x.weiterButton.click();
        BrowserUtils.sleep(3);

    }
    @Then("verify that I am in the personal information page")
    public void verify_that_i_am_in_the_personal_information_page() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "THG-Prämie";
        Assert.assertTrue(expectedTitle.equals(actualTitle));

    }

}
