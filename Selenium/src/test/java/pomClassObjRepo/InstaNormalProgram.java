package pomClassObjRepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaNormalProgram {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
		WebElement email = driver.findElement(By.name("email"));
		WebElement pass = driver.findElement(By.name("pass"));
		Thread.sleep(2000);
		email.sendKeys("kavyar_37");
		pass.sendKeys("kavyaram");
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		email.sendKeys("kavyar_37");
		pass.sendKeys("kavyaram"); //StaleElementReferenceException (refresh kudutha nala inga oru exception varum)
	}

}
