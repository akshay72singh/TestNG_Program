package testNg_In_Parallel;

import org.testng.annotations.Test;

public class Parallel_TestNG {

	
	@Test
	public void tc01() {
		System.out.println("This OutPut for TC01 : "+Thread.currentThread().getId());
	}
	
	@Test
	public void tc02() {
		System.out.println("This OutPut for TC02 : "+Thread.currentThread().getId());
	}
}
