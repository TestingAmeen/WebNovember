package seleniumexample2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Robotexample {
ChromeDriver driver;
	@BeforeMethod
public void bfre() {
	driver=new ChromeDriver();
		
}
@Test
public void test1() throws Exception {
	driver.get("https://www.ilovepdf.com/word_to_pdf");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//span[contains(text(),'Select WORD files')]")).click();
	
	fileupload("C:\\Users\\ameen\\Desktop\\software Testing class\\Testrobot.docx");
	
}
private void fileupload(String p) throws AWTException {
	StringSelection str=new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);//to copy to clipboard
	
	Robot robot=new Robot();
	
	robot.delay(3000);//to delay the next process
	robot.keyPress(KeyEvent.VK_CONTROL);//to press the keys
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	
	robot.delay(2000);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
}
@AfterMethod
public void afer() {
	
}
}
