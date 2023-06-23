package testngprgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTest {

	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else 
		{
			driver = new FirefoxDriver();
		}
			
		}
	@Test
	public void testing()
	{
		driver.get("https://www.google.com");
	}
	}

