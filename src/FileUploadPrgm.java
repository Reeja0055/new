import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadPrgm {

	WebDriver driver;
	@BeforeTest
	public void btest()
	{
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void testing() throws Exception
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		
		fileUpload("‪‪C:\\Users\\HP\\Desktop\\EncapsulationQues.docx");
	}

	public void fileUpload(String p) throws AWTException {
		// TODO Auto-generated method stub
		StringSelection select = new StringSelection(p); //selecting the path
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select,null); //set the path in the clipboard
		 
		Robot robot = new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
