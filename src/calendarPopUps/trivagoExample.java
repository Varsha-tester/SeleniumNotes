package calendarPopUps;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class trivagoExample {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver/chromedriver.exe");
		}
	
	public static void main(String[] args) throws InterruptedException {
		LocalDateTime ldt = LocalDateTime.now();
		String month = ldt.getMonth().name();
		int year = ldt.getYear();
		int date = ldt.getDayOfMonth();
		month = month.substring(0,1)+month.substring(1).toLowerCase();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.trivago.co.uk/");		
		driver.switchTo().frame("uc-cross-domain-bridge");
		driver.findElement(By.xpath("//*[@id=\"uc-center-container\"]/div[2]/div/div[1]/div/button[3]")).click();//not working, incomplete
	}
}
