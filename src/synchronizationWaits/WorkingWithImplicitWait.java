package synchronizationWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithImplicitWait {	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("file:///C:\\Users\\VV Work\\Documents\\Lets call it a V Drive\\Notes\\Selenium notes\\Thread.html");
	driver.findElement(By.id("btn")).click();
	driver.findElement(By.partialLinkText("Facebook")).click();
}
}
