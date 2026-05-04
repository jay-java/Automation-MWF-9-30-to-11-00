package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P009_WindowSwitch {
	public static void main(String[] args) {
		String url = "https://demo.guru99.com/popup.php";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement link = driver.findElement(By.linkText("Click Here"));
		link.click();

		String mainWin = driver.getWindowHandle();

		Set<String> allWin = driver.getWindowHandles();
		for (String s : allWin) {
			System.out.println(s);
			if (!s.equals(mainWin)) {
				driver.switchTo().window(s);
				WebElement email = driver.findElement(By.name("emailid"));
				email.sendKeys("selenium@gmail.com");

				WebElement btn = driver.findElement(By.name("btnLogin"));
				btn.click();

			}
		}
		driver.quit();
	}
}
