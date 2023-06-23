import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver(); //launching browser
		driver.get("https://www.google.com");
		
		
		// to get title of the application or current page/tab
		
		String actual = driver.getTitle();
		System.out.println("actual title="+actual);
		
		//automating title of the application
		
		String expected ="Google.com";
			
		/*
		 * if(actual.equals(expected)) { System.out.println("pass"); } else {
		 * System.out.println("fail"); }
		 */
		 
		//hard assertions - execution aborts if assert condition is not met
			//	Assert.assertEquals(expected,actual); 
				//System.out.println("hello");
				
				
				// soft assertion
				 SoftAssert soft = new SoftAssert(); 
				 soft.assertEquals(expected,actual);
				 System.out.println("hello");
					
				 
				
				
	}

}
