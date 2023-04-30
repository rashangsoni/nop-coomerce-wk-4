package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopsPage extends Utility {

    By dropdown = By.name("products-orderby");

    //1.3 Select Sort By position "Name: Z to A"
    public void setDropdown() {
        selectByVisibleTextFromDropDown(dropdown, "Name: A to Z");
    }
}


