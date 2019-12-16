package web.element;

import java.util.*;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selinium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://omayo.blogspot.com/");
		System.out.println(driver.getCurrentUrl());
		WebElement link = driver.findElement(By.linkText("http://www.Selenium143.blogspot.com"));
		link.click(); // submit, move to and then click, javascript
		
		List<String> windows = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windows.size());
		int n = windows.size();
		System.out.println(n);
		driver.switchTo().window(windows.get(n-1));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(windows.get(n-2));
		System.out.println(driver.getCurrentUrl());
		
		// static variable and function
		
		// Java programs  12345 to add 15 
		// Google page take all the links with inner text
		// Take images from from a page
	}

}
