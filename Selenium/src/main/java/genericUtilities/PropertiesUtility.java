package genericUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtility {
	public String toReadDataFromPropertiesFiles(String Key) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\Kavya Rajendran\\OneDrive\\Documents\\Html\\DemoWebShopNotes.txt");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(Key);
		return value;
	}
}
