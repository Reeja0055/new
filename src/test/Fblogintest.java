package test;

import org.testng.annotations.Test;

import pages.Fbloginpage;

public class Fblogintest extends Baseclass{
	
	
	@Test
	public void testlogin() 
	{
		Fbloginpage ob= new Fbloginpage(driver);
		ob.setvalues("abc@gmail.com","abcd");
		ob.login();
	}
}
