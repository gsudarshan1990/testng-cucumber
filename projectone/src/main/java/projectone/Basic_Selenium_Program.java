package projectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Selenium_Program {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EP833WG\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(10);
		WebElement search_webelement=driver.findElement(By.xpath("//input[@title='Search']"));
		search_webelement.sendKeys("toolsqa");
		WebElement search_button=driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@class='gNO89b']"));
		search_button.click();
		Thread.sleep(10);
		WebElement ToolsQA_link=driver.findElement(By.xpath("(//div[@id='search']//div//div//div//div//div//div//div//div//a//h3[contains(text(),'ToolsQA')])[1]"));
		ToolsQA_link.click();
		Thread.sleep(10);
		driver.quit();
		
	}

}
