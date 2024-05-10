package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart {
    public WebDriver driver;

    By havePromo = By.cssSelector(".promo-code-button .collapse-button");
    By promoTextBox = By.cssSelector("input[name='discount_name']");
    By promoAddButton = By.cssSelector("form[method='post']  span");
    By proceedToCheckoutButton = By.linkText("PROCEED TO CHECKOUT");
    By deleteItemOne = By.cssSelector(".cart-items .cart-item:nth-of-type(1) .float-xs-left");
    By deleteItemTwo = By.cssSelector(".cart-items .cart-item:nth-of-type(2) .float-xs-left");
    By totalValue = By.cssSelector(".cart-total .value");

    public ShoppingCart(WebDriver driver){
        this.driver =driver;
    }

    public WebElement getHavePromo(){
        return driver.findElement(havePromo);
    }

    public WebElement getPromoTextBox(){
        return driver.findElement(promoTextBox);
    }

    public WebElement getPromoAddButton(){
        return driver.findElement(promoAddButton);
    }

    public WebElement getProceedToCheckButton(){
        return driver.findElement(proceedToCheckoutButton);
    }

    public WebElement getDeleteItemOne(){
        return driver.findElement(deleteItemOne);
    }

    public WebElement getDeleteItemTwo(){
        return driver.findElement(deleteItemTwo);
    }

    public WebElement getTotalValue(){
        return driver.findElement(totalValue);
    }
}
