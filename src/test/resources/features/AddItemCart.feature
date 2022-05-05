@wip
Feature: Add a product to the cart

  Background:
    Given the user is on the home page
    And the user accepts the cookies


  Scenario Outline: Verify that the user should be able to add a product "<productNumber>" to the cart
    When the user navigates to the "For Babys" "Walker Wagons and other learning aids" page
    And the user add a product "<productNumber>" to the cart
    And the user clicks chart icon at the top of the right corner
    Then verify that the user can see the added product "<productNumber>" in the cart
    Examples: productNumber
      | productNumber |
      | 000902        |
      | 006432        |
      | 304793        |


  Scenario Outline: Verify that the user should be able to add a product under the  "<tab>"
    When the user navigates to the "<tab>" "<module>" page
    And the user add a product "<productNumber>" to the cart
    And the user clicks chart icon at the top of the right corner
    Then verify that the user can see the added product "<productNumber>" in the cart
    Examples: tab, module , productNumber
      | tab                | module                                | productNumber |
      | Wooden toys        | Motor Skills Toys                     | 303821        |
      | The world of dolls | Fabric dolls                          | 305815        |
      | For Babys          | Walker Wagons and other learning aids | 000902        |


  Scenario: Verify that the user should be able to update quantity of item in cart
    When the user navigates to the "The world of dolls" "Fabric dolls" page
    And the user add a product "305815" to the cart
    And the user clicks chart icon at the top of the right corner
    When the user change quantity of product with "4"
    Then verify that quantity of item has been updated and the system displayed "Product quantity has been updated."
    When the user change quantity of product with "8"
    Then verify that quantity of item has been updated and the system displayed "Product quantity has been updated."












