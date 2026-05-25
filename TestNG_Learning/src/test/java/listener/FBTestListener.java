package listener;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class FBTestListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test started");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver = (WebDriver) result.getTestContext().getAttribute("myDriver");
		String imName = result.getName();
		String path = "C:\\screenshot\\" + imName + ".png";

		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);

		try {
			FileUtils.copyFile(source, dest);
			System.out.println("ss taken");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test finished");
	}
}
