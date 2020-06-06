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
    GoToCartActions goToCartActions = new GoToCartActions();
    ShoppingCartActions shoppingCartActions = new ShoppingCartActions();

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

    @When("I click on Add to Cart button")
    public void i_click_on_add_to_kart_button() {
        itemPageActions.clickOnAddToCartBtn();
    }

    @When("I click on Cart button")
    public void i_click_on_Cart_button() {
        goToCartActions.clickOnGoTokart();
    }

    @Then("I compare the prices")
    public void i_compare_the_prices() {
        char[] itemPagePrice = itemPageActions.getItemPagePrice().toCharArray();
        char[] shopCartPrice = shoppingCartActions.getShopCartPrice().toCharArray();

        String itemPagePrice_f = "";
        String shopCartPrice_f = "";

        for (char chars : itemPagePrice) {
            if (Character.isDigit(chars)) itemPagePrice_f += chars;
        }

        for (char chars : shopCartPrice) {
            if (Character.isDigit(chars)) shopCartPrice_f += chars;
        }

        Assert.assertEquals(itemPagePrice_f, shopCartPrice_f);
    }

    @When("I click on Delete button")
    public void i_click_on_Delete_button() {
        shoppingCartActions.clickOnDelete();
    }

    @Then("The Shopping Cart displays {string}")
    public void a_confirmation_message_is_displayed(String itemsInCart) {
        String actualItemsInCart = shoppingCartActions.getConfirmationMsg();
        Assert.assertEquals(actualItemsInCart, itemsInCart);
    }
}