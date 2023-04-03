package seleniumexample2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Testngprgrm2 {
	ChromeDriver driver;
	@BeforeTest
	public void bforetest() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void bforemethod() {
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");

	}
	@Test(priority = 2)
	public void test1()
	{
		WebElement displayedlogo=driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/img[1]"));
		boolean b=displayedlogo.isDisplayed();
		
		if(b) {
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
		
		
	}
	@Test(priority = 1)
	private void displays() {
		Boolean displaysbutton = driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[24]/td[3]/input[1]")).isSelected();		
		if(displaysbutton) {
		
			System.out.println("radio button is selected");
		}
		else {
			System.out.println("radio button is not selected");
		}
		
	}
	@Test(priority = 3)
	private void registers() {
			WebElement regist=driver.findElement(By.xpath("//input[@id='Register']"));		
			boolean r= regist.isEnabled();
			if(r) {
				System.out.println("button is enabled");
			}
			else
			{
				System.out.println("button is not enabled");
			}
	}
	
	@AfterMethod
	public void Aftermthod() {
		
		
	}
	
	@AfterTest
	public void AfterTst()
	{
		
		driver.close();
		}
	
	
}
