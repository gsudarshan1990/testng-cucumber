package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchedPage {
	
	@FindBy(xpath="//input[@title='Search']")
	private WebElement search_box;
	
	public GoogleSearchedPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement get_searchbox()
	{
		return search_box;
	}
	
	public void clear_search_box()
	{
		this.search_box.clear();
	}
	
}
