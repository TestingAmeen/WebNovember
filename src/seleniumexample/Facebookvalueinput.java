package seleniumexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookvalueinput {
	ChromeDriver Driver=new ChromeDriver();
	@Before
	public void setup(){
		Driver.get("https://www.Facebook.com");
		}
	
	@Test
	public void testsearching() {
		Driver.findElement(By.id("email")).sendKeys("name123@gmail.com");
		Driver.findElement(By.name("pass")).sendKeys("1234508");
		Driver.findElement(By.name("login")).click();
	
		
		}
	
	@After
	public void teardown() {
	//	Driver.quit();
       						}
}
