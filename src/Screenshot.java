import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	ChromeDriver driver;
	
@Before
	
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	
	@Test
	
	public void testing() throws IOException
	
	{
	
	File ts = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileHandler.copy(ts,new File("E://screenshot5.png"));
	
	
	//WebElement button = driver.findElement(By.xpath("//div[@id='navSwmHoliday']"));
		
	
	
	//FileHandler.copy(ts,new File("./ScreenshotNew//error.png"));
	
	
	}
	
	@After
	
	public void tearDown()
	{
		
		//driver.close();
	}
}
