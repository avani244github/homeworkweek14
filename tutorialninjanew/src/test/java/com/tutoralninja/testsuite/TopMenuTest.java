package com.tutoralninja.testsuite;

import com.tutoralninja.pages.ComponentPage;
import com.tutoralninja.pages.DesktopPage;
import com.tutoralninja.pages.HomePage;
import com.tutoralninja.pages.LaptopAndNotebookPage;
import com.tutoralninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    LaptopAndNotebookPage laptopAndNotebookPage = new LaptopAndNotebookPage();
    ComponentPage componentPage = new ComponentPage();


    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.clickOnDeskToplink();
       String actualResult = desktopPage.getDesktopText();
       String expectedResult = "Desktops";
        Assert.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        homePage.clickOnLaptopsAndNotebooksLink();
        String actualResult1 = laptopAndNotebookPage.getLaptopAndNotebookText();
       String expectedResult1 = "Laptops & Notebooks";
       Assert.assertEquals(expectedResult1,actualResult1);
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        homePage.clickOnComponentLink();
        String actualResult2 = componentPage.getComponentText();
        String expectedResult2 = "Components";
       // Assert.assertEquals(expectedResult2,actualResult2);

    }
}
