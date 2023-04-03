package seleniumexample2;



import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rediff2 {
	FirefoxDriver driver=new FirefoxDriver();
	@Before
	public void befo(){
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}

	@Test
	public void tes1() {
	WebElement txt=	driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[2]"));
	String s=txt.getAttribute("value");
	
	if(s.equals("check availability"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
}

	@After
	public void teardown() {
		driver.close();
	}
}
