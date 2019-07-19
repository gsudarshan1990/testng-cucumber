package lambdatest_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lambdatest.HomePage;
import lambdatest.Register;

public class lambdatest_testngclass {

	private String property1="webdriver.chrome.driver";
	private String property2="C:\\Users\\EP833WG\\Desktop\\Driver\\chromedriver.exe";
	private WebDriver driver;
	private String base_url="https://www.lambdatest.com/";
	HomePage hp;
	Register register;
	
	@BeforeClass
	public void init()
	{
		System.setProperty(property1, property2);
		driver=new ChromeDriver();
	}
	
	@Test(priority=0)
	public void test_case()
	{
		driver.get(base_url);
		driver.manage().window().maximize();
		hp=new HomePage(driver);
		register=hp.click_free_signup(driver);
		
	}
	
	@Test(priority=1)
	public void second_test_case()
	{
		register.enter_orgainization_name();
		register.enter_fullname();
		register.enter_workemail();
		register.enter_password();
		register.enter_phone();
		register.click_checkbox();
		register.click_free_sign_up();
		
	}
	
	
	@AfterClass
	public void finalize()
	{
		driver.quit();
	}
}
