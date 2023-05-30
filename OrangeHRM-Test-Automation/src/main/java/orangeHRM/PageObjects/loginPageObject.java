package orangeHRM.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangeHRM.Utilities.BaseUtil;

public class loginPageObject extends BaseUtil {
	WebDriver driver;
	BaseUtil base;
	
	
	public loginPageObject(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Username']") 
	private WebElement usrName;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement psWord;
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginBtn;
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement dashBoard;
	
	
	
	By byloginBtn=By.xpath("//button[text()=' Login ']");
	
	
	
	
	
	public void login(String userName, String passWord) {
		base= new BaseUtil(driver);
		base.explicitWait(byloginBtn);
		usrName.sendKeys(userName);
		psWord.sendKeys(passWord);
	}
	public boolean clickLoginButton() {
		loginBtn.click();
		base.implictWait(5);
		boolean res= dashBoard.isDisplayed();
		return res;
		
	}
	
	

}
