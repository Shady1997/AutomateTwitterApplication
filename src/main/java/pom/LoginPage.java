package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Sign in')]")
	public WebElement signinButton;
	
	@FindBy(xpath = "//input[@name='text']")
	public WebElement userName;
	
	@FindBy(xpath = "//span[contains(text(),'Next')]")
	public WebElement nextButton;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath = "//span[contains(text(),'Log in')]")
	public WebElement loginButton;

}
