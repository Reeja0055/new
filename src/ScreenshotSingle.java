import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotSingle {

	ChromeDriver driver;
	
	@Before
		
		public void setup()
		{
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
		}
		
		@Test
		
		public void testing() throws IOException
		
		{
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//TakesScreenshot ts = (TakesScreenshot)driver;
		WebElement button = driver.findElement(By.name("login"));
			
		File f=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f,new File("./Screenshots//buttonerror.png"));
		}
		
		@After
		
		public void tearDown()
		{
			
			//driver.close();
		}
}
