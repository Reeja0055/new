import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
	 driver=new ChromeDriver();
	 driver.get("https://www.google.com");
	}
	
	@Test
	public void testing()
	{
		String s =driver.getPageSource();
		if(s.contains("Gmail"))
		{
			System.out.println("text is present");
		}
		else
		{
			System.out.println("text is not present");
		}
	}
	
	@After
	public void ends()
	{
		driver.close();
	}
}
