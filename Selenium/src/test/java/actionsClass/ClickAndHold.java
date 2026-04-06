package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-tns-c2785778308-3 icon-cancel']")).click();
		driver.findElement(By.id("userName")).sendKeys("KavyaRam");
		driver.findElement(By.id("password")).sendKeys("KavyaRam@04");
		WebElement icon = driver.findElement(By.xpath("//img[@class='ng-star-inserted']"));
		Thread.sleep(2000);
		act.clickAndHold(icon).perform();
		//act.moveToElement(icon).clickAndHold().perform();
		Thread.sleep(2000);
		act.release(driver.findElement(By.xpath("//img[@class='ng-star-inserted']"))).perform();
		//act.moveToElement(driver.findElement(By.xpath("//img[@class='ng-star-inserted']"))).release().perform();
		Thread.sleep(2000);
	}

}
