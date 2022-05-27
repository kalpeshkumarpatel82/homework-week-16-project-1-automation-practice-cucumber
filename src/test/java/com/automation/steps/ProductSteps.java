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
            new MyAccountPage().selectItemFromTopMenu(data.get(0));
            new MyAccountPage().selectItemFromSubCategoryMenu(data.get(1));
            new CommonPage().selectItemToBuy(data.get(2));
            Assert.assertEquals(data.get(3), new ProductPage().getProductRefName());
            new ProductPage().setQuantity(data.get(4));
            new ProductPage().setAddToCard();
            new ProductPage().setCloseConfirmMessage();
        }
        new MyAccountPage().clickOnCartButton();
    }

    @Then("^I shall validate shopping cart as below$")
    public void iShallValidateShoppingCartAsBelow(DataTable dataTable) {
        List<List<String>> productCart = dataTable.asLists(String.class);
        for (List<String> data : productCart) {
            Assert.assertEquals(data, new MyAccountPage().getTextFromShoppingCart(data.get(0)));
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
