package calendarPopUps;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makeMyTrip {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {	
		LocalDateTime ldt = LocalDateTime.now();
		String month = ldt.getMonth().name();
		int date = ldt.getDayOfMonth();
		int year = ldt.getYear();
		//To make the first letter as Capital and all other letters in lowercase of month
		month = month.substring(0,1)+month.substring(1).toLowerCase();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//button[text()='ACCEPT']")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		WebElement dateBtn = driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+date+"']"));
		Thread.sleep(1000);
		dateBtn.click();
		driver.close();
		
		
	}
	
}
