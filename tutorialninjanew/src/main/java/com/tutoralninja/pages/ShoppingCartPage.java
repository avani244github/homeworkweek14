package com.tutoralninja.pages;

import com.tutoralninja.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By verifyShoppingCartText = By.xpath("//div[@id='top-links']/ul/li[4]/a");
    By verifyProductName = By.xpath("//div[@id='checkout-cart']/div/div/form/div/table/tbody/tr/td[2]/a");
    By verifyDeliveryDate = By.xpath("//div[@id='checkout-cart']/div/div/form/div/table/tbody/tr/td[2]/small");
    By verifyModel = By.xpath("//div[@id='checkout-cart']/div/div/form/div/table/tbody/tr/td[3]");
    By verifyTotal = By.xpath("//div[@id='checkout-cart']/div/div/form/div/table/tbody/tr/td[6]");
    By verifyShCartText = By.xpath("//div[@id='checkout-cart']/div/div/h1");
    By verifyProductNm = By.xpath("//div[@id='checkout-cart']/div/div/form/div/table/tbody/tr/td[2]/a");
    By changeQuantity = By.xpath("//div[@id='checkout-cart']/div/div/form/div/table/tbody/tr/td[4]/div/input");
    By updateDetails = By.xpath("//div[@id='checkout-cart']/div/div/form/div/table/tbody/tr/td[4]/div/span/button[1]");
    By verifySuccessMessageOfUpdate = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By verifyTotalAmount = By.xpath("//div[@id='checkout-cart']/div/div/form/div/table/tbody/tr/td[6]");
    By clickOnCheckOut = By.xpath("//div[@class='buttons clearfix']/div[2]/a");
    public String verifyText(){
        return getTextFromElement(verifyShoppingCartText);
    }
    public String verifyName(){
        return getTextFromElement(verifyProductName);
    }
public String verifyDate(){
        return  getTextFromElement(verifyDeliveryDate);
}
public String verifyModelNo(){
        return getTextFromElement(verifyModel);
}
public String verifyTotalAmount(){
        return getTextFromElement(verifyTotal);
}
public String verifyShoppingCart(){
        return getTextFromElement(verifyShCartText);
}
public String verifyMacBook(){
        return getTextFromElement(verifyProductNm);
}
    public void changeProductQuantity(){
        clearTextFromField(changeQuantity);
        sendTextToElement(changeQuantity,"2");
    }
    public void clickOnUpdateTab(){
        clickOnElement(updateDetails);
    }
    public String verifyModifiedMessage(){
        return getTextFromElement(verifySuccessMessageOfUpdate);
    }
    public String verifyTotal(){
        return getTextFromElement(verifyTotalAmount);
    }
    public void clickOnCheckOutButton(){
        clickOnElement(clickOnCheckOut);
    }

}
