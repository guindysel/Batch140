package web.element;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		// to scrolldown (0,1000) -> vertically (1000,0) -> scroll horizantolly
		// js.executeScript("window.scrollBy(0,1000)");
		// to scroll a specific element
		WebElement button = driver.findElement(By.id("sex-0"));
		js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.id("lastname")));
		button.click();
	}

}
