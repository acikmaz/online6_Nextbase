package com.nextBase.pages;
import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ActiveStreamPage {

    public ActiveStreamPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText ="Activity Stream")
    public WebElement activeStreamButton;
    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageIcon;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesIcon;
}




