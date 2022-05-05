package com.haba.step_definitions;

import com.haba.pages.HomePage;
import com.haba.utilities.BrowserUtils;
import com.haba.utilities.ConfigurationReader;
import com.haba.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomePageStepDefs {

    HomePage homePage = new HomePage();

    @Given("the user is on the home page")
    public void theUserIsOnThe() {
        Driver.get().get(ConfigurationReader.get("HomePage"));
        BrowserUtils.waitForPageToLoad(10);
        homePage.closeCountryBtn.click();
    }

    @And("the user accepts the cookies")
    public void the_user_accepts_the_cookies() {
        //BrowserUtils.hover(homePage.chartIcon);
        BrowserUtils.clickWithAction(homePage.cookiePopUp);
    }


}

