package nihi.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import nihi.pages.AllAppsAfterLogin;
import nihi.pages.HomePage;
import nihi.utilities.CommonDataProvider;

public class LoginTest {
	
	@Test(dataProviderClass=CommonDataProvider.class, dataProvider = "dp")
	public void loginTest(Hashtable<String, String> data ) {
		
		HomePage home = new HomePage();
		AllAppsAfterLogin apps = home.gotoLogin(data.get("username"), data.get("password"));
		Assert.fail("Login Test Failed");
		
	}

}
