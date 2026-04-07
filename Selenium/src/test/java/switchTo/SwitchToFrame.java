package switchTo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("");
		WebElement element = driver.findElement(By.xpath(""));
		driver.switchTo().frame(element);
		driver.findElement(By.id("")).sendKeys("Kavya");
		System.out.println("kavya");
	}

}
