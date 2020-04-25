package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {
    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(how = How.CLASS_NAME, using = "nav-input")
    public WebElement searchButton;
}
