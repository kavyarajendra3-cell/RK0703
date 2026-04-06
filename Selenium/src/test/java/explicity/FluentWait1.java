package explicity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWait1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//span[.='APPLE iPhone 11']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("624301");
		WebElement chkBtn = driver.findElement(By.id("Check"));
	
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(5));
		wait.withTimeout(Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("Check"))));	
		chkBtn.click();
	}

}
