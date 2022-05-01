Feature: Add a product to the cart

  Background:
    Given the user is on the home page
    And the user accepts the cookies

  Scenario Outline: Verify that the user should be able to add a product "<productnumber>" to the cart
    When the user navigates to the "For Babys" "Walker Wagons and other learning aids" page
    And the user add a product "<productnumber>" to the cart
    And the user clicks chart icon at the top of the right corner
    Then verify that the user can see the added product "<productnumber>" in the cart
    Examples: productnumber
      | productnumber |
      | 000902        |
      | 006432        |
      | 304793        |



  Scenario: Verify that the user should be able to add a multiple product to the cart
    When the user navigates to the "For Babys" "Clutching toys" page
    And the user add a product "306203" to the cart
    And the user clicks chart icon at the top of the right corner
    Then verify that the user can see the added product "306203" in the cart
    When the user navigates to the "Wooden toys" "Motor Skills Toys" page
    And the user add a product "303821" to the cart
    And the user clicks chart icon at the top of the right corner
    Then verify that the user can see the added product "303821" in the cart
    When the user navigates to the "The world of dolls" "Fabric dolls" page
    And the user add a product "305815" to the cart
    And the user clicks chart icon at the top of the right corner
    Then verify that the user can see the added product "305815" in the cart




  Scenario: Verify that the user should be able to update quantity of item in cart
    When the user navigates to the "For Babys" "Clutching toys" page
    And the user add a product "306203" to the cart
    And the user clicks chart icon at the top of the right corner
    When the user change quantity of product with "4"
    Then verify that quantity of item has been updated
















