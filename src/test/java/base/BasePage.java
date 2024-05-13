package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	private String url;
	private Properties prop;

	public BasePage() throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/java/resources/config.properties");
		prop.load(data);
	}

	public static WebDriver getDriver() throws IOException {
		return WebDriverInstance.getDriver();
	}

	public String getUrl() throws IOException {
		url = prop.getProperty("url");
		return url;
	}

	public void takeSnapShot(String name) throws IOException {
		File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);

		File destFile = new File(System.getProperty("user.dir") + "/target/screenshots/"
				+ timestamp() + ".png");

		FileUtils.copyFile(srcFile, destFile);
	}

	public String timestamp() {

		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

	public static void waitForElementInvisible(WebElement element, int timer) throws IOException {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timer));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
}
