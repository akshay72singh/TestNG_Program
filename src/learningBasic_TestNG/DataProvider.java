package learningBasic_TestNG;

import org.testng.annotations.Test;

public class DataProvider {

	@Test(dataProvider = "getData")// 3rd step - data provider has to be mentioned with the name of the method inside the data provider annotation
	public void dataMatrix(String name,String password,String login) {// 4th step - number of the input parameters inside the method == numbers of the collumns in the Data provider OA
	}

	@org.testng.annotations.DataProvider
	// 1st step -returns a 2 dimensional Object Array
	// 2nd step - rows and collumn you have to specify
	public static Object[][] getData() {
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
