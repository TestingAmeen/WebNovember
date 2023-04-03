package seleniumexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {
	ChromeDriver Driver=new ChromeDriver();
	@Before
	public void setup(){
		Driver.get("https://demo.guru99.com/test/newtours/register.php");
		}
	
	@Test
	public void testsearching() {
		Select Drpdown= new Select(Driver.findElement(By.name("country")));
		Drpdown.selectByVisibleText("ANTARCTICA");
		Driver.navigate().refresh();
		}
	
	@After
	public void teardown() {
		//Driver.quit();
       						}
}
