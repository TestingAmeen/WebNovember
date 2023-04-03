package seleniumexample;

import java.io.File;
import java.io.IOException;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	ChromeDriver driver=new ChromeDriver();

@Before
public void befor()
	{
		 driver.get("http://www.google.com");
	}
@Test
public void Test2() throws IOException
{
	//for saving screenshot in drive
	File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(screen,new File("E://new5.png"));
	
	//for saving in directory
	
	WebElement buten=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[2]"));
	File screen1=buten.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(screen1,new File("./screenshot//new2.png"));
	
	
}
@After
public void last1()
{
driver.close();
}
}
