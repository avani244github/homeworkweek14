package com.tutoralninja.pages;

import com.tutoralninja.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
By returningCostumerText = By.xpath("//div[@id='account-login']/div/div/div/div[2]/div/h2");
By eMail = By.xpath("//div[@id='content']/div/div[2]/div/form/div[1]/input");
By password = By.xpath("//div[@id='content']/div/div[2]/div/form/div[2]/input");
By loginButton = By.xpath("//div[@id='content']/div/div[2]/div/form/input");
By verifyMyAccountText = By.xpath("//div[@id='account-account']/div/div/h2[1]");
By clickOnMyAccount = By.xpath("//div[@id='top-links']/ul/li[2]/a");
By accountLogout = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[5]/a");
By logoutText = By.xpath("//div[@id='common-success']/div/div/h1");
By clickOnContinue = By.xpath("//div[@id='common-success']/div/div/div/div/a");
    public String getWelcomeText(){

      return getTextFromElement(welcomeText);
  }
public String verifyText(){
      return getTextFromElement(returningCostumerText);
}
public void loginNewMyAccount(){
        sendTextToElement(eMail,"beena_patel87@hotmail.com");
        sendTextToElement(password,"12345");
        mouseHoverToElementAndClick(loginButton);
    }
    public String verifyMyAccountText(){
        return getTextFromElement(verifyMyAccountText);
    }
    public void myAccountLogout(){
        mouseHoverToElementAndClick(clickOnMyAccount);
        mouseHoverToElementAndClick(accountLogout);
    }
    public String logoutTextVerify(){
        return getTextFromElement(logoutText);
    }
    public void continueButton(){
        clickOnElement(clickOnContinue);
    }
}
