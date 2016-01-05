package testtprog;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class gmail {
	@Test
	public void ravitset()
	{
		FirefoxDriver driver=new FirefoxDriver();
		 driver.get("http://gmail.com");
		 
	}

}
