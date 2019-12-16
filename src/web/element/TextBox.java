package web.element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\selinium jars\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver();
		driver.navigate().to("https://www.google.com");
		WebElement search = driver.findElement(By.name("q")); // locators to find unique values [ ID, name, class name, link text, partial link text, xpath, css selector, dom]
		search.sendKeys("today's news");
		search.sendKeys(Keys.ENTER); // keys is an enumeration
	}

}
