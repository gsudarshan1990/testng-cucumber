package dataproviderexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'LOGIN')]")
	private WebElement login_button;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement get_user_name()
	{
		return email;
	}
	
	public WebElement get_password()
	{
		return password;
	}
	
	public WebElement get_login_button()
	{
		return login_button;
	}
}
