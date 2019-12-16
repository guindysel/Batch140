package com.java.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selinium jars\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver(); // webdriver is an interface
		
		//ChromeDriver cd = new ChromeDriver();
		System.out.println("hi  ");
		
		driver.get("https://www.google.com"); // open a link
	}

}
