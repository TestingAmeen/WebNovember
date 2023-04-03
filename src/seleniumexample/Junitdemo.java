package seleniumexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitdemo {
	
@Before
public void befo(){
	System.out.println("browser opened");
}

@Test
public void tes1() {
	System.out.println(" browser tested");
}

@After
public void teardown() {
	System.out.println("browser closed"); 
}

}
