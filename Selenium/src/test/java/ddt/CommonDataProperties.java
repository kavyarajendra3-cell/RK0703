package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonDataProperties {

	public static void main(String[] args) throws Throwable  {
		//step 1
		FileInputStream fis = new FileInputStream("C:\\Users\\Kavya Rajendran\\OneDrive\\Documents\\Html\\CommonData.txt");
		//step 2 
		Properties prop = new Properties();
		//step 3
		prop.load(fis); // In this line only we get Exception (ioException,Throwable)
		
		//step 4 
		String BROWSER = prop.getProperty("Browser");
		String URL = prop.getProperty("Url");
		String UN = prop.getProperty("Un");
		String PW = prop.getProperty("Pw");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PW);
		
		WebDriver driver = null;
		
		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			}
		else if(BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			}
		else {
			driver = new FirefoxDriver();
		}
		
	driver.manage().window().maximize();
	driver.get(URL);
	driver.findElement(By.name("email")).sendKeys(UN);
	driver.findElement(By.name("pass")).sendKeys(PW);
	}

}
