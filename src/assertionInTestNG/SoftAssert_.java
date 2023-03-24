package assertionInTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_ {

	@Test
	public void validation() {
		
		SoftAssert softassert = new SoftAssert();
		
		int i = 10;
		int j= 30;
		System.out.println(i+j);
		softassert.assertEquals(i,j);
		
		boolean e= true;
		boolean f = false;
		
		System.out.println(e==f);
		
//		softassert.assertAll();
		
		// SoftAssert give the answer base on last logic answer
	}
}
