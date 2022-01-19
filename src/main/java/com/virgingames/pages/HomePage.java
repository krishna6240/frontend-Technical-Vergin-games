package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() { PageFactory.initElements(driver,this); }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log In')]")
    WebElement loginText;


    public String verifyLoginText() {
        Reporter.log("Clicking on login button" + loginText.toString());
        log.info("Clicking on login button" + loginText.toString());
        return getTextFromElement(loginText);
    }

    public Boolean verifyLoginBtnIsDisplayed() {
        Reporter.log("Login Button is Displayed " + loginText.toString());
        log.info("Login Button is Displayed " + loginText.toString());
        return loginText.isDisplayed();
    }




}
