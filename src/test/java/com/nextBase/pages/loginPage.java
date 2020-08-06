package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    public loginPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (name = "USER_LOGIN")
    public WebElement userNameInput;
    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;
    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMeChechButton;
    @FindBy(linkText = "Forgot your password?")
    public  WebElement forgotYourPasswordLink;
    @FindBy(className = "login-btn")
    public  WebElement logInButton;

    public void login(String username, String password) {
        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        logInButton.click();
    }




}
