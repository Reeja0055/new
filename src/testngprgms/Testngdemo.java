package testngprgms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	
	ChromeDriver driver;
	@BeforeSuite
	public void suite()
	{
		System.out.println("before suite");
	}

	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		System.out.println("browser opens");
	}
	
	@BeforeClass
	public void bclass()
	{
		System.out.println("before class");
	}
	
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com");
		System.out.println("url loading..");
	}
	
	@Test
	public void registration()
	{
		System.out.println("test 1");
	}
	@Test(invocationCount=3)
	public void c()
	{
		System.out.println("test 3 ");
	}
	
	@Test(dependsOnMethods="registration")
	public void login()
	{
		System.out.println("test 2");
	}

	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method..");
	}
	
	@AfterClass
	public void aclass()
	{
		System.out.println("after class");
	}
	
	@AfterTest
	public void teardown()
	{
		System.out.println("browser closes");
		driver.quit();
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("after suite");
	}
}
