package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByAmount {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demowebshop.tricentis.com/");
	    WebElement fbLink = driver.findElement(By.linkText("Facebook"));
	    Actions act = new Actions(driver);
	  //act.scrollByAmount(0, 1500).perform();
	    act.scrollToElement(fbLink).perform();
	    
	}

}
