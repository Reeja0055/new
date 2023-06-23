package testngprgms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {
	WebDriver driver;
	@Test
	public void test()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		
		//getWindowHandle() - to get unique ID of current window
		String parentWindow = driver.getWindowHandle(); //return String
		System.out.println("parent title ="+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click(); //click here link

		//getWindowHandles() -  stores set of handles for all pages opened 
		Set<String> allWindowHandles = driver.getWindowHandles(); //return Set

		for(String handle: allWindowHandles)
		{
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				String s = driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/h2")).getText();
				System.out.println(s);
			}
			
}

}
}
