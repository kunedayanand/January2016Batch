package testtprog;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class goggle {
	@Test
	public void rahul()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
	}

}
