package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driverConnection.DriverConnection;

public class P004_DropDown {
	public static void main(String[] args) {
		String url = "https://www.tutorialspoint.com/selenium/practice/select-menu.php";
		
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement dropdown = driver.findElement(By.id("inputGroupSelect03"));
		Select select = new Select(dropdown);
		//by index
//		select.selectByIndex(1);
		
		//by value
//		select.selectByValue("3");
		
		//by visible text
		select.selectByVisibleText("Proof.");
	}
}
