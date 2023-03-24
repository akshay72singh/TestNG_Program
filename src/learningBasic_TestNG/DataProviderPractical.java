package learningBasic_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataProviderPractical {

	public static WebDriver driver;
     static SoftAssert  softassert = new SoftAssert();
	@Test
	public void ninjaLoginTest(String username,String password) {
		driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.linkText("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		softassert.assertTrue(driver.findElement(By.linkText("Logout"))).isDisplayed();
		softassert.assertAll();
		driver.quit


	}
	@DataProvider
	public Object [][]getData(){
		Object data [][]= {{"akshay@gmail.com","ak20"},
		                                {"akshay@gmail.com","ak20"}};
		}
		
	}

