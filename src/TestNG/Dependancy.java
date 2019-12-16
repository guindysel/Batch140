package TestNG;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dependancy {
	WebDriver driver;

	@BeforeTest // this will open browser once and run all the test cases
	// @BeforeMethod // this will open browser for each test
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\selinium jars\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void tc001() {
		driver.navigate().to("https://jqueryui.com/");
		Assert.assertEquals(driver.getTitle(), "Autocomplete | jQuery UI");
	}

	@Test(dependsOnMethods= {"tc001"}) // dependsOnMethods is used to skip if above test case is failed
	public void tc002() throws InterruptedException {
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
			if (option.getText().trim().equalsIgnoreCase("AppleScript")) // Compare Texts
			{
				option.click();
				break;
			}
		}
		Assert.assertEquals(auto.getAttribute("value"), "AppleScript");
		// System.out.println("==========");
		// System.out.println(auto.getAttribute("value"));
	}
}
