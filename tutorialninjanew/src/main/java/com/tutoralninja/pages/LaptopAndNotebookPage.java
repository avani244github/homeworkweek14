package com.tutoralninja.pages;

import com.tutoralninja.utility.Utility;
import org.openqa.selenium.By;

public class LaptopAndNotebookPage extends Utility {
    By verifyLaptopAndNoteBookText = By.tagName("h2");
    By selectPriceHighToLow = By.xpath("//div[@id='content']/div[3]/div[3]/div/select");
By selectMacBook = By.xpath("//div[@id='content']/div[4]/div[4]/div/div[2]/div[1]/h4/a");
By clickOnShoppingCart = By.xpath("");



    public String getLaptopAndNotebookText() {
        return getTextFromElement(verifyLaptopAndNoteBookText);

    }
    public void sortPrice(){
        selectByIndexFromDropDown(selectPriceHighToLow,4);

    }
    public void clickOnMacBook(){
mouseHoverToElementAndClick(selectMacBook);
    }
}
