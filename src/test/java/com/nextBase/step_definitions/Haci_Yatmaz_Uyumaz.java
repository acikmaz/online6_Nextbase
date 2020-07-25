package com.nextBase.step_definitions;

import com.nextBase.pages.landingPage;
import com.nextBase.pages.loginPage;
import com.nextBase.pages.messagePage;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Haci_Yatmaz_Uyumaz {

    loginPage loginPage = new loginPage();

    messagePage messagePage = new messagePage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);






    @Given("User login and  go to message page")
    public void user_login_and_go_to_message_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();

    }

    @When("User clicks on message text")
    public void user_clicks_on_message_text() {

        messagePage.messageTextButton.click();

    }

    @When("User clicks on upload files icon")
    public void user_clicks_on_upload_files_icon() {

        wait.until(ExpectedConditions.visibilityOf(messagePage.uploadFileIcon));

        messagePage.uploadFileIcon.click();

    }

    @Then("User should see select document from Bitrix")
    public void user_should_see_select_document_from_bitrix() throws InterruptedException {

       Thread.sleep(3000);

       // System.out.println(messagePage.selectDocumentFromBitrix24.getText());


       Assert.assertTrue( messagePage.clickuploadImageElement.isDisplayed());

    }

}
