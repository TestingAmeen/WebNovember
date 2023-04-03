package seleniumexample;



import org.junit.After; 
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff {
		ChromeDriver driver=new ChromeDriver();
		
		@Before
		public void begin()
		{
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		}
		
		@Test
		public void Test1()
		{
			String Pagesource=driver.getPageSource();
			boolean Result=Pagesource.contains("Register");
			System.out.println(Result);
			
			
			//another method to find text in a page
			
			WebElement e = driver.findElement(By.xpath("//*[@id='wrapper']"));	
		    if(e.getText().contains("Register")) 
			{
				System.out.println("present");
			}
			else
			{
				System.out.println("not present");
			}
		    
		    //c)select values from dropdown using select class
		    
		    
		    WebElement day=driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[22]/td[3]/select[1]"));
		    Select s=new Select(day);
		    s.selectByValue("02");
		    WebElement month=driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[22]/td[3]/select[2]"));
		    Select d=new Select(month);
		    d.selectByValue("06");
		    WebElement year=driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[22]/td[3]/select[3]"));
		    Select f=new Select(year);
		    f.selectByValue("2000");
		    
		}
		
		@After
		public void Last()
		{
			//driver.close();
		}
}
