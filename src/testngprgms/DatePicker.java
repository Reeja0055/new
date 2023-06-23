package testngprgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker {

	WebDriver driver;
	String baseurl="https://www.expedia.co.in/";
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public  void url()
	{
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	@Test
	public void testing()
	{
		driver.findElement(By.xpath("//button[@id='date_form_field-btn']")).click();
		
		while(true)
		{
			WebElement month =driver.findElement(By.xpath("//div[@class='uitk-date-picker-month'][1]/h2"));
			
			String month1 =month.getText(); //August 2023
			if(month1.equals("August 2023"))
			{
				System.out.println(month1);
				break;
			}
			else
			{
				driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-medium uitk-button-only-icon uitk-layout-flex-item uitk-button-paging'][2]")).click();//right arrow				
			}
		}
		//storing 1 to 31 in List
		List<WebElement> alldays =driver.findElements(By.xpath("//*[@id=\"lodging_search_form\"]/div/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));
		//iterating one by one
		for(WebElement dayelement:alldays)
		{
			String day = dayelement.getAttribute("data-day");
			//System.out.println(date);
			if(day.equals("16"))
			{
				dayelement.click();
				System.out.println("day selected: "+day);
			}
		}
	}
}
