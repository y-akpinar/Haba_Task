package com.haba.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.ArrayList;
import java.util.List;

public class ProductLocaterGenerator {

    public List<String> nameList = new ArrayList<>();

    /**
     * The function is used to produce locators
     * @param idNumber
     * @return
     */
    public WebElement locateProduct(String idNumber) {
        String locators = "[data-article-number='" + idNumber + "']";
        return Driver.get().findElement(By.cssSelector(locators));
    }

    public void navigateProductPage(String idNumber){
        locateProduct(idNumber).click();
    }

    public  void addNameToList(String name){
        nameList.add(name);
    }

}
