package seleniumexample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demoprgrm {
	WebDriver driver;
	@Parameters("browsers")
	@BeforeTest
	public void before(String browsers)
	{
		if(browsers.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browsers.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if(browsers.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		
		
		
	driver.get("https://demo.guru99.com/test/upload/");
	}
	
	@Test
	public void test2() 
	{
		//radio button check
	WebElement radio =	driver.findElement(By.xpath("//input[@id='terms']"));
		if(radio.isSelected()) {
			System.out.println("radio button is selected");
		}
		else {
			System.out.println("radio button is not selected");
		}
		
		
		//file upload
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("E:\\New Bitmap Image.bmp");
		
		//radio button click
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		
		//submit button click
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
	
	}
	
	
}
