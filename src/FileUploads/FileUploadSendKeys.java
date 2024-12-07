package FileUploads;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadSendKeys {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.id("okck")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\varsh\\Downloads\\Varsha_Venugopal_CV.pdf");
		Thread.sleep(2000);
		driver.close();
	
	}
}

