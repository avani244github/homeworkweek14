package com.tutoralninja.testsuite;

import com.tutoralninja.pages.*;
import com.tutoralninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsAndNotebooks extends TestBase {
    HomePage homePage = new HomePage();
    LaptopAndNotebookPage laptopAndNotebookPage = new LaptopAndNotebookPage();
    MacBookPage macBookPage = new MacBookPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        homePage.clickOnLaptopsAndNotebooksLink();
        laptopAndNotebookPage.sortPrice();

    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() {
        homePage.clickOnLaptopsAndNotebooksLink();
        laptopAndNotebookPage.sortPrice();
        laptopAndNotebookPage.clickOnMacBook();
        String actualText = macBookPage.getMacBookText();
        String expectedText = "MacBook";
        Assert.assertEquals(expectedText, actualText);
        macBookPage.clickOnAddToCart();
        String actualText1 = macBookPage.getMassage();
        String expectedText1 = "Success: You have added MacBook to your shopping cart!\n"+"×";
        Assert.assertEquals(expectedText1,actualText1);

macBookPage.clickOnShoppingCartButton();

        //String actualResult2 = shoppingCartPage.verifyShoppingCart();
       // String expectedResult2 = "Shopping Cart  (0.00kg)";
        //Assert.assertEquals(expectedResult2,actualResult2);

        String actualResult3 = shoppingCartPage.verifyMacBook();
        String expectedResult3 = "MacBook";
        Assert.assertEquals(expectedResult3, actualResult3);
shoppingCartPage.changeProductQuantity();
shoppingCartPage.clickOnUpdateTab();

String actualText2 = shoppingCartPage.verifyModifiedMessage();
//String expectedText2 = "Success: You have modified your shopping cart!\n" +
       // "×";
//Assert.assertEquals(expectedText2,actualText2);
        String actualAmount = shoppingCartPage.verifyTotal();
        String expectedAmount = "$1,204.00";
        Assert.assertEquals(expectedAmount,actualAmount);
        shoppingCartPage.clickOnCheckOutButton();

        String actualText4 = checkOutPage.checkoutText();
        String expectedText4= "Checkout";
        Assert.assertEquals(expectedText4,actualText4);

        String actualText5 = checkOutPage.newCostumerText();
        String expectedText5= "New Customer";
        Assert.assertEquals(expectedText5,actualText5);
        checkOutPage.guestButton();
        checkOutPage.continueButton();
        checkOutPage.mandatoryField();
        checkOutPage.continueToNextPage();
        checkOutPage.commentAddon();
        checkOutPage.teamsAndCondition();
        checkOutPage.finalContinueButton();

        String actualText6 = checkOutPage.verifyFinalMessages();
        String expectedText6= "Warning: No Payment options are available. Please contact us for assistance!";
        Assert.assertEquals(expectedText5,actualText5);


    }

}
