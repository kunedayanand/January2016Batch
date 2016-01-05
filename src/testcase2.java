import jan4.welcomemercurytours;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class testcase2 {
@Test
public void registertest()
{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://newtours.demoaut.com");
	welcomemercurytours wm=PageFactory.initElements(driver, welcomemercurytours.class);
	registermercurytours rm=PageFactory.initElements(driver, registermercurytours.class);
    leftmenu lm=PageFactory.initElements(driver, leftmenu.class);
	wm.Register();
	rm.contactinformation();
	lm.home();
	wm.findaflight("tutorial","tutorial");
}
}
