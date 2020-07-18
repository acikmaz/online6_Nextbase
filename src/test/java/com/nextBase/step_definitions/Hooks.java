package com.nextBase.step_definitions;

import com.nextBase.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before(order = 2)
    public void setUpScenario(){
        System.out.println("-------> Before annotation: Setting up browser");
    }

    @Before (value = "@db", order = 1)
    public void setUpDatabaseConnection(){
        System.out.println("---------> BEFORE ANNOTATION: DB CONNECTION CREATED <--------");
    }

    @After(order = 1)
    public void tearDownScenario(Scenario scenario){
        //System.out.println("-------> After annotation: Closing browser");
        //System.out.println("scenario.getName() = " + scenario.getName());
        //System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());
        //System.out.println("scenario.isFailed() = " + scenario.isFailed());

        //#1 we need to take a screen shot using SELENIUM -->
        // getScreenShotAs: to be able to use this method we have to cast our driver type to TakeScreenShot


        //#2 we are going to attach it into our report: using attach method
        //attach method accepts 3 arguments. #1: Screenshot itself #2: image type #3: current scenario's name

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

    }

    @After ("@db")
    public void tearDownDatabaseConnection(){
        System.out.println("-------> AFTER ANNOTATION: DB CONNECTION CLOSED <--------");
    }

    @BeforeStep
    public void setUpStep(){
        System.out.println("==========> BEFORESTEP: TAKING SCREENSHOT <===========");
    }

    @AfterStep
    public void tearDownStep(){
        System.out.println("==========> AFTERSTEP: TAKING SCREENSHOT <===========");
    }

}
