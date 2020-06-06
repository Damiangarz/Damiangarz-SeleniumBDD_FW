package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.GotoCartLocators;
import utils.SeleniumDriver;

public class GoToCartActions {
    GotoCartLocators goToCartLocators;

    public GoToCartActions(){
        this.goToCartLocators = new GotoCartLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),goToCartLocators);
    }

    public void clickOnGoToCart(){
        goToCartLocators.goToCartBtn.click();
    }
}
