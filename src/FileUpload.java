import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpload {

	ChromeDriver driver;
	@BeforeMethod
	public void beforemethod()
	{
		driver = new ChromeDriver();
		
	}
	@Test
	public void testing() throws Exception 
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		fileupload("C:\\Users\\HP\\Desktop\\java_ques.docx");
	}
	public void fileupload(String s) throws AWTException {
		StringSelection sele = new StringSelection(s);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sele,null);
		
		Robot robot = new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(3000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		// TODO Auto-generated method stub
		
	}
}
