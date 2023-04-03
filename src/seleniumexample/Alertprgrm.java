package seleniumexample;

import org.junit.After; 
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprgrm {
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
		//alert assigning
		Alert a=driver.switchTo().alert();
		
		//alert text getting
		String s=a.getText();
		
		//alert text verify
		if(s.equals("hello alert box"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();
		
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
