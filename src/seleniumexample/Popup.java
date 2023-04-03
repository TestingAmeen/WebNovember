package seleniumexample;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Popup {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void befor()
		{
			 driver.get("file:///C:/Users/ameen/Desktop/page.html");
		}
	@Test
	public void Test2() 
	{
		driver.findElement(By.xpath("//*[@value='Display alert box']")).click();
		//alert handling syntax
		driver.switchTo().alert().accept();
		
		driver.findElement(By.name("firstname")).sendKeys("Ameen");
		driver.findElement(By.name("lastname")).sendKeys("ts");
		driver.findElement(By.xpath("//*[@value='Submit']")).click();
	}
	@After
	public void last1()
	{
	//driver.close();
	}
}
