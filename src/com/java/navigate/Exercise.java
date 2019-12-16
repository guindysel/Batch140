package com.java.navigate;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.seleniumeasy.com/test/input-form-demo.html");
		driver.findElement(By.name("first_name")).sendKeys("SUBRAMANI");

		driver.findElement(By.name("last_name")).sendKeys("E");

		driver.findElement(By.name("email")).sendKeys("subramani@1920");

		driver.findElement(By.name("phone")).sendKeys("9500647784");

		driver.findElement(By.name("address")).sendKeys("PLOT NO 112 SARATHI STREET MANICKAM NAGAR");

		driver.findElement(By.name("city")).sendKeys("CHENNNAI");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");
		List<WebElement> options = driver.findElements(By.xpath("//select[@class='form-control selectpicker']/option"));
		Iterator<WebElement> itr = options.iterator();
		while (itr.hasNext()) {
			WebElement option = (WebElement) itr.next();
			System.out.println(option.getText());
			if (option.getText().trim().equalsIgnoreCase("Virginia"))
				
			{
				option.click();
			}

		}

		driver.findElement(By.name("zip")).sendKeys("CHENNIAI");
		driver.findElement(By.name("website")).sendKeys("www.tatadocomo.com");
		String as = "yes";
		if (as.equals("yes")) {
			driver.findElement(By.xpath("//input[@value='no']")).click();
		} else {
			driver.findElement(By.xpath("//input[@name=value='no']")).click();
		}
		driver.findElement(By.name("comment")).sendKeys("Automation");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
