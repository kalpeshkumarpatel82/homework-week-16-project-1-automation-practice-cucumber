package com.automation.steps;/*
 Created by Kalpesh Patel
 */

import com.automation.pages.AuthPage;
import com.automation.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateUserSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @Then("^Navigate to SignUp page$")
    public void navigateToSignUpPage() {
        new HomePage().clickOnSignInButton();

    }

    @And("^create an account with random username$")
    public void createAnAccountWithRandomUsername() {
        new AuthPage().enterEmailAddressToCreateAnAccount("test1234@nodomain.com");
        new AuthPage().clickOnCreateAccount();
        new AuthPage().selectTitle("Mr.");
        new AuthPage().enterFirstNamePersonalInfo("Ramlal");
        new AuthPage().enterLastNamePersonalInfo("Mohanlal");
        //new AuthPage().enterEmailAddress("test1234@nodomain.com");
        new AuthPage().enterPassword("Password123");
        new AuthPage().selectBirthDate("10","8","1991");
        new AuthPage().optInNewsLetter();
        new AuthPage().optInReceiveOfferCheckBox();
        //new AuthPage().enterFirstNameOfAddress("Ramlal");
        //new AuthPage().enterLastNameOfAddress("Mohanlal");
        new AuthPage().enterCompanyName("Yahoo");
        new AuthPage().enterAddress("111 Mercury Plaza","Behind City Park");
        new AuthPage().enterCityName("Mumbai");
        new AuthPage().selectState("Utah");
        new AuthPage().enterPostcode("45678");
        //new AuthPage().selectCountry("United States");
        new AuthPage().enterAdditionalInfo("Happy Testing");
        new AuthPage().enterHomePhone("011112344556");
        new AuthPage().enterMobilePhone("02245675312");
        new AuthPage().enterAlias("mohanlal2022");
        new AuthPage().clickOnRegisterButton();
    }
}
