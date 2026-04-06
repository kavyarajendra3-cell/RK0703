package popup;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childpopup1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		String pid = driver.getWindowHandle();
		System.out.println(pid);
		Set<String> allid = driver.getWindowHandles();
		allid.remove(pid);
		System.out.println(allid);	
		
		for (String id : allid) {
			driver.switchTo().window(id);
			String actTitle = driver.getTitle();
			if(actTitle.contains("Facebook")) {
				System.out.println(driver.getCurrentUrl());
			    driver.close();
				break;
		}
	}	
  }
}


