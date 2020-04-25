package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.GotoKartLocators;
import utils.SeleniumDriver;

public class GoToKartActions {
    GotoKartLocators goToKartLocators;

    public GoToKartActions(){
        this.goToKartLocators = new GotoKartLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),goToKartLocators);
    }

    public void clickOnGoTokart(){
        goToKartLocators.goToKartBtn.click();
    }
}
