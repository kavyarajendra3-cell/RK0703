package pomClassObjRepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objRepositary.InstaLoginPage;
import objRepositary.OrangeHrmPage;

public class OrangeHrm {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		OrangeHrmPage lp = new OrangeHrmPage(driver);
		lp.getUnTF().sendKeys("Admin");
		lp.getPwTf().sendKeys("admin123");
	
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		lp.getUnTF().sendKeys("Admin");
		lp.getPwTf().sendKeys("admin123");
	}

}
