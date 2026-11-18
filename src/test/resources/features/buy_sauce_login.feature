@Login
Feature: login test

  Scenario Outline: testing the successful login
    Given the user is on the serenity demo page
    When attempts to log in
      | user   | pass   |
      | <user> | <pass> |
    Then validate the text on screen <message>
    Examples:
      | user  | pass     | message   |
      | standard_user | secret_sauce | Swag Labs |

  Scenario Outline: testing the failed login
    Given the user is on the serenity demo page
    When attempts to log in
      | user   | pass   |
      | <user> | <pass> |
    Then validate message error on screen <message>
    Examples:
      | user  | pass     | message   |
      | standard_user | 1234 | Epic sadface: Username and password do not match any user in this service |
      | standard_user |  | Epic sadface: Password is required |
      |  | 1234 | Epic sadface: Username is required |