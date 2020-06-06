package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartLocators {
    @FindBy(how = How.CSS, using = ".sc-product-price")
    public WebElement shopCartPrice;

    @FindBy(how = How.CSS, using = "input[value=Eliminar]")
    public WebElement deleteBtn;

    @FindBy(how = How.ID, using = "nav-cart-count")
    public WebElement itemsInCart;

}
