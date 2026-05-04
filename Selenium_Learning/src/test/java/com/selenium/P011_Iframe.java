package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverConnection.DriverConnection;

public class P011_Iframe {
	public static void main(String[] args) {
		String url = "https://demoqa.com/frames";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement iFrame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iFrame1);

		WebElement text1 = driver.findElement(By.id("sampleHeading"));
		System.out.println(text1.getText());

		driver.switchTo().window(driver.getWindowHandle());

		WebElement iFrame2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(iFrame2);

		WebElement text2 = driver.findElement(By.id("sampleHeading"));
		System.out.println(text2.getText());
	}
}
