package testngannotationsexample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngannotationsclass {

	@BeforeSuite
	public void before_suit_function()
	{
		System.out.println("This is Before Suite annotation");
	}

	@AfterSuite
	public void after_suite_function()
	{
		System.out.println("This is After Suite annotation");
	}
	
	
	@BeforeTest
	public void before_test_function()
	{
		System.out.println("This the before test annotation");
	}
	
	@AfterTest
	public void after_test_function()
	{
		System.out.println("This is After Test annotation");
	}
	
	
	@BeforeClass
	public void before_class_function()
	{
		System.out.println("This is before class annotation");
	}
	
	@AfterClass
	public void after_class_function()
	{
		System.out.println("This is after class annotation");
	}
	
	
	@BeforeMethod
	public void before_method_function()
	{
		System.out.println("This is before method annotation");
	}
	
	@AfterMethod
	public void after_method_function()
	{
		System.out.println("This is after method annotation");
	}

	
	@Test
	public void test_exectution()
	{
		System.out.println("All the annotations executed");
	}
}
