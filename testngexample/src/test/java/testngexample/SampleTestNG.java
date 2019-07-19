package testngexample;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class SampleTestNG {
	
	private WebDriver driver;
	private String property1="webdriver.chrome.driver";
	private String property2="C:\\Users\\EP833WG\\Desktop\\Driver\\chromedriver.exe";
	private String base_url="https://testng.org/doc/maven.html";
	
	@BeforeTest
	public void init()
	{
		System.setProperty(property1, property2);
		driver=new ChromeDriver();
	}

	@Test
	public void verifyPageTitle()
	{
		driver.get(base_url);
		driver.manage().window().maximize();
		String Title=driver.getTitle();
		Assert.assertEquals("TestNG - Maven", Title);
	}
	
	@AfterTest
	public void finalize()
	{
		driver.quit();
	}
}

