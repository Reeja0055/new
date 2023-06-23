import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class DataDrivenTesting {
	
	WebDriver driver;
	@BeforeTest
	public void beforeTest()
	{
		driver = new ChromeDriver();
	}
	@Test
	public void test() throws IOException 
	{
		FileInputStream f = new FileInputStream("C:\\Users\\HP\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		int rowCount = sh.getLastRowNum(); //row count
		for(int i=1;i<=rowCount;i++)
		{
			String uname = sh.getRow(i).getCell(0).getStringCellValue();
			
			String pass = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("username: "+uname);
			System.out.println("password: "+pass);
			driver.get("https://www.facebook.com");
			driver.findElement(By.name("email")).sendKeys(uname);
			driver.findElement(By.name("pass")).sendKeys(pass);
			driver.findElement(By.name("login")).click();
			//String actual =driver.getCurrentUrl();
		}
		
	}
}
