import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorId {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
	 driver=new ChromeDriver();
	 driver.get("https://www.facebook.com");
	}
	
	
	@Test
	public void testing()
	{
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ads@gmail.com");
		//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("abc123");
		driver.findElement(By.xpath("//*[contains(@href,'/pages/create/?ref_type=registration_form')]")).click();
		
		//driver.findElement(By.xpath("//button[contains(@name,'log')]")).click();
		
	
	}
	
	@After
	public void ends()
	{
		//driver.close();
	}
}
