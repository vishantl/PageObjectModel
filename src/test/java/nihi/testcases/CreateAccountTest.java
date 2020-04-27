package nihi.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import nihi.AddMenu.AddAccountPage;
import nihi.base.Page;
import nihi.pages.AllAppsAfterLogin;
import nihi.utilities.CommonDataProvider;

public class CreateAccountTest {

	@Test(dataProviderClass=CommonDataProvider.class, dataProvider = "dp" )
	public static void createAccountTest(Hashtable<String, String>data) throws InterruptedException {
		
		AllAppsAfterLogin apps = new AllAppsAfterLogin();
		apps.gotoCRM();
		AddAccountPage addacc = Page.topmenu.gotoAccounts();		
		//tm.gotoDeals();
		addacc.addAccount(data.get("accountName"));
		Assert.fail("Create Account Test Failed");
		
	}
	
	
}
