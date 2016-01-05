package jan5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class gridprogram1 {
@Test
public void logintest() throws MalformedURLException
{
DesiredCapabilities cap=DesiredCapabilities.firefox();
cap.setBrowserName("firefox");
cap.setPlatform(Platform.WINDOWS);
RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:9999/wd/hub"),cap);
driver.get("http://google.com");
String exptitle="Gmail";
driver.findElement(By.linkText("Gmail")).click();
String acttitle=driver.getTitle();
if(exptitle.equals(acttitle))
{
	System.out.println("Gmail link working correctly");
}
else
{
	System.out.println("Gmail link not working correctly");	
}
}
}
