package actionClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithFlipKart {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	driver.manage().window().maximize();	
	driver.get("https://www.flipkart.com/");
	Actions action = new Actions(driver);
	WebElement homeFurniture = driver.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]"));
	action.moveToElement(homeFurniture).click().perform();
	Thread.sleep(1500);
	WebElement livingRoom = driver.findElement(By.xpath("//a[contains(text(),'Living Room Furniture')]"));
	action.moveToElement(livingRoom).perform();
	WebElement tvUnit = driver.findElement(By.xpath("(//a[contains(text(),'TV Units')])[2]"));	
	action.moveToElement(tvUnit).click().perform();
	
	String url = driver.getCurrentUrl();
	if(url.contains("tv-units")) {
		System.out.println("User is in Tv Units page");
	}else {
		System.out.println("User is not in TV units page");
	}
	driver.quit();
}
}
