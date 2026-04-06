package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		WebElement day =driver.findElement(By.id("day"));
		WebElement month =driver.findElement(By.id("month"));
		WebElement year =driver.findElement(By.id("year"));
		Thread.sleep(2000);
		
		Select sel = new Select(day);
		sel.selectByVisibleText("4");
		Thread.sleep(2000);
		
		Select sel1 = new Select(month);
		sel1.selectByIndex(2);
		Thread.sleep(2000);
		
		Select sel2 = new Select(year);
		sel2.selectByValue("2004");
		Thread.sleep(2000);
		
	}

}
