package groupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FristTest {
	
	@Test(groups = "Smoke")
	public void frist1Test() {
		Reporter.log("Frist1 Test", true);
	}
	
	@Test(groups = "Sanity")
	public void frist2Test() {
		Reporter.log("Frist2 Test", true);
	}
	
	@Test(groups = {"Smoke","Sanity"})
	public void frist3Test() {
		Reporter.log("Frist3 Test", true);
	}

}
