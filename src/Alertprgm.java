import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgm {
ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/alertprgm.html");
	}
	
	@Test
	public void alertbox() throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		Thread.sleep(3000);
		Alert a =driver.switchTo().alert();

		  String s =a.getText(); 
		  System.out.println(s);
		  
		  if(s.equals("Hello! I am alert box!!")) 
		  { 
			  System.out.println("pass"); 
		  } 
		  else
		  { 
			  System.out.println("fail"); 
		  }
		 
		  a.accept();

		  System.out.println("alert accepted");
			
		  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
			
	}

}
