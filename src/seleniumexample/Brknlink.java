package seleniumexample;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brknlink {
ChromeDriver driver=new ChromeDriver();
	
	
	@Before
	public void first() 
	{
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test1()
	{
		//find how many link present
		List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("total no. of links "+linkdetails.size());
		
		//Response code of each link in page
		for(WebElement li:linkdetails) 
		{
			String ur=li.getAttribute("href");
			//responce code verification method
			verify(ur);
		}
		
		
		
	}
	
	private void verify(String ur) {
		try {
			URL u=new URL(ur);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			
			//code for waiting time 1000 = 1 seconds.
			con.setConnectTimeout(1000);
			
			
			if(con.getResponseCode()==200) {
				System.out.println("Sucess:responce code 200"+ur);
			} else if(con.getResponseCode()==404) {
				System.out.println("Failed:responce code 404"+ur);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
	}

	@After
	public void last()
	{
		driver.close();
	}
	
}
