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

public class CommonPage extends Utility {
    private static final Logger log = LogManager.getLogger(CommonPage.class.getName());

    public CommonPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//ul[@class='product_list grid row']//a[@class='product-name' and contains(text(),'Printed Dress')]")
    WebElement printedDress;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='product_list grid row']//a[@class='product-name' and contains(text(),'Faded Short Sleeve T-shirts')]")
    WebElement fadedShortSleeveTShirts;

    public void clickOnPrintedDress(){
        clickOnElement(printedDress);
        log.info("Entering Printed Dress Account" + printedDress.toString());
    }

    public void clickOnFadedShortSleeveTShirt(){
        clickOnElement(fadedShortSleeveTShirts);
        log.info("Entering Faced Short Sleeve T-Shirts" + fadedShortSleeveTShirts.toString());
    }


}