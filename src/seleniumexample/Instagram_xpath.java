package seleniumexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_xpath {
	ChromeDriver Driver=new ChromeDriver();
	
	@Before
	public void first() {
		Driver.get("https://www.instagram.com/");
	}
	@Test
	public void test1() {
		Driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Email123@gmail.com");
		Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abc123456");
		Driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@After
	public void last() {
		//Driver.close();
	}
}
