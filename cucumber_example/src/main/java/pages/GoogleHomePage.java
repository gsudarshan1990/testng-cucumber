package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
	
	@FindBy(xpath="//input[@title='Search']")
	private WebElement search_text_box;
	
	@FindBy(xpath="//div//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")
	private WebElement google_search_button;
	
	private GoogleSearchedPage googlesearchedpage;
	
	public GoogleHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void enter_search_box(String text)
	{
		this.search_text_box.sendKeys(text);
	}
	
	public GoogleSearchedPage click_search_box(WebDriver driver)
	{
		this.google_search_button.click();
		googlesearchedpage=new GoogleSearchedPage(driver);
		return googlesearchedpage;
	}
}
