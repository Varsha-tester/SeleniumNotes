package alertExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertExample {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver/chromedriver.exe");
		}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("result")).getText());
		driver.close();
	}
}
