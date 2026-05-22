package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driverConnection.DriverConnection;

public class CrossBrowserTest {

	String url = "https://www.facebook.com/";
	WebDriver driver = null;

	@Parameters({ "browser" })
	@Test
	public void loginTest(String browserName) {
		if (browserName.equals("chrome")) {
			driver = DriverConnection.getDriver(url);
		}
		if (browserName.equals("ff")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Admin\\Downloads\\geckodriver-v0.36.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
		}
		if (browserName.equals("edge")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Admin\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get(url);
		}
	}
}
