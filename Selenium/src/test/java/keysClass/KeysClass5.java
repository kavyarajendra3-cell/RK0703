package keysClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysClass5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement name=driver.findElement(By.name("firstname"));
		name.sendKeys("Kavya");
		WebElement nameSur=driver.findElement(By.name("lastname"));
		nameSur.sendKeys("RamPrasanna");
		WebElement birth=driver.findElement(By.name("birthday_day"));
		birth.sendKeys("1111",Keys.TAB,"Jul",Keys.TAB,"2003");
		WebElement Gender=driver.findElement(By.xpath("//input[@value='1']"));
		Gender.click();
		System.out.println(Gender.isSelected());
		WebElement mob=driver.findElement(By.name("reg_email__"));
		mob.sendKeys("kavyarajendra3@gmail.com",Keys.TAB);	
		WebElement Psw=driver.findElement(By.name("reg_passwd__"));
		Psw.sendKeys("kavyanikki07");		
	}

}
