package seleniumexample2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypaste {
	public class Testngprgm {
		ChromeDriver driver;
		@BeforeTest
		public void setup() 
		{
			driver=new ChromeDriver();
		}
		@BeforeMethod
		public void bforetest() {
			driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		}
		@Test
		public void test1()
		{
		Actions act=new Actions(driver);//action class used for copy paste	
		
			WebElement firstname=driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[3]/td[3]/input[1]"));
			WebElement rediffid=driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[7]/td[3]/input[1]"));
			firstname.sendKeys("Ameen");
			
			
			act.keyDown(firstname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
			act.keyDown(firstname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
			act.keyDown(rediffid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
			act.perform();
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
}
