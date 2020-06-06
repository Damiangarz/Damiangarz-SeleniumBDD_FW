@Regression
Feature: Search for a ps4 console
  in order to validate the search function
  As a tester
  I want to search for an item

  Scenario: Search for a ps4 console
    Given I navigate into "https://www.amazon.com.mx/" website
    When I enter "playstation 4 console" as search criteria
    And click on the search button
    Then I want to click on the first item
    When the item page is displayed I capture the price
    And I click on Add to Cart button
    And I click on Cart button
    Then I compare the prices
    When I click on Delete button
    Then The Shopping Cart displays "0"