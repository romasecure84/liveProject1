package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopProductPage {
    public WebDriver driver;

    By sizeOption = By.cssSelector("[aria-label='Size']");
    By quantityIncrease = By.cssSelector(".touchspin-up");
    By quantityDecrease = By.cssSelector(".touchspin-down");
    By addToCartButton = By.cssSelector(".add-to-cart.btn.btn-primary");
    By homepageLink = By.xpath("//span[.='Home']");

    public ShopProductPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getSizeOption(){
        return driver.findElement(sizeOption);
    }

    public WebElement getQuantityIncrease(){
        return driver.findElement(quantityIncrease);
    }

    public WebElement getQuantityDecrease(){
        return driver.findElement(quantityDecrease);
    }

    public WebElement getAddToCartButton(){
        return driver.findElement(addToCartButton);
    }

    public WebElement getHomePageLink(){
        return driver.findElement(homepageLink);
    }
}
