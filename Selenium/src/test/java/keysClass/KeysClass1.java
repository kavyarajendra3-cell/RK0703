package keysClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysClass1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://secure.instagram.com/");
		WebElement nameTf=driver.findElement(By.name("email"));
		nameTf.sendKeys("kavya07@",Keys.CONTROL+"a");
		nameTf.sendKeys(Keys.CONTROL+"c");
		nameTf.sendKeys(Keys.TAB,Keys.CONTROL+"v");//without enter

	}

}
