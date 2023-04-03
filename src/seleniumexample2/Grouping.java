package seleniumexample2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grouping {
	ChromeDriver driver;
	@BeforeTest(alwaysRun = true)
	public void setup() 
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod(alwaysRun = true) //always run used for execute the method in grouping xml
	public void bforetest() {
		driver.get("http://www.google.com");
		System.out.println("url");
	}
	@Test(groups = {"smoke"})
	public void test1()
	{
		System.out.println("Test1");
		
	}
	@Test(groups = {"sanity"})
	public void test2()
	{
		System.out.println("Test2");
		
	}
	@Test(groups = {"smoke","sanity"})
	public void test3()
	{
		System.out.println("Test3");
		
	}
	@Test(groups = {"regression"})
	public void test4()
	{
		System.out.println("Test4");
		
	}
	@Test(groups = {"sanity","smoke"})
	public void test5()
	{
		System.out.println("Test5");
		
	}
}
