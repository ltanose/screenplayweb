Feature: add to product to cart in saucedemo

  Background:
    Given the user is on the serenity demo page
    When attempts to log in
      | user   | pass   |
      | standard_user | secret_sauce |

  Scenario Outline: As a user, I want to add products to the cart
    Given I add a product to the cart
    Then validate the name product in the cart <product_name>
    Examples:
      | product_name  |
      | Sauce Labs Backpack |

  Scenario: As a user, I want to remove products to the cart
    Given I add a product to the cart
    When the product is removed from the cart
    Then We verify that the cart is empty.
