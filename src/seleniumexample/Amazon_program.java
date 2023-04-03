package seleniumexample;


	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Amazon_program {
		ChromeDriver Driver=new ChromeDriver();
		
		@Before
		public void first() {
			Driver.get("https://www.amazon.in/");
		}
		
		
		
		@Test
		public void test1() {
			//enter'phone' in search
			Driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phone");
			Driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

			//click cart
			Driver.findElement(By.xpath("//*[@id='nav-cart-count-container']")).click();	
			//click mobiles
			Driver.findElement(By.xpath("//*[@id='nav-main']/div[2]/div/div")).click();
			//click hello signin
			Driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']")).click();
			//enter invalid email
			Driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("fakeemail@gmail.com");
			Driver.findElement(By.xpath("//*[@id='continue']")).click();

			//navigate to homepage
			Driver.navigate().back();
			Driver.navigate().back();


		}
		
		
		
		
		@After
		public void last() {
			//Driver.close();
		}
}
