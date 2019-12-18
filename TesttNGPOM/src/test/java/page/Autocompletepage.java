package page;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Autocompletelocators;

public class Autocompletepage extends Autocompletelocators {
	WebDriver driver;
	Autocompletelocators al;
	WebElement ck;

	public Autocompletepage(WebDriver driver) {
		this.driver = driver;
		al = new Autocompletelocators();

	}

	public void frameLogin() {
		driver.switchTo().frame(0);

	}

	public void inputTags(String var) {
		ck = driver.findElement(By.id(al.tags_Id));
		ck.click();
		ck.sendKeys(var);

	}

	public void listElement(String own) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> options = driver.findElements(By.xpath(al.listelement_Xpath));
		Iterator<WebElement> itr = options.iterator();
		System.out.println(options.size());
		while (itr.hasNext()) {
			WebElement option = (WebElement) itr.next();
			System.out.println(option.getText());
			if (option.getText().trim().equalsIgnoreCase(own)) {
				option.click();
			}
		}
	}
}
