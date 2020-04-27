package nihi.testcases;

import org.testng.annotations.AfterSuite;

import nihi.base.Page;

public class BaseClass {

	@AfterSuite
	public static void tearDown() {
		
		Page.quit();
	}
	
}
