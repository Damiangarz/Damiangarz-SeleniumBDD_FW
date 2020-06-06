package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartLocators {
    @FindBy(how = How.CSS, using = ".sc-product-price")
    public WebElement shopCartPrice;

    //@FindBy(how = How.XPATH, using = "//input[@value='Eliminar']")
    //@FindBy(how = How.CSS, using = ".sc-action-delete span input")
    @FindBy(how = How.CSS, using = "input[value=Eliminar]")
    public WebElement deleteBtn;

    /*
    //Selector omitted because page changes structure at different runs
    //@FindBy(how = How.CSS, using = ".sc-your-amazon-cart-is-empty h2")
    @FindBy(how = How.CSS, using = ".sc-your-amazon-cart-is-empty")
    public WebElement confirmationMsg; //@FindBy(how = How.CSS, using = ".sc-your-amazon-cart-is-empty h2")
    */

    @FindBy(how = How.ID, using = "nav-cart-count")
    public WebElement itemsInCart;

}
