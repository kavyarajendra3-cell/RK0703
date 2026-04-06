package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://vinothqaacademy.com/alert-and-popup/");
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		Thread.sleep(2000);
		Alert ale = driver.switchTo().alert();
		System.out.println(ale.getText());
		ale.accept();
	}
}
