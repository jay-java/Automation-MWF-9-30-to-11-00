package com.junit;

import java.util.Arrays;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import driverConnection.DriverConnection;

@RunWith(Parameterized.class)
public class P007_ParameterizedTest {

	String email;
	String password;

	public P007_ParameterizedTest(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	static WebDriver driver;

	@Before
	public void openBrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}

	@Test
	public void fbLogin() throws InterruptedException {
		WebElement emailEle = driver.findElement(By.name("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		WebElement passwordEle = driver.findElement(By.name("pass"));
		passwordEle.clear();
		passwordEle.sendKeys(password);
		Thread.sleep(2000);
	}

	@Parameters
	public static List<Object[]> getData() {
		Object obj[][] = new Object[4][2];
		obj[0][0] = "correct@gmail.com";
		obj[0][1] = "correct@123";

		obj[1][0] = "incorrect@gmail.com";
		obj[1][1] = "correct@123";

		obj[2][0] = "correct@gmail.com";
		obj[2][1] = "incorrect@123";

		obj[3][0] = "incorrect@gmail.com";
		obj[3][1] = "incorrect@123";

		return Arrays.asList(obj);
	}

//	@AfterClass
//	public static void tearDown() {
//		driver.close();
//	}

}
