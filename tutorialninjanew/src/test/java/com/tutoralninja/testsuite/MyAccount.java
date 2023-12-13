package com.tutoralninja.testsuite;

import com.tutoralninja.pages.HomePage;
import com.tutoralninja.pages.LoginPage;
import com.tutoralninja.pages.RegisterPage;
import com.tutoralninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccount extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        homePage.myAccountRegister();
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        homePage.myAccountLogin();
        String actualResult = loginPage.verifyText();
        String expectedResult = "Returning Customer";
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        homePage.myAccountRegister();
        registerPage.registerField();
        String actualResult = registerPage.verifyNewMessage();
        String expectedResult = "Your Account Has Been Created!";
        Assert.assertEquals(expectedResult, actualResult);
        registerPage.clickOnContinueButton();
        registerPage.myAccountLogout();

        String actualResults = registerPage.verifyLogoutText();
        String expectedResults = "Account Logout";
        Assert.assertEquals(expectedResults,actualResults);

        registerPage.clickContinueButton();
    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        homePage.myAccountLogin();
        loginPage.loginNewMyAccount();

        String actualResult = loginPage.verifyMyAccountText();
        String expectedResult = "My Account";
        Assert.assertEquals(expectedResult,actualResult);

        loginPage.myAccountLogout();
        String actualResult1 = loginPage.logoutTextVerify();
        String expectedResult1 = "Account Logout";
        Assert.assertEquals(expectedResult1,actualResult1);

        loginPage.continueButton();
    }

}
