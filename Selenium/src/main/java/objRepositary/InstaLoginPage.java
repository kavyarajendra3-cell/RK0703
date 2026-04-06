package objRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaLoginPage {
	
	WebDriver driver;

	public InstaLoginPage(WebDriver driver)  { // Constructor
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy(name = "email")
	private WebElement unTF;
	
	@FindBy(name = "pass")
	private WebElement pwTF; //Private en use panrom nah Encapsulation 
	 
	public WebElement getUnTF() {
		return unTF;
	}
	public WebElement getPwTf() {
		return pwTF;
	 }
}
	

