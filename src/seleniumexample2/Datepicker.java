package seleniumexample2;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Datepicker {
	ChromeDriver driver;
	@BeforeMethod
	public void bfore() {
		driver=new ChromeDriver();
		driver.get("https://www.expedia.co.in/");
	}
	
	@Test
	public void Test1() {
		
		
		//month clicking
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
		while(true) {
		WebElement date= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/h2[1]"));
		String month=date.getText();
		if(month.equals("April 2023")) {
			System.out.println(month);
			break;
		}
		else {
			driver.findElement(By.xpath("//body/div[@id='app-blossom-flex-ui']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[2]")).click();
		}
					}
		
		//day clicking
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));
		for (WebElement datelement:alldates) {
			String dates=datelement.getAttribute("data-day");
			if(dates.equals("25")) {
				datelement.click();
				System.out.println("date selected");
			}
		}
	
	
	}
	@AfterMethod
	public void afte() {
		
	}
}
