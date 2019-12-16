package web.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpitcitWait2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selinium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.navigate().to("https://jqueryui.com/droppable/");
		
		WebElement drop = driver.findElement(By.className("demo-frame"));
		//driver.switchTo().frame(drop);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(drop));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("draggable")));
		WebElement dragdrop = driver.findElement(By.id("draggable"));
		WebElement dragdrop2 = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(dragdrop, dragdrop2).build().perform();
		driver.switchTo().defaultContent(); // it will go only one step back
		driver.switchTo().defaultContent();

	}

}
