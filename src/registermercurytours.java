import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class registermercurytours {
	@FindBy(name="firstName")
	WebElement firstname;
	
	@FindBy(name="lastName")
	WebElement lastname;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="register")
	WebElement register;
	public void contactinformation()
	{
		firstname.sendKeys("sai");
		lastname.sendKeys("krishna");
		email.sendKeys("tutorial");
		password.sendKeys("tutorial");
		register.click();
	}
	

}
