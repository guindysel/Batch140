package web.element;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selinium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/autocomplete/");
		
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
	}

}
