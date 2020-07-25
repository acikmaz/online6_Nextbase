package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class messagePage {

    public messagePage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//*[@id='feed-add-post-form-tab-message']/span")
    public WebElement messageTextButton;

    @FindBy(xpath = "//*[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFileIcon;


    @FindBy(xpath = "(//span[@title='Upload files'])[1]")
    public WebElement clickuploadImageElement;


}
