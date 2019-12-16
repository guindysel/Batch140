package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SkippingTestCase {
	WebDriver driver;
	@BeforeTest  // this will open browser once and run all the test cases
	//@BeforeMethod // this will open browser for each test
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\selinium jars\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test//(priority = 0)
	public void google() {
		new SkipException("skipping google testcase"); // to skip explicitly
		driver.get("https://www.google.com");
		
	}
	@Test(priority = 2)
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
