package webElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("email")).sendKeys("kavyarajendra3@gmail.com",Keys.ENTER);
		driver.findElement(By.name("pass")).sendKeys("kavyanikki07",Keys.ENTER);
		boolean btn =driver.findElement(By.xpath("(//span[.='Log in'])[2]")).isEnabled();
		System.out.println(btn);
	}

}
