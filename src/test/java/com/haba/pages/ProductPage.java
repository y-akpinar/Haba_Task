package com.haba.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(css = "#addToCartButton")
    public WebElement addChartBtn;

    @FindBy(css = "div.price")
    public WebElement productPrice;

    @FindBy(css = ".product-name")
    public WebElement productName;


    /**
     * get the current Name of product
     * @return
     */
    public String getProductName(){
        return productName.getText();
    }
}

