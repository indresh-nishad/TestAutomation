package orangeHRM.TestCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import orangeHRM.PageObjects.AdminPageObjects;
import orangeHRM.PageObjects.loginPageObject;
import orangeHRM.Utilities.BrowserSetup;
import orangeHRM.Utilities.DataProviderUtil;

public class AdminTest extends BrowserSetup {
	loginPageObject loginPg;
	AdminPageObjects admin;
	
	@Test(dataProvider="testDataLogin", dataProviderClass=DataProviderUtil.class)
	public void verifyAdminLink(String usrName, String psWord) {
		loginPg= new loginPageObject(driver);
		loginPg.login(usrName, psWord);
		loginPg.clickLoginButton();
		admin= new AdminPageObjects(driver);
		boolean adminValidation=admin.adminClick();
		Assert.assertTrue(adminValidation, "Admin link is not working");	
	}
}
