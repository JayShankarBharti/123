package testNG;

import org.testng.Reporter;

public class PriorityPracticeTest {
	@Test
	public void demo1() {
		Reporter.log("demo1",true);
	}
	
	@Test
	public void demo2() {
		Reporter.log("demo2", true);
	}
	
	@Test
	public void demo3() {
		Reporter.log("demo3", true);
	}
	
	@Test
	public void demo4() {
		
	}
	

}
