package seleniumexample2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameterpassing {
@Parameters("a")
@Test
public void Test1(String a)
{
	System.out.println("value is "+a);
}
	
}
