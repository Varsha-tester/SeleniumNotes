package listAndForEach;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithBooking {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.booking.com/");
	driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@placeholder='Where are you going?']")).sendKeys("Turkey");
	Thread.sleep(1500);
	List<WebElement> elements=driver.findElements(By.xpath("(//div[@role='listbox'])[1]//div"));
	for(WebElement element:elements) {
		if(element.getText().equalsIgnoreCase("Turkey")) {
			element.click();
			break;
		}				
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(@aria-label,'Next month')]")).click();	
	driver.findElement(By.xpath("(//span[contains(@aria-label,'1 June 2024')])[1]")).click();
	driver.findElement(By.xpath("(//span[contains(@aria-label,'10 June 2024')])[1]")).click();
	driver.findElement(By.xpath("(//span[contains(text(),'Search')])[1]")).click();
	
	
}
}
