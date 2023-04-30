package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class WelcomePleaseSignIn extends Utility {

    By welcomeText = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By checkoutGuest = By.xpath("//button[normalize-space()='Checkout as Guest']");

    //2.20 Verify the Text “Welcome, Please Sign In!”
    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
   //2.21Click on “CHECKOUT AS GUEST” Tab
    public void setCheckoutGuest() {
        clickOnElement(checkoutGuest);

    }
}
