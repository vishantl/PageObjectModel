package nihi.utilities;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import nihi.base.Page;

public class ScreenshotandTmStmp extends Page {
	
	public static String screenshotName;
	public static String screenshotPath;
	
	
	public static void takeScreenshot() throws IOException {
		
		Date d = new Date();
		String timeStamp = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		screenshotName = "C:\\Users\\vishant.landge\\Desktop\\Selenium_WorkFiles\\"+"screenshot"+"_"+timeStamp;
		FileUtils.copyFile(screenshot, new File(screenshotName));

			/*
			 * takeScreenshot();
			 * 
			 * Screenshot screenshot1 = (Screenshot) new
			 * AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000)).
			 * takeScreenshot(driver,
			 * driver.findElement(By.cssSelector("#logo-events > h2 > a")));
			 * ImageIO.write(((ru.yandex.qatools.ashot.Screenshot) screenshot1).getImage(),
			 * "jpg", new File(screenshotName+"\\img_screenshot" + timeStamp));
			 */	
		
	}

}
