package nihi.rough;

import nihi.AddMenu.AddAccountPage;
import nihi.base.Page;
import nihi.pages.AllAppsAfterLogin;
import nihi.pages.HomePage;

public class LoginTest1 extends Page{

	public static void main(String[] args) throws InterruptedException {

		
		AllAppsAfterLogin apps = new AllAppsAfterLogin();
		apps.gotoCRM();
		AddAccountPage addacc = Page.topmenu.gotoAccounts();		
		//tm.gotoDeals();
		//addacc.addAccount();
	}

}
