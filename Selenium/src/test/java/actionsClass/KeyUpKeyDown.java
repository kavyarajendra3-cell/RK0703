package actionsClass;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpKeyDown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demoqa.com/text-box");
	    Thread.sleep(2000);
	    Actions act = new Actions(driver);	
	    WebElement fullnme = driver.findElement(By.id("userName"));
	    WebElement submit = driver.findElement(By.id("submit"));
	    
	    act.sendKeys(fullnme,"KavyaRam").keyDown(Keys.TAB).keyUp(Keys.TAB).sendKeys("kavyaram@gmail.com")
	       .keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.SHIFT).sendKeys("new york").keyUp(Keys.SHIFT)
	       .keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.SHIFT).sendKeys("chicago").keyUp(Keys.SHIFT)
	       .click(submit).perform();
	    
	    System.out.println(driver.findElement(By.id("outpu.")).getText());
	    Thread.sleep(2000);
	    driver.quit(); 
	}

}
