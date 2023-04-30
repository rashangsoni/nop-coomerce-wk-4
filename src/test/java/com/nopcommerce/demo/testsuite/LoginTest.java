package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    HomePage homePage = new HomePage();

    @Test

    public void verifyUserShouldNavigateToHomePageSuccessfully() {
        homePage.mouseHoverOnComputer();
        homePage.clickOnDesktop();

    }
}