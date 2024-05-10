package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopContentPanel {
    public WebDriver driver;

    By continueShoppingButton = By.xpath("//button[contains(text(),'Continue')]");
    By checkoutButton = By.xpath("//*[text()='Proceed to checkout']");

    public ShopContentPanel(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getContinueShoppingButton(){
        return driver.findElement(continueShoppingButton);
    }

    public WebElement getCheckoutButton(){
        return driver.findElement(checkoutButton);
    }
}
