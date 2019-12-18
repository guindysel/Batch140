package testcase;

import java.util.LinkedList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import initializer.Initializer;
import page.SeleniumEasyPage;

public class SeleniumTC extends Initializer {
	WebDriver driver;
	SeleniumEasyPage sk;
	ExtentTest test;
	ExtentReports reports;
	LinkedList<String>li;
	

	@BeforeTest
	public void logintest() {
		driver = browserlaunch("E:\\SUBRAMANI\\Java\\Java\\TesttNGPOM\\src\\test\\java\\config\\env.property");
		sk = new SeleniumEasyPage(driver);
		driver.manage().window().maximize();
		reports=initReport();
	li=excelnew();
		
		//System.out.println(System.getProperty("user.dir") + "//extentseliniumeasy.html");
		test = reports.startTest("Selenium Easy reports");
	}

	// driver.navigate().to("https://www.seleniumeasy.com/test/input-form-demo.html");

	@Test(priority = 0)
	public void firstName() {
		System.out.println(li.get(0));
		sk.inputFirstName(li.get(0));
		test.log(LogStatus.PASS, "selected in reqeusted name");
	}

	@Test(priority = 1)
	public void lastName() {
		sk.inputLastName(li.get(1));
		test.log(LogStatus.PASS, "selected in reqeusted name");
	}

	@Test(priority = 2)
	public void emailID() {
		sk.inputEMail("subramani1920@gmail.com");
		test.log(LogStatus.PASS, "selected in reqeusted name");
		
	}

	@Test(priority = 3)
	public void phoneNo() {
		sk.inputphoneNo("7200001118");
	}

	@Test(priority = 4)
	public void address() {
		sk.inputAddress("No 112 Sarthi Nagar Chrompet");
		test.log(LogStatus.PASS, "selected in reqeusted name");
	}

	@Test(priority = 5)
	public void city() {
		sk.inputCity("Chennai");
		test.log(LogStatus.PASS, "selected in reqeusted name");
	}

	@Test(priority = 6)
	public void stateInd() {

		sk.inputState("Virginia");
		test.log(LogStatus.PASS, "selected in reqeusted name");
	}

	@Test(priority = 7)
	public void zipCode() {
		sk.inputZip("600044");
		test.log(LogStatus.PASS, "selected in reqeusted name");
	}

	@Test(priority = 8)
	public void website() {
		sk.inputWebsite("www.amazon.com");
		test.log(LogStatus.PASS, "selected in reqeusted name");
	}

	@Test(priority = 9)
	public void hosting() {
		sk.inputHosting("yes");
		test.log(LogStatus.PASS, "selected in reqeusted name");
	}

	@Test(priority = 10)
	public void projectDescription() {
		sk.inputProjetdescription("Automation");
		test.log(LogStatus.PASS, "selected in reqeusted name");
	}

	@Test(priority = 11)
	public void submit() {
		sk.inputsubmit();
		test.log(LogStatus.PASS, "selected in reqeusted name");
	}

	@AfterTest
	public void teardown() {
		driver.quit();
		reports.flush();
		reports.endTest(test);

	}

}
