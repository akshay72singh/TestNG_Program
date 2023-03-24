package learningBasic_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun_Class {

	@Test(priority=1,enabled = true)
	public void begin() {
		System.out.println("This is Begin Method");
		Assert.fail("We are failing this method");
}

	@Test(priority = 2, enabled = true, dependsOnMethods = "begin",alwaysRun=true)
	public void ready() {
		System.out.println("This is Ready Method");
	}

	@Test(priority = 3, enabled = true, dependsOnMethods = { "begin", "ready" },alwaysRun=true)
	public void stady() {
		System.out.println("This is Stady Method");
	}

	@Test(priority = 4, enabled = true, dependsOnMethods = { "begin", "redy", "stady" },alwaysRun=true)
	public void go() {
		System.out.println("This is Go Method");
	}

}
