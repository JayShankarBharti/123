package listeners;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SecondTest {
	
	@Test
	public void secondTest() {
		Reporter.log("Second Test", true);
	}	

}
