package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.ItemPageLocators;
import utils.SeleniumDriver;

public class ItemPageActions {
    String itemPagePrice;
    ItemPageLocators itemPageLocators;
    public ItemPageActions(){
        this.itemPageLocators = new ItemPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),itemPageLocators);
    }

    public  void captureItemPagePrice(){
        this.itemPagePrice = itemPageLocators.itemPagePrice.getText();
    }

    public String getItemPagePrice(){
        return itemPagePrice;
    }

    public void clickOnAddToKartBtn(){
        itemPageLocators.addToKartBtn.click();
    }
}
