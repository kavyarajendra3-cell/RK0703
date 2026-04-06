package takeScreenShot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeWebElement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		WebElement icon = driver.findElement(By.xpath("//input[@id='_r_i_']"));
		Thread.sleep(2000);
		File temp1 = icon.getScreenshotAs(OutputType.FILE);
		File temp2 = new File("./ScreenShot/insta2.png");
		FileHandler.copy(temp1, temp2);
		
	//	TakesScreenshot ts = (TakesScreenshot)driver;
	//  File scr = ts.getScreenshotAs(OutputType.FILE);
	//  File dest = new File("./ScreenShot/insta2.png");
    //  FileHandler.copy(scr, dest);	
	}
	

}
