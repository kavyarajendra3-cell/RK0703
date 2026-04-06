package ddt;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritingDatafromJson {

	public static void main(String[] args) throws IOException {	
		JSONObject obj = new JSONObject();
		FileWriter fw = new FileWriter("WriteData.Json");
		obj.put("Email","kavyaram@gmail.com");
		obj.put("Password","KavyaRam@37");
		fw.write(obj.toJSONString());
		fw.close();
		System.out.println("Successfully Written");
	}

}
