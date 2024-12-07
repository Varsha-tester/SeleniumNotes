package framesHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFrame1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
	driver.findElement(By.id("accept-choices")).click();
	driver.switchTo().frame("iframeResult");
	WebElement firstName = driver.findElement(By.id("fname"));
	firstName.sendKeys("Varsha");
	WebElement lastName = driver.findElement(By.id("lname"));
	lastName.sendKeys("Venugopal");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.id("runbtn")).click();
	driver.close();
}
}
