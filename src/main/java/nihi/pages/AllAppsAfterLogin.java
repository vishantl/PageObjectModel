package nihi.pages;

import nihi.base.Page;

public class AllAppsAfterLogin extends Page {

	
	public void gotoBooks() {
		
		click("booksBtn_CSS");
	}

	public void gotoCalendar() {

	}

	public void gotoCampaign() {
		 
		click("campaignBtn_CSS");
		
	}

	public TopMenu gotoCRM() {

		click("CRMBtn_CSS");
		return new TopMenu(driver);
	}

	public void gotoMail() {

	}
}
