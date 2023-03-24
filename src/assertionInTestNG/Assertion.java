package assertionInTestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

/**  Assertion is used in TestNG only for Validation
 *
 */
public class Assertion {
	
	@Test
	public void critical() {
		String name = "akshay";
		String name1= "akshay";
		Assert.assertEquals(name1, name);
		System.out.println("Critical ");
	}
	@Test
	public void low() {
		boolean first = 1<2;
		boolean second = 2>3;
		Assert.assertEquals(first, second);
	}
}
