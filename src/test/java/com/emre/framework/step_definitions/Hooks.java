package com.emre.framework.step_definitions;

import com.emre.framework.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @Before   // import from io cucumber.java not junit
    public void setupScenario() {
        System.out.println("==== setting up browser using cucumber @Before");
    }

    @After
    public void teardownScenario (Scenario scenario) {

        if(scenario.isFailed()) {
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", scenario.getName());
        }

        Driver.closeDriver();

        // is gonne close the driver after every scenario
        // System.out.println("==== closing driver using cucumber @After");
        //  System.out.println("==== scenarion ended take screen shot if failed");
    }

    @BeforeStep
    public void setupStep () {
        System.out.println("------> applying setup using @Beforestep");
    }

    @AfterStep
    public void afterStep () {
        System.out.println(" -------> applying tear down using @Afterstep");
    }



}
