package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P006_RadioButton {
	public static void main(String[] args) {
		String url = "https://www.tutorialspoint.com/selenium/practice/radio-button.php";
		WebDriver driver = DriverConnection.getDriver(url);

		List<WebElement> radio = driver.findElements(By.name("tab"));
		radio.get(1).click();
		System.out.println(radio.size());
		for (WebElement e : radio) {
			System.out.println(e.getText());
		}
	}
}
