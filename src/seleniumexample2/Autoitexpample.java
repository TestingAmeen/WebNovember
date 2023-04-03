package seleniumexample2;
import java.io.IOException;

import org.openqa.selenium.By; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Autoitexpample {
	ChromeDriver driver;
	@BeforeMethod
public void bfre() {
	driver=new ChromeDriver();
		
}
@Test
public void test1() throws IOException, InterruptedException  {
	driver.get("https://www.ilovepdf.com/word_to_pdf");
	//driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[contains(text(),'Select WORD files')]")).click();
	Thread.sleep(2000);
	Runtime.getRuntime().exec("C:\\Users\\ameen\\Desktop\\software Testing class\\Selenium\\T1.exe");
}
@AfterMethod
public void afte() {
	
}
}
