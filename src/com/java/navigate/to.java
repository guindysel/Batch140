package com.java.navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class to {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selinium jars\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.navigate().to("https://in.yahoo.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
