package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemologinTestng {
	@Test
	public void register() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Kavya");
		driver.findElement(By.id("LastName")).sendKeys("Rajendran");
		driver.findElement(By.id("Email")).sendKeys("kavyaram@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("KavyaRam@");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("KavyaRam@");
		driver.findElement(By.id("register-button")).click();
	}
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("kavyaram@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("KavyaRam@");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();	
	}
}
