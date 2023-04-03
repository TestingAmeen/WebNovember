package seleniumexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textverfication {
	ChromeDriver Driver=new ChromeDriver();
	@Before
	public void setup(){
		Driver.get("https://www.google.com");
		}
	
	@Test
	public void testsearching() {
	String sc=	Driver.getPageSource();	
		if(sc.contains("Gmail")) {
			System.out.println("it contains");
		}
		else {
			System.out.println("its doesn't contains");
		}
		}
	
	@After
	public void teardown() {
		Driver.quit();
       						}
}
