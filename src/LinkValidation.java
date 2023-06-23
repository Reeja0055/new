import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinkValidation {
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
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println("total number of links: "+linklist.size());
		
		for(WebElement li :linklist)
		{
			String url =li.getAttribute("href");
			verify(url);
		}	
		
	}
	private void verify(String url) throws IOException {
		// TODO Auto-generated method stub
		URL u = new URL("https://www.facebook.com");
		HttpURLConnection con = (HttpURLConnection)u.openConnection();
		
		if(con.getResponseCode()==200)
		{
			System.out.println("success: " +url);
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("broken link: "+url);
		}
		
	}
}
