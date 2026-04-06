package ddt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ReadingDatafromJson {

	public static void main(String[] args) throws ParseException, Throwable{
		
		FileReader fir = new FileReader("CommonData.Json");
		JSONParser jsonparser = new JSONParser();
		Object javaobj = jsonparser.parse(fir);
		
		JSONObject obj =(JSONObject) javaobj;
		
		String BROWSER = obj.get("Browser").toString();
	    String URL = obj.get("Url").toString();	
		String EMAIL = obj.get("Email").toString().toString();	
		String PW = obj.get("Password").toString().toString();
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(EMAIL);
		System.out.println(PW);
		
		WebDriver driver = null;
		
		if (BROWSER.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();	
		} 
		else if(BROWSER.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();		
		}
		else {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(By.name("email")).sendKeys(EMAIL);
		driver.findElement(By.name("pass")).sendKeys(PW);
		driver.findElement(By.xpath("//span[.='Log in']")).click();
	}

}
