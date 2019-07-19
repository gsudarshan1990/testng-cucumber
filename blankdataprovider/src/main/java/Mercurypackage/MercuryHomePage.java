package Mercurypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MercuryHomePage {


	@FindBy(name="userName")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement sign_on_button;
	
	
	public MercuryHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement get_username()
	{
		return username;
	}
	
	public WebElement get_password()
	{
		return password;
	}
	
	public WebElement get_sign_on_button()
	{
		return sign_on_button;
	}
}
