package assertionInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Vs_HardAssert {

	@Test
	public void hardAssertLogic() {
		System.out.println("This is my First Hard Assert Logic");
		Assert.assertTrue(true);

		System.out.println("This is my Second Hard Assert Logic");
		Assert.assertTrue(false);

		System.out.println("This is my Third Hard Assert Logic");
		Assert.assertTrue(true);

	}

	@Test
	public void softAssertLogic() {
		SoftAssert softAssrt = new SoftAssert();
		System.out.println("This is my first Soft Assert Logic");
		softAssrt.assertTrue(true);

		System.out.println("This is my Second Soft Assert Logic");
		softAssrt.assertTrue(false);

		System.out.println("This is my Third Soft Assert Logic");
		softAssrt.assertTrue(true);

		softAssrt.assertAll();
	}
}
