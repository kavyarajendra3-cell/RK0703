package pomClassObjRepo;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objRepositary.DemoLoginPage;

public class DemoLogin {

	public static void main(String[] args) throws Throwable {

		//DemoLoginPage dlp = new DemoLoginPage(driver);
		/*dlp.getMaleRadioBtn().click();
		dlp.getFnTf().sendKeys("Kavya");
		dlp.getLnTf().sendKeys("Rajendran");
		dlp.getEmTf().sendKeys("kavyaram3@gmail.com");
		dlp.getPwTf().sendKeys("kavyaRam37");
		dlp.getCnpTf().sendKeys("kavyaRam37");
		dlp.getRgBtn().click();*/
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Kavya Rajendran\\OneDrive\\Documents\\Html\\DemoWebShopNotes.txt");
		Properties prop = new Properties();
		prop.load(fis);
		
		//Gathering Data
		
		String fn = prop.getProperty("Firstname");
		String ln = prop.getProperty("Lastname");
		String mail = prop.getProperty("Email");
		String pw = prop.getProperty("Password");
		String cpw = prop.getProperty("ConfirmPassword");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/register");
	
		DemoLoginPage dlp = new DemoLoginPage(driver);
		dlp.personalDetails(fn,ln,mail,pw,cpw);	
		
	}

}
