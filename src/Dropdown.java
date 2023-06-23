import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

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
		
		WebElement day=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select s= new Select(day);
		s.selectByVisibleText("03");
		WebElement month=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select s1= new Select(month);
		s1.selectByIndex(3);
		
		WebElement year=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		Select s2= new Select(year);
		s2.selectByValue("2021");
	
	}
	
	@After
	public void ends()
	{
		//driver.close(); 
	}
}
