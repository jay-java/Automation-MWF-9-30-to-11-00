package com.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P006_AnnotationsPractical {

	static WebDriver driver;

	@BeforeClass
	public static void openBrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getDriver(url);
	}

	@Test
	public void fbLogin() throws InterruptedException {
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("selenium@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("selenium@123");
		Thread.sleep(2000);
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}
