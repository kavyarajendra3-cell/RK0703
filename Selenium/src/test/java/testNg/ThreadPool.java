package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadPool {
	@Test(invocationCount = 2 , threadPoolSize = 3)
	public void amaze() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void flip() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
}
