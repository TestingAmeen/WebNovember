package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	WebDriver driver;
@BeforeClass
public void base(){
	driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
}
}
