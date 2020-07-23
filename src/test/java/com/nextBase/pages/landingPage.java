package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage {



    public landingPage(){
        PageFactory.initElements(Driver.getDriver(), this);


    }


    @FindBy(xpath = "//input[@class = 'main-ui-filter-search-filter']")
    public WebElement filterBox;


}
