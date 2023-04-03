package seleniumexample2;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrolldownprgm {
	ChromeDriver driver;
	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void bforetest() {
		driver.get("https://www.ebay.com/");
		
	}
	@Test
	public void test1()
	{
		//Scroll down using javascriptexecutor by defining the pixel syntax
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");

		
		//Scroll down using javascriptexecutor until an element is visible
		
//		WebElement Element=driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[8]/div[1]/div[2]/a[1]/div[2]"));
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();",Element);

		
		
		//Scrolldown to the bottom of the page
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}
	@AfterMethod
	public void after() {
		
	}
	
}
