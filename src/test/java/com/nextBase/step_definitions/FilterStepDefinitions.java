package com.nextBase.step_definitions;

import com.nextBase.pages.landingPage;
import com.nextBase.pages.loginPage;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterStepDefinitions {


    com.nextBase.pages.loginPage loginPage = new loginPage();
    com.nextBase.pages.landingPage landingPage = new landingPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

    @Given("User is on the Bitrix landing page")
    public void user_is_on_the_bitrix_landing_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();
    }



    @When("User clicks on Filter module and enters hr35@cybertekschool.com")
    public void user_clicks_on_filter_module_and_enters_hr35_cybertekschool_com() {
       // wait.until(ExpectedConditions.elementToBeClickable(landingPage.filterBox));
        landingPage.filterBox.click();
        landingPage.filterBox.sendKeys("hr35@cybertekschool.com");
    }

    @When("User enters Search")
    public void user_enters_search() {
        landingPage.filterBox.sendKeys(Keys.ENTER);
    }


    @Then("User should see all posts by hr35@cybertekschool.com on the Activity Stream")
    public void user_should_see_all_posts_by_hr35_cybertekschool_com_on_the_activity_stream() {
        WebElement username = Driver.getDriver().findElement(By.xpath("//div[@id = 'pagetitle']"));

        Assert.assertTrue(username.isDisplayed());
    }

}
