package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelExecution {

	
	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\selinium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}
	
	@Test
	public void launch12() {
		System.setProperty("webdriver.gecko.driver", "C:\\selinium jars\\IEDriverServer.exe");
		WebDriver driver1 = new InternetExplorerDriver();
		InternetExplorerDriver d1 = new InternetExplorerDriver();
		
	}
	@Test
	public void launch2() {
		System.setProperty("webdriver.chrome.driver", "C:\\selinium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}
	
	@Test
	public void launch3() {
		System.setProperty("webdriver.chrome.driver", "C:\\selinium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}
}
