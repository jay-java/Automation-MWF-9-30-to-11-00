package listener;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import driverConnection.DriverConnection;

public class FBTest {

	@Test
	public void login(ITestContext i) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);

		driver.findElement(By.name("email")).sendKeys("selenium@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("selenium@123");
		i.setAttribute("myDriver", driver);
		assertTrue(false);
	}
}
