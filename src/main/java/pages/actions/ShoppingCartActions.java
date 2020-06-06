package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.ShoppingCartLocators;
import utils.SeleniumDriver;

public class ShoppingCartActions {
    ShoppingCartLocators shoppingCartLocators;

    public ShoppingCartActions(){
        this.shoppingCartLocators = new ShoppingCartLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),shoppingCartLocators);
    }

    public String getShopCartPrice(){
        String shopCartPrice = shoppingCartLocators.shopCartPrice.getText();
        return shopCartPrice;
    }

    public void clickOnDelete(){
        shoppingCartLocators.deleteBtn.click();
    }

    public String getConfirmationMsg(){
        String itemsInCart = shoppingCartLocators.itemsInCart.getText();
        return itemsInCart;
    }
}