package seleniumexample2;

import java.time.Duration; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
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
		//implicit wait used
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//explicit wait used
		WebDriverWait expi= new WebDriverWait(driver, Duration.ofSeconds(30));
		
		
		
		Actions act=new Actions(driver);
		
		WebElement to=driver.findElement(By.xpath("//body/div[@id='mainContent']/div[1]/ul[1]/li[3]/a[1]"));
		act.moveToElement(to);
		act.perform();
		
		//explicit wait 
		expi.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Cameras and photos')]")));
	   
		
		driver.findElement(By.xpath("//a[contains(text(),'Cameras and photos')]")).click();
		
	
	}
	
	@AfterMethod
	public void Aftermthod() {
		
		
	}
	
	@AfterTest
	public void AfterTst()
	{
		
	//	driver.close();
		}
}
