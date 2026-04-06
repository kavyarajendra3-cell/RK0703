package objRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoLoginPage {
	WebDriver driver;
	public DemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name = "Gender")
	private WebElement maleRadioBtn;
	
	@FindBy (name = "FirstName")
	private WebElement fnTf;
	
	@FindBy(name = "LastName")
	private WebElement lnTf;
	
	@FindBy (name = "Email")
	private WebElement emTf;
	
	@FindBy (name = "Password")
	private WebElement pwTf;
	
	@FindBy (name = "ConfirmPassword")
	private WebElement cnpTf;
	
	@FindBy(name = "register-button")
	private WebElement RgBtn;
	
	
	public WebElement getMaleRadioBtn() {
		return maleRadioBtn;
	}

	public WebElement getFnTf() {
		return fnTf;
	}

	public WebElement getLnTf() {
		return lnTf;
	}

	public WebElement getEmTf() {
		return emTf;
	}

	public WebElement getPwTf() {
		return pwTf;
	}

	public WebElement getCnpTf() {
		return cnpTf;
	}
		
	public WebElement getRgBtn() {
		return RgBtn;

	}
	
	public void personalDetails(String fn , String ln,String mail,String pw,String cpw) {
		maleRadioBtn.click();
		fnTf.sendKeys("Firstname");
		lnTf.sendKeys("Lastname");
		emTf.sendKeys("Email");
		pwTf.sendKeys("Password");
		cnpTf.sendKeys("ConfirmPassword");
		RgBtn.click();	
	}
}

