package parametrization_TestngXml;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class OptionalParameter {

	public static WebDriver driver;
	@Test
	@Parameters ( { "url","userName" } )

	public void vtiger(@Optional ("chrome")String browser,String url,String userName){
	driver=new ChromeDriver();
	driver.get(url);
	driver.findElement(By.name("user_name")).sendKeys(userName);
}
}
}
