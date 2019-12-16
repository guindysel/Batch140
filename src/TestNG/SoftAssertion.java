package TestNG;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	WebDriver driver;
	SoftAssert sa;
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\selinium jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		sa = new SoftAssert();
	}
	
	@Test
	public void doAutoComplete() throws InterruptedException {
		driver.navigate().to("https://jqueryui.com/autocomplete/");
		//Assert.assertEquals(driver.getTitle(), "Autocomplete | jQuery U");
		sa.assertEquals(driver.getTitle(), "Autocomplete | jQuery U");
		WebElement drop = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(drop);
		WebElement auto = driver.findElement(By.id("tags"));
		auto.sendKeys("a");
		Thread.sleep(1500); // Waiting time for browser to show the list
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
		//Assert.assertEquals(auto.getAttribute("value"), "AppleScript");
		sa.assertEquals(auto.getAttribute("value"), "AppleScript");
		//System.out.println("==========");
		//System.out.println(auto.getAttribute("value"));
		sa.assertAll(); // it will show the failed conditions
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
