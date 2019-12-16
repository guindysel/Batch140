package TestNG;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider {
	WebDriver driver;
	
	@BeforeMethod 
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\selinium jars\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(dataProvider="autocomplete", dataProviderClass = TestDataSource.class)
	public void getinto(String key, String value ) throws InterruptedException {
		
		driver.navigate().to("https://jqueryui.com/autocomplete/");
		
		WebElement drop = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(0);
		WebElement auto = driver.findElement(By.id("tags"));
		auto.sendKeys(key);
		Thread.sleep(3000); // Waiting time for browser to show the list
		List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div"));
		Iterator<WebElement> itr = options.iterator();
		System.out.println("==========");
		System.out.println(options.size());
		while (itr.hasNext()) // hasnext is used to check contains or not 
		{
		
			WebElement option = (WebElement) itr.next();
			System.out.println(option.getText());
			if(option.getText().trim().equalsIgnoreCase("AppleScript")) // Compare Texts
			{
				option.click();
				break;
			}
		}
	}
	
	@AfterMethod	
	public void teardown() {
		driver.quit();
	}
}
