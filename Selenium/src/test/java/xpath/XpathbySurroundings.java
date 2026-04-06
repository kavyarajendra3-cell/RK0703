package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbySurroundings {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zepto.com/");
		driver.findElement(By.xpath("//span[.='Nycil Germ Expert Prickly Heat Powder - Cool Herbal, (Get Cool Herbal 60 g Free)']/../..//button[.='ADD']")).click();
	}

}
