package page;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import initializer.Initializer;
import locators.SeleniumEasyLocators;

public class SeleniumEasyPage extends SeleniumEasyLocators {
	WebDriver driver;
	SeleniumEasyLocators se;
	


	public SeleniumEasyPage(WebDriver driver) {
		
		this.driver = driver;// this keyword identifying globalvairable
		se = new SeleniumEasyLocators();
		
		 

	}

	public void inputFirstName(String fn) {
		driver.findElement(By.name(se.firstName_Name)).sendKeys(fn);

	}

	public void inputLastName(String ln) {
		driver.findElement(By.name(se.lastName_Name)).sendKeys(ln);
	}

	public void inputEMail(String em) {
		driver.findElement(By.name(se.email_Name)).sendKeys(em);

	}

	public void inputphoneNo(String ph) {
		driver.findElement(By.name(se.phone_Name)).sendKeys(ph);

	}

	public void inputAddress(String ad) {
		driver.findElement(By.name(se.address_Name)).sendKeys(ad);

	}

	public void inputCity(String ct) {
		driver.findElement(By.name(se.city_Name)).sendKeys(ct);

	}

	public void inputState(String req) {
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> options = driver.findElements(By.xpath(se.state_Xpath));
		Iterator<WebElement> itr = options.iterator();
		System.out.println(options.size());
		while (itr.hasNext()) {
			WebElement option = (WebElement) itr.next();
			System.out.println(option.getText());
			if (option.getText().trim().equalsIgnoreCase(req)) {
				option.click();
			}

		}

	}

	public void inputZip(String zp) {
		driver.findElement(By.name(se.zip_Name)).sendKeys(zp);

	}

	public void inputWebsite(String dm) {
		driver.findElement(By.name(se.websitedomain_Name)).sendKeys(dm);

	}

	public void inputHosting(String sh) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		if (sh.trim().equalsIgnoreCase("yes")) {
			driver.findElement(By.xpath(se.hostingvalueyes_Xpath)).click();
		} else {
			driver.findElement(By.xpath(se.hostingvalueno_Xpath)).click();
		}

	}

	public void inputProjetdescription(String cc) {
		driver.findElement(By.name(se.projectdes_Name)).sendKeys(cc);

	}

	public void inputsubmit() {
		driver.findElement(By.xpath(se.submit_Xpath)).click();
	}

}
