package com.haba.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    @FindBy(css = ".hffLightbox-close")
    public WebElement closeCountryBtn;

    @FindBy(xpath = "//button[.=\"Accept All Cookies\"]")
    public WebElement cookiePopUp;

    @FindBy(css = ".mini-cart-icon")
    public WebElement cartIcon;


}
