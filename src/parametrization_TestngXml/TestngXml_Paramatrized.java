package parametrization_TestngXml;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class TestngXml_Paramatrized {

	@Test
	@Parameters({"url","userName"})
	Run | Debug
	public void vtiger(String browser,String url,String userName){
	driver=new ChromeDriver();
	driver.get(url);
	driver.findElement(By.name("user_name")).sendKeys(userName);
}
}