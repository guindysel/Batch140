package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite");
		System.out.println("BeforeSuite2");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethods()
	{
		System.out.println("BeforeMethods");
	}
	
	@Test
	public void launch()
	{
		System.out.println("Launch");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}
	
	@Test
	public void testRun()
	{
		System.out.println("TestRun");
	}
}

/* [RemoteTestNG] detected TestNG version 6.14.3
BeforeSuite
BeforeTest
BeforeClass
BeforeMethods
Launch
AfterMethod
BeforeMethods
TestRun
AfterMethod
AfterClass
AfterTest
PASSED: launch
PASSED: testRun

===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================

AfterSuite

===============================================
Default suite
Total tests run: 2, Failures: 0, Skips: 0
===============================================

 */