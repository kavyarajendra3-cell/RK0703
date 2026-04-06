package explicity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWait2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("email")).sendKeys("kavya7_r_");
		driver.findElement(By.name("pass")).sendKeys("kavyanikki07");
		WebElement lgin = driver.findElement(By.xpath("//span[.='Log in'][1]"));
		
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(5));
		wait.withTimeout(Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[.='Log in'][1]"))));	
		lgin.click();

	}

}
