package orangeHRM.Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtil {
	WebDriver driver;
	public BaseUtil(WebDriver driver) {
		this.driver= driver;
	}


	public void implictWait(int time) {
		//time is value till the time implicit wait we want to apply
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

	}
	public void explicitWait(By element) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
		wt.until(ExpectedConditions.visibilityOfElementLocated(element)); 
	}

	public void scrollBy() {

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,100)");

	}
	public void scrollTo() {

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.scrollTo(0,100)");

	}
	public void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
	






}
