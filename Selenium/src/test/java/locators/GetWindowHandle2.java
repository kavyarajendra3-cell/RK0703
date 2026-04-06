package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle2 {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();
		driver.findElement(By.linkText("Twitter")).click();
		driver.findElement(By.linkText("YouTube")).click();
		Thread.sleep(2000);
		String pId=driver.getWindowHandle();
		Set<String> allIds= driver.getWindowHandles();
		System.out.println(pId);
		System.out.println(allIds);
		allIds.remove(pId);
		System.out.println(driver.getTitle());
		for(String id :allIds) {
			driver.switchTo().window(id);
			String actTitle=driver.getTitle();
			if(actTitle.contains("YouTube"));{
				System.out.println(driver.getCurrentUrl());
				driver.close();
				break;
			}
				
			}
			
			}
	}


