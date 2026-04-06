package keysClass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysClass6 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.linkText("Register")).click();
		WebElement exp = driver.findElement(By.xpath("//div[@data-val='exp']"));
		exp.click();
		driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		for (int i = 1; i <10; i++) {
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		for (int j = 1; j <2; j++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
	}
		   robot.keyPress(KeyEvent.VK_ENTER);
		   robot.keyRelease(KeyEvent.VK_ENTER);	
	  Thread.sleep(2000);
			
		}

	}

}
