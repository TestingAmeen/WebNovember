package seleniumexample2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mousehoverprgrm2 {
	ChromeDriver driver;
	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void bforetest() {
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act = new Actions(driver); 
		
	
		WebElement link=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		// Right click the button to launch right click menu options
		act.contextClick(link);
		act.perform();
		
		// Click on Edit link on the displayed menu options
		driver.findElement(By.xpath("//body/ul[1]/li[1]")).click();
		
		//alert handling
		driver.switchTo().alert().accept();
		
		
		//Double click the button to launch an alertbox
		Actions act2 = new Actions(driver); 
		WebElement doube=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		
		act2.doubleClick(doube);
		act2.perform();
		 
		
		//Switch to the alert box and click on OK button
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text\n" +alert.getText());
		alert.accept();
		
		
		
		
		
	}
	@AfterTest
	public void AfterTst()
	{
		//driver.close();
		}
}
