Feature: Remove a product to the cart

  Background:
    Given the user is on the home page
    And the user accepts the cookies

  Scenario: Verify that the user should be able to remove an item by clicking delete icon
    When the user navigates to the "For Babys" "Clutching toys" page
    And the user add a product "306203" to the cart
    And the user clicks chart icon at the top of the right corner
    When the user click remove item icon
    Then verify that item has been removed

  @wip
  Scenario: Verify that the user should be able to remove an item by selecting 0 quantity
    When the user navigates to the "For Babys" "Clutching toys" page
    And the user add a product "306203" to the cart
    And the user clicks chart icon at the top of the right corner
    When the user change quantity of product with "0"
    Then verify that item has been removed