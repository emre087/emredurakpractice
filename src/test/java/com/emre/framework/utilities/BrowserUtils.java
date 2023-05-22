package com.emre.framework.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BrowserUtils {


    public static void sleep(int second) {
        second *= 1000;  // burada thread teki milisecondu seconda çevirdik.
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }


    }

    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle) {
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        for (String each : allWindowHandles) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("Currrent Url: " + Driver.getDriver().getCurrentUrl());
            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }

            String actualTitle = Driver.getDriver().getTitle();
            Assert.assertTrue(actualTitle.contains(expectedInTitle));


        }


    }


}
