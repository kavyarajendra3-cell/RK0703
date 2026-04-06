package takeScreenShot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Svg {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.instagram.com/");
	    WebElement icon = driver.findElement(By.xpath("//*[name()='svg' and @class='x1kpxq89 x1247r65']"));
	    icon.click();
	}

	
}
