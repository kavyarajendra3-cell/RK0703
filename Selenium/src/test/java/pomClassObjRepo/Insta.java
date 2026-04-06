package pomClassObjRepo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objRepositary.InstaLoginPage;

public class Insta {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
		InstaLoginPage lp = new InstaLoginPage(driver);
		lp.getUnTF().sendKeys("kavyar_37"); //hot coding
		lp.getPwTf().sendKeys("kavyaram@");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		lp.getUnTF().sendKeys("kavyar_37");
		lp.getPwTf().sendKeys("kavyaram@");
	}

}
