package lambdatest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//li[@class='login']")
	private WebElement freesignup_button;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public Register click_free_signup(WebDriver driver)
	{
		freesignup_button.click();
		Register register=new Register(driver);
		return register;
	}
}
