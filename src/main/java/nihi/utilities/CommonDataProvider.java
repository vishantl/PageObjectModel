package nihi.utilities;

import java.lang.reflect.Method;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;

import nihi.base.Page;

public class CommonDataProvider extends Page {

	@DataProvider(name = "dp")
	public Object[][] getdata(Method m) {
		
		String sheetName = m.getName();	
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][1];

		Hashtable<String, String> table = null;

		for (int i = 2; i <= rows; i++) {

			table = new Hashtable<String, String>();
			for (int j = 0; j < cols; j++) {
				table.put(excel.getCellData(sheetName, j, 1), excel.getCellData(sheetName, j, i));
				
				
				data[i - 2][0] = table;   /*Value '0' in Column suggests that the data object stores all the values of the row(i-2) in a single cell of the data object */ 
				
				
				System.out.println(data[i-2][0]);
			}
		}

		return data;

	}

}
