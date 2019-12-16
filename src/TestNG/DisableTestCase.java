package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DisableTestCase {
	WebDriver driver;
		@BeforeTest
		public void launch() {
			System.setProperty("webdriver.chrome.driver", "C:\\selinium jars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		@Test(priority = 0)
		public void google() {
			driver.get("https://www.google.com");
		}
		@Test(priority = 2, enabled = false) //to skip the test cases in a sequence
		public void yahoo() {
			driver.get("https://in.yahoo.com/");
		}
		
		@Test(priority = 1)
		public void bing() {
			driver.get("https://www.bing.com/?cc=in");
		}
		@Test(priority = 3)
		public void ask() {
			driver.get("https://www.search.ask.com/");
		}
		
		@AfterTest
		//@AfterMethod
		public void teardown() {
			driver.quit();
		}
}
