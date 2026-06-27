package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    private By backpackAddToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private By cartIcon = By.className("shopping_cart_link");
    private By cartBadge = By.className("shopping_cart_badge");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void addBackpackToCart() {
        click(backpackAddToCartButton);
    }

    public void openCart() {
        click(cartIcon);
    }

    public String getCartBadgeText() {
        return getText(cartBadge);
    }
}