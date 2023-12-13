package com.tutoralninja.pages;

import com.tutoralninja.utility.Utility;
import org.openqa.selenium.By;

public class ComponentPage extends Utility {
    By verifyComponentText = By.xpath("//ul[@class='nav navbar-nav']/li[3]/div/a");

    public String getComponentText() {
        return getTextFromElement(verifyComponentText);

    }
}
