package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametirarization {
	WebDriver driver;
	
	@Test(priority = 0)
	@Parameters({"browser"})
	public void launchBrowser(String str) {
		switch(str)
		{
		case "ff":
			System.setProperty("webdriver.gecko.driver", "C:\\selinium jars\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
			
		default:
		System.setProperty("webdriver.chrome.driver", "C:\\selinium jars\\chromedriver.exe");
		driver = new ChromeDriver();
		break;
		}
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
	
	//@AfterTest
	@AfterMethod
	public void teardown() {
		driver.quit();
	}	
}
