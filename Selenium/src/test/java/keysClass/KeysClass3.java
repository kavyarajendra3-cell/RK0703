package keysClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysClass3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement birth=driver.findElement(By.name("birthday_day"));
		birth.sendKeys(Keys.ARROW_DOWN,Keys.TAB,Keys.ARROW_DOWN,Keys.TAB,Keys.ARROW_DOWN);//it will drop down only one number
	}

}
