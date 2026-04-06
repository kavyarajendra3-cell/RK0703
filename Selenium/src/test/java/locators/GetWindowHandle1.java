package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle1 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Facebook")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Twitter")).click();
			Thread.sleep(2000);
			String pId = driver.getWindowHandle();
			Set<String> allIds = driver.getWindowHandles();
			System.out.println(pId);
			System.out.println(allIds);
			allIds.remove(pId);
			System.out.println(driver.getTitle());
			for(String id:allIds) {
				driver.switchTo().window(id);
			}
			System.out.println(driver.getTitle());
			System.out.println(allIds);
			driver.close();	
	}

}
