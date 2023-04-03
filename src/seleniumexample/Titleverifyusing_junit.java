package seleniumexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverifyusing_junit {
	ChromeDriver Driver=new ChromeDriver();
	@Before
	public void befo(){
		
		Driver.get("https://www.google.com");
		}
	
	@Test
	public void tes1() {
		String Expectedvalue="Google";
		String Actualtitle=Driver.getTitle();
		System.out.println(Actualtitle);
		if(Expectedvalue.equals(Actualtitle)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}
	
	@After
	public void teardown() {
		Driver.quit();
		}
	
}
