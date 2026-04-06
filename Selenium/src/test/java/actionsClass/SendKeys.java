package actionsClass;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/");
		WebElement scr = driver.findElement(By.name("search_query"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.sendKeys(scr,"Kathaipoma").perform();//sendKeys(webElement Target,charSequence Keys)
		//scr.sendKeys("Kathaipoma");//Normal Keys class Method
	}

}
