package nihi.utilities;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;

public class Listeners implements ITestListener, ISuiteListener{
	static String messageBody;
	
	public void onStart(ISuite suite) {
		
	}

	public void onFinish(ISuite suite) {
		
		/*
		 * MonitoringMail mail = new MonitoringMail(); try { messageBody =
		 * "https://"+InetAddress.getLocalHost().getHostAddress()+
		 * ":8080/job/DataDrivenLiveProject/HTML_20Report/"; } catch
		 * (UnknownHostException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } try { mail.sendMail(TestConfig.server,
		 * TestConfig.from, TestConfig.to, TestConfig.subject, messageBody); } catch
		 * (AddressException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (MessagingException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */	}

	public void onTestStart(ITestResult result) {
		
		if(!TestUtil.isRunnable(result.getName())) { //This needs to be checked
			
			throw new SkipException("Skipping this test " +result.getName().toUpperCase()+ " as the RunMode is N for the test");
		}
		
		}

	public void onTestSuccess(ITestResult result) {
	System.out.println("Test Passed "+ result.getName());
	
	}

	public void onTestFailure(ITestResult result) {
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		try {
			ScreenshotandTmStmp.takeScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reporter.log("Click here for screenshot");
		Reporter.log("<a target=\"_blank\" href="+ScreenshotandTmStmp.screenshotName+">Screenshot_link</a>");
		Reporter.log("<br>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href="+ScreenshotandTmStmp.screenshotName+"><img src="+ScreenshotandTmStmp.screenshotName+" width=200 height=200 ></a>");
		System.out.println("Test Failed "+ result.getName());
		}

	public void onTestSkipped(ITestResult result) {
		}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		}

	public void onTestFailedWithTimeout(ITestResult result) {
		}

	public void onStart(ITestContext context) {
		}

	public void onFinish(ITestContext context) {
		}

	
	
}
