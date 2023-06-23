import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitPrgm {
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
	@Test
	public void testing()
	{
		String actualtitle=driver.getTitle();
		String expectedtitle="Google";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	
	@After
	public void teardown()
	{
		//System.out.println("browser closes");
	}

}
