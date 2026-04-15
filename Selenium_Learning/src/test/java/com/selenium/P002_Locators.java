package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P002_Locators {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement emailEle = driver.findElement(By.name("email"));
		emailEle.sendKeys("selenium@gmail.com");

		WebElement passEle = driver.findElement(By.name("pass"));
		passEle.sendKeys("selenium@123");
	}
}
