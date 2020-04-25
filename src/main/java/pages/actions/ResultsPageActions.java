package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.ResultsPageLocators;
import utils.SeleniumDriver;

public class ResultsPageActions {
    ResultsPageLocators resultsPageLocators;


    public ResultsPageActions(){
        this.resultsPageLocators = new ResultsPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),resultsPageLocators);
    }

    public void clickOnItem(){
        resultsPageLocators.priceList.get(0).click();
    }

}
