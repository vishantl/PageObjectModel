package nihi.pages;

import nihi.base.Page;

public class HomePage extends Page {

	/* this.driver = driver; driver reference of HomePage class i.e. this.driver is
	 * being assigned with the driver reference being sent from the class/main
	 * method where the object of the HomePage Class is being created. (Here, from
	 * main method in LoginTest Class. Therefore, this.driver becomes (=)
	 * chromedriver and the same is forwarded in each method within this class
	 */
	public void gotoCustomers() {

	click("customers_CSS");
	
	}

	public AllAppsAfterLogin gotoLogin(String username, String password) {

		click("loginBtn_CSS");
		type("username_CSS", username);
		click("nextBtn_CSS");
		type("password_CSS", password);
		click("signinBtn_CSS");
		return new AllAppsAfterLogin();

	}

	public void gotoSupport() {

		click("supportBtn_CSS");
	}

	public void gotoContact() {

		click("contactBtn_CSS");
	}

	public void gotoValidateFooterLinks() {

	}

}