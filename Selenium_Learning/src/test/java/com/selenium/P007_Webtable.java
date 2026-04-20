package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P007_Webtable {
	public static void main(String[] args) {
		String url = "https://www.tutorialspoint.com/selenium/practice/webtables.php";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement email = driver
				.findElement(By.xpath("//div[@class='container']/div/div[2]/form/div[2]/table/tbody/tr[3]/td[4]"));
		System.out.println(email.getText());

		List<WebElement> thead = driver
				.findElements(By.xpath("//div[@class='container']/div/div[2]/form/div[2]/table/thead/tr/th"));
		for (WebElement e : thead) {
			System.out.print(e.getText() + " ");
		}

		List<WebElement> rows = driver
				.findElements(By.xpath("//div[@class='container']/div/div[2]/form/div[2]/table/tbody/tr"));
		for (int i = 1; i <= rows.size(); i++) {
			List<WebElement> col = driver.findElements(
					By.xpath("//div[@class='container']/div/div[2]/form/div[2]/table/tbody/tr[" + i + "]/td"));
			for (int j = 1; j <= col.size(); j++) {
				WebElement data = driver.findElement(By.xpath(
						"//div[@class='container']/div/div[2]/form/div[2]/table/tbody/tr[" + i + "]/td[" + j + "]"));
				System.out.print(data.getText() + " ");
			}
			System.out.println();
		}

	}
}
