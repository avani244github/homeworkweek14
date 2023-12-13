package com.tutoralninja.pages;

import com.tutoralninja.utility.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {
    By verifyDesktopText = By.xpath("//div[@id='content']/h2");
    By sortAlphabeticalOrder = By.id("input-sort");

By selectProduct = By.xpath("//div[@id='content']/div[4]/div[3]/div/div[2]/div[1]/h4/a");
    public String getDesktopText() {
      return getTextFromElement(verifyDesktopText);

    }
    public void selectZtoA(){
        selectByVisibleTextFromDropDown(sortAlphabeticalOrder,"Name (Z - A)");

    }
    public void selectAtoZ(){

        selectByVisibleTextFromDropDown(sortAlphabeticalOrder,"Name (A - Z)");
    }
    public void selectHpLp3065(){
        mouseHoverToElementAndClick(selectProduct);
    }
}
