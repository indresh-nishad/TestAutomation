package orangeHRM.Utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtil {
	
	@DataProvider(name ="testDataLoginTest")
	public Object[][] datProviderDemo() {
	 return new Object[][] {
	   { "Admin", "admin123" },
	   { "Admin", "admin124" },
	   { "customer", "admin125" },
	 };
	}
	
	@DataProvider(name ="testDataLogin")
	public Object[][] datProviderDemo2() {
	 return new Object[][] {
	   { "Admin", "admin123" },
	 };
	}

	

}
