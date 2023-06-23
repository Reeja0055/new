import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

ChromeDriver driver;
	
	@Before
	public void setUp()
	{
	 driver=new ChromeDriver();
	 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void testing()
	{
		
		WebElement day= driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select s= new Select(day);
		//s.selectByVisibleText("04");
		//s.selectByValue("03");
		s.selectByIndex(5);
		
	}
}
