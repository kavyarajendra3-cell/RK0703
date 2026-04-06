package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeMusic {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.youtube.com/");
		WebElement song = driver.findElement(By.name("search_query"));
		song.sendKeys("Kadhaipoma",Keys.ENTER);
		
		driver.findElement(By.xpath("//ytd-video-renderer[@class='style-scope ytd-item-section-renderer'][1]"));
		Thread.sleep(2000);
		
		//to skip the add i'm using try catch block
		
		try {
			driver.findElement(By.xpath(""));
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		
			
			
		}
	
	}


