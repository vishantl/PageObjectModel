package nihi.pages;

import org.openqa.selenium.WebDriver;

import nihi.AddMenu.AddAccountPage;
import nihi.base.Page;

public class TopMenu {
	
	public WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		this.driver = driver;
		
	}
	public void gotoLeads() {

	}

	public void gotoContacts() {

	}

	public AddAccountPage gotoAccounts() throws InterruptedException {
		
		Page.click("accountBtn_CSS");
		return new AddAccountPage();
	}

	public void gotoDeals() {

	}
}
