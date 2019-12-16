package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grouping {

	WebDriver driver;
	
	@BeforeTest(groups= {"all"})
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\selinium jars\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(groups= {"regression"})
	public void google() {
		driver.get("https://www.google.com");
	}
	@Test(groups= {"regression"})
	public void yahoo() {
		driver.get("https://in.yahoo.com/");
	}
	
	@Test(groups= {"regression", "smoke"})
	public void bing() {
		driver.get("https://www.bing.com/?cc=in");
	}
	
	@Test(groups= {"regression", "sanity"})
	public void ask() {
		driver.get("https://www.search.ask.com/");
	}
	
	@Test(groups= {"smoke", "sanity"})
	public void msn() {
		driver.get("https://www.msn.com/en-in");
	}
	
	@Test(groups= {"smoke"})
	public void duckgo() {
		driver.get("https://duckduckgo.com/");
	}
	
	@AfterTest(groups= {"all"})
	public void tearDown() {
		driver.quit();
	}
}
