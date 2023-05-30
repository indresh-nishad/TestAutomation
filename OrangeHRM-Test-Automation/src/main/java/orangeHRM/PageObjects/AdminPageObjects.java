package orangeHRM.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangeHRM.Utilities.BaseUtil;

public class AdminPageObjects extends BaseUtil {
	WebDriver driver;
	BaseUtil base;
	
	
	public AdminPageObjects(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement adminLink;
	
	By admin=By.xpath("//span[text()='Admin']");
	
	@FindBy(xpath="//h5[text()='System Users']")
	private WebElement sysUser;
	
	
	
	
	public boolean adminClick() {
		base= new BaseUtil(driver);
		base.explicitWait(admin);
		adminLink.click();
		base.implictWait(10);
		boolean result=sysUser.isDisplayed();
		return result;
		
	}
	
	
	
}
