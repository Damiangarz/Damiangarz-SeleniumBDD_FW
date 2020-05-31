package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.actions.*;
import utils.SeleniumDriver;

public class SearchItemSteps {
    HomePageActions homePageActions = new HomePageActions();
    ResultsPageActions resultsPageActions = new ResultsPageActions();
    ItemPageActions itemPageActions = new ItemPageActions();
    GoToKartActions goToKartActions = new GoToKartActions();
    ShoppingKartActions shoppingKartActions = new ShoppingKartActions();

    @Given("I navigate into {string} website")
    public void i_navigate_into_website(String url) {
        SeleniumDriver.openPage(url);
    }

    @When("I enter {string} as search criteria")
    public void i_enter_as_search_criteria(String item) {
        homePageActions.enterSearchItem(item);
    }

    @When("click on the search button")
    public void click_on_the_search_button() {
        homePageActions.clickOnSearchButton();
    }

    @Then("I want to click on the first item")
    public void i_want_to_click_on_the_first_item() {
        resultsPageActions.clickOnItem();
    }

    @When("the item page is displayed I capture the price")
    public void the_item_page_is_displayed_I_capture_the_price() {
        itemPageActions.captureItemPagePrice();
    }

    @When("I click on add to kart button")
    public void i_click_on_add_to_kart_button() {
        itemPageActions.clickOnAddToKartBtn();
    }

    @When("I click on Kart button")
    public void i_click_on_Kart_button() {
        goToKartActions.clickOnGoTokart();
    }

    @Then("I compare the prices")
    public void i_compare_the_prices() {
        char[] itemPagePrice = itemPageActions.getItemPagePrice().toCharArray();
        char[] shopKartPrice = shoppingKartActions.getShopKartPrice().toCharArray();

        String itemPagePrice_f = "";
        String shopKartPrice_f = "";

        for (char chars : itemPagePrice) {
            if (Character.isDigit(chars)) itemPagePrice_f += chars;
        }

        for (char chars : shopKartPrice) {
            if (Character.isDigit(chars)) shopKartPrice_f += chars;
        }

        Assert.assertEquals(itemPagePrice_f, shopKartPrice_f);
    }

    @When("I click on Delete button")
    public void i_click_on_Delete_button() {
        shoppingKartActions.clickOnDelete();
    }

    @Then("The Shoopping kart displays {string}")
    public void a_confirmation_message_is_displayed(String itemsInKart) {
        String actualItemsInKart = shoppingKartActions.getConfirmationMsg();
        Assert.assertEquals(actualItemsInKart, itemsInKart);
    }
}