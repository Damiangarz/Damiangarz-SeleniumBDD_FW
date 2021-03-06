package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GotoCartLocators {
    @FindBy(how = How.LINK_TEXT, using = "Carrito")
    public WebElement goToCartBtn;
}
