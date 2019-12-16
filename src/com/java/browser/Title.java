package com.java.browser;

import java.nio.file.DirectoryNotEmptyException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\selinium jars\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver(); // webdriver is an interface
		
		System.out.println("hi  ");
		
		driver.get("https://www.google.com"); // open a link
		System.out.println(driver.getTitle());


		//driver.quit(); // will close the tabs which is opened with the same object
		
		//System.out.println(driver.getPageSource()); // page source will return the source code
		
		System.out.println(driver.getCurrentUrl()); // returns current url 
		
		/* Chennai split into 3  
		
		che
		hen
		enn
		nna
		nai 
		// It is splitted using the permutation concept.
		*/
		
		// 16/10/2019
		
		driver.manage().window().fullscreen(); // works for mac00
		driver.manage().window().maximize(); // works for windows
		
		// Resize browser
		Dimension d = new Dimension(600, 400);
		driver.manage().window().setSize(d);
	}

}
