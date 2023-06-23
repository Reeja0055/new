

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ebay {

ChromeDriver driver;
	
	@Before
		
		public void setup()
		{
			driver = new ChromeDriver();
			driver.get("https://www.ebay.com");
		}
		
		@Test
		public void testing()
		{
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Actions act = new Actions(driver);
			
			WebElement electronics = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
			act.moveToElement(electronics); 
			act.perform();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			WebElement smart =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='mainContent']/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));	
			smart.click();
		}

}
