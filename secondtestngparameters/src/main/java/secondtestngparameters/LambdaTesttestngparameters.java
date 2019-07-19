package secondtestngparameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LambdaTesttestngparameters {

	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button")
	private WebElement button;
	
	
	public LambdaTesttestngparameters(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement get_email()
	{
		return email;
	}
	
	public WebElement get_password()
	{
		return password;
	}
	
	public WebElement get_button()
	{
		return button;
	}
}

