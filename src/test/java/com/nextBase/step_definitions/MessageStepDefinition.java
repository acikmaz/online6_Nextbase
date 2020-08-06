package com.nextBase.step_definitions;
import com.nextBase.pages.ActiveStreamPage;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.concurrent.TimeUnit;

public class MessageStepDefinition {

    ActiveStreamPage activeStreamPage = new ActiveStreamPage();

    @Given("User should click Active stream module button")
    public void user_should_click_active_stream_module_button() {
       activeStreamPage.messageIcon.click();

    }

    @When("User click on Message button")
    public void user_click_on_message_button() {
        activeStreamPage.messageIcon.click();
    }
    @Then("User should click on upload files icon")
    public void user_should_click_on_upload_files_icon() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        activeStreamPage.uploadFilesIcon.click();

    }

}
