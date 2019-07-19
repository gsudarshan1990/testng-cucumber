package secondtestngparameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import secondtestngparameters.LambdaTesttestngparameters;

public class TestNGParametersExample {

	private String property1="webdriver.chrome.driver";
	private String property2="C:\\Users\\EP833WG\\Desktop\\Driver\\chromedriver.exe";
	private WebDriver driver;
	private String base_url="https://accounts.lambdatest.com/login";
	LambdaTesttestngparameters lambdatesttestngparameters;
	
	@BeforeClass
	public void init()
	{
		System.setProperty(property1, property2);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Parameters({"username","password"})
	@Test
	public void test_login(String username,String password)
	{
		driver.get(base_url);
		lambdatesttestngparameters=new LambdaTesttestngparameters(driver);
		lambdatesttestngparameters.get_email().sendKeys(username);
		lambdatesttestngparameters.get_password().sendKeys(password);
		lambdatesttestngparameters.get_button().click();
		
	}
	
	
	@AfterClass
	public void finalize()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
