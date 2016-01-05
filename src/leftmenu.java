import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class leftmenu {
	@FindBy(linkText="Home")
	WebElement home;
	public void home()
	{
		home.click();
	}
	@FindBy(linkText="Flights")
	WebElement flight;
	public void flight()
	{
      flight.click();
	}
	@FindBy(linkText="Hotels")
	WebElement hotels;
	public void hotels()
	{
		hotels.click();
	}
	@FindBy(linkText="Car Rentals")
	WebElement carrental;
	public void carrental()
	{
		carrental.click();
	}
	@FindBy(linkText="Cruises")
	WebElement crusies;
	public void crusies()
	{
		crusies.click();
	}
	@FindBy(linkText="Destinations")
	WebElement destinations;
	public void destinations()
	{
		destinations.click();
	}
	@FindBy(linkText="Vacations")
	WebElement vacations;
	public void vacations()
	{
      vacations.click();
	}
	
	
}
