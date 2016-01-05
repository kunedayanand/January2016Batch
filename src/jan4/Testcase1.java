package jan4;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Testcase1 {
@Test
public void logintest()
{
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("myprofile12");
	FirefoxDriver driver=new FirefoxDriver(fp);
	driver.get("http://newtours.demoaut.com");
	welcomemercurytours wm=PageFactory.initElements(driver, welcomemercurytours.class);
	wm.findaflight("tutorial","tutorial");
}

}
