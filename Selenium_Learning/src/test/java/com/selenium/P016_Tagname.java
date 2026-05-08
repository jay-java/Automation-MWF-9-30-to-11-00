package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P016_Tagname {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);

		List<WebElement> tags = driver.findElements(By.tagName("a"));
		String str[] = new String[tags.size()];
		int index = 0;

		for (WebElement tag : tags) {
			if (!tag.getText().equals("")) {
				str[index] = tag.getText();
				index++;
			}
		}

		String s[] = str;
		for (String s1 : s) {
			System.out.println(s1);
			driver.findElement(By.linkText(s1)).click();
			Thread.sleep(4000);
			driver.navigate().back();
		}
	}
}
