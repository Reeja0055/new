import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyDownPrgm {
ChromeDriver driver;
	
	@Before
		
		public void setup()
		{
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
		}
		
		@Test
		public void testing() 
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			WebElement search = driver.findElement(By.xpath("//*[@name='q']"));
			search.sendKeys("sele");
			for(int i =1;i<=4;i++)
			{
				search.sendKeys(Keys.DOWN);
				
				
			}
			search.sendKeys(Keys.ENTER);
			
		}
}
