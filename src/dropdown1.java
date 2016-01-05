

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class dropdown1 {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("myprofile12");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://newtours.demoaut.com");
driver.findElement(By.linkText("REGISTER")).click();
WebElement drop=driver.findElement(By.name("country"));
List<WebElement> dropdown= drop.findElements(By.tagName("option"));
System.out.println(dropdown.size());
for(int i=0;i<dropdown.size();i++)
		{
		dropdown.get(i).click();
		if(dropdown.get(i).isSelected())
		{
			System.out.println(dropdown.get(i).getText()+"is active");
			
		}
		else
		{
			System.out.println(dropdown.get(i).getText()+"is inactive");
		}
		}
	}

}
