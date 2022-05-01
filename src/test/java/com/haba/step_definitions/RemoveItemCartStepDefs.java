package com.haba.step_definitions;

import com.haba.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RemoveItemCartStepDefs {

    CartPage cartPage = new CartPage();

    @When("the user click remove item icon")
    public void theUserClickRemoveItemIcon() {
        cartPage.removeItemIcon.click();
    }

    @Then("verify that item has been removed")
    public void verifyThatItemHasBeenRemoved() {
        Assert.assertTrue(cartPage.cartMessages.isDisplayed());
        Assert.assertTrue(cartPage.getCartMessages().contains("Product has been removed from your cart."));
    }
}
