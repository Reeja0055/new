import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyboardPrgm {

	ChromeDriver driver;
	
	@BeforeMethod
	public void set()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	
	@Test
	public void testing() throws InterruptedException
	{
		driver.manage().window().maximize();
		WebElement fname =driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		WebElement id =driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		Actions act = new Actions(driver);
		
		/*
		 * act.contextClick(fname); //right click act.doubleClick(fname);
		 */

		/*
		 * act.moveToElement(id); id.sendKeys("aqqwq");
		 */
		
		act.keyDown(fname,Keys.SHIFT).sendKeys("anu").keyUp(Keys.SHIFT);
		Thread.sleep(3000);
		act.keyDown(fname,Keys.SHIFT).sendKeys(Keys.ARROW_LEFT).keyUp(Keys.SHIFT);
		//act.keyDown(fname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		
	 act.keyDown(fname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		 act.keyDown(id,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		
		act.perform();
		
	}
	
}
