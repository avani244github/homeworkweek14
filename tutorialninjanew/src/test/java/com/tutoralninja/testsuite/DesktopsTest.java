package com.tutoralninja.testsuite;

import com.tutoralninja.pages.DesktopPage;
import com.tutoralninja.pages.HPLP3065Page;
import com.tutoralninja.pages.HomePage;
import com.tutoralninja.pages.ShoppingCartPage;
import com.tutoralninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends TestBase {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    HPLP3065Page hplp3065Page = new HPLP3065Page();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        homePage.clickOnDeskToplink();
        desktopPage.selectZtoA();

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        homePage.clickOnDeskToplink();
        desktopPage.selectAtoZ();
        desktopPage.selectHpLp3065();
        hplp3065Page.getHPLP3065Text();
        hplp3065Page.changeDeliveryDate();
        hplp3065Page.selectQuantity();
        hplp3065Page.addToCartButton();

      //  String actualResult = hplp3065Page.verifySuccessMessage();
        //String expectedResult = "Success: You have added HP LP3065 to your shopping cart!\n" + "×";
       // Assert.assertEquals(expectedResult, actualResult);

        hplp3065Page.clickShoppingCart();

        String actualResult1 = shoppingCartPage.verifyText();
        String expectedResult1 = "Shopping Cart";
        Assert.assertEquals(expectedResult1, actualResult1);

        String actualResult2 = shoppingCartPage.verifyName();
        String expectedResult2 = "HP LP3065";
        Assert.assertEquals(expectedResult2, actualResult2);

        String actualResult3 = shoppingCartPage.verifyDate();
        String expectedResult3 = "Delivery Date:2022-11-30";
        Assert.assertEquals(expectedResult3, actualResult3);

        String actualResult4 = shoppingCartPage.verifyModelNo();
        String expectedResult4 = "Product 21";
        Assert.assertEquals(expectedResult4, actualResult4);

        String actualResult5 = shoppingCartPage.verifyTotalAmount();
        String expectedResult5 = "$122.00";
        Assert.assertEquals(expectedResult5, actualResult5);

    }
}
