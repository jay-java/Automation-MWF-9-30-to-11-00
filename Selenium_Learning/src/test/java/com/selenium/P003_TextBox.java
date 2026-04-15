package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P003_TextBox {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		driver.findElement(By.linkText("Create new account")).click();

		WebElement firstName = driver.findElement(By.id("_R_1cl2p4jikacppb6amH1_"));
		firstName.sendKeys("selenium");
		

		WebElement surName = driver.findElement(By.id("_R_1kl2p4jikacppb6amH1_"));
		surName.sendKeys("selenium");
		
		
		
	}
}
