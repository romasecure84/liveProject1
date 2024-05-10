package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormDelivery {
    public WebDriver driver;

    By firstNameField = By.cssSelector(".form-fields input#field-firstname");
    By lastNameField = By.cssSelector(".form-fields input#field-lastname");
    By companyNameField = By.cssSelector("input#field-company");
    By addressField = By.cssSelector("input[name='address1']");
    By addressComplementField = By.cssSelector("input[name='address2']");
    By cityField = By.cssSelector("input#field-city");
    By stateDropdown = By.cssSelector("select#field-id_state");
    By zipPostalCodeField = By.cssSelector("input#field-postcode");
    By countryDropdown = By.cssSelector("select#field-id_country");
    By phoneField = By.cssSelector("input#field-phone");
    By invoiceSameAddressCheckbox = By.cssSelector("input#use_same_address");
    By continueButton = By.cssSelector("button[name='confirm-addresses']");

    public OrderFormDelivery(WebDriver driver){
        this.driver = driver;
    }
    public WebElement getFirstNameField(){
        return driver.findElement(firstNameField);
    }
    public WebElement getLastNameField(){
        return driver.findElement(lastNameField);
    }
    public WebElement getCompanyNameField(){
        return driver.findElement(companyNameField);
    }
    public WebElement getAddressField(){
        return driver.findElement(addressField);
    }
    public WebElement getAddressComplementField(){
        return driver.findElement(addressComplementField);
    }
    public WebElement getCityField(){
        return driver.findElement(cityField);
    }
    public WebElement getStateDropdown(){
        return driver.findElement(stateDropdown);
    }
    public WebElement getZipPostalCodeField(){
        return driver.findElement(zipPostalCodeField);
    }
    public WebElement getCountryDropdown(){
        return driver.findElement(countryDropdown);
    }
    public WebElement getPhoneField(){
        return driver.findElement(phoneField);
    }
    public WebElement getInvoiceSameAddressCheckbox(){
        return driver.findElement(invoiceSameAddressCheckbox);
    }
    public WebElement getContinueButton(){
        return driver.findElement(continueButton);
    }
}
