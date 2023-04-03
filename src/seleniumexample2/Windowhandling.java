package seleniumexample2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Windowhandling {
WebDriver driver;
@BeforeMethod
public void bfore() {
	driver=new FirefoxDriver();
	driver.get("https://demo.guru99.com/popup.php");
}
	@SuppressWarnings("deprecation")
	@Test
	public void teste() {
		String parentwindow=driver.getWindowHandle();
		System.out.println("parent window Title "+driver.getTitle() );
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String> allwindowhandles=driver.getWindowHandles();
		
		
		for(String handle:allwindowhandles) {
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(parentwindow)){
				driver.switchTo().window(handle);
				
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				String s =driver.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/h2[1]")).getText();
				System.out.println(s);
				driver.close();
			}
			}
		
		}
	
	@AfterTest
	public void aftr() {
}
}
