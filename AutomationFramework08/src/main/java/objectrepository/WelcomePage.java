package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	//initialize
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//declare 
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	//getters
	public WebElement getLoginLink() {
		return loginLink;
	}
}

