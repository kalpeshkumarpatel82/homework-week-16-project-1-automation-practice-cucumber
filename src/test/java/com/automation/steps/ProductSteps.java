package com.automation.steps;
/* 
 Created by Kalpesh Patel
 */

import com.automation.pages.CommonPage;
import com.automation.pages.MyAccountPage;
import com.automation.pages.ProductPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ProductSteps {
    @And("^I add below product to cart$")
    public void iAddBelowProductToCart(DataTable dataTable) {
        List<List<String>> productCart = dataTable.asLists(String.class);
        for (List<String> data : productCart) {
            if (data.get(0).equalsIgnoreCase("Dresses")) {
                new MyAccountPage().clickOnDressesTopMenu();
                ;
            }
            if (data.get(1).equalsIgnoreCase("CASUAL DRESSES")) {
                new MyAccountPage().clickOnCasualDressesLink();
            }
            if (data.get(2).equalsIgnoreCase("Printed Dress")) {
                new CommonPage().clickOnPrintedDress();
            }
            if (data.get(4).equalsIgnoreCase("2")) {
                new ProductPage().setQuantity();
                new ProductPage().setQuantity(data.get(4));
                new ProductPage().setAddToCard();
                new ProductPage().setCloseConfirmMessage();
            }

            if (data.get(0).equalsIgnoreCase("Women")) {
                new MyAccountPage().clickOnWomenTab();
            }
            if (data.get(1).equalsIgnoreCase("TOPS")) {
                new MyAccountPage().clickOnTopMenu();
            }
            if (data.get(2).equalsIgnoreCase("Faded Short Sleeve T-shirts")) {
                new CommonPage().clickOnFadedShortSleeveTShirt();
            }
            if (data.get(4).equalsIgnoreCase("3")) {
                new ProductPage().setQuantity();
                new ProductPage().setQuantity(data.get(4));
                new ProductPage().setAddToCard();
                new ProductPage().setCloseConfirmMessage();
            }
        }
    }

    @Then("^I shall validate shopping cart as below$")
    public void iShallValidateShoppingCartAsBelow(DataTable dataTable) {
        List<List<String>> productCart = dataTable.asLists(String.class);
        for(List<String> data : productCart){
            if(data.get(0).equalsIgnoreCase("Printed Dress")){
                Assert.assertEquals(data,new MyAccountPage().getTextFromShoppingCartOfPrintedDress());
            }

            if(data.get(0).equalsIgnoreCase("Faded Short Sleeve T-shirts")){
                Assert.assertEquals(data,new MyAccountPage().getTextFromShoppingCartOfFadedTShirt());
            }
        }
    }

    @Then("^I shall be able to Buy the product$")
    public void iShallBeAbleToBuyTheProduct() {
        new MyAccountPage().clickOnProceedToCheckOut();
        new MyAccountPage().clickOnProceedToCheckOutOnAddress();
        new MyAccountPage().clickOnProceedToCheckOutOnShipping();
    }

    @And("^I shall be able to Buy using cheque payment$")
    public void iShallBeAbleToBuyUsingChequePayment() {
        new MyAccountPage().clickOnPayByCheck();
        new MyAccountPage().confirmationOrder();
    }
}
