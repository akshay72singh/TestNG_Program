package i_TestContext_Logic;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ITest_Context {

	@Test(priority = 1)
	public void setUp(ITestContext context) {
		System.out.println("This is new Set up of my Laptop");
		context.setAttribute("Windows 10", "Dell");
	}

	@Test(priority = 2, dependsOnMethods = "setUp")
	public void logic(ITestContext context) {
		System.out.println("This is new Logic of my Laptop");
		String operatingSystem = (String) context.getAttribute("Windows 10");
		System.out.println("The setUp for operating system of Dell Laptop is : " + operatingSystem);
		context.setAttribute("Complex", "Agile+TestNG");
	}

	@Test(priority = 3, dependsOnMethods = { "setUp", "logic" })
	public void exit(ITestContext context) {
		System.out.println("This is new Exit of my Laptop");
		String operatingSystem = (String) context.getAttribute("Windows 10");
		System.out.println("The setUp for operating system of Dell Laptop is : " + operatingSystem);
		String complex = (String) context.getAttribute("Complex");
		System.out.println("The Logic Complexity at the exit point is : " + complex);
	}
}
