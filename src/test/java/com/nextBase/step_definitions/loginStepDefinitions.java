package com.nextBase.step_definitions;
import com.nextBase.pages.loginPage;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginStepDefinitions {
    loginPage loginPage=new loginPage();
    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("bitrix_url"));

    }

    @When("User enters valid {string} and valid {string}")
    public void user_enters_valid_and_valid(String userName, String password) {
        loginPage.login(userName, password);

    }

    @Then("User should be able to see dashboard")
    public void user_should_be_able_to_see_dashboard() {
        String expectedTitle= "Portal";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

}
