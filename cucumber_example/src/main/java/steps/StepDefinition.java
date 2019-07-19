package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GoogleHomePage;
import pages.GoogleSearchedPage;

public class StepDefinition {
	
	private String property1="webdriver.chrome.driver";
	private String property2="C:\\Users\\EP833WG\\Desktop\\Driver\\chromedriver.exe";
	private WebDriver driver;
	private String base_url="https://www.google.com/";
	GoogleHomePage ghp;
	GoogleSearchedPage googlesearchedpage;
	WebDriverWait wait;
	
	@Before
	public void init()
	{
		System.setProperty(property1, property2);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver,30);
	}
	
	
	@Given("^I am in google page$")
	public void i_am_in_google_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(base_url);
	    ghp=new GoogleHomePage(driver);
	}

	@When("^I type \"([^\"]*)\"$")
	public void i_type(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   ghp.enter_search_box("cucumber");
	}

	@Then("^I click the submit button$")
	public void i_click_the_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		googlesearchedpage=ghp.click_search_box(driver);
	}

	@Then("^I clear search text box$")
	public void i_clear_search_text_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		googlesearchedpage.clear_search_box();
		
		
	}
	
	@After
	public void finalize() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

}
