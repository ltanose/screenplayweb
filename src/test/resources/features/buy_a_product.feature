@BuyProduct
Feature: buy a product in the saucedemo

  Background:
    Given the user is on the serenity demo page
    When attempts to log in
      | user   | pass   |
      | standard_user | secret_sauce |


  Scenario Outline: testing the buy a product in the saucedemo
    Given I add a product to the cart
    And we proceed to checkout
    When I am adding the details for the purchase.
      | first_name   | last_name   |postal_code|
      | <first_name> | <last_name> | <postal_code> |
    And I complete the purchase
    Then validate completion text <message>
    Examples:
      | first_name  | last_name     | postal_code   | message |
      | standard_user | secret_sauce | 123 | Thank you for your order! |


  Scenario Outline: test the entry of purchase data
    Given I add a product to the cart
    And we proceed to checkout
    When I am adding the details for the purchase.
      | first_name   | last_name   |postal_code|
      | <first_name> | <last_name> | <postal_code> |
    Then validate failed message <message>
    Examples:
      | first_name  | last_name     | postal_code   | message |
      |  | tanos | 123 | Error: First Name is required |
      | leider |  | 123 | Error: Last Name is required |
      | leider | tanos |  | Error: Postal Code is required |