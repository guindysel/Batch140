package locators;

public class SeleniumEasyLocators {
	public String firstName_Name, lastName_Name, email_Name, phone_Name, hostingvalueyes_Xpath, hostingvalueno_Xpath, address_Name,
			city_Name, state_Xpath, zip_Name, websitedomain_Name, projectdes_Name,submit_Xpath;

	public SeleniumEasyLocators() {
		firstName_Name = "first_name";
		lastName_Name = "last_name";
		email_Name = "email";
		phone_Name = "phone";
		address_Name = "address";
		city_Name = "city";
		state_Xpath = "//select[@name='state']/option";
		zip_Name = "zip";
		websitedomain_Name = "website";
		hostingvalueyes_Xpath = "//input[@value='yes']";
		hostingvalueno_Xpath = "//input[@value='no']";
		projectdes_Name = "comment";
		submit_Xpath="//button[@type='submit']";

	}

}
