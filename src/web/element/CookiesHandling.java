package web.element;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import okhttp3.Cookie;

public class CookiesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selinium jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Set<org.openqa.selenium.Cookie> ck = driver.manage().getCookies(); // Duplicate values not allowed
		Iterator<org.openqa.selenium.Cookie> itr = ck.iterator();
		while(itr.hasNext())
		{
			org.openqa.selenium.Cookie cookie = (org.openqa.selenium.Cookie) itr.next();
			
			System.out.println("Domain = "+cookie.getDomain());
			System.out.println("Name = "+cookie.getName());
			System.out.println("path = "+cookie.getPath());
			System.out.println("Value = "+cookie.getValue());
			System.out.println("Expiry = "+cookie.getExpiry());
		}
	}

}
