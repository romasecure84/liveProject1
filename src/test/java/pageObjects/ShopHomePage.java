package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopHomePage {
    public WebDriver driver;

    By productOne = By.xpath("(//*[text()='Hummingbird printed t-shirt'])[1]");
    By productTwo = By.xpath("(//*[text()='Hummingbird printed sweater'])[1]");
    By productThree = By.xpath("//*[text()='The best is yet to come'...']");
    By productFour = By.xpath("//*[text()='The adventure begins Framed...']");
    By productFive = By.xpath("//*[text()='Today is a good day Framed...']");
    By productSix = By.xpath("(//*[text()='Mug The best is yet to come'])[1]");
    By productSeven = By.xpath("//*[text()='Mug The adventure begins']");
    By productEight = By.xpath("(//*[text()='Mug Today is a good day'])");

    public ShopHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getProductOne() {
        return driver.findElement(productOne);
    }

    public WebElement getProductTwo() {
        return driver.findElement(productTwo);
    }

    public WebElement getProductThree() {
        return driver.findElement(productThree);
    }

    public WebElement getProductFour() {
        return driver.findElement(productFour);
    }

    public WebElement getProductFive() {
        return driver.findElement(productFive);
    }

    public WebElement getProductSix() {
        return driver.findElement(productSix);
    }

    public WebElement getProductSeven() {
        return driver.findElement(productSeven);
    }

    public WebElement getProductEight() {
        return driver.findElement(productEight);
    }

}
