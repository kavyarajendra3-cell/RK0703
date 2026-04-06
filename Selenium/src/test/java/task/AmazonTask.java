package task;

import java.util.List;
import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("slippers for womens",Keys.ENTER);
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
	    List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	    List<WebElement> names = driver.findElements(By.xpath("//h2"));
	    
		int minprice = Integer.MAX_VALUE; //adhu oru inbulid method 2 power 7-1(min value edukanum nah max_value & max value edukanum nah min_value)
		int index = 0; // 
		
		//list (vara nala) = size, string = length , array = length-1
		
		for (int i = 0; i <= prices.size(); i++) {
			String pricetext = prices.get(i).getText();
			int price = Integer.parseInt(pricetext); // WRAPPER CLASS String value(NPD) PRICE VALUE into Integer value (PD)
			//incase "String" thousand hundred adhu vanthu integer value ah convert panna NUMBER FORMATE EXCEPTION
		if (price  < minprice ) {
			minprice = price;
			index = i;	
		} 
		System.out.println("Least Price Product : " + names.get(index).getText());
		System.out.println("Price :" + minprice);
				
		}
	}
}
