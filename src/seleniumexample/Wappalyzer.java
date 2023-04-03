package seleniumexample;

import org.junit.After; 
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Wappalyzer {
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void begin()
	{
		driver.get("https://www.wappalyzer.com/lists/?technologies=shopify");
	}
	
	@Test
	public void Test1()
	{
		
	/*	//b)Click on resources
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/main/div/div[1]/header/div/div/div/div[2]/button[2]")).click();
		//c)Click on technologies
		driver.findElement(By.xpath("//*[@id='list-item-50']/div")).click();
		
		
		driver.navigate().to("https://www.wappalyzer.com/technologies/");
	//	driver.get("https://www.wappalyzer.com/technologies/");
		//d)click shopify
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span")).click();		
		
		*/
	//	e)click 'createaleadlist' Button
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("java"); 	
		
	//	driver.navigate().to("https://www.wappalyzer.com/lists/?technologies=shopify");
		
	//	driver.findElement(By.xpath("//*[@id=\"input-394\"]")).click();
		
//		WebElement testDropDown = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/main/div/div[2]/div/div[2]/form/div[1]/div[1]/div[1]/div/div[1]/button/span"));
//		Select dropdown = new Select(testDropDown);  
//		dropdown.selectByValue("input-394");

	}
	
	@After
	public void Last()
	{
		//driver.close();
	}
}
