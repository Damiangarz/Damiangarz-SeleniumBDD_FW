package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.ShoppingKartLocators;
import utils.SeleniumDriver;

public class ShoppingKartActions {
    ShoppingKartLocators shoppingKartLocators;

    public ShoppingKartActions(){
        this.shoppingKartLocators = new ShoppingKartLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),shoppingKartLocators);
    }

    public String getShopKartPrice(){
        String shopKartPrice = shoppingKartLocators.shopKartPrice.getText();
        return shopKartPrice;
    }

    public void clickOnDelete(){
        shoppingKartLocators.deleteBtn.click();
    }

    public String getConfirmationMsg(){
        String confirmationMsg = shoppingKartLocators.confirmationMsg.getText();
        return confirmationMsg;
    }

}
