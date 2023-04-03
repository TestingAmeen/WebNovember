package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


import page.Fbloginpage;

public class Fblogintest extends Baseclass {

	@Test
	public void testlogin() {
	Fbloginpage ob=new Fbloginpage(driver);
	ob.setvalues("adha@gmail.com", "agvgdv244");
	ob.login();
	}
	@AfterTest
	public void metod(){
		driver.close();
	
	}
}
