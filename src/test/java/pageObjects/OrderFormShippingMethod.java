package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormShippingMethod {
    public WebDriver driver;

    By deliveryMessageTextbox = By.cssSelector("textarea#delivery_message");
    By continueButton = By.cssSelector("form#js-delivery > button[name='confirmDeliveryOption']");

    public OrderFormShippingMethod(WebDriver driver){
        this.driver = driver;
    }
    public WebElement getDeliveryMessageTextbox(){
        return driver.findElement(deliveryMessageTextbox);
    }
    public WebElement getContinueButton(){
        return driver.findElement(continueButton);
    }
}
