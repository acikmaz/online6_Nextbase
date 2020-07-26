package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserToMessage {

    public AddUserToMessage(){ PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@id=\'feed-add-post-form-tab-message\']/span")
    public WebElement messageButton;

    @FindBy(xpath = "//*[@id=\'bx-b-mention-blogPostForm\']")
    public WebElement addMentionIcon;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement employeesAndDepartmentTab;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[1]/div[1]/div[1]")
    public WebElement email;

    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-item\"]/span[2]/span[1]")
    public WebElement messageBox;

    @FindBy(name = "USER_LOGIN")
    public WebElement username;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(xpath = "//input[@class = 'login-btn']")
    public WebElement loginButton;






}
