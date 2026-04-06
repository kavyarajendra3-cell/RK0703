package task;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class AmazonTask2 {

	public static void main(String[] args) throws Throwable {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://www.amazon.in/");
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Watch for womens",Keys.ENTER);
	    driver.findElement(By.xpath("//button[@name='submit.addToCart'][3]")).click();
	    //Add to Cart
	    driver.findElement(By.id("nav-cart-text-container")).click();
	    Thread.sleep(2000);
	    //Take Screenshot (Cart Page)
	   /* TakesScreenshot ts = (TakesScreenshot)driver;
	    File scr = ts.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./ScreenShot/amazon.png");
	    FileHandler.copy(scr,dest);
	    System.out.println("Successfully taken the Screenshot");
	    driver.quit();*/
	    
	}

}
