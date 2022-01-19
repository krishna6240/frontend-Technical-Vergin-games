package com.virgingames.cucumber.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepdefs {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

        @Then("^I should see \"([^\"]*)\" displayed in one of the button$")
    public void iShouldSeeDisplayedInOneOfTheButton(String loginTxt)  {
        Assert.assertEquals(new HomePage().verifyLoginText(),loginTxt);
        new HomePage().verifyLoginText();

    }




}
