package testngprgms;

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
	public void beforemethod()
	{
		driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void testing()
	{
		WebElement fname= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		fname.sendKeys("anu");
		WebElement id = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		Actions act = new Actions(driver);
		act.keyDown(fname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(fname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(id,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
		
	}

}
