package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {

    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postalCode = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By finishButton = By.id("finish");
    private By completeHeader = By.className("complete-header");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void enterCheckoutInformation(String first, String last, String zip) {

        type(firstName, first);
        type(lastName, last);
        type(postalCode, zip);

        click(continueButton);
    }

    public void finishOrder() {
        click(finishButton);
    }

    public String getSuccessMessage() {
        return getText(completeHeader);
    }
}