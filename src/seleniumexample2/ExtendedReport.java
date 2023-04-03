package seleniumexample2;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtendedReport {
WebDriver driver;
String baseurl="https://www.facebook.com/";
ExtentHtmlReporter reporter;
ExtentTest test;
ExtentReports extent;


@BeforeTest
public void Befretest() {
	reporter=new ExtentHtmlReporter("./Reports/myreport2.html");
	reporter.config().setDocumentTitle("Automationreport");
	reporter.config().setReportName("functional test");
	reporter.config().setTheme(Theme.DARK);
	
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("hostname", "localhost");
	extent.setSystemInfo("os", "windows10");
	extent.setSystemInfo("testername", "ameen");
	extent.setSystemInfo("browser name", "chrome");
	
	driver=new FirefoxDriver();

}

@BeforeMethod
public void bfremethod() {
	driver.get(baseurl);
}

@Test
public void fbtitleverify() {
	test=extent.createTest("fbtitleverification");
	String Exp="Facebook – log in or sign up";
	String Actual=driver.getTitle();
	Assert.assertEquals(Exp, Actual);
}

@Test
public void fbbuttontest() throws Exception {
	test=extent.createTest("fbbuttontest");
	String buttontext=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).getText();
	Assert.assertEquals(buttontext, "Log in");
}
@AfterTest
public void teardown() {
	extent.flush();
	
}

@AfterMethod
public void aftermthod(ITestResult result) throws Exception {
	if(result.getStatus()==ITestResult.FAILURE) 
	{
		test.log(Status.FAIL, "test case failed is "+result.getName());
		test.log(Status.FAIL, "test case failed is "+result.getThrowable());
		
	
	}
	else if(result.getStatus()==ITestResult.SKIP) {
		test.log(Status.SKIP, "test case skipped is "+result.getName());
	}
	else if(result.getStatus()==ITestResult.SUCCESS) {
		test.log(Status.PASS, "test case passed is "+result.getName());
	}	
	
	
}


}