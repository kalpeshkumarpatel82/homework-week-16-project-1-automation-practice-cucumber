package com.automation.pages;
/* 
 Created by Kalpesh Patel
 */

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement quantity;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addToCard;

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]")
    WebElement closeConfirmMessage;

    public void setQuantity(String text) {
        log.info("Sending text to Quantity : " + text + " to " + quantity.toString());
        sendTextToElement(quantity, text);
    }

    public void setQuantity() {
        log.info("Clearing Quantity " + quantity.toString());
        sendTextToElement(quantity);
    }

    public void setAddToCard() {
        log.info("Clicking on Add to Cart " + addToCard.toString());
        clickOnElement(addToCard);
    }

    public void setCloseConfirmMessage() {
        log.info("Clicking on Close button " + closeConfirmMessage.toString());

        clickOnElement(closeConfirmMessage);
    }


}
