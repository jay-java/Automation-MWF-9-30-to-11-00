package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P001_OpenBrowser {
	public static void main(String[] args) throws InterruptedException {
//		 1.chrome driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.facebook.com/";
		driver.manage().window().maximize();
		driver.get(url);
//		
		// edge driver
//		System.setProperty("webdriver.edge.driver",
//				"C:\\Users\\Admin\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		String url = "https://www.facebook.com/";
//		driver.manage().window().maximize();
//		driver.get(url);

		// firefox
//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\Admin\\Downloads\\geckodriver-v0.36.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		String url = "https://www.facebook.com/";
//		driver.manage().window().maximize();
//		driver.get(url);
//		Thread.sleep(3000);
//		driver.close();
	}
}
