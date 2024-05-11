package uk.co.automationtesting;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.ShopHomePage;

import java.io.IOException;

public class OrderCompleteTest extends BasePage {
    public OrderCompleteTest() throws IOException {
        super();
    }
    @BeforeTest
    public void setUp() throws IOException {
        driver = getDriver();
        driver.get("https://www.automationtesting.co.uk/");
    }

    @Test
    public void endToEndTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        Thread.sleep(2000);
        homePage.getTestStoreLink().click();

        ShopHomePage shopHomePage = new ShopHomePage(driver);
        shopHomePage.getProductOne().click();
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
        driver = null;
    }
}
