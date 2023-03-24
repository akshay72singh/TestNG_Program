package multipleDataProviders;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import learningBasic_TestNG.ChromeDriver;

public class TestCases {

	SoftAssert assertobj = new SoftAssert();
	@Test
	public void ninjaLoginTest(String username,String password) {
		driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.linkText("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		assertobj.assertTrue(driver.findElement(By.linkText("Logout"))).isDisplayed();
		assertobj.assertAll();
		driver.quit();


	}
}
