package xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoGoogle {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Todays");
		Thread.sleep(2000);
		
		List<WebElement>goo=driver.findElements(By.xpath("//div[@class='pcTkSc']"));
		
		for (WebElement Auto : goo) {
			System.out.println(Auto.getText());
		}
	}
}
