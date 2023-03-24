package learningBasic_TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_TestCase {

	WebDriver driver;

	@BeforeMethod
	public void browser_URL() {

		WebDriverManager.ChromeDriver().setup();
		driver.get("https://mycarhelpline.com");

	}

	@Test(priority = 1, enabled = true)
	public void landingPage() {
		System.out.println(driver.getCurrentUrl());

		String currentUrl = "https://mycarhelpline.com";
		if (currentUrl.equalsIgnoreCase("https://mycarhelpline.com")) {
			System.out.println("Test Case Landing Page is Pass");
		} else {
			System.out.println("Test Case Landing Page is fail");
		}
	}

	@Test(priority=2,enabled = true,,dependsonMethods="landingPage")
	public void calculatore() {
	driver.findElement(By.linkText("Calculator")).click();
}

	@Test(priority = 3, enabled = true, dependsonMethods = { "landingPage", "calculatore" })
	public void returnToHomePage() {
		driver.findElement(By.linkText("Home")).click();
	}
}