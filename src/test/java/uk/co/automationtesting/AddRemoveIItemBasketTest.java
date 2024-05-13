package uk.co.automationtesting;

import base.BasePage;
import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.IOException;

@Listeners(resources.Listeners.class)

public class AddRemoveIItemBasketTest extends BasePage {
    public AddRemoveIItemBasketTest() throws IOException {
        super();
    }
    @BeforeTest
    public void setUp() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }

    @Test
    public void AddRemoveItemTest() throws IOException, InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.getCookie().click();
        Thread.sleep(2000);
        homePage.getTestStoreLink().click();

        ShopHomePage shopHomePage = new ShopHomePage(driver);
        shopHomePage.getProductTwo().click();

        ShopProductPage shopProductPage = new ShopProductPage(driver);
        Select option = new Select(shopProductPage.getSizeOption());
        option.selectByVisibleText("M");
        shopProductPage.getQuantityIncrease().click();
        shopProductPage.getAddToCartButton().click();

        ShopContentPanel shopContentPanel = new ShopContentPanel(driver);
        Thread.sleep(2000);
        shopContentPanel.getContinueShoppingButton().click();
        shopProductPage.getHomePageLink().click();

//        JavascriptExecutor js = (JavascriptExecutor)getDriver();
//        js.executeScript("argument[0].scrollIntoView()");
        shopHomePage.getProductEight().click();
        shopProductPage.getQuantityIncrease().click();
        shopProductPage.getAddToCartButton().click();
        Thread.sleep(2000);
        shopContentPanel.getCheckoutButton().click();

        ShoppingCart shoppingCart = new ShoppingCart(driver);
        shoppingCart.getDeleteItemOne().click();
        Thread.sleep(2000);
        System.out.println(shoppingCart.getTotalValue().getText());
        Assert.assertEquals(shoppingCart.getTotalValue().getText(),"$30.80");
        shoppingCart.getProceedToCheckButton().click();

        OrderFormPersonalInfo personalInfo = new OrderFormPersonalInfo(driver);
        Faker faker = new Faker();
        personalInfo.getGenderMr().click();
        personalInfo.getFirstNameField().sendKeys(faker.name().firstName());
        personalInfo.getLastNameField().sendKeys(faker.name().lastName());
        personalInfo.getEmailField().sendKeys(faker.internet().emailAddress());
        personalInfo.getPasswordField().sendKeys(faker.internet().password());
        personalInfo.getBirthDateField().sendKeys("01/01/2001");
        personalInfo.getReceiveOrderCheckbox().click();
        personalInfo.getPrivacyPolicyCheckbox().click();
        personalInfo.getNewsletterCheckbox().click();
        Thread.sleep(2000);
        personalInfo.getContinueButton().click();

        OrderFormDelivery formDelivery = new OrderFormDelivery(driver);
        formDelivery.getCompanyNameField().sendKeys(faker.company().name());
        formDelivery.getAddressField().sendKeys(faker.address().fullAddress());
        formDelivery.getCityField().sendKeys(faker.address().city());
        Select optionState = new Select(formDelivery.getStateDropdown());
        optionState.selectByVisibleText("California");
        formDelivery.getZipPostalCodeField().sendKeys("12345");
        Select optionCountry = new Select(formDelivery.getCountryDropdown());
        optionCountry.selectByVisibleText("United States");
        formDelivery.getPhoneField().sendKeys(faker.phoneNumber().cellPhone());
        //formDelivery.getInvoiceSameAddressCheckbox().click();
        Thread.sleep(2000);
        formDelivery.getContinueButton().click();

        OrderFormShippingMethod shippingMethod = new OrderFormShippingMethod(driver);
        shippingMethod.getDeliveryMessageTextbox().sendKeys(faker.address().fullAddress());
        shippingMethod.getContinueButton().click();

        OrderFormPayment payment = new OrderFormPayment(driver);
        payment.getPayByCheck().click();
        payment.getTermsAndConditions().click();
        payment.getOrderButton().click();

    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        //driver.close();
        //driver = null;
    }
}
