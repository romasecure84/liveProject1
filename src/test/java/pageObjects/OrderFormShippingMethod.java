package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderFormShippingMethod extends BasePage {
    public WebDriver driver;

    By deliveryMessageTextbox = By.cssSelector("textarea#delivery_message");
    By continueButton = By.cssSelector("form#js-delivery > button[name='confirmDeliveryOption']");

    public OrderFormShippingMethod() throws IOException {
        super();
    }
    public WebElement getDeliveryMessageTextbox() throws IOException {
        this.driver = getDriver();
        return driver.findElement(deliveryMessageTextbox);
    }
    public WebElement getContinueButton() throws IOException {
        this.driver = getDriver();
        return driver.findElement(continueButton);
    }
}
