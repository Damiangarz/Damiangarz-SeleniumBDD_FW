package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingKartLocators {
    @FindBy(how = How.XPATH, using = "//div/div[2]/p/span")
    public WebElement shopKartPrice;

    @FindBy(how = How.XPATH, using = "//input[@value='Eliminar']")
    public WebElement deleteBtn;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Tu carrito de Amazon está vacío')]")
    public WebElement confirmationMsg;
}
