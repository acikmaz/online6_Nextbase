package com.nextBase.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {
    //1-Make constructor private
    private Driver(){
    }

    private static WebDriver driver;
    private static final Logger logger = Logger.getLogger(Driver.class);


    public static WebDriver getDriver(){

        if (driver == null){
            String browser = ConfigurationReader.getProperty("browser");
            logger.info("Browser :: " + browser);


            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;
            }
        }

        return driver;

    }

    public static void closeDriver(){
        if (driver != null) {
            driver.quit();
            driver = null;

        }
    }

}