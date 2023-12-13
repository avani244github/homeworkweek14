package com.tutoralninja.pages;

import com.tutoralninja.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By desktopLink = By.xpath("//ul[@class='nav navbar-nav']/li[1]/a");
    By showAllDesktops = By.xpath("//ul[@class='nav navbar-nav']/li[1]/div/a");
By laptopsAndNotebooksLink = By.xpath("//ul[@class='nav navbar-nav']/li[2]/a");
By showAllLaptopsAndNotebooks = By.xpath("//ul[@class='nav navbar-nav']/li[2]/div/a");
By componentLink = By.xpath("//ul[@class='nav navbar-nav']/li[3]/a");
By showAllComponent = By.xpath("//ul[@class='nav navbar-nav']/li[3]/div/a");
By shoppingCart = By.xpath("//div[@id='cart']/button");
    By clickOnMyAccount = By.xpath("//div[@id='top-links']/ul/li[2]/a");
    By selectRegister = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[1]");
    By selectLogin = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[2]");
    public void clickOnDeskToplink() {
       mouseHoverToElementAndClick(desktopLink);
       clickOnElement(showAllDesktops);
    }
    public void clickOnLaptopsAndNotebooksLink(){
        mouseHoverToElementAndClick(laptopsAndNotebooksLink);
        clickOnElement(showAllLaptopsAndNotebooks);

    }
    public void clickOnComponentLink(){
        mouseHoverToElement(componentLink);
        clickOnElement(showAllComponent);
    }
    public void clickOnShoppingCart(){
        mouseHoverToElementAndClick(shoppingCart);
    }
    public void myAccountRegister(){
        mouseHoverToElementAndClick(clickOnMyAccount);
        mouseHoverToElementAndClick(selectRegister);
    }
    public void myAccountLogin(){
        mouseHoverToElementAndClick(clickOnMyAccount);
        mouseHoverToElementAndClick(selectLogin);
    }

}
