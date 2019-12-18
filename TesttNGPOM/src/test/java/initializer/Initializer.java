package initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;

public class Initializer {
	WebDriver driver;
	Properties p;
	String location = "E:\\SUBRAMANI\\Java\\Java\\TesttNGPOM\\src\\test\\resources\\excelfile\\mani.xlsx";
	public static LinkedList<String> li;

	FileInputStream fs;
	ExtentReports reports;

	public WebDriver browserlaunch(String profilepath) {

		try {
			fs = new FileInputStream(profilepath);
			// fs = new
			// FileInputStream("E:\\SUBRAMANI\\Java\\Java\\TesttNGPOM\\src\\test\\java\\config\\env.property");
			p = new Properties();

			p.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(p.getProperty("Browser"));
		char browser = (p.getProperty("Browser")).charAt(0);
		switch (browser) {
		case 'c':
			System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case 'f':
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\AS\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case 'I':
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\AS\\Downloads\\IE-DRIVER\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

			break;

		default:
			break;

		}
		driver.get(p.getProperty("URL"));
		// initReport();// init report
		return driver;

	}

	public ExtentReports initReport() {
		reports = new ExtentReports(System.getProperty("user.dir") + "//extentautoreport.html");
		return reports;
	}

	public LinkedList<String> excelnew() {
		System.out.println("***********************************1");
		System.out.println(location);
		try {
			// wb = WorkbookFactory.create(new File(location));
			Workbook wb = WorkbookFactory.create(new File(location));

			DataFormatter df = new DataFormatter();
			System.out.println(wb.getNumberOfSheets());
			Sheet sh = wb.getSheetAt(0);
			Iterator<Row> rows = sh.rowIterator();
			li = new LinkedList<String>();
			System.out.println("***********************************2");
			while (rows.hasNext()) {
				Row row = (Row) rows.next();
				Iterator<Cell> cells = row.cellIterator();

				while (cells.hasNext()) {
					Cell cell = (Cell) cells.next();
					String s = df.formatCellValue(cell);
					li.add(s);
					System.out.println(s);

				}

			}
			System.out.println("***********************************");
			System.out.println(li);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return li;
	}
}