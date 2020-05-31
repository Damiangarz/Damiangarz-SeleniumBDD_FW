package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.HomePageLocators;
import utils.SeleniumDriver;

public class HomePageActions {
    HomePageLocators homePageLocators;

    public HomePageActions(){
        this.homePageLocators = new HomePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),homePageLocators);
    }

    public void enterSearchItem(String item){
        homePageLocators.searchBox.sendKeys(item);
    }

    public void clickOnSearchButton(){
        homePageLocators.searchButton.click();
    }
}
