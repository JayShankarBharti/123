package groupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ThirdTest {
	
	@Test(groups = "System")
	public void third1Test() {
		Reporter.log("Third1 Test", true);
	}
	
	@Test(groups = {"Smoke","Sanity","System"})
	public void third2Test() {
		Reporter.log("Third2 Test", true);
	}
	
	@Test(alwaysRun = true)
	public void third3Test() {
		Reporter.log("Third3 Test", true);
	}


}
