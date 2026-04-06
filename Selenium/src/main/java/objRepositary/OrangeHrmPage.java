package objRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmPage {
	
		WebDriver driver;
		
		public OrangeHrmPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver,this);	
		}
		
		@FindBy(name = "username")
		private WebElement unTF;
		
		@FindBy(name = "password")
		private WebElement pwTF;
		
		public WebElement getUnTF() {
			return unTF;
		}
		public WebElement getPwTf() {
			return pwTF;
		}
	}


