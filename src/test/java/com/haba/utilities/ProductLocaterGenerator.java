package com.haba.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class ProductLocaterGenerator {

    private static Logger LOG = LoggerFactory.getLogger(ProductLocaterGenerator.class);

    public  List<String> nameList =new ArrayList<>();

    /**
     * The function is used to produce locators
     * @param idNumber
     * @return
     */
    public WebElement locateProduct(String idNumber) {
        String locators = "[data-article-number='" + idNumber + "']";
        WebElement articleNumber = Driver.get().findElement(By.cssSelector(locators));
        LOG.info("Locators{}",locators);
        return articleNumber;
    }

    public void navigateProductPage(String idNumber){
        locateProduct(idNumber).click();
    }

    public  void addNameToList(String name){
        nameList.add(name);
    }


}
