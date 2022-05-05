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


    @Then("verify that item has been removed and the system displayed {string}")
    public void verifyThatItemHasBeenRemovedAndTheSystemDisplayed(String removeMessage) {
        Assert.assertTrue(cartPage.cartMessages.isDisplayed());
        Assert.assertEquals(removeMessage,cartPage.getCartMessages());
    }
}
