package jan4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class welcomemercurytours {
@FindBy(name="userName")
WebElement username;
@FindBy(name="password")
WebElement password;
@FindBy(name="login")
WebElement login;
public void findaflight(String username,String password)
{
	this.username.sendKeys(username);
	this.password.sendKeys(password);
	login.click();
	
}
@FindBy(linkText="your destination")
WebElement destinations;
public void destinations()
{
	destinations.click();
}
@FindBy(linkText="featured vacation destinations")
WebElement vaction;
public void vaction()
{
	vaction.click();
}
@FindBy(linkText="Register here")
WebElement Register ;
public void Register()
{
	Register.click();
}
}
