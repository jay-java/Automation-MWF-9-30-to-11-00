package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P014_Scroll {
	public static void main(String[] args) {
		String url ="https://demoqa.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//1.scroll by pixels
//		js.executeScript("window.scrollBy(0,350)", "");
		
		//2.scroll by element
//		WebElement intersection = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/a[5]/div/div/div[3]/h5"));
//		js.executeScript("arguments[0].scrollIntoView();", intersection);
		
		//3.scroll by bottom/height
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
}
