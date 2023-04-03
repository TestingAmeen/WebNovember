package seleniumexample2;


import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven1 {
	ChromeDriver driver;
	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
	}

	@Test
	public void test1() throws Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\ameen\\Desktop\\software Testing class\\Selenium\\Data driven\\Datadrivenprgrm1.xlsx");
		XSSFWorkbook WB=new XSSFWorkbook(f);//Excel workbook
		XSSFSheet sheet=WB.getSheet("Sheet1");//Excel sheet
		
		int rowcount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowcount;i++) {
			String username=sheet.getRow(i).getCell(0).getStringCellValue();
			String password=sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println("username= "+username);
			System.out.println("password= "+password);
			
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			
			//validation
		String valid = driver.getCurrentUrl();
		String expectedurl="https://www.facebook.com/login/?";
		if(valid.contains(expectedurl)) {
			System.out.println("incorrect");
		}
		else
		{
			System.out.println("correct");
		}
			
		}
		
		
	}
	
	
	@AfterTest
	public void AfterTst()
	{
		//driver.close();
		}
}
