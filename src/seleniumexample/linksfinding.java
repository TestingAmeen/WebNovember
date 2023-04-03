package seleniumexample;

import java.util.List; 

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
  
public class linksfinding {

	ChromeDriver driver=new ChromeDriver();
	
	
	@Before
	public void first() 
	{
		driver.get("https://www.wappalyzer.com/technologies/ecommerce/shopify/");
	}
	
	@Test
	public void test1()
	{
		List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("total no. of links "+linkdetails.size());
	}
	
	@After
	public void last()
	{
		driver.close();
	}
	
}
