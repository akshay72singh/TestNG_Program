package learningBasic_TestNG;

import java.lang.reflect.Method;

public class DataRepo {

	public static Object[][] getData(Method name) {
		System.out.println("Test case which has the method is : "+name.getName());
		Object[][] data = new Object[2][3];
		data[0][0] = "UserName";
		data[0][1] = "UserPassword";
		data[0][2] = "Login";

		data[1][0] = "UserName";
		data[1][1] = "UserPassword";
		data[1][2] = "Login";

		return data;
	}
}
