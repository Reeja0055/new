import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

ChromeDriver driver;
	
	@Before
	
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	
	public void testing()
	
	{
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		
		
		
		for(WebElement li:linklist) //li- first link <a....</a>
		{
			
			String url =li.getAttribute("href");
			verify(url);
		}
		
	}
	
	private void verify(String url) {
		// TODO Auto-generated method stub
		
		try {
			URL u = new URL(url);
			HttpURLConnection con = (HttpURLConnection)u.openConnection();
			
			if(con.getResponseCode()==200)
			{
				System.out.println("success: " +url);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("broken link: "+url);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}

	@After
	
	public void tearDown()
	{
		
		//driver.close();
		
		/*
		 * String actual =driver.findElement(By.xpath("")).getAttribute("value"); 
		 * String exp ="Check availability"; 
		 * if(actual.equals(exp))
		 *  {
		 * System.out.println("pass"); 
		 * } 
		 * else 
		 * { System.out.println("fail"); 
		 * }
		 */
	}
	

}
