package TestNG;

import org.testng.annotations.DataProvider;

public class TestDataSource {
	@DataProvider(name="autocomplete")
	public static Object[][] data() {
		Object[][] input = new Object[3][2];
		input[0][0] = "a";
		input[0][1] = "AppleScript";
		input[1][0] = "c";
		input[1][1] = "COBOL";
		input[2][0] = "j";
		input[2][1] = "Java";
		
		return input;
	}

}
