package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driverConnection.DriverConnection;

public class P005_CheckBox {
	public static void main(String[] args) {
		String url = "https://www.tutorialspoint.com/selenium/practice/check-box.php";
		
		WebDriver driver = DriverConnection.getDriver(url);
		
		driver.findElement(By.id("c_bs_1")).click();
	}
}
