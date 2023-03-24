package learningBasic_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotation {

	// Precedence Wise Execution

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is BeforeSuite");
	}@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is BeforeMethod");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is BeforeTest");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is BeforeClass");
	}
	
	@Test
	private void test() {
		System.out.println("This is Test");
	}
	@Test
	public void test1() {
		System.out.println("This is Test111111");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is afterMethod");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("This is afterClass");
	}
	@AfterTest
	private void afterTest() {
		System.out.println("This is afterTest+++++++++++++++++");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is afterSuite");
	}
}
