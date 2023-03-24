package TestCases;

import javax.xml.crypto.Data;

import org.testng.annotations.Test;

import learningBasic_TestNG.DataProvider;
import learningBasic_TestNG.DataRepo;

public class MultipleTestCases {

	
	
	@Test(dataProviderClass = DataRepo.class,dataProvider="getData") //dataProvider is used for relationship
	public void hitURL(String name,String password,String login){
		System.out.println("name = "+name+" password = "+password+" login = "+login);
	}
	@Test(dataProviderClass = DataRepo.class,dataProvider="getData")
	public void enterCrenditional(String name,String password,String login){
		System.out.println("name = "+name+" password = "+password+" login = "+login);
	}
	@Test(dataProviderClass = DataRepo.class,dataProvider="getData")
	public void validHomePage(String name,String password,String login){
		System.out.println("name = "+name+" password = "+password+" login = "+login);

	}
	@Test(dataProviderClass = DataRepo.class,dataProvider="getData")
	public void logOut(String name,String password,String login){
		System.out.println("name = "+name+" password = "+password+" login = "+login);

	}
	
}
