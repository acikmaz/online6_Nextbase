package com.nextBase.step_definitions;

import com.nextBase.pages.AddUserToMessage;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserToMessageStepDefinition {

    AddUserToMessage addUserToMessage = new AddUserToMessage();
    @Given("user should able to log in the app and click to message module")
    public void user_should_able_to_log_in_the_app_and_click_to_message_module() throws InterruptedException {
        Driver.getDriver().get("http://login2.nextbasecrm.com");
        addUserToMessage.username.sendKeys("helpdesk25@cybertekschool.com");
        addUserToMessage.password.sendKeys("UserUser");
        addUserToMessage.loginButton.click();
        Thread.sleep(3000);
         addUserToMessage.messageButton.click();

    }

    @When("user click the Add mentions icon")
    public void user_click_the_add_mentions_icon()throws InterruptedException {
        Thread.sleep(2000);
        addUserToMessage.addMentionIcon.click();
    }

    @When("user should be select employees and department")
    public void user_should_be_select_employees_and_department() throws InterruptedException {
        Thread.sleep(2000);
     addUserToMessage.employeesAndDepartmentTab.click();
    }
    @When("user should click given email")
    public void user_should_click_given_email() throws InterruptedException {
        Thread.sleep(2000);
        addUserToMessage.email.click();
    }
    @Then("user see selected email on the To container")
    public void user_see_selected_email_on_the_to_container() throws InterruptedException {
     Thread.sleep(2000);
        Assert.assertEquals(addUserToMessage.messageBox.getText(), "hr47@cybertekschool.com ");
    }
}
