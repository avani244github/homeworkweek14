package com.tutoralninja.pages;

import com.tutoralninja.utility.Utility;
import org.openqa.selenium.By;

public class MacBookPage extends Utility {
    By verifyMacBookText = By.xpath("//div[@id='content']/div/div[2]/h1");
    By addToCart = By.xpath("//div[@id='content']/div/div[2]/div[2]/div/button");
    By verifyMassage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By clickOnCart = By.xpath("//ul[@class='list-inline']/li[4]/a/i");

    public String getMacBookText() {
        return getTextFromElement(verifyMacBookText);

    }

    public void clickOnAddToCart() {
        mouseHoverToElementAndClick(addToCart);

    }

    public String getMassage() {
        return getTextFromElement(verifyMassage);
    }

    public void clickOnShoppingCartButton() {
        clickOnElement(clickOnCart);
    }
}
