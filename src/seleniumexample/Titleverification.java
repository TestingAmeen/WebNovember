package seleniumexample;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverification {

	public static void main(String[] args) {
		String Expectedvalue="Google";
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.google.com");
		//Driver.get("https://quillbot.com/grammar-check");

		String Actualtitle=Driver.getTitle();
		System.out.println(Actualtitle);
		if(Expectedvalue.equals(Actualtitle)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		Driver.quit();
	}

}
