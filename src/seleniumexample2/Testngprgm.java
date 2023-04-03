package seleniumexample2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class Testngprgm {
	ChromeDriver driver;
	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void bforetest() {
		driver.get("http://www.google.com");
		System.out.println("url");
	}
	@Test
	public void test1()
	{
		System.out.println("Test1");
		
	}
	@Test(enabled = false)
	public void test2() {
		System.out.println("Test2");

	}
	@Test(dependsOnMethods = "test2")
	public void test3() {
		System.out.println("Test3");

	}
	@AfterMethod
	public void Aftermthod() {
		System.out.println("Aftermethod");
		System.out.println();
		
	}
	
	@AfterTest
	public void AfterTst()
	{
		System.out.println("Browserclosing");
		driver.close();
		}
}
	
