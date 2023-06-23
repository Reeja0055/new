package test;

import org.testng.annotations.Test;

import pages.Fbcreatepage;

public class Fbcreatepagetest extends Baseclass{


	@Test
	public void createpagetest()
	{
		Fbcreatepage ob= new Fbcreatepage(driver);
		ob.clickCreatePage();
		ob.getStartedButton();
	}
}
