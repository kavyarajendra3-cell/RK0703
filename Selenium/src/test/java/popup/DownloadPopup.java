package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadPopup {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/download?sublist=0");
		driver.findElement(By.id("writeArea")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.id("downloadButton")).click();
	}

}
