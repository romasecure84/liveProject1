package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormPayment {
    public WebDriver driver;

    By payByWire = By.cssSelector("[for='payment-option-1'] span");
    By payByCheck = By.cssSelector("[for='payment-option-2'] span");
    By termsAndConditions = By.xpath("//form[@id='conditions-to-approve']/ul//label[@class='js-terms']");
    By orderButton = By.xpath("//div[@id='payment-confirmation']//button[@type='submit']");

    public OrderFormPayment(WebDriver driver){
        this.driver = driver;
    }
    public WebElement getPayByWire(){
        return driver.findElement(payByWire);
    }
    public WebElement getPayByCheck(){
        return driver.findElement(payByCheck);
    }
    public WebElement getTermsAndConditions() {
        return driver.findElement(termsAndConditions);
    }
    public WebElement getOrderButton(){
        return driver.findElement(orderButton);
    }
}
