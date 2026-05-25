package dataProvider;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import driverConnection.DriverConnection;

public class DataProviderFb {

	static WebDriver driver;

	@BeforeClass
	public static void openBrowser() {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
	}

	@Test(dataProvider = "dp")
	public void login(String email, String password) {
		WebElement emailEle = driver.findElement(By.name("email"));
		emailEle.sendKeys(email);
		WebElement passEle = driver.findElement(By.name("pass"));
		passEle.sendKeys(password);
	}

	@DataProvider(name = "dp")
	public static Object[][] getData() {
		Object obj[][] = new Object[4][2];
		obj[0][0] = "correct@gmail.com";
		obj[0][1] = "correct@123";

		obj[1][0] = "incorrect@gmail.com";
		obj[1][1] = "correct@123";

		obj[2][0] = "correct@gmail.com";
		obj[2][1] = "incorrect@123";

		obj[3][0] = "incorrect@gmail.com";
		obj[3][1] = "incorrect@123";

		return obj;
	}

}
