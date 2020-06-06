@Regression
Feature: Search for a Switch console
  in order to validate the search function
  As a tester
  I want to search for an item

  Scenario: Search for a Switch console
    Given I navigate into "https://www.amazon.com.mx/" website
    When I enter "Nintendo Switch Console" as search criteria
    And click on the Search Button
    Then I want to click on the first item
    When the item page is displayed I capture the Price
    And I click on Add to Cart Button
    And I click on Cart Button
    Then I compare the Prices
    When I click on Delete Button
    Then The Shopping Cart displays "0"