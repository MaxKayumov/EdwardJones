package com.tinyProject.pages;

import com.tinyProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EdwardJonesMainPage {

    public EdwardJonesMainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Secure Login']")
    public WebElement loginLink;

}
