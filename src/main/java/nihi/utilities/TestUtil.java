package nihi.utilities;

import nihi.base.Page;

public class TestUtil extends Page{

	public static boolean isRunnable(String testName) {
	
		String sheetName1 = "test_suite";
		int rowNum = excel.getRowCount(sheetName1);
		
		for (int i = 2; i <= rowNum; i++) {
			
			String testCase = excel.getCellData(sheetName1, "TCID", i);
						
			if (testCase.equalsIgnoreCase(testName)) {
					
				String runmod = excel.getCellData(sheetName1, "runmode", i);
				
					if (runmod.equalsIgnoreCase("Y"))
						return true;
					else
						return false;
		}
	
	}
		return false;
}
}