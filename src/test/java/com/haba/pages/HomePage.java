package com.haba.pages;


import com.haba.utilities.BrowserUtils;
import com.haba.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HomePage extends BasePage {

    @FindBy(css = ".hffLightbox-close")
    public WebElement closeCountryBtn;

    @FindBy(xpath = "//button[.=\"Accept All Cookies\"]")
    public WebElement cookiePopUp;

    @FindBy(css = ".mini-cart-icon")
    public WebElement cartIcon;


}
