package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetWebpage {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.instagram.com/");
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File scr = ts.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./ScreenShot/insta.png");
	    FileHandler.copy(scr, dest);
	}

}
