package com.tutoralninja.pages;

import com.tutoralninja.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By verifyCheckoutText = By.xpath("//div[@id='checkout-checkout']/div/div/h1");
    By verifyNewCostumerText = By.xpath("//div[@id='content']/div/div[1]/div[2]/div/div/div[1]/h2");
    By clickOnGuestButton = By.xpath("//div[@id='content']/div/div[1]/div[2]/div/div/div[1]/div[2]/label/input");
    By clickOnContinueButton = By.xpath("//div[@id='content']/div/div[1]/div[2]/div/div/div[1]/input");
    By name = By.xpath("//fieldset[@id='account']/div[2]/input");
    By surName = By.xpath("//fieldset[@id='account']/div[3]/input");
    By eMailId = By.xpath("//fieldset[@id='account']/div[4]/input");
    By phNumber = By.xpath("//fieldset[@id='account']/div[5]/input");
    By address1 = By.xpath("//fieldset[@id='address']/div[2]/input");
    By address2 = By.xpath("//fieldset[@id='address']/div[3]/input");
    By city = By.xpath("//fieldset[@id='address']/div[4]/input");
    By postCode = By.xpath("//fieldset[@id='address']/div[5]/input");
    By country = By.xpath("//fieldset[@id='address']/div[6]/select");
    By state = By.xpath("//fieldset[@id='address']/div[7]/select");
    By continuesButton = By.xpath("//div[@class='panel-collapse collapse in']/div/div[2]/div/input");
    By addCommentText = By.xpath("//div[@id='content']/div/div[3]/div[2]/div/p[2]/textarea");
    By tikOnTerms = By.xpath("//div[@id='content']/div/div[3]/div[2]/div/div[2]/div/input");
    By finalContinueButton = By.xpath("//div[@id='content']/div/div[3]/div[2]/div/div[2]/div/input[2]");
    By verifyMessages = By.xpath("//div[@id='content']/div/div[3]/div[2]/div/div[1]");

    public String checkoutText() {
        return getTextFromElement(verifyCheckoutText);

    }

    public String newCostumerText() {
        return getTextFromElement(verifyNewCostumerText);

    }

    public void guestButton() {
        mouseHoverToElementAndClick(clickOnGuestButton);
    }

    public void continueButton() {
        mouseHoverToElementAndClick(clickOnContinueButton);


    }

    public void mandatoryField() {
        sendTextToElement(name, "Anita");
        sendTextToElement(surName, "Pandya");
        sendTextToElement(eMailId, "patelavani380094@hotmail.com");
        sendTextToElement(phNumber, "7567887645");
        sendTextToElement(address1, "rto road");
        sendTextToElement(address2, "upperclass");
        sendTextToElement(city, "London");
        sendTextToElement(postCode, "TY67Uh");
        selectByVisibleTextFromDropDown(country,"United Kingdom");
        selectByVisibleTextFromDropDown(state,"East Sussex");

    }

    public void continueToNextPage() {
        mouseHoverToElementAndClick(continuesButton);
    }

    public void commentAddon() {
        sendTextToElement(addCommentText, "Move Forward");
    }

    public void teamsAndCondition() {
        mouseHoverToElementAndClick(tikOnTerms);
    }

    public void finalContinueButton() {
        mouseHoverToElementAndClick(finalContinueButton);

    }
    public String verifyFinalMessages(){
        return getTextFromElement(verifyMessages);
    }

}
