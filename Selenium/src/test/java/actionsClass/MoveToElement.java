package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/#");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Actions act = new Actions(driver);
		WebElement morebtn = driver.findElement(By.xpath("//span[.='More']"));
		act.moveByOffset(1230, 90).perform();
		Thread.sleep(2000);
		act.moveToElement(morebtn).click().perform();
		act.moveToElement(morebtn, -100, 225).perform();
	}

}
