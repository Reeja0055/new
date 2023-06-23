package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbcreatepage {

WebDriver driver;
	
	By createpage = By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By getstarted = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	
	
	public Fbcreatepage(WebDriver driver) //to get browser details
	{
		this.driver= driver;
	}

	public void clickCreatePage()
	{
		driver.findElement(createpage).click();
	}
	
	public void getStartedButton()
	{
		driver.findElement(getstarted).click();
	}
}
