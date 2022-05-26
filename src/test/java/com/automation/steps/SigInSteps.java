package com.automation.steps;
/* 
 Created by Kalpesh Patel
 */

import com.automation.pages.AuthPage;
import com.automation.pages.HomePage;
import com.automation.pages.MyAccountPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SigInSteps {
    @Given("^I am on the Sign In Page$")
    public void iAmOnTheSignInPage() {
        new HomePage().clickOnSignInButton();
    }

    @When("^Login using newly create credentials$")
    public void loginUsingNewlyCreateCredentials() {
        new AuthPage().enterEmailAddress("test1234@nodomain.com");
        new AuthPage().enterPassword("Password123");
        new AuthPage().clickOnSignInButton();

    }

    @Then("^I shall verify the address information in my address section$")
    public void iShallVerifyTheAddressInformationInMyAddressSection() {
        new MyAccountPage().clickOnMyAddressButton();
        String[] expected = {"Ramlal Mohanlal", "Yahoo", "111 Mercury Plaza Behind City Park", "Mumbai, Utah 45678", "United States", "011112344556", "02245675312"};
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], new MyAccountPage().getAddressInfo()[i]);
        }
    }


}
