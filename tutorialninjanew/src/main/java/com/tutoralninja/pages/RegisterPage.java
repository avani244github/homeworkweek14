package com.tutoralninja.pages;

import com.tutoralninja.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By name = By.xpath("//fieldset[@id='account']/div[2]/div/input");
    By lastName = By.xpath("//fieldset[@id='account']/div[3]/div/input");
    By eMail = By.xpath("//fieldset[@id='account']/div[4]/div/input");
    By phNumber = By.xpath("//fieldset[@id='account']/div[5]/div/input");
    By password = By.xpath("//div[@id='content']/form/fieldset[2]/div[1]/div/input");
    By confirmPassword = By.xpath("//div[@id='content']/form/fieldset[2]/div[2]/div/input");
    By subscribe = By.xpath("//div[@id='content']/form/fieldset[3]/div/div/label[1]/input");
    By privacyPolicy = By.xpath("//div[@id='content']/form/div/div/input[1]");
    By continueButton = By.xpath("//div[@id='content']/form/div/div/input[2]");
    By verifyMessage = By.xpath("//div[@id='common-success']/div/div/h1");
    By againContinueButton = By.xpath("//div[@id='common-success']/div/div/div/div/a");
    By clickOnMyAccount = By.xpath("//div[@id='top-links']/ul/li[2]/a");
    By accountLogout = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[5]/a");
    By verifyText = By.xpath("//div[@id='common-success']/div/div/h1");
    By finalContinueButton = By.xpath("//div[@id='common-success']/div/div/div/div/a");

    public void registerField(){
        sendTextToElement(name,"Avyna");
        sendTextToElement(lastName,"ahureja");
        sendTextToElement(eMail,"parekivi@hotmail.com");
        sendTextToElement(phNumber,"7876567756");
        sendTextToElement(password,"78765457111");
        sendTextToElement(confirmPassword,"78765457111");
        mouseHoverToElementAndClick(subscribe);
        mouseHoverToElementAndClick(privacyPolicy);
        clickOnElement(continueButton);

    }
    public String verifyNewMessage(){
        return getTextFromElement(verifyMessage);
    }
    public void clickOnContinueButton(){
        clickOnElement(againContinueButton);
    }
    public void myAccountLogout(){
        mouseHoverToElementAndClick(clickOnMyAccount);
        mouseHoverToElementAndClick(accountLogout);
    }
    public String verifyLogoutText(){
        return getTextFromElement(verifyText);
    }
    public void clickContinueButton(){
        clickOnElement(finalContinueButton);
    }

}
