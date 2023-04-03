package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import page.Fbcreateapage;

public class Fbcreateapagetest extends Baseclass{
	@Test
	public void testlogin() {
	Fbcreateapage ob1=new Fbcreateapage(driver);
	ob1.createapage();
	ob1.getstarted();
	}
	@AfterTest
	public void metod(){
		driver.close();
	
	}
}
