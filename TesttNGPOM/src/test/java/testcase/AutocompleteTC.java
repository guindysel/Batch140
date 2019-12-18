package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import initializer.Initializer;
import page.Autocompletepage;

public class AutocompleteTC extends Initializer {
	WebDriver driver;
	Autocompletepage am;
	ExtentTest test;
	ExtentReports reports;

	@BeforeTest
	public void chromelaunch() {

		driver = browserlaunch("E:\\SUBRAMANI\\Java\\Java\\TesttNGPOM\\src\\test\\java\\config\\auto.porperty");
		am = new Autocompletepage(driver);
		reports = initReport();

		test = reports.startTest("AutoComplete Export");
	}

	@Test(priority = 0)
	public void frameswitch() {
		am.frameLogin();
		test.log(LogStatus.PASS, "switched in frame page");
	}

	@Test(priority = 1)
	public void sendkeysvariable() {
		am.inputTags("a");
		test.log(LogStatus.PASS, "variable sended in correctly");
	}

	@Test(priority = 2)
	public void listofelements() {
		am.listElement("applescript");
		test.log(LogStatus.PASS, "selected in reqeusted name");

	}

	@AfterTest
	public void teardown() {
		driver.quit();
		reports.flush();
		reports.endTest(test);
	}

}