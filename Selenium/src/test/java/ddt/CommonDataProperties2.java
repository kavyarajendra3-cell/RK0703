package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonDataProperties2 {

	public static void main(String[] args) throws Throwable {
	FileInputStream fis = new FileInputStream("C:\\Users\\Kavya Rajendran\\OneDrive\\Documents\\Html\\CommonData2.txt");
	Properties prop = new Properties();
	prop.load(fis);
	
	String BROWSER = prop.getProperty("Browser");
    String URL = prop.getProperty("Url");
    String FIRSTNAME = prop.getProperty("Firstname");
    String LASTNAME = prop.getProperty("Lastname");
    String EMAIL = prop.getProperty("Email");
    String PASSWORD = prop.getProperty("Password");
    String CONFIRMPASSWORD = prop.getProperty("ConfirmPassword");
    
    System.out.println(BROWSER);
	System.out.println(URL);
	System.out.println(FIRSTNAME);
	System.out.println(LASTNAME);
	System.out.println(EMAIL);
	System.out.println(PASSWORD);
	System.out.println(CONFIRMPASSWORD);	
	
	WebDriver driver = null;
	
	if (BROWSER.equalsIgnoreCase("Chrome")) {
		driver = new ChromeDriver();	
	   }
		
		else if (BROWSER.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();		
		} 
		else {
			driver = new FirefoxDriver();
		}
	
	driver.manage().window().maximize();
	driver.get(URL);
	driver.findElement(By.id("FirstName")).sendKeys(FIRSTNAME);
	driver.findElement(By.id("LastName")).sendKeys(LASTNAME);
	driver.findElement(By.id("Email")).sendKeys(EMAIL);
	driver.findElement(By.id("Password")).sendKeys(PASSWORD);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(CONFIRMPASSWORD);
	}

}
