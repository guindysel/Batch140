package web.element;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selinium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		WebElement drop = driver.findElement(By.id(("continents")));
		// to scroll
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.id("tool-0")));
		drop.click();
		
		// to take multiple elements in list
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='continents']/option"));
		Iterator<WebElement> itr = options.iterator();
		while (itr.hasNext()) // hasnext is used to check contains or not 
		{
		
			WebElement option = (WebElement) itr.next();
			System.out.println(option.getText());
			
			if(option.getText().trim().equalsIgnoreCase("South America")) // Compare Texts
			{
				option.click();
				break;
			}
		}
		
		// Want to create a automation for the below page
		// https://www.seleniumeasy.com/test/basic-radiobutton-demo.html
	}

}
