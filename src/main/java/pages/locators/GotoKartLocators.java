package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GotoKartLocators {
    //@FindBy(how = How.ID, using = "hlb-view-cart-announce") //ID Selector failed at some executions, replaced for Link Text
    @FindBy(how = How.LINK_TEXT, using = "Carrito")
    public WebElement goToKartBtn;
}
