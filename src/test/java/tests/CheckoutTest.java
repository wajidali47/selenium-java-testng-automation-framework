package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void completeCheckoutTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addBackpackToCart();

        Assert.assertEquals(productsPage.getCartBadgeText(), "1");

        productsPage.openCart();

        CartPage cartPage = new CartPage(driver);

        Assert.assertEquals(cartPage.getCartItemName(), "Sauce Labs Backpack");

        cartPage.clickCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);

        checkoutPage.enterCheckoutInformation(
                "Wajid",
                "Ali",
                "20100"
        );

        checkoutPage.finishOrder();

        Assert.assertEquals(
                checkoutPage.getSuccessMessage(),
                "Thank you for your order!"
        );
    }
}