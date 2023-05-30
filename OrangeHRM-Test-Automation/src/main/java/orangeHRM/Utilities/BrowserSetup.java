package orangeHRM.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {
	public WebDriver driver;
	@Parameters({"url", "browserName"})
	@BeforeMethod
	public void launchBrowser(String url, String browserName) {
		
		String browser=browserName.toLowerCase();
		switch(browser){
		case "chrome":
			WebDriverManager.chromedriver();
			driver= new ChromeDriver();
			driver.get(url);
			break;
		case "edge":
			WebDriverManager.edgedriver();
			driver= new EdgeDriver();
			driver.get(url);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver();
			driver= new FirefoxDriver();
			driver.get(url);
			break;
		default:
			System.out.println("Browser not matched");
		
		}
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	

	

}
