package com.tutoralninja.pages;

import com.tutoralninja.utility.Utility;
import org.openqa.selenium.By;

public class HPLP3065Page extends Utility {
    By verifyHPLP3065Text = By.xpath("//div[@id='content']/div/div[2]/h1");
    By selectDate = By.xpath("//div[@id='content']/div/div[2]/div[2]/div[1]/div/input");
    By quantity = By.xpath("//div[@id='content']/div/div[2]/div[2]/div[2]/input[1]");
    By addToCart = By.xpath("//div[@id='content']/div/div[2]/div[2]/div[2]/button");
    By verifyMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCartButton = By.xpath("//nav[@id='top']/div/div[2]/ul/li[4]/a/i");

    public String getHPLP3065Text() {
        return getTextFromElement(verifyHPLP3065Text);
    }

    public void changeDeliveryDate() {
        clearTextFromField(selectDate);
        sendTextToElement(selectDate, "2022-11-30");
    }

    public void selectQuantity() {
        clearTextFromField(quantity);
        sendTextToElement(quantity, "1");
    }

    public void addToCartButton() {
        mouseHoverToElementAndClick(addToCart);
    }

    public String verifySuccessMessage() {
        return getTextFromElement(verifyMessage);
    }

    public void clickShoppingCart() {
        mouseHoverToElementAndClick(shoppingCartButton);
    }

}
