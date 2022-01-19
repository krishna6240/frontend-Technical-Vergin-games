package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "username")
    WebElement sendvalueUsername;
    @FindBy(id = "password")
    WebElement sendvaluePass;
    @FindBy(xpath = "//a[contains(text(),'Log In')]")
    WebElement clickOnSignInButton;
    @FindBy(className = "login_submit")
    WebElement loginsubmitbtn;
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement verifyAuthentication;
    public void signInWithUserNameAndPassword(String userName, String password) {
        sendTextToElement(sendvalueUsername, userName);
        sendTextToElement(sendvaluePass, password);
    }
    public void clickOnLoginBtn(){
        clickOnElement(clickOnSignInButton);
    }

    public Boolean verifyLoginBtnIsDisplayed() {
        Reporter.log("Login Button is Displayed " + loginsubmitbtn.toString());
        return loginsubmitbtn.isDisplayed();
    }



}
