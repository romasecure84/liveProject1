package uk.co.automationtesting;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.IOException;

public class OrderCompleteTest extends BasePage {
    public OrderCompleteTest() throws IOException {
        super();
    }
    @BeforeTest
    public void setUp() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }

    @Test
    public void endToEndTest() throws InterruptedException, IOException {
        HomePage homePage = new HomePage(driver);
        homePage.getCookie().click();
        Thread.sleep(2000);
        homePage.getTestStoreLink().click();

        ShopHomePage shopHomePage = new ShopHomePage(driver);
        shopHomePage.getProductOne().click();

        ShopProductPage shopProductPage = new ShopProductPage(driver);
        Select option = new Select(shopProductPage.getSizeOption());
        option.selectByVisibleText("M");
        shopProductPage.getQuantityIncrease().click();
        shopProductPage.getAddToCartButton().click();

        ShopContentPanel shopContentPanel = new ShopContentPanel(driver);
        shopContentPanel.getCheckoutButton().click();

        ShoppingCart shoppingCart = new ShoppingCart(driver);
        shoppingCart.getHavePromo().click();
        shoppingCart.getPromoTextBox().sendKeys("20OFF");
        shoppingCart.getPromoAddButton().click();
        Thread.sleep(2000);
        shoppingCart.getProceedToCheckButton().click();


    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
        driver = null;
    }
}
