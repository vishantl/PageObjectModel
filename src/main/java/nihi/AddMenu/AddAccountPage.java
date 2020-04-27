package nihi.AddMenu;

import nihi.base.Page;

public class AddAccountPage extends Page {

	public AddAccountPage addAccount(String accountName) {
		
		click("addAcc_CSS");
		type("accName_CSS", accountName);
		
		topmenu.gotoContacts();
		return new AddAccountPage();
	}
	
}
