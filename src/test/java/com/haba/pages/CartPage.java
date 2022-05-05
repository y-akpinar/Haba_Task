package com.haba.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CartPage extends BasePage {

    @FindBy(css = "div.price")
    public WebElement productPrice;

    @FindBy(css = ".article-number")
    public WebElement productItemNumber;

    @FindBy(css = "span.name")
    public WebElement productName;

    @FindBy(css = "#quantity_0")
    public WebElement quantityDropdown;

    @FindBy(css = ".alert.alert-info")
    public WebElement cartMessages;

    @FindBy(css = "[title=\"text.cart.remove.item\"]")
    public WebElement removeItemIcon;


    /**
     * get the actual Name of product on the Cart
     * @return
     */
    public String getProductName(){
        return productName.getText();
    }

    /**
     * get the actual item number of product on the Cart
     * @return
     */
    public String getProductIdNumber(){
        return productItemNumber.getText().substring(9);
    }

    /**
     * get the actual Price of product on the Cart
     * @return
     */
    public String getProductPrice(){
        return productPrice.getText();
    }

    /**
     * update or change quantity of product on the cart
     * @param quantity
     */
    public void changeQuantity(String quantity){
        Select dropdown = new Select(quantityDropdown);
        dropdown.selectByVisibleText(quantity);
    }

    public String getDropdownSelectedNumber(){
        Select dropdown = new Select(quantityDropdown);
        return dropdown.getFirstSelectedOption().getText();
    }

    public String getCartMessages(){
        return cartMessages.getText().substring(1).trim();
    }
}
