package xpath;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles",Keys.ENTER);
		
		List<WebElement> cartbtn=driver.findElements(By.name("submit.addToCart"));
		
		for (int i = 0; i <=5; i++) {
			cartbtn.get(i).click();
		
		//for (WebElement Add : cartbtn) {
			//cartbtn
		}
			}		
}

		
			
	


