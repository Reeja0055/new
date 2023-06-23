package testngprgms;

import org.testng.annotations.Test;

public class Prority {

	@Test
	public void abc()
	{  
		System.out.println("abc");
	}
	
	@Test(enabled=false)
	public void reg()
	{  
		System.out.println("reg");
	}

	@Test
	public void login()
	{  
		System.out.println("login");
	
	}
}
