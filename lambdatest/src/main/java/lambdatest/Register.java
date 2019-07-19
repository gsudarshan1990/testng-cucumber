package lambdatest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {

	
	@FindBy(name="organization_name")
	private WebElement organization_name;
	
	@FindBy(name="name")
	private WebElement full_name;
	
	@FindBy(name="email")
	private WebElement work_email;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(id="terms_of_service")
	private WebElement check_box;
	
	@FindBy(xpath="//button[contains(text(),'Free Signup')]")
	private WebElement click_free_sign_up;
	
	public Register(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
	}
	
	public void enter_orgainization_name()
	{
		organization_name.sendKeys("Hexaware");
		
	}
	
	public void enter_fullname()
	{
		full_name.sendKeys("Sudharshan Govindarajan");
	}
	
	public void enter_workemail()
	{
		work_email.sendKeys("sudarshang@hexaware.com");
	}
	
	public void enter_password()
	{
		password.sendKeys("password1");
	}
	
	public void enter_phone()
	{
		phone.sendKeys("1234567890");
	}
	
	public void click_checkbox()
	{
		check_box.click();
	}
	
	public void click_free_sign_up()
	{
		click_free_sign_up.click();
	}
}
