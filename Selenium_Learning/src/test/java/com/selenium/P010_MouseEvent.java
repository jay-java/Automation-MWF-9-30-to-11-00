package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverConnection.DriverConnection;

public class P010_MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.amazon.in/";
		WebDriver driver = DriverConnection.getDriver(url);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement sell = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sell")));
		System.out.println("done");
		WebElement bs = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Bestsellers')]")));
		WebElement mobile = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Mobiles')]")));

		Actions builder = new Actions(driver);
		builder.moveToElement(sell).build().perform();
		builder.moveToElement(bs).build().perform();
		builder.moveToElement(mobile).build().perform();

		Thread.sleep(5000);

		driver.quit();
	}
}
