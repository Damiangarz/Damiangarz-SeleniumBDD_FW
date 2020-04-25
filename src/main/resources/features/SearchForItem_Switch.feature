@Regression
Feature: Search for a Switch console
  in order to validate the search function
  As a tester
  I want to search for an item

  Scenario: Search for a Switch console
    Given I navigate into "https://www.amazon.com.mx/" website
    When I enter "Nintendo Switch console" as search criteria
    And click on the search button
    Then I want to click on the first item
    When the item page is displayed I capture the price
    And I click on add to kart button
    And I click on Kart button
    Then I compare the prices
    When I click on Delete button
    Then A confirmation message is displayed "Tu carrito de Amazon está vacío"


