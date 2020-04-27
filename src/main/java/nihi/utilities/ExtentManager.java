package nihi.utilities;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	private static ExtentHtmlReporter extent;

	public static ExtentHtmlReporter createInstance() {

		if (extent == null) {
			extent = new ExtentHtmlReporter(
					System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\extent.html");
			extent.loadConfig(
					System.getProperty("user.dir") + "\\src\\test\\resources\\extentconfig\\ReportsConfig.xml");

			extent.config().setTheme(Theme.STANDARD);
			extent.config().setDocumentTitle("Test Extent Report");
			extent.config().setEncoding("utf-8");
			extent.config().setReportName("Test Extent Report");

			// extent = new ExtentHtmlReporter();

			/*
			 * extent. extent.attachReporter(extent);
			 * extent.setSystemInfo("Automation Tester", "Vishant Landge");
			 * extent.setSystemInfo("Organization", "Nihilent Ltd.");
			 * extent.setSystemInfo("Build no", "Learning-Selenium1.0");
			 */

			
		}
		return extent;
	}
}
