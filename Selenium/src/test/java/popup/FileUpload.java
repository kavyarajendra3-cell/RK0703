package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclsrc=aw.ds&gad_source=1&gad_campaignid=19863995494&gbraid=0AAAAADLp3cEuYbxurhXG-FUVITul-ZrMw&gclid=CjwKCAiAtq_NBhA_EiwA78nNWF1S270CWvFJHUycDxd-wLj1uH2TZZDhp7aoDHxdEPgtfwZlhjPsORoCdpgQAvD_BwE");
		//driver.findElement(By.linkText("I'm experienced")).click();
		driver.findElement(By.linkText("Upload Resume")).sendKeys("\"C:\\Users\\Kavya Rajendran\\Downloads\\Kavya R Resume.pdf\"");
	}

}
