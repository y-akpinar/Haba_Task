package com.haba.step_definitions;

import com.haba.pages.CartPage;
import com.haba.pages.HomePage;
import com.haba.pages.ProductPage;
import com.haba.utilities.ProductLocaterGenerator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddItemCartStepDefs {

    HomePage homePage = new HomePage();
    ProductLocaterGenerator productLocaterGenerator = new ProductLocaterGenerator();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();
    String expectedQuantity;


    @When("the user navigates to the {string} {string} page")
    public void theUserNavigatesToThePage(String tab, String module) {
        homePage.navigateToModule(tab, module);
    }

    @And("the user clicks chart icon at the top of the right corner")
    public void theUserClicksChartIconAtTheTopOfTheRightCorner() {
        homePage.cartIcon.click();
    }


    @And("the user add a product {string} to the cart")
    public void theUserAddAProductToTheCart(String productNumber) {
        productLocaterGenerator.navigateProductPage(productNumber);
        productLocaterGenerator.addNameToList(productPage.getProductName()); // get current price of product and add the List
        productPage.addChartBtn.click();
    }


    @Then("verify that the user can see the added product {string} in the cart")
    public void verifyThatTheUserCanSeeTheAddedProductInTheCart(String idNummer) {
        Assert.assertTrue(cartPage.getProductIdNumber().contains(idNummer));
        Assert.assertEquals(productLocaterGenerator.nameList.get(0), cartPage.getProductName());
        productLocaterGenerator.nameList.clear();

    }

    @When("the user change quantity of product with {string}")
    public void theUserChangeQuantityOfProductWith(String quantity) {
        expectedQuantity= quantity;
        cartPage.changeQuantity(quantity);
    }


    @Then("verify that quantity of item has been updated")
    public void verifyThatQuantityOfItemHasBeenUpdated() {
        Assert.assertTrue(cartPage.cartMessages.isDisplayed());
        Assert.assertTrue(cartPage.getCartMessages().contains("Product quantity has been updated."));
        Assert.assertEquals(expectedQuantity,cartPage.getDropdownSelectedNumber());
    }
}
