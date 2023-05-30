package orangeHRM.TestCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import orangeHRM.PageObjects.loginPageObject;
import orangeHRM.Utilities.BrowserSetup;
import orangeHRM.Utilities.DataProviderUtil;

public class LoginTest extends BrowserSetup {
	loginPageObject loginPg;

	@Test(dataProvider="testDataLoginTest", dataProviderClass=DataProviderUtil.class)
	public void verfiyLogin(String usrName, String psWord) {
		loginPg= new loginPageObject(driver);
		loginPg.login(usrName, psWord);
		boolean result=loginPg.clickLoginButton();
		Assert.assertTrue(result, "Login failed");
		System.out.println("Git status check");
	}
}


