package dataproviderexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderloginexample {
	
	private String property1="webdriver.chrome.driver";
	private String property2="C:\\Users\\EP833WG\\Desktop\\Driver\\chromedriver.exe";
	private WebDriver driver;
	private String base_url="https://accounts.lambdatest.com/login";
	LoginPage loginpage;
	
	@DataProvider(name="data-provider")
	public Object[][] login_details()
	{
		return new Object[][] {{"sudarshang@hexaware.com","password1"}};
	}
	
	@BeforeClass
	public void init()
	{
		System.setProperty(property1, property2);
		driver=new ChromeDriver();
	}
	
	@Test(dataProvider="data-provider")
	public void check_login(String username,String password)
	{
		driver.get(base_url);
		loginpage=new LoginPage(driver);
		loginpage.get_user_name().sendKeys(username);
		loginpage.get_password().sendKeys(password);
		loginpage.get_login_button().click();
	}
	
	@AfterClass
	public void finalize() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
