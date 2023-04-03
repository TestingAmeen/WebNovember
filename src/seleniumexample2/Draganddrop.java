package seleniumexample2;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	ChromeDriver driver;
	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void bforetest() {
		driver.get("https://demoqa.com/droppable");

	}
	@Test
	public void test1()
	{
		Actions act=new Actions(driver);
		WebElement from=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement to=driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		
		act.dragAndDrop(from, to);
		act.perform();
		
		
		//another method for drag and drop"[
//		Actions drag =act.clickAndHold(from).
//		moveToElement(to).release(to);
//		drag.perform();
		
	
		String s=to.getText();
		if(s.equals("Dropped!")) {
			System.out.println("it is working");
		}
		else {
			System.out.println("not working");
		}
		
		
		
		
		
	}
	
	@AfterMethod
	public void Aftermthod() {
	
		
	}
	
	@AfterTest
	public void AfterTst()
	{
		//driver.close();
		}
}
